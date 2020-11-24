package typings.maximMazurokGapiClientPoly.gapi.client.poly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersResource extends js.Object {
  
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
  implicit class UsersResourceOps[Self <: UsersResource] (val x: Self) extends AnyVal {
    
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
    def setAssets(value: AssetsResource): Self = this.set("assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikedassets(value: LikedassetsResource): Self = this.set("likedassets", value.asInstanceOf[js.Any])
  }
}
