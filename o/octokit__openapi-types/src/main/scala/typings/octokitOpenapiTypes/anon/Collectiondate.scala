package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collectiondate extends StObject {
  
  var collection_date: js.UndefOr[String] = js.undefined
  
  var dormant_users: js.UndefOr[Dormancythreshold] = js.undefined
  
  var ghe_stats: js.UndefOr[Gists] = js.undefined
  
  var ghes_version: js.UndefOr[String] = js.undefined
  
  var github_connect: js.UndefOr[Featuresenabled] = js.undefined
  
  var host_name: js.UndefOr[String] = js.undefined
  
  var schema_version: js.UndefOr[String] = js.undefined
  
  var server_id: js.UndefOr[String] = js.undefined
}
object Collectiondate {
  
  inline def apply(): Collectiondate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collectiondate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collectiondate] (val x: Self) extends AnyVal {
    
    inline def setCollection_date(value: String): Self = StObject.set(x, "collection_date", value.asInstanceOf[js.Any])
    
    inline def setCollection_dateUndefined: Self = StObject.set(x, "collection_date", js.undefined)
    
    inline def setDormant_users(value: Dormancythreshold): Self = StObject.set(x, "dormant_users", value.asInstanceOf[js.Any])
    
    inline def setDormant_usersUndefined: Self = StObject.set(x, "dormant_users", js.undefined)
    
    inline def setGhe_stats(value: Gists): Self = StObject.set(x, "ghe_stats", value.asInstanceOf[js.Any])
    
    inline def setGhe_statsUndefined: Self = StObject.set(x, "ghe_stats", js.undefined)
    
    inline def setGhes_version(value: String): Self = StObject.set(x, "ghes_version", value.asInstanceOf[js.Any])
    
    inline def setGhes_versionUndefined: Self = StObject.set(x, "ghes_version", js.undefined)
    
    inline def setGithub_connect(value: Featuresenabled): Self = StObject.set(x, "github_connect", value.asInstanceOf[js.Any])
    
    inline def setGithub_connectUndefined: Self = StObject.set(x, "github_connect", js.undefined)
    
    inline def setHost_name(value: String): Self = StObject.set(x, "host_name", value.asInstanceOf[js.Any])
    
    inline def setHost_nameUndefined: Self = StObject.set(x, "host_name", js.undefined)
    
    inline def setSchema_version(value: String): Self = StObject.set(x, "schema_version", value.asInstanceOf[js.Any])
    
    inline def setSchema_versionUndefined: Self = StObject.set(x, "schema_version", js.undefined)
    
    inline def setServer_id(value: String): Self = StObject.set(x, "server_id", value.asInstanceOf[js.Any])
    
    inline def setServer_idUndefined: Self = StObject.set(x, "server_id", js.undefined)
  }
}
