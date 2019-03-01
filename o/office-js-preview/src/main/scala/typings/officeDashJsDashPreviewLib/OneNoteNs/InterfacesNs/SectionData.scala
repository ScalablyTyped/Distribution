package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

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
  var clientUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the ID of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * True if this section is encrypted with a password. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isEncrypted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * True if this section is locked. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isLocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the name of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
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
  var webUrl: js.UndefOr[java.lang.String] = js.undefined
}

object SectionData {
  @scala.inline
  def apply(
    clientUrl: java.lang.String = null,
    id: java.lang.String = null,
    isEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    isLocked: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    pages: js.Array[PageData] = null,
    webUrl: java.lang.String = null
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

