package typings.ospec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ospecMod {
  import org.scalablytyped.runtime.Instantiable1
  import typings.std.Error

  type AssertionDescriber = js.Function1[/* description */ String, Unit]
  type Definer = js.Function2[
    /* done */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
    /* timeout */ js.Function1[/* delay */ Double, Unit], 
    Unit | js.Thenable[js.Any]
  ]
  type ObjectConstructor = Instantiable1[/* args (repeated) */ js.Any, js.Any]
  type Reporter = js.Function1[/* results */ js.Array[Result], Double]
}
