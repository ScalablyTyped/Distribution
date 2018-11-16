package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.ManagedWebGLRenderingContext")
@js.native
class ManagedWebGLRenderingContext protected () extends js.Object {
  def this(canvasOrContext: stdLib.HTMLCanvasElement) = this()
  def this(canvasOrContext: stdLib.WebGLRenderingContext) = this()
  def this(canvasOrContext: stdLib.HTMLCanvasElement, contextConfig: js.Any) = this()
  def this(canvasOrContext: stdLib.WebGLRenderingContext, contextConfig: js.Any) = this()
  var canvas: stdLib.HTMLCanvasElement = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var restorables: js.Any = js.native
  def addRestorable(restorable: phaserLib.spineNs.Restorable): scala.Unit = js.native
  def removeRestorable(restorable: phaserLib.spineNs.Restorable): scala.Unit = js.native
}

