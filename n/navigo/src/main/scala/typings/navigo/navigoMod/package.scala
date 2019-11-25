package typings.navigo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object navigoMod {
  import typings.navigo.Anon_As

  type Params = State
  type RouteHandler = (js.Function2[/* params */ Params, /* query */ String, Unit]) | Anon_As
  type State = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in navigo.Keys ]: any}
    */ typings.navigo.navigoStrings.State with js.Any
}
