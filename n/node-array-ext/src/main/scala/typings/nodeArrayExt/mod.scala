package typings.nodeArrayExt

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-array-ext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asyncEach[T](
    array: js.Array[T],
    each: js.Function3[
      /* i */ Double, 
      /* element */ T, 
      /* done */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ],
    finish: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncEach")(array.asInstanceOf[js.Any], each.asInstanceOf[js.Any], finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def awaitEach[T](
    array: js.Array[T],
    each: js.Function3[
      /* i */ Double, 
      /* element */ T, 
      /* done */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ],
    finish: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("awaitEach")(array.asInstanceOf[js.Any], each.asInstanceOf[js.Any], finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
