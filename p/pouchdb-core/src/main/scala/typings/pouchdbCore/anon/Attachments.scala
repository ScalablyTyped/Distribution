package typings.pouchdbCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachments extends js.Object {
  var _attachments: js.UndefOr[typings.pouchdbCore.PouchDB.Core.Attachments] = js.undefined
  /** You can update an existing doc using _rev */
  var _rev: js.UndefOr[RevisionId] = js.undefined
  var filters: js.UndefOr[StringDictionary[String]] = js.undefined
  var views: js.UndefOr[StringDictionary[Map]] = js.undefined
}

object Attachments {
  @scala.inline
  def apply(
    _attachments: typings.pouchdbCore.PouchDB.Core.Attachments = null,
    _rev: RevisionId = null,
    filters: StringDictionary[String] = null,
    views: StringDictionary[Map] = null
  ): Attachments = {
    val __obj = js.Dynamic.literal()
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments.asInstanceOf[js.Any])
    if (_rev != null) __obj.updateDynamic("_rev")(_rev.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachments]
  }
}

