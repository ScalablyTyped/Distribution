package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderUIState extends js.Object {
  var BottomPaneBarMinimized: Boolean = js.native
  var HitHighlightingEnabled: Boolean = js.native
  val ListingUIState: IFolderListingUIState = js.native
  var MetadataEditorInRightPane: Boolean = js.native
  var RelativeBottomPaneHeight: Double = js.native
  var RelativeRightPaneWidth: Double = js.native
  var RightPaneBarMinimized: Boolean = js.native
  var ShowBottomPaneBar: Boolean = js.native
  var ShowRightPaneBar: Boolean = js.native
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
  @scala.inline
  implicit class IFolderUIStateOps[Self <: IFolderUIState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBottomPaneBarMinimized(value: Boolean): Self = this.set("BottomPaneBarMinimized", value.asInstanceOf[js.Any])
    @scala.inline
    def setHitHighlightingEnabled(value: Boolean): Self = this.set("HitHighlightingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setListingUIState(value: IFolderListingUIState): Self = this.set("ListingUIState", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadataEditorInRightPane(value: Boolean): Self = this.set("MetadataEditorInRightPane", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeBottomPaneHeight(value: Double): Self = this.set("RelativeBottomPaneHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeRightPaneWidth(value: Double): Self = this.set("RelativeRightPaneWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightPaneBarMinimized(value: Boolean): Self = this.set("RightPaneBarMinimized", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowBottomPaneBar(value: Boolean): Self = this.set("ShowBottomPaneBar", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowRightPaneBar(value: Boolean): Self = this.set("ShowRightPaneBar", value.asInstanceOf[js.Any])
  }
  
}

