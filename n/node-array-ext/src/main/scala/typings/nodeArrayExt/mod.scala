package typings.nodeArrayExt

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-array-ext", "asyncEach")
  @js.native
  def asyncEach[T](
    array: js.Array[T],
    each: js.Function3[
      /* i */ Double, 
      /* element */ T, 
      /* done */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ],
    finish: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  
  @JSImport("node-array-ext", "awaitEach")
  @js.native
  def awaitEach[T](
    array: js.Array[T],
    each: js.Function3[
      /* i */ Double, 
      /* element */ T, 
      /* done */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
      Unit
    ],
    finish: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
}
