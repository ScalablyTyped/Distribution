package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdRev extends js.Object {
  var id: java.lang.String
  var rev: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId
}

object Anon_IdRev {
  @scala.inline
  def apply(id: java.lang.String, rev: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId): Anon_IdRev = {
    val __obj = js.Dynamic.literal(id = id, rev = rev)
  
    __obj.asInstanceOf[Anon_IdRev]
  }
}

