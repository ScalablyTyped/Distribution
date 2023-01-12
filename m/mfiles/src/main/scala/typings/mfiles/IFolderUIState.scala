package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFolderUIState extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IFolderUIState] (val x: Self) extends AnyVal {
    
    inline def setBottomPaneBarMinimized(value: Boolean): Self = StObject.set(x, "BottomPaneBarMinimized", value.asInstanceOf[js.Any])
    
    inline def setHitHighlightingEnabled(value: Boolean): Self = StObject.set(x, "HitHighlightingEnabled", value.asInstanceOf[js.Any])
    
    inline def setListingUIState(value: IFolderListingUIState): Self = StObject.set(x, "ListingUIState", value.asInstanceOf[js.Any])
    
    inline def setMetadataEditorInRightPane(value: Boolean): Self = StObject.set(x, "MetadataEditorInRightPane", value.asInstanceOf[js.Any])
    
    inline def setRelativeBottomPaneHeight(value: Double): Self = StObject.set(x, "RelativeBottomPaneHeight", value.asInstanceOf[js.Any])
    
    inline def setRelativeRightPaneWidth(value: Double): Self = StObject.set(x, "RelativeRightPaneWidth", value.asInstanceOf[js.Any])
    
    inline def setRightPaneBarMinimized(value: Boolean): Self = StObject.set(x, "RightPaneBarMinimized", value.asInstanceOf[js.Any])
    
    inline def setShowBottomPaneBar(value: Boolean): Self = StObject.set(x, "ShowBottomPaneBar", value.asInstanceOf[js.Any])
    
    inline def setShowRightPaneBar(value: Boolean): Self = StObject.set(x, "ShowRightPaneBar", value.asInstanceOf[js.Any])
  }
}
