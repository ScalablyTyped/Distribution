package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.opt_in
import typings.octokitTypes.octokitTypesStrings.opt_out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationsSetLfsPreferenceEndpoint extends StObject {
  
  var owner: String
  
  var repo: String
  
  /**
    * Can be one of `opt_in` (large files will be stored using Git LFS) or `opt_out` (large files will be removed during the import).
    */
  var use_lfs: opt_in | opt_out
}
object MigrationsSetLfsPreferenceEndpoint {
  
  inline def apply(owner: String, repo: String, use_lfs: opt_in | opt_out): MigrationsSetLfsPreferenceEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsSetLfsPreferenceEndpoint]
  }
  
  extension [Self <: MigrationsSetLfsPreferenceEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setUse_lfs(value: opt_in | opt_out): Self = StObject.set(x, "use_lfs", value.asInstanceOf[js.Any])
  }
}
