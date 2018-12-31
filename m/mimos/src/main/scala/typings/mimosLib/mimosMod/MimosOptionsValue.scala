package typings
package mimosLib.mimosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MimosOptionsValue
  extends mimeDashDbLib.mimeDashDbMod.DataStructure {
  /** method with signature function(mime) when this mime type is found in the database, this function will run. This allows you make customizations to mime based on developer criteria. */
  var predicate: js.UndefOr[js.Function1[/* mime */ MimosOptionsValue, MimosOptionsValue]] = js.undefined
  /** specify the type value of result objects, defaults to key. See the example below for more clarification. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

