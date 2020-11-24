package typings.nano.mod

import typings.nano.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://docs.couchdb.org/en/stable/api/server/common.html#api-server-root
@js.native
trait InfoResponse extends js.Object {
  
  var couchdb: String = js.native
  
  var features: js.Array[String] = js.native
  
  var git_sha: String = js.native
  
  var uuid: String = js.native
  
  var vendor: Name = js.native
  
  var version: String = js.native
}
object InfoResponse {
  
  @scala.inline
  def apply(
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
  implicit class InfoResponseOps[Self <: InfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCouchdb(value: String): Self = this.set("couchdb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGit_sha(value: String): Self = this.set("git_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: Name): Self = this.set("vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
