package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.GLTexture")
@js.native
class GLTexture protected ()
  extends phaserLib.spineNs.Texture
     with phaserLib.spineNs.Disposable
     with phaserLib.spineNs.Restorable {
  def this(context: ManagedWebGLRenderingContext, image: stdLib.HTMLImageElement) = this()
  def this(context: stdLib.WebGLRenderingContext, image: stdLib.HTMLImageElement) = this()
  def this(context: ManagedWebGLRenderingContext, image: stdLib.HTMLImageElement, useMipMaps: scala.Boolean) = this()
  def this(context: stdLib.WebGLRenderingContext, image: stdLib.HTMLImageElement, useMipMaps: scala.Boolean) = this()
  var boundUnit: js.Any = js.native
  var context: js.Any = js.native
  var texture: js.Any = js.native
  var useMipMaps: js.Any = js.native
  def bind(): scala.Unit = js.native
  def bind(unit: scala.Double): scala.Unit = js.native
  /* InferMemberOverrides */
  override def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def restore(): scala.Unit = js.native
  def unbind(): scala.Unit = js.native
  def update(useMipMaps: scala.Boolean): scala.Unit = js.native
}

