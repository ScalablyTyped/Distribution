package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object navigoLib {
  type Keys = java.lang.String
  type Params = State
  type RouteHandler = (js.Function2[/* params */ Params, /* query */ java.lang.String, scala.Unit]) | Anon_As
  type State = navigoLib.navigoLibStrings.State with js.Any
}
