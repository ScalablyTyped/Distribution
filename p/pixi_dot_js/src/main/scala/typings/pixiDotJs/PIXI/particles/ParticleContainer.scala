package typings.pixiDotJs.PIXI.particles

import org.scalablytyped.runtime.NumberDictionary
import typings.pixiDotJs.PIXI.BaseTexture
import typings.pixiDotJs.PIXI.Container
import typings.std.WebGLBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.particles.ParticleContainer")
@js.native
class ParticleContainer () extends Container {
  def this(maxSize: Double) = this()
  def this(maxSize: Double, properties: ParticleContainerProperties) = this()
  def this(maxSize: Double, properties: ParticleContainerProperties, batchSize: Double) = this()
  def this(maxSize: Double, properties: ParticleContainerProperties, batchSize: Double, autoResize: Boolean) = this()
  var _batchSize: Double = js.native
  var _bufferUpdateIDs: js.Array[Double] = js.native
  var _glBuffers: NumberDictionary[WebGLBuffer] = js.native
  var _maxSize: Double = js.native
  var _properties: js.Array[Boolean] = js.native
  var _tint: Double = js.native
  var _updateID: Double = js.native
  var autoSize: Boolean = js.native
  var baseTexture: BaseTexture = js.native
  var blendMode: Double = js.native
  var roundPixels: Boolean = js.native
  var tint: Double = js.native
  var tintRgb: Double | js.Array[_] = js.native
  /* protected */ def onChildrenChange(): Unit = js.native
  /* protected */ def onChildrenChange(smallestChildIndex: Double): Unit = js.native
  def setProperties(properties: ParticleContainerProperties): Unit = js.native
}

