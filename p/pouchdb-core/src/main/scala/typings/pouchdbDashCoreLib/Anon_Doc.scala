package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Doc[Content /* <: js.Object */] extends js.Object {
  /** Only present if `include_docs` was `true`. */
  var doc: js.UndefOr[
    pouchdbDashCoreLib.PouchDBNs.CoreNs.ExistingDocument[Content with pouchdbDashCoreLib.PouchDBNs.CoreNs.AllDocsMeta]
  ] = js.undefined
  var id: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId
  var key: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentKey
  var value: Anon_Deleted
}

