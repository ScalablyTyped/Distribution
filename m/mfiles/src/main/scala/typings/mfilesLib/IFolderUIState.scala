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
    val __obj = js.Dynamic.literal(BottomPaneBarMinimized = BottomPaneBarMinimized, HitHighlightingEnabled = HitHighlightingEnabled, ListingUIState = ListingUIState, MetadataEditorInRightPane = MetadataEditorInRightPane, RelativeBottomPaneHeight = RelativeBottomPaneHeight, RelativeRightPaneWidth = RelativeRightPaneWidth, RightPaneBarMinimized = RightPaneBarMinimized, ShowBottomPaneBar = ShowBottomPaneBar, ShowRightPaneBar = ShowRightPaneBar)
  
    __obj.asInstanceOf[IFolderUIState]
  }
}

