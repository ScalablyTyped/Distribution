package typings
package nedbLib.nedbMod.NedbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * multi (defaults to false) which allows the modification of several documents if set to true
  * upsert (defaults to false) if you want to insert a new document corresponding to the update rules if your query doesn't match anything
  */
trait UpdateOptions extends js.Object {
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  var returnUpdatedDocs: js.UndefOr[scala.Boolean] = js.undefined
  var upsert: js.UndefOr[scala.Boolean] = js.undefined
}

