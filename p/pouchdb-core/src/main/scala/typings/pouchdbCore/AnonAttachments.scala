package typings.pouchdbCore

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbCore.PouchDB.Core.Attachments
import typings.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttachments extends js.Object {
  var _attachments: js.UndefOr[Attachments] = js.undefined
  /** You can update an existing doc using _rev */
  var _rev: js.UndefOr[RevisionId] = js.undefined
  var filters: js.UndefOr[StringDictionary[String]] = js.undefined
  var views: js.UndefOr[StringDictionary[AnonMap]] = js.undefined
}

object AnonAttachments {
  @scala.inline
  def apply(
    _attachments: Attachments = null,
    _rev: RevisionId = null,
    filters: StringDictionary[String] = null,
    views: StringDictionary[AnonMap] = null
  ): AnonAttachments = {
    val __obj = js.Dynamic.literal()
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments.asInstanceOf[js.Any])
    if (_rev != null) __obj.updateDynamic("_rev")(_rev.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttachments]
  }
}

