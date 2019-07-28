package typings.officeDashJs.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "section.toJSON()". */
trait SectionData extends js.Object {
  /**
    *
    * The client url of the section. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the ID of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * True if this section is encrypted with a password. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isEncrypted: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * True if this section is locked. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isLocked: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the name of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * The collection of pages in the section. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pages: js.UndefOr[js.Array[PageData]] = js.undefined
  /**
    *
    * The web url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var webUrl: js.UndefOr[String] = js.undefined
}

object SectionData {
  @scala.inline
  def apply(
    clientUrl: String = null,
    id: String = null,
    isEncrypted: js.UndefOr[Boolean] = js.undefined,
    isLocked: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    pages: js.Array[PageData] = null,
    webUrl: String = null
  ): SectionData = {
    val __obj = js.Dynamic.literal()
    if (clientUrl != null) __obj.updateDynamic("clientUrl")(clientUrl)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isEncrypted)) __obj.updateDynamic("isEncrypted")(isEncrypted)
    if (!js.isUndefined(isLocked)) __obj.updateDynamic("isLocked")(isLocked)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pages != null) __obj.updateDynamic("pages")(pages)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[SectionData]
  }
}

