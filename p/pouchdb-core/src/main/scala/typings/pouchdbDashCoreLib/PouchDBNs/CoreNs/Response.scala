package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends BasicResponse {
  /** id of the targeted document */
  var id: DocumentId
  /** resulting revision of the targeted document */
  var rev: RevisionId
}

