package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assetid extends StObject {
  
  /** The unique identifier of the asset. */
  var asset_id: Double
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object Assetid {
  
  inline def apply(asset_id: Double, owner: String, repo: String): Assetid = {
    val __obj = js.Dynamic.literal(asset_id = asset_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assetid]
  }
  
  extension [Self <: Assetid](x: Self) {
    
    inline def setAsset_id(value: Double): Self = StObject.set(x, "asset_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
