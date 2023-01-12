package typings.maximMazurokGapiClientPoly.gapi.client.poly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersResource extends StObject {
  
  var assets: AssetsResource
  
  var likedassets: LikedassetsResource
}
object UsersResource {
  
  inline def apply(assets: AssetsResource, likedassets: LikedassetsResource): UsersResource = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], likedassets = likedassets.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsersResource] (val x: Self) extends AnyVal {
    
    inline def setAssets(value: AssetsResource): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setLikedassets(value: LikedassetsResource): Self = StObject.set(x, "likedassets", value.asInstanceOf[js.Any])
  }
}
