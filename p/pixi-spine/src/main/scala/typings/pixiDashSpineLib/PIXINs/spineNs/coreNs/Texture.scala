package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Texture")
@js.native
abstract class Texture protected () extends js.Object {
  def this(image: stdLib.HTMLImageElement) = this()
  var _image: stdLib.HTMLImageElement = js.native
  def dispose(): scala.Unit = js.native
  def getImage(): stdLib.HTMLImageElement = js.native
  def setFilters(minFilter: TextureFilter, magFilter: TextureFilter): scala.Unit = js.native
  def setWraps(uWrap: TextureWrap, vWrap: TextureWrap): scala.Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.Texture")
@js.native
object Texture extends js.Object {
  def filterFromString(text: java.lang.String): pixiDashSpineLib.PIXINs.spineNs.coreNs.TextureFilter = js.native
  def wrapFromString(text: java.lang.String): pixiDashSpineLib.PIXINs.spineNs.coreNs.TextureWrap = js.native
}

