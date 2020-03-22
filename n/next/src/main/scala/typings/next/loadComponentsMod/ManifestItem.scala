package typings.next.loadComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestItem extends js.Object {
  var file: String
  var id: Double | String
  var name: String
  var publicPath: String
}

object ManifestItem {
  @scala.inline
  def apply(file: String, id: Double | String, name: String, publicPath: String): ManifestItem = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ManifestItem]
  }
}

