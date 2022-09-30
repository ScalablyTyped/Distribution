package typings.p2.global.p2

import typings.p2.mod.ShapeOptions
import typings.p2.p2Ints.`128`
import typings.p2.p2Ints.`16`
import typings.p2.p2Ints.`1`
import typings.p2.p2Ints.`2`
import typings.p2.p2Ints.`32`
import typings.p2.p2Ints.`4`
import typings.p2.p2Ints.`64`
import typings.p2.p2Ints.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.Shape")
@js.native
open class Shape ()
  extends typings.p2.mod.Shape {
  def this(options: ShapeOptions) = this()
}
/* static members */
object Shape {
  
  @JSGlobal("p2.Shape")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("p2.Shape.BOX")
  @js.native
  def BOX: `32` = js.native
  inline def BOX_=(x: `32`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOX")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Shape.CAPSULE")
  @js.native
  def CAPSULE: `64` = js.native
  inline def CAPSULE_=(x: `64`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAPSULE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Shape.CIRCLE")
  @js.native
  def CIRCLE: `1` = js.native
  inline def CIRCLE_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CIRCLE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Shape.CONVEX")
  @js.native
  def CONVEX: `8` = js.native
  inline def CONVEX_=(x: `8`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONVEX")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Shape.HEIGHTFIELD")
  @js.native
  def HEIGHTFIELD: `128` = js.native
  inline def HEIGHTFIELD_=(x: `128`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEIGHTFIELD")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Shape.LINE")
  @js.native
  def LINE: `16` = js.native
  inline def LINE_=(x: `16`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Shape.PARTICLE")
  @js.native
  def PARTICLE: `2` = js.native
  inline def PARTICLE_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PARTICLE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Shape.PLANE")
  @js.native
  def PLANE: `4` = js.native
  inline def PLANE_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLANE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Shape.idCounter")
  @js.native
  def idCounter: Double = js.native
  inline def idCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idCounter")(x.asInstanceOf[js.Any])
}
