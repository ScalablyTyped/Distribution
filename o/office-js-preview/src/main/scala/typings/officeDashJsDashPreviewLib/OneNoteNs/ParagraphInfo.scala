package typings
package officeDashJsDashPreviewLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * List information for paragraph.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait ParagraphInfo extends js.Object {
  /**
    *
    * //
    Bullet list type of paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  var bulletType: java.lang.String
  /**
    *
    * //
    Index of paragraph in list
    *
    * [Api set: OneNoteApi 1.1]
    */
  var index: scala.Double
  /**
    *
    * //
    Type of list in paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  var listType: ListType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Number | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bullet
  /**
    *
    * //
    number list type of paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  var numberType: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 63 */ js.Any
}

object ParagraphInfo {
  @scala.inline
  def apply(
    bulletType: java.lang.String,
    index: scala.Double,
    listType: ListType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Number | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bullet,
    numberType: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 63 */ js.Any
  ): ParagraphInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bulletType")(bulletType)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    __obj.updateDynamic("numberType")(numberType)
    __obj.asInstanceOf[ParagraphInfo]
  }
}

