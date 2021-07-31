package typings.mfiles.global.MFiles

import typings.mfiles.IFolderListingColumn
import typings.mfiles.MFiles.MFFolderListingColumnFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.FolderListingColumn")
@js.native
class FolderListingColumn ()
  extends StObject
     with IFolderListingColumn {
  
  /* CompleteClass */
  override def Clone(): IFolderListingColumn = js.native
  
  /* CompleteClass */
  var Flags: MFFolderListingColumnFlags = js.native
  
  /* CompleteClass */
  override val ID: Double = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  var Position: Double = js.native
  
  /* CompleteClass */
  var Visible: Boolean = js.native
  
  /* CompleteClass */
  var Width: Double = js.native
}
