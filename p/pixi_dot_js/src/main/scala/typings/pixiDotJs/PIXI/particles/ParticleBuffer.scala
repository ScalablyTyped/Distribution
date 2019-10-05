package typings.pixiDotJs.PIXI.particles

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.particles.ParticleBuffer")
@js.native
class ParticleBuffer protected () extends js.Object {
  def this(gl: WebGLRenderingContext, properties: js.Any, dynamicPropertyFlags: js.Array[_], size: Double) = this()
  var _updateID: Double = js.native
  var dynamicBuffer: js.Any = js.native
  var dynamicData: js.Any = js.native
  var dynamicDataUint32: js.Any = js.native
  var dynamicProperties: js.Array[_] = js.native
  var dynamicStride: Double = js.native
  var gl: WebGLRenderingContext = js.native
  var size: Double = js.native
  var staticBuffer: js.Any = js.native
  var staticData: js.Any = js.native
  var staticDataUint32: js.Any = js.native
  var staticProperties: js.Array[_] = js.native
  var staticStride: Double = js.native
  def destroy(): Unit = js.native
}

