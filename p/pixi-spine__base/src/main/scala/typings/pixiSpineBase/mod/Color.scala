package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/base", "Color")
@js.native
open class Color () extends StObject {
  def this(r: Double) = this()
  def this(r: Double, g: Double) = this()
  def this(r: Unit, g: Double) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(r: Double, g: Unit, b: Double) = this()
  def this(r: Unit, g: Double, b: Double) = this()
  def this(r: Unit, g: Unit, b: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
  def this(r: Double, g: Double, b: Unit, a: Double) = this()
  def this(r: Double, g: Unit, b: Double, a: Double) = this()
  def this(r: Double, g: Unit, b: Unit, a: Double) = this()
  def this(r: Unit, g: Double, b: Double, a: Double) = this()
  def this(r: Unit, g: Double, b: Unit, a: Double) = this()
  def this(r: Unit, g: Unit, b: Double, a: Double) = this()
  def this(r: Unit, g: Unit, b: Unit, a: Double) = this()
  
  var a: Double = js.native
  
  def add(r: Double, g: Double, b: Double, a: Double): this.type = js.native
  
  var b: Double = js.native
  
  def clamp(): this.type = js.native
  
  var g: Double = js.native
  
  var r: Double = js.native
  
  def set(r: Double, g: Double, b: Double, a: Double): this.type = js.native
  
  def setFromColor(c: Color): this.type = js.native
  
  def setFromString(hex: String): this.type = js.native
}
/* static members */
object Color {
  
  @JSImport("@pixi-spine/base", "Color")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/base", "Color.BLUE")
  @js.native
  def BLUE: Color = js.native
  inline def BLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/base", "Color.GREEN")
  @js.native
  def GREEN: Color = js.native
  inline def GREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREEN")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/base", "Color.MAGENTA")
  @js.native
  def MAGENTA: Color = js.native
  inline def MAGENTA_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGENTA")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/base", "Color.RED")
  @js.native
  def RED: Color = js.native
  inline def RED_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RED")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/base", "Color.WHITE")
  @js.native
  def WHITE: Color = js.native
  inline def WHITE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHITE")(x.asInstanceOf[js.Any])
  
  inline def fromString(hex: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(hex.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  inline def rgb888ToColor(color: Color, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb888ToColor")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rgba8888ToColor(color: Color, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba8888ToColor")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
