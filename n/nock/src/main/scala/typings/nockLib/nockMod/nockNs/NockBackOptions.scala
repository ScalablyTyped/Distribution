package typings
package nockLib.nockMod.nockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NockBackOptions extends js.Object {
  var after: js.UndefOr[js.Function1[/* scope */ Scope, scala.Unit]] = js.undefined
  var afterRecord: js.UndefOr[js.Function1[/* defs */ js.Array[NockDefinition], js.Array[NockDefinition]]] = js.undefined
  var before: js.UndefOr[js.Function1[/* def */ NockDefinition, scala.Unit]] = js.undefined
  var recorder: js.UndefOr[RecorderOptions] = js.undefined
}

