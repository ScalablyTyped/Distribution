package typings.p2.global.p2

import typings.p2.mod.RayOptions
import typings.p2.p2Ints.`1`
import typings.p2.p2Ints.`2`
import typings.p2.p2Ints.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.Ray")
@js.native
open class Ray ()
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
  def ALL: `4` = js.native
  inline def ALL_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Ray.ANY")
  @js.native
  def ANY: `2` = js.native
  inline def ANY_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Ray.CLOSEST")
  @js.native
  def CLOSEST: `1` = js.native
  inline def CLOSEST_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSEST")(x.asInstanceOf[js.Any])
}
