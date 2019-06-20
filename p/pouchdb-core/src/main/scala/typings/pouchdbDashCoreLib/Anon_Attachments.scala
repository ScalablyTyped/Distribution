package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attachments extends js.Object {
  var _attachments: js.UndefOr[pouchdbDashCoreLib.PouchDBNs.CoreNs.Attachments] = js.undefined
  /** You can update an existing doc using _rev */
  var _rev: js.UndefOr[pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId] = js.undefined
  var filters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var views: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Anon_Map]] = js.undefined
}

object Anon_Attachments {
  @scala.inline
  def apply(
    _attachments: pouchdbDashCoreLib.PouchDBNs.CoreNs.Attachments = null,
    _rev: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId = null,
    filters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    views: org.scalablytyped.runtime.StringDictionary[Anon_Map] = null
  ): Anon_Attachments = {
    val __obj = js.Dynamic.literal()
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments)
    if (_rev != null) __obj.updateDynamic("_rev")(_rev)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[Anon_Attachments]
  }
}

