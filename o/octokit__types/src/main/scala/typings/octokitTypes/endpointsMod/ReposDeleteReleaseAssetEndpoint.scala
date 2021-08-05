package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposDeleteReleaseAssetEndpoint extends StObject {
  
  var asset_id: Double
  
  var owner: String
  
  var repo: String
}
object ReposDeleteReleaseAssetEndpoint {
  
  inline def apply(asset_id: Double, owner: String, repo: String): ReposDeleteReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(asset_id = asset_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteReleaseAssetEndpoint]
  }
  
  extension [Self <: ReposDeleteReleaseAssetEndpoint](x: Self) {
    
    inline def setAsset_id(value: Double): Self = StObject.set(x, "asset_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
