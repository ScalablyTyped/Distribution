package typings
package preactLib.preactMod.preactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentConstructor[P, S]
  extends ScalablyTyped.runtime.Instantiable1[/* props */ P, Component[P, S]]
     with ScalablyTyped.runtime.Instantiable2[/* props */ P, /* context */ js.Any, Component[P, S]] {
  var defaultProps: js.UndefOr[stdLib.Partial[P]] = js.native
  var displayName: js.UndefOr[java.lang.String] = js.native
}

