package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Item to be stored in the {@link pc.SceneRegistry}.
  * @property name - The name of the scene.
  * @property url - The url of the scene file.
  * @param name - The name of the scene.
  * @param url - The url of the scene file.
  */
@JSImport("playcanvas", "SceneRegistryItem")
@js.native
class SceneRegistryItem protected ()
  extends typings.playcanvas.pc.SceneRegistryItem {
  def this(name: String, url: String) = this()
}
