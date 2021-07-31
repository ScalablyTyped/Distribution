package typings.mfiles.global.MFiles

import typings.mfiles.IFolderListingColumnSortings
import typings.mfiles.IFolderListingColumns
import typings.mfiles.IFolderListingUIState
import typings.mfiles.MFiles.MFFolderListingItemGroupingMode
import typings.mfiles.MFiles.MFFolderListingViewMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.FolderListingUIState")
@js.native
class FolderListingUIState ()
  extends StObject
     with IFolderListingUIState {
  
  /* CompleteClass */
  var ColumnSortings: IFolderListingColumnSortings = js.native
  
  /* CompleteClass */
  var Columns: IFolderListingColumns = js.native
  
  /* CompleteClass */
  var GroupingMode: MFFolderListingItemGroupingMode = js.native
  
  /* CompleteClass */
  var IconSize: Double = js.native
  
  /* CompleteClass */
  var ViewMode: MFFolderListingViewMode = js.native
}
