package typings.maximMazurokGapiClientPoly.gapi.client.poly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersResource extends StObject {
  
  var assets: AssetsResource = js.native
  
  var likedassets: LikedassetsResource = js.native
}
object UsersResource {
  
  @scala.inline
  def apply(assets: AssetsResource, likedassets: LikedassetsResource): UsersResource = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], likedassets = likedassets.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersResource]
  }
  
  @scala.inline
  implicit class UsersResourceMutableBuilder[Self <: UsersResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssets(value: AssetsResource): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikedassets(value: LikedassetsResource): Self = StObject.set(x, "likedassets", value.asInstanceOf[js.Any])
  }
}
