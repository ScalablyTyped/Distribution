package typings.nano.mod

import typings.nano.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * Response to CouchDB root API call - cluster information.
  * @see Docs: {@link https://docs.couchdb.org/en/stable/api/server/common.html#api-server-root} */
trait InfoResponse extends StObject {
  
  var couchdb: String
  
  var features: js.Array[String]
  
  var git_sha: String
  
  var uuid: String
  
  var vendor: Name
  
  var version: String
}
object InfoResponse {
  
  inline def apply(
    couchdb: String,
    features: js.Array[String],
    git_sha: String,
    uuid: String,
    vendor: Name,
    version: String
  ): InfoResponse = {
    val __obj = js.Dynamic.literal(couchdb = couchdb.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], git_sha = git_sha.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InfoResponse] (val x: Self) extends AnyVal {
    
    inline def setCouchdb(value: String): Self = StObject.set(x, "couchdb", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setGit_sha(value: String): Self = StObject.set(x, "git_sha", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: Name): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
