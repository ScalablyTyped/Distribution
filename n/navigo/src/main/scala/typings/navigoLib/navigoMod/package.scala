package typings
package navigoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object navigoMod {
  type Params = State
  type RouteHandler = (js.Function2[/* params */ Params, /* query */ java.lang.String, scala.Unit]) | navigoLib.Anon_As
  type State = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in navigo.Keys ]: any}
    */ navigoLib.navigoLibStrings.State with js.Any
}
