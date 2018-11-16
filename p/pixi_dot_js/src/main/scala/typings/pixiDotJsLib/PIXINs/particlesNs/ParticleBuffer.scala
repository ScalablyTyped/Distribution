package typings
package pixiDotJsLib.PIXINs.particlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.particles.ParticleBuffer")
@js.native
class ParticleBuffer protected () extends js.Object {
  def this(gl: stdLib.WebGLRenderingContext, properties: js.Any, dynamicPropertyFlags: js.Array[_], size: scala.Double) = this()
  var _updateID: scala.Double = js.native
  var dynamicBuffer: js.Any = js.native
  var dynamicData: js.Any = js.native
  var dynamicDataUint32: js.Any = js.native
  var dynamicProperties: js.Array[_] = js.native
  var dynamicStride: scala.Double = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var size: scala.Double = js.native
  var staticBuffer: js.Any = js.native
  var staticData: js.Any = js.native
  var staticDataUint32: js.Any = js.native
  var staticProperties: js.Array[_] = js.native
  var staticStride: scala.Double = js.native
  def destroy(): scala.Unit = js.native
}

