package typings
package mongrationLib.mongrationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MigrationResponse extends js.Object {
  var id: java.lang.String
  var status: mongrationLib.mongrationLibStrings.`not-run` | mongrationLib.mongrationLibStrings.skipped | mongrationLib.mongrationLibStrings.pending | mongrationLib.mongrationLibStrings.ok | mongrationLib.mongrationLibStrings.error | mongrationLib.mongrationLibStrings.rollback | mongrationLib.mongrationLibStrings.`rollback-error`
}

