package typings.p2.global.p2

import typings.p2.mod.ConvexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.Convex")
@js.native
open class Convex ()
  extends typings.p2.mod.Convex {
  def this(options: ConvexOptions) = this()
}
/* static members */
object Convex {
  
  @JSGlobal("p2.Convex")
  @js.native
  val ^ : js.Any = js.native
  
  inline def triangleArea(a: js.Array[Double], b: js.Array[Double], c: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("triangleArea")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]
}
