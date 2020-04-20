package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderUIState extends js.Object {
  var BottomPaneBarMinimized: Boolean
  var HitHighlightingEnabled: Boolean
  val ListingUIState: IFolderListingUIState
  var MetadataEditorInRightPane: Boolean
  var RelativeBottomPaneHeight: Double
  var RelativeRightPaneWidth: Double
  var RightPaneBarMinimized: Boolean
  var ShowBottomPaneBar: Boolean
  var ShowRightPaneBar: Boolean
}

object IFolderUIState {
  @scala.inline
  def apply(
    BottomPaneBarMinimized: Boolean,
    HitHighlightingEnabled: Boolean,
    ListingUIState: IFolderListingUIState,
    MetadataEditorInRightPane: Boolean,
    RelativeBottomPaneHeight: Double,
    RelativeRightPaneWidth: Double,
    RightPaneBarMinimized: Boolean,
    ShowBottomPaneBar: Boolean,
    ShowRightPaneBar: Boolean
  ): IFolderUIState = {
    val __obj = js.Dynamic.literal(BottomPaneBarMinimized = BottomPaneBarMinimized.asInstanceOf[js.Any], HitHighlightingEnabled = HitHighlightingEnabled.asInstanceOf[js.Any], ListingUIState = ListingUIState.asInstanceOf[js.Any], MetadataEditorInRightPane = MetadataEditorInRightPane.asInstanceOf[js.Any], RelativeBottomPaneHeight = RelativeBottomPaneHeight.asInstanceOf[js.Any], RelativeRightPaneWidth = RelativeRightPaneWidth.asInstanceOf[js.Any], RightPaneBarMinimized = RightPaneBarMinimized.asInstanceOf[js.Any], ShowBottomPaneBar = ShowBottomPaneBar.asInstanceOf[js.Any], ShowRightPaneBar = ShowRightPaneBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderUIState]
  }
}

