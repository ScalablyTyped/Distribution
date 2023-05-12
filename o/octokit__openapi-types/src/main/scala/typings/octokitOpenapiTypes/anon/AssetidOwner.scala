package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetidOwner extends StObject {
  
  var asset_id: Double
  
  var owner: String
  
  var repo: String
}
object AssetidOwner {
  
  inline def apply(asset_id: Double, owner: String, repo: String): AssetidOwner = {
    val __obj = js.Dynamic.literal(asset_id = asset_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetidOwner] (val x: Self) extends AnyVal {
    
    inline def setAsset_id(value: Double): Self = StObject.set(x, "asset_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
