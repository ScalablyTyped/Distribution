package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessibleReorderAfterItem extends js.Object {
  var accessibleReorderAfterItem: js.UndefOr[String] = js.undefined
  var accessibleReorderBeforeItem: js.UndefOr[String] = js.undefined
  var accessibleReorderTouchInstructionText: js.UndefOr[String] = js.undefined
  var labelCut: js.UndefOr[String] = js.undefined
  var labelPasteAfter: js.UndefOr[String] = js.undefined
  var labelPasteBefore: js.UndefOr[String] = js.undefined
  var labelRemove: js.UndefOr[String] = js.undefined
  var msgFetchingData: js.UndefOr[String] = js.undefined
  var msgNoData: js.UndefOr[String] = js.undefined
  var overflowItemLabel: js.UndefOr[String] = js.undefined
  var removeCueText: js.UndefOr[String] = js.undefined
  var selectedLabel: js.UndefOr[String] = js.undefined
}

object AnonAccessibleReorderAfterItem {
  @scala.inline
  def apply(
    accessibleReorderAfterItem: String = null,
    accessibleReorderBeforeItem: String = null,
    accessibleReorderTouchInstructionText: String = null,
    labelCut: String = null,
    labelPasteAfter: String = null,
    labelPasteBefore: String = null,
    labelRemove: String = null,
    msgFetchingData: String = null,
    msgNoData: String = null,
    overflowItemLabel: String = null,
    removeCueText: String = null,
    selectedLabel: String = null
  ): AnonAccessibleReorderAfterItem = {
    val __obj = js.Dynamic.literal()
    if (accessibleReorderAfterItem != null) __obj.updateDynamic("accessibleReorderAfterItem")(accessibleReorderAfterItem.asInstanceOf[js.Any])
    if (accessibleReorderBeforeItem != null) __obj.updateDynamic("accessibleReorderBeforeItem")(accessibleReorderBeforeItem.asInstanceOf[js.Any])
    if (accessibleReorderTouchInstructionText != null) __obj.updateDynamic("accessibleReorderTouchInstructionText")(accessibleReorderTouchInstructionText.asInstanceOf[js.Any])
    if (labelCut != null) __obj.updateDynamic("labelCut")(labelCut.asInstanceOf[js.Any])
    if (labelPasteAfter != null) __obj.updateDynamic("labelPasteAfter")(labelPasteAfter.asInstanceOf[js.Any])
    if (labelPasteBefore != null) __obj.updateDynamic("labelPasteBefore")(labelPasteBefore.asInstanceOf[js.Any])
    if (labelRemove != null) __obj.updateDynamic("labelRemove")(labelRemove.asInstanceOf[js.Any])
    if (msgFetchingData != null) __obj.updateDynamic("msgFetchingData")(msgFetchingData.asInstanceOf[js.Any])
    if (msgNoData != null) __obj.updateDynamic("msgNoData")(msgNoData.asInstanceOf[js.Any])
    if (overflowItemLabel != null) __obj.updateDynamic("overflowItemLabel")(overflowItemLabel.asInstanceOf[js.Any])
    if (removeCueText != null) __obj.updateDynamic("removeCueText")(removeCueText.asInstanceOf[js.Any])
    if (selectedLabel != null) __obj.updateDynamic("selectedLabel")(selectedLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessibleReorderAfterItem]
  }
}

