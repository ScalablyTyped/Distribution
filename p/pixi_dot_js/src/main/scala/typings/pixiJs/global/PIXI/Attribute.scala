package typings.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
@JSGlobal("PIXI.Attribute")
@js.native
class Attribute protected ()
  extends StObject
     with typings.pixiJs.PIXI.Attribute {
  def this(buffer: String) = this()
  def this(buffer: String, size: Double) = this()
  def this(buffer: String, size: Double, normalized: Boolean) = this()
  def this(buffer: String, size: Unit, normalized: Boolean) = this()
  def this(buffer: String, size: Double, normalized: Boolean, `type`: Double) = this()
  def this(buffer: String, size: Double, normalized: Unit, `type`: Double) = this()
  def this(buffer: String, size: Unit, normalized: Boolean, `type`: Double) = this()
  def this(buffer: String, size: Unit, normalized: Unit, `type`: Double) = this()
  def this(buffer: String, size: Double, normalized: Boolean, `type`: Double, stride: Double) = this()
  def this(buffer: String, size: Double, normalized: Boolean, `type`: Unit, stride: Double) = this()
  def this(buffer: String, size: Double, normalized: Unit, `type`: Double, stride: Double) = this()
  def this(buffer: String, size: Double, normalized: Unit, `type`: Unit, stride: Double) = this()
  def this(buffer: String, size: Unit, normalized: Boolean, `type`: Double, stride: Double) = this()
  def this(buffer: String, size: Unit, normalized: Boolean, `type`: Unit, stride: Double) = this()
  def this(buffer: String, size: Unit, normalized: Unit, `type`: Double, stride: Double) = this()
  def this(buffer: String, size: Unit, normalized: Unit, `type`: Unit, stride: Double) = this()
  def this(buffer: String, size: Double, normalized: Boolean, `type`: Double, stride: Double, start: Double) = this()
  def this(buffer: String, size: Double, normalized: Boolean, `type`: Double, stride: Unit, start: Double) = this()
  def this(buffer: String, size: Double, normalized: Boolean, `type`: Unit, stride: Double, start: Double) = this()
  def this(buffer: String, size: Double, normalized: Boolean, `type`: Unit, stride: Unit, start: Double) = this()
  def this(buffer: String, size: Double, normalized: Unit, `type`: Double, stride: Double, start: Double) = this()
  def this(buffer: String, size: Double, normalized: Unit, `type`: Double, stride: Unit, start: Double) = this()
  def this(buffer: String, size: Double, normalized: Unit, `type`: Unit, stride: Double, start: Double) = this()
  def this(buffer: String, size: Double, normalized: Unit, `type`: Unit, stride: Unit, start: Double) = this()
  def this(buffer: String, size: Unit, normalized: Boolean, `type`: Double, stride: Double, start: Double) = this()
  def this(buffer: String, size: Unit, normalized: Boolean, `type`: Double, stride: Unit, start: Double) = this()
  def this(buffer: String, size: Unit, normalized: Boolean, `type`: Unit, stride: Double, start: Double) = this()
  def this(buffer: String, size: Unit, normalized: Boolean, `type`: Unit, stride: Unit, start: Double) = this()
  def this(buffer: String, size: Unit, normalized: Unit, `type`: Double, stride: Double, start: Double) = this()
  def this(buffer: String, size: Unit, normalized: Unit, `type`: Double, stride: Unit, start: Double) = this()
  def this(buffer: String, size: Unit, normalized: Unit, `type`: Unit, stride: Double, start: Double) = this()
  def this(buffer: String, size: Unit, normalized: Unit, `type`: Unit, stride: Unit, start: Double) = this()
  
  /**
    * Destroys the Attribute.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}
object Attribute {
  
  @JSGlobal("PIXI.Attribute")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  @scala.inline
  def from(buffer: String): typings.pixiJs.PIXI.Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Attribute]
  @scala.inline
  def from(buffer: String, size: Double): typings.pixiJs.PIXI.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Attribute]
  @scala.inline
  def from(buffer: String, size: Double, normalized: Boolean): typings.pixiJs.PIXI.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Attribute]
  @scala.inline
  def from(buffer: String, size: Double, normalized: Boolean, `type`: Double): typings.pixiJs.PIXI.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Attribute]
  @scala.inline
  def from(buffer: String, size: Double, normalized: Boolean, `type`: Double, stride: Double): typings.pixiJs.PIXI.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Attribute]
  @scala.inline
  def from(buffer: String, size: Double, normalized: Boolean, `type`: Unit, stride: Double): typings.pixiJs.PIXI.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Attribute]
  @scala.inline
  def from(buffer: String, size: Double, normalized: Unit, `type`: Double): typings.pixiJs.PIXI.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Attribute]
  @scala.inline
  def from(buffer: String, size: Double, normalized: Unit, `type`: Double, stride: Double): typings.pixiJs.PIXI.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Attribute]
  @scala.inline
  def from(buffer: String, size: Double, normalized: Unit, `type`: Unit, stride: Double): typings.pixiJs.PIXI.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Attribute]
  @scala.inline
  def from(buffer: String, size: Unit, normalized: Boolean): typings.pixiJs.PIXI.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Attribute]
  @scala.inline
  def from(buffer: String, size: Unit, normalized: Boolean, `type`: Double): typings.pixiJs.PIXI.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Attribute]
  @scala.inline
  def from(buffer: String, size: Unit, normalized: Boolean, `type`: Double, stride: Double): typings.pixiJs.PIXI.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Attribute]
  @scala.inline
  def from(buffer: String, size: Unit, normalized: Boolean, `type`: Unit, stride: Double): typings.pixiJs.PIXI.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Attribute]
  @scala.inline
  def from(buffer: String, size: Unit, normalized: Unit, `type`: Double): typings.pixiJs.PIXI.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Attribute]
  @scala.inline
  def from(buffer: String, size: Unit, normalized: Unit, `type`: Double, stride: Double): typings.pixiJs.PIXI.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Attribute]
  @scala.inline
  def from(buffer: String, size: Unit, normalized: Unit, `type`: Unit, stride: Double): typings.pixiJs.PIXI.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Attribute]
}
