package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposUpdateReleaseAssetEndpoint extends StObject {
  
  var asset_id: Double
  
  /**
    * An alternate short description of the asset. Used in place of the filename.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The file name of the asset.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var owner: String
  
  var repo: String
}
object ReposUpdateReleaseAssetEndpoint {
  
  inline def apply(asset_id: Double, owner: String, repo: String): ReposUpdateReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(asset_id = asset_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateReleaseAssetEndpoint]
  }
  
  extension [Self <: ReposUpdateReleaseAssetEndpoint](x: Self) {
    
    inline def setAsset_id(value: Double): Self = StObject.set(x, "asset_id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
