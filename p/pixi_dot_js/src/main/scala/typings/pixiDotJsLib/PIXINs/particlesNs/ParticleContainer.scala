package typings
package pixiDotJsLib.PIXINs.particlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.particles.ParticleContainer")
@js.native
class ParticleContainer ()
  extends pixiDotJsLib.PIXINs.Container {
  def this(maxSize: scala.Double) = this()
  def this(maxSize: scala.Double, properties: ParticleContainerProperties) = this()
  def this(maxSize: scala.Double, properties: ParticleContainerProperties, batchSize: scala.Double) = this()
  def this(maxSize: scala.Double, properties: ParticleContainerProperties, batchSize: scala.Double, autoResize: scala.Boolean) = this()
  var _batchSize: scala.Double = js.native
  var _bufferUpdateIDs: js.Array[scala.Double] = js.native
  var _glBuffers: ScalablyTyped.runtime.NumberDictionary[stdLib.WebGLBuffer] = js.native
  var _maxSize: scala.Double = js.native
  var _properties: js.Array[scala.Boolean] = js.native
  var _tint: scala.Double = js.native
  var _updateID: scala.Double = js.native
  var autoSize: scala.Boolean = js.native
  var baseTexture: pixiDotJsLib.PIXINs.BaseTexture = js.native
  var blendMode: scala.Double = js.native
  var roundPixels: scala.Boolean = js.native
  var tint: scala.Double = js.native
  var tintRgb: scala.Double | js.Array[_] = js.native
  /* protected */ def onChildrenChange(): scala.Unit = js.native
  /* protected */ def onChildrenChange(smallestChildIndex: scala.Double): scala.Unit = js.native
  def setProperties(properties: ParticleContainerProperties): scala.Unit = js.native
}

