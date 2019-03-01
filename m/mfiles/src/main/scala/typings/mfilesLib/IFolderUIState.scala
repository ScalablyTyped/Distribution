package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderUIState extends js.Object {
  var BottomPaneBarMinimized: scala.Boolean
  var HitHighlightingEnabled: scala.Boolean
  val ListingUIState: IFolderListingUIState
  var MetadataEditorInRightPane: scala.Boolean
  var RelativeBottomPaneHeight: scala.Double
  var RelativeRightPaneWidth: scala.Double
  var RightPaneBarMinimized: scala.Boolean
  var ShowBottomPaneBar: scala.Boolean
  var ShowRightPaneBar: scala.Boolean
}

object IFolderUIState {
  @scala.inline
  def apply(
    BottomPaneBarMinimized: scala.Boolean,
    HitHighlightingEnabled: scala.Boolean,
    ListingUIState: IFolderListingUIState,
    MetadataEditorInRightPane: scala.Boolean,
    RelativeBottomPaneHeight: scala.Double,
    RelativeRightPaneWidth: scala.Double,
    RightPaneBarMinimized: scala.Boolean,
    ShowBottomPaneBar: scala.Boolean,
    ShowRightPaneBar: scala.Boolean
  ): IFolderUIState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BottomPaneBarMinimized")(BottomPaneBarMinimized)
    __obj.updateDynamic("HitHighlightingEnabled")(HitHighlightingEnabled)
    __obj.updateDynamic("ListingUIState")(ListingUIState)
    __obj.updateDynamic("MetadataEditorInRightPane")(MetadataEditorInRightPane)
    __obj.updateDynamic("RelativeBottomPaneHeight")(RelativeBottomPaneHeight)
    __obj.updateDynamic("RelativeRightPaneWidth")(RelativeRightPaneWidth)
    __obj.updateDynamic("RightPaneBarMinimized")(RightPaneBarMinimized)
    __obj.updateDynamic("ShowBottomPaneBar")(ShowBottomPaneBar)
    __obj.updateDynamic("ShowRightPaneBar")(ShowRightPaneBar)
    __obj.asInstanceOf[IFolderUIState]
  }
}

