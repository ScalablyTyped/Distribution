package typings.pouchdbDashCore

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbDashCore.PouchDBNs.CoreNs.Attachments
import typings.pouchdbDashCore.PouchDBNs.CoreNs.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attachments extends js.Object {
  var _attachments: js.UndefOr[Attachments] = js.undefined
  /** You can update an existing doc using _rev */
  var _rev: js.UndefOr[RevisionId] = js.undefined
  var filters: js.UndefOr[StringDictionary[String]] = js.undefined
  var views: js.UndefOr[StringDictionary[Anon_Map]] = js.undefined
}

object Anon_Attachments {
  @scala.inline
  def apply(
    _attachments: Attachments = null,
    _rev: RevisionId = null,
    filters: StringDictionary[String] = null,
    views: StringDictionary[Anon_Map] = null
  ): Anon_Attachments = {
    val __obj = js.Dynamic.literal()
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments)
    if (_rev != null) __obj.updateDynamic("_rev")(_rev)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[Anon_Attachments]
  }
}

