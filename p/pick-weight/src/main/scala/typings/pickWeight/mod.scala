package typings.pickWeight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* was `typeof weighted` */
  inline def apply[T](arr: js.Array[T], weights: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("pick-weight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
