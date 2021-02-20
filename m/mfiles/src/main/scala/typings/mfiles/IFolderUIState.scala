package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFolderUIState extends StObject {
  
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
  implicit class IFolderUIStateMutableBuilder[Self <: IFolderUIState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomPaneBarMinimized(value: Boolean): Self = StObject.set(x, "BottomPaneBarMinimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitHighlightingEnabled(value: Boolean): Self = StObject.set(x, "HitHighlightingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListingUIState(value: IFolderListingUIState): Self = StObject.set(x, "ListingUIState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataEditorInRightPane(value: Boolean): Self = StObject.set(x, "MetadataEditorInRightPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeBottomPaneHeight(value: Double): Self = StObject.set(x, "RelativeBottomPaneHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeRightPaneWidth(value: Double): Self = StObject.set(x, "RelativeRightPaneWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightPaneBarMinimized(value: Boolean): Self = StObject.set(x, "RightPaneBarMinimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBottomPaneBar(value: Boolean): Self = StObject.set(x, "ShowBottomPaneBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRightPaneBar(value: Boolean): Self = StObject.set(x, "ShowRightPaneBar", value.asInstanceOf[js.Any])
  }
}
