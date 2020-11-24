package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds the information for a single attribute structure required to render geometry.
  *
  * This does not contain the actual data, but instead has a buffer id that maps to a {@link PIXI.Buffer}
  * This can include anything from positions, uvs, normals, colors etc.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Attribute")
@js.native
class Attribute protected ()
  extends typings.pixiJs.PIXI.Attribute {
  def this(buffer: String) = this()
  def this(buffer: String, size: Double) = this()
  def this(buffer: String, size: js.UndefOr[scala.Nothing], normalized: Boolean) = this()
  def this(buffer: String, size: Double, normalized: Boolean) = this()
  def this(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: js.UndefOr[scala.Nothing],
    `type`: Double
  ) = this()
  def this(buffer: String, size: js.UndefOr[scala.Nothing], normalized: Boolean, `type`: Double) = this()
  def this(buffer: String, size: Double, normalized: js.UndefOr[scala.Nothing], `type`: Double) = this()
  def this(buffer: String, size: Double, normalized: Boolean, `type`: Double) = this()
  def this(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    stride: Double
  ) = this()
  def this(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: js.UndefOr[scala.Nothing],
    `type`: Double,
    stride: Double
  ) = this()
  def this(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: Boolean,
    `type`: js.UndefOr[scala.Nothing],
    stride: Double
  ) = this()
  def this(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: Boolean,
    `type`: Double,
    stride: Double
  ) = this()
  def this(
    buffer: String,
    size: Double,
    normalized: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    stride: Double
  ) = this()
  def this(
    buffer: String,
    size: Double,
    normalized: js.UndefOr[scala.Nothing],
    `type`: Double,
    stride: Double
  ) = this()
  def this(
    buffer: String,
    size: Double,
    normalized: Boolean,
    `type`: js.UndefOr[scala.Nothing],
    stride: Double
  ) = this()
  def this(buffer: String, size: Double, normalized: Boolean, `type`: Double, stride: Double) = this()
  def this(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    stride: js.UndefOr[scala.Nothing],
    start: Double
  ) = this()
  def this(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    stride: Double,
    start: Double
  ) = this()
  def this(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: js.UndefOr[scala.Nothing],
    `type`: Double,
    stride: js.UndefOr[scala.Nothing],
    start: Double
  ) = this()
  def this(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: js.UndefOr[scala.Nothing],
    `type`: Double,
    stride: Double,
    start: Double
  ) = this()
  def this(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: Boolean,
    `type`: js.UndefOr[scala.Nothing],
    stride: js.UndefOr[scala.Nothing],
    start: Double
  ) = this()
  def this(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: Boolean,
    `type`: js.UndefOr[scala.Nothing],
    stride: Double,
    start: Double
  ) = this()
  def this(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: Boolean,
    `type`: Double,
    stride: js.UndefOr[scala.Nothing],
    start: Double
  ) = this()
  def this(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: Boolean,
    `type`: Double,
    stride: Double,
    start: Double
  ) = this()
  def this(
    buffer: String,
    size: Double,
    normalized: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    stride: js.UndefOr[scala.Nothing],
    start: Double
  ) = this()
  def this(
    buffer: String,
    size: Double,
    normalized: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    stride: Double,
    start: Double
  ) = this()
  def this(
    buffer: String,
    size: Double,
    normalized: js.UndefOr[scala.Nothing],
    `type`: Double,
    stride: js.UndefOr[scala.Nothing],
    start: Double
  ) = this()
  def this(
    buffer: String,
    size: Double,
    normalized: js.UndefOr[scala.Nothing],
    `type`: Double,
    stride: Double,
    start: Double
  ) = this()
  def this(
    buffer: String,
    size: Double,
    normalized: Boolean,
    `type`: js.UndefOr[scala.Nothing],
    stride: js.UndefOr[scala.Nothing],
    start: Double
  ) = this()
  def this(
    buffer: String,
    size: Double,
    normalized: Boolean,
    `type`: js.UndefOr[scala.Nothing],
    stride: Double,
    start: Double
  ) = this()
  def this(
    buffer: String,
    size: Double,
    normalized: Boolean,
    `type`: Double,
    stride: js.UndefOr[scala.Nothing],
    start: Double
  ) = this()
  def this(buffer: String, size: Double, normalized: Boolean, `type`: Double, stride: Double, start: Double) = this()
}
/* static members */
@JSImport("pixi.js", "Attribute")
@js.native
object Attribute extends js.Object {
  
  /**
    * Helper function that creates an Attribute based on the information provided
    *
    * @static
    * @param {string} buffer - the id of the buffer that this attribute will look for
    * @param {Number} [size=0] - the size of the attribute. If you have 2 floats per vertex (eg position x and y) this would be 2
    * @param {Boolean} [normalized=false] - should the data be normalized.
    * @param {Number} [type=PIXI.TYPES.FLOAT] - what type of number is the attribute. Check {@link PIXI.TYPES} to see the ones available
    * @param {Number} [stride=0] - How far apart (in floats) the start of each value is. (used for interleaving data)
    *
    * @returns {PIXI.Attribute} A new {@link PIXI.Attribute} based on the information provided
    */
  def from(buffer: String): typings.pixiJs.PIXI.Attribute = js.native
  def from(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    stride: Double
  ): typings.pixiJs.PIXI.Attribute = js.native
  def from(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: js.UndefOr[scala.Nothing],
    `type`: Double
  ): typings.pixiJs.PIXI.Attribute = js.native
  def from(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: js.UndefOr[scala.Nothing],
    `type`: Double,
    stride: Double
  ): typings.pixiJs.PIXI.Attribute = js.native
  def from(buffer: String, size: js.UndefOr[scala.Nothing], normalized: Boolean): typings.pixiJs.PIXI.Attribute = js.native
  def from(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: Boolean,
    `type`: js.UndefOr[scala.Nothing],
    stride: Double
  ): typings.pixiJs.PIXI.Attribute = js.native
  def from(buffer: String, size: js.UndefOr[scala.Nothing], normalized: Boolean, `type`: Double): typings.pixiJs.PIXI.Attribute = js.native
  def from(
    buffer: String,
    size: js.UndefOr[scala.Nothing],
    normalized: Boolean,
    `type`: Double,
    stride: Double
  ): typings.pixiJs.PIXI.Attribute = js.native
  def from(buffer: String, size: Double): typings.pixiJs.PIXI.Attribute = js.native
  def from(
    buffer: String,
    size: Double,
    normalized: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    stride: Double
  ): typings.pixiJs.PIXI.Attribute = js.native
  def from(buffer: String, size: Double, normalized: js.UndefOr[scala.Nothing], `type`: Double): typings.pixiJs.PIXI.Attribute = js.native
  def from(
    buffer: String,
    size: Double,
    normalized: js.UndefOr[scala.Nothing],
    `type`: Double,
    stride: Double
  ): typings.pixiJs.PIXI.Attribute = js.native
  def from(buffer: String, size: Double, normalized: Boolean): typings.pixiJs.PIXI.Attribute = js.native
  def from(
    buffer: String,
    size: Double,
    normalized: Boolean,
    `type`: js.UndefOr[scala.Nothing],
    stride: Double
  ): typings.pixiJs.PIXI.Attribute = js.native
  def from(buffer: String, size: Double, normalized: Boolean, `type`: Double): typings.pixiJs.PIXI.Attribute = js.native
  def from(buffer: String, size: Double, normalized: Boolean, `type`: Double, stride: Double): typings.pixiJs.PIXI.Attribute = js.native
}
