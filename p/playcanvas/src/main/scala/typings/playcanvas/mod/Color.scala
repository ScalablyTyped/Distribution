package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new Color object.
  * @property r - The red component of the color.
  * @property g - The green component of the color.
  * @property b - The blue component of the color.
  * @property a - The alpha component of the color.
  * @param [r] - The value of the red component (0-1). If r is an array of length 3 or 4, the array will be used to populate all components.
  * @param [g] - The value of the green component (0-1).
  * @param [b] - The value of the blue component (0-1).
  * @param [a] - The value of the alpha component (0-1).
  */
@JSImport("playcanvas", "Color")
@js.native
class Color ()
  extends typings.playcanvas.pc.Color {
  def this(r: js.Array[Double]) = this()
  def this(r: Double) = this()
  def this(r: js.UndefOr[scala.Nothing], g: Double) = this()
  def this(r: js.Array[Double], g: Double) = this()
  def this(r: Double, g: Double) = this()
  def this(r: js.UndefOr[scala.Nothing], g: js.UndefOr[scala.Nothing], b: Double) = this()
  def this(r: js.UndefOr[scala.Nothing], g: Double, b: Double) = this()
  def this(r: js.Array[Double], g: js.UndefOr[scala.Nothing], b: Double) = this()
  def this(r: js.Array[Double], g: Double, b: Double) = this()
  def this(r: Double, g: js.UndefOr[scala.Nothing], b: Double) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(
    r: js.UndefOr[scala.Nothing],
    g: js.UndefOr[scala.Nothing],
    b: js.UndefOr[scala.Nothing],
    a: Double
  ) = this()
  def this(r: js.UndefOr[scala.Nothing], g: js.UndefOr[scala.Nothing], b: Double, a: Double) = this()
  def this(r: js.UndefOr[scala.Nothing], g: Double, b: js.UndefOr[scala.Nothing], a: Double) = this()
  def this(r: js.UndefOr[scala.Nothing], g: Double, b: Double, a: Double) = this()
  def this(r: js.Array[Double], g: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], a: Double) = this()
  def this(r: js.Array[Double], g: js.UndefOr[scala.Nothing], b: Double, a: Double) = this()
  def this(r: js.Array[Double], g: Double, b: js.UndefOr[scala.Nothing], a: Double) = this()
  def this(r: js.Array[Double], g: Double, b: Double, a: Double) = this()
  def this(r: Double, g: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], a: Double) = this()
  def this(r: Double, g: js.UndefOr[scala.Nothing], b: Double, a: Double) = this()
  def this(r: Double, g: Double, b: js.UndefOr[scala.Nothing], a: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
}
object Color {
  
  /**
    * A constant color set to black [0, 0, 0, 1].
    */
  /* static member */
  @JSImport("playcanvas", "Color.BLACK")
  @js.native
  val BLACK: typings.playcanvas.pc.Color = js.native
  
  /**
    * A constant color set to blue [0, 0, 1, 1].
    */
  /* static member */
  @JSImport("playcanvas", "Color.BLUE")
  @js.native
  val BLUE: typings.playcanvas.pc.Color = js.native
  
  /**
    * A constant color set to cyan [0, 1, 1, 1].
    */
  /* static member */
  @JSImport("playcanvas", "Color.CYAN")
  @js.native
  val CYAN: typings.playcanvas.pc.Color = js.native
  
  /**
    * A constant color set to gray [0.5, 0.5, 0.5, 1].
    */
  /* static member */
  @JSImport("playcanvas", "Color.GRAY")
  @js.native
  val GRAY: typings.playcanvas.pc.Color = js.native
  
  /**
    * A constant color set to green [0, 1, 0, 1].
    */
  /* static member */
  @JSImport("playcanvas", "Color.GREEN")
  @js.native
  val GREEN: typings.playcanvas.pc.Color = js.native
  
  /**
    * A constant color set to magenta [1, 0, 1, 1].
    */
  /* static member */
  @JSImport("playcanvas", "Color.MAGENTA")
  @js.native
  val MAGENTA: typings.playcanvas.pc.Color = js.native
  
  /**
    * A constant color set to red [1, 0, 0, 1].
    */
  /* static member */
  @JSImport("playcanvas", "Color.RED")
  @js.native
  val RED: typings.playcanvas.pc.Color = js.native
  
  /**
    * A constant color set to white [1, 1, 1, 1].
    */
  /* static member */
  @JSImport("playcanvas", "Color.WHITE")
  @js.native
  val WHITE: typings.playcanvas.pc.Color = js.native
  
  /**
    * A constant color set to yellow [1, 1, 0, 1].
    */
  /* static member */
  @JSImport("playcanvas", "Color.YELLOW")
  @js.native
  val YELLOW: typings.playcanvas.pc.Color = js.native
}
