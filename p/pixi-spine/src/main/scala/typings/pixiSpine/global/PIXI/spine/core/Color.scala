package typings.pixiSpine.global.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.Color")
@js.native
class Color ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.Color {
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
  
  /* CompleteClass */
  var a: Double = js.native
  
  /* CompleteClass */
  override def add(r: Double, g: Double, b: Double, a: Double): this.type = js.native
  
  /* CompleteClass */
  var b: Double = js.native
  
  /* CompleteClass */
  override def clamp(): this.type = js.native
  
  /* CompleteClass */
  var g: Double = js.native
  
  /* CompleteClass */
  var r: Double = js.native
  
  /* CompleteClass */
  override def set(r: Double, g: Double, b: Double, a: Double): this.type = js.native
  
  /* CompleteClass */
  override def setFromColor(c: typings.pixiSpine.PIXI.spine.core.Color): this.type = js.native
  
  /* CompleteClass */
  override def setFromString(hex: String): this.type = js.native
}
object Color {
  
  @JSGlobal("PIXI.spine.core.Color")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Color.BLUE")
  @js.native
  def BLUE: typings.pixiSpine.PIXI.spine.core.Color = js.native
  @scala.inline
  def BLUE_=(x: typings.pixiSpine.PIXI.spine.core.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Color.GREEN")
  @js.native
  def GREEN: typings.pixiSpine.PIXI.spine.core.Color = js.native
  @scala.inline
  def GREEN_=(x: typings.pixiSpine.PIXI.spine.core.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Color.MAGENTA")
  @js.native
  def MAGENTA: typings.pixiSpine.PIXI.spine.core.Color = js.native
  @scala.inline
  def MAGENTA_=(x: typings.pixiSpine.PIXI.spine.core.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGENTA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Color.RED")
  @js.native
  def RED: typings.pixiSpine.PIXI.spine.core.Color = js.native
  @scala.inline
  def RED_=(x: typings.pixiSpine.PIXI.spine.core.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Color.WHITE")
  @js.native
  def WHITE: typings.pixiSpine.PIXI.spine.core.Color = js.native
  @scala.inline
  def WHITE_=(x: typings.pixiSpine.PIXI.spine.core.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHITE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def rgb888ToColor(color: typings.pixiSpine.PIXI.spine.core.Color, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb888ToColor")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def rgba8888ToColor(color: typings.pixiSpine.PIXI.spine.core.Color, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba8888ToColor")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
