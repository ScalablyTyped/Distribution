package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResponseChange[Content /* <: js.Object */] extends js.Object {
  var changes: js.Array[pouchdbDashCoreLib.Anon_Rev]
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var doc: js.UndefOr[ExistingDocument[Content with ChangesMeta]] = js.undefined
  var id: java.lang.String
  var seq: scala.Double | java.lang.String
}

