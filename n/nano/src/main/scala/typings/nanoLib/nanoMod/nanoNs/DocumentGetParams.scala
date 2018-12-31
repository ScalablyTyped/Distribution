package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid
trait DocumentGetParams extends js.Object {
  // Includes encoding information in attachment stubs if the particular attachment is compressed. Default is
  // false.
  var att_encoding_info: js.UndefOr[scala.Boolean] = js.undefined
  // Includes attachments bodies in response. Default is false.
  var attachments: js.UndefOr[scala.Boolean] = js.undefined
  // Includes attachments only since specified revisions. Doesn’t includes attachments for specified revisions.
  var atts_since: js.UndefOr[js.Array[_]] = js.undefined
  // Includes information about conflicts in document. Default is false.
  var conflicts: js.UndefOr[scala.Boolean] = js.undefined
  // Includes information about deleted conflicted revisions. Default is false.
  var deleted_conflicts: js.UndefOr[scala.Boolean] = js.undefined
  // Forces retrieving latest “leaf” revision, no matter what rev was requested. Default is false.
  var latest: js.UndefOr[scala.Boolean] = js.undefined
  // Includes last update sequence for the document. Default is false.
  var local_seq: js.UndefOr[scala.Boolean] = js.undefined
  // Acts same as specifying all conflicts, deleted_conflicts and revs_info query parameters. Default is false.
  var meta: js.UndefOr[scala.Boolean] = js.undefined
  // Retrieves documents of specified leaf revisions. Additionally, it accepts value as all to return all leaf
  // revisions.
  var open_revs: js.UndefOr[js.Array[_]] = js.undefined
  // Retrieves document of specified revision.
  var rev: js.UndefOr[java.lang.String] = js.undefined
  // Includes list of all known document revisions.
  var revs: js.UndefOr[scala.Boolean] = js.undefined
  // Includes detailed information for all known document revisions. Default is false.
  var revs_info: js.UndefOr[scala.Boolean] = js.undefined
}

