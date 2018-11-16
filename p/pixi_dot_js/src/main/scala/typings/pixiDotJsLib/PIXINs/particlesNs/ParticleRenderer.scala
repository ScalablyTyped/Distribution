package typings
package pixiDotJsLib.PIXINs.particlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.particles.ParticleRenderer")
@js.native
class ParticleRenderer protected ()
  extends pixiDotJsLib.PIXINs.ObjectRenderer {
  def this(renderer: pixiDotJsLib.PIXINs.WebGLRenderer) = this()
  var indexBuffer: stdLib.WebGLBuffer = js.native
  var indices: stdLib.Uint16Array = js.native
  var properties: js.Array[ParticleRendererProperty] = js.native
  var shader: pixiDotJsLib.PIXINs.glCoreNs.GLShader = js.native
  var tempMatrix: pixiDotJsLib.PIXINs.Matrix = js.native
  /* protected */ def _generateOneMoreBuffer(container: ParticleContainer): ParticleBuffer = js.native
  def generateBuffers(container: ParticleContainer): js.Array[ParticleBuffer] = js.native
  def uploadAlpha(
    children: js.Array[pixiDotJsLib.PIXINs.DisplayObject],
    startIndex: scala.Double,
    amount: scala.Double,
    array: js.Array[scala.Double],
    stride: scala.Double,
    offset: scala.Double
  ): scala.Unit = js.native
  def uploadPosition(
    children: js.Array[pixiDotJsLib.PIXINs.DisplayObject],
    startIndex: scala.Double,
    amount: scala.Double,
    array: js.Array[scala.Double],
    stride: scala.Double,
    offset: scala.Double
  ): scala.Unit = js.native
  def uploadRotation(
    children: js.Array[pixiDotJsLib.PIXINs.DisplayObject],
    startIndex: scala.Double,
    amount: scala.Double,
    array: js.Array[scala.Double],
    stride: scala.Double,
    offset: scala.Double
  ): scala.Unit = js.native
  def uploadTint(
    children: js.Array[pixiDotJsLib.PIXINs.DisplayObject],
    startIndex: scala.Double,
    amount: scala.Double,
    array: js.Array[scala.Double],
    stride: scala.Double,
    offset: scala.Double
  ): scala.Unit = js.native
  def uploadUvs(
    children: js.Array[pixiDotJsLib.PIXINs.DisplayObject],
    startIndex: scala.Double,
    amount: scala.Double,
    array: js.Array[scala.Double],
    stride: scala.Double,
    offset: scala.Double
  ): scala.Unit = js.native
  def uploadVertices(
    children: js.Array[pixiDotJsLib.PIXINs.DisplayObject],
    startIndex: scala.Double,
    amount: scala.Double,
    array: js.Array[scala.Double],
    stride: scala.Double,
    offset: scala.Double
  ): scala.Unit = js.native
}

