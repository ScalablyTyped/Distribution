package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of an RGBA color.
  */
@JSGlobal("pc.Color")
@js.native
/**
  * Create a new Color object.
  *
  * @param {number|number[]} [r] - The value of the red component (0-1). Defaults to 0. If r is
  * an array of length 3 or 4, the array will be used to populate all components.
  * @param {number} [g] - The value of the green component (0-1). Defaults to 0.
  * @param {number} [b] - The value of the blue component (0-1). Defaults to 0.
  * @param {number} [a] - The value of the alpha component (0-1). Defaults to 1.
  */
open class Color ()
  extends typings.playcanvas.mod.Color {
  def this(r: js.Array[Double]) = this()
  def this(r: Double) = this()
  def this(r: js.Array[Double], g: Double) = this()
  def this(r: Double, g: Double) = this()
  def this(r: Unit, g: Double) = this()
  def this(r: js.Array[Double], g: Double, b: Double) = this()
  def this(r: js.Array[Double], g: Unit, b: Double) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(r: Double, g: Unit, b: Double) = this()
  def this(r: Unit, g: Double, b: Double) = this()
  def this(r: Unit, g: Unit, b: Double) = this()
  def this(r: js.Array[Double], g: Double, b: Double, a: Double) = this()
  def this(r: js.Array[Double], g: Double, b: Unit, a: Double) = this()
  def this(r: js.Array[Double], g: Unit, b: Double, a: Double) = this()
  def this(r: js.Array[Double], g: Unit, b: Unit, a: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
  def this(r: Double, g: Double, b: Unit, a: Double) = this()
  def this(r: Double, g: Unit, b: Double, a: Double) = this()
  def this(r: Double, g: Unit, b: Unit, a: Double) = this()
  def this(r: Unit, g: Double, b: Double, a: Double) = this()
  def this(r: Unit, g: Double, b: Unit, a: Double) = this()
  def this(r: Unit, g: Unit, b: Double, a: Double) = this()
  def this(r: Unit, g: Unit, b: Unit, a: Double) = this()
}
object Color {
  
  /**
    * A constant color set to black [0, 0, 0, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Color.BLACK")
  @js.native
  val BLACK: typings.playcanvas.mod.Color = js.native
  
  /**
    * A constant color set to blue [0, 0, 1, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Color.BLUE")
  @js.native
  val BLUE: typings.playcanvas.mod.Color = js.native
  
  /**
    * A constant color set to cyan [0, 1, 1, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Color.CYAN")
  @js.native
  val CYAN: typings.playcanvas.mod.Color = js.native
  
  /**
    * A constant color set to gray [0.5, 0.5, 0.5, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Color.GRAY")
  @js.native
  val GRAY: typings.playcanvas.mod.Color = js.native
  
  /**
    * A constant color set to green [0, 1, 0, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Color.GREEN")
  @js.native
  val GREEN: typings.playcanvas.mod.Color = js.native
  
  /**
    * A constant color set to magenta [1, 0, 1, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Color.MAGENTA")
  @js.native
  val MAGENTA: typings.playcanvas.mod.Color = js.native
  
  /**
    * A constant color set to red [1, 0, 0, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Color.RED")
  @js.native
  val RED: typings.playcanvas.mod.Color = js.native
  
  /**
    * A constant color set to white [1, 1, 1, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Color.WHITE")
  @js.native
  val WHITE: typings.playcanvas.mod.Color = js.native
  
  /**
    * A constant color set to yellow [1, 1, 0, 1].
    *
    * @type {Color}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Color.YELLOW")
  @js.native
  val YELLOW: typings.playcanvas.mod.Color = js.native
}
