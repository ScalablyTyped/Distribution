package typings.p2.global.p2

import typings.p2.mod.RayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.Ray")
@js.native
class Ray ()
  extends typings.p2.mod.Ray {
  def this(options: RayOptions) = this()
}
/* static members */
object Ray {
  
  @JSGlobal("p2.Ray")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("p2.Ray.ALL")
  @js.native
  def ALL: Double = js.native
  inline def ALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Ray.ANY")
  @js.native
  def ANY: Double = js.native
  inline def ANY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Ray.CLOSEST")
  @js.native
  def CLOSEST: Double = js.native
  inline def CLOSEST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSEST")(x.asInstanceOf[js.Any])
}
