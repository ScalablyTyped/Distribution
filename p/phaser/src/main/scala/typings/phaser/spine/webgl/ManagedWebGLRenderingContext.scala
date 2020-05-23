package typings.phaser.spine.webgl

import typings.phaser.spine.Restorable
import typings.std.HTMLCanvasElement
import typings.std.OffscreenCanvas
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedWebGLRenderingContext extends js.Object {
  var canvas: HTMLCanvasElement | OffscreenCanvas
  var gl: WebGLRenderingContext
  var restorables: js.Any
  def addRestorable(restorable: Restorable): Unit
  def removeRestorable(restorable: Restorable): Unit
}

object ManagedWebGLRenderingContext {
  @scala.inline
  def apply(
    addRestorable: Restorable => Unit,
    canvas: HTMLCanvasElement | OffscreenCanvas,
    gl: WebGLRenderingContext,
    removeRestorable: Restorable => Unit,
    restorables: js.Any
  ): ManagedWebGLRenderingContext = {
    val __obj = js.Dynamic.literal(addRestorable = js.Any.fromFunction1(addRestorable), canvas = canvas.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], removeRestorable = js.Any.fromFunction1(removeRestorable), restorables = restorables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedWebGLRenderingContext]
  }
}

