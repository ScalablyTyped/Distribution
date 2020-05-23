package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Item to be stored in the {@link pc.SceneRegistry}.
  * @property name - The name of the scene.
  * @property url - The url of the scene file.
  * @param name - The name of the scene.
  * @param url - The url of the scene file.
  */
trait SceneRegistryItem extends js.Object {
  /**
    * The name of the scene.
    */
  var name: String
  /**
    * The url of the scene file.
    */
  var url: String
}

object SceneRegistryItem {
  @scala.inline
  def apply(name: String, url: String): SceneRegistryItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneRegistryItem]
  }
}

