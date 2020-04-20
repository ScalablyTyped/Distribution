package typings.navigo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Keys = java.lang.String
  type Params = typings.navigo.mod.State
  type RouteHandler = (js.Function2[/* params */ typings.navigo.mod.Params, /* query */ java.lang.String, scala.Unit]) | typings.navigo.AnonAs
  type State = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in navigo.navigo.Keys ]: any}
    */ typings.navigo.navigoStrings.State with org.scalablytyped.runtime.TopLevel[js.Any]
}
