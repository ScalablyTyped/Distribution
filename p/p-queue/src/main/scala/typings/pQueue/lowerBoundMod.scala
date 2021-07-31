package typings.pQueue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lowerBoundMod {
  
  @JSImport("p-queue/dist/lower-bound", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](array: js.Array[T], value: T, comparator: js.Function2[/* a */ T, /* b */ T, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Double]
}
