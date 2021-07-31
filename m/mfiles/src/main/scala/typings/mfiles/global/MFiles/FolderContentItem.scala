package typings.mfiles.global.MFiles

import typings.mfiles.IFolderContentItem
import typings.mfiles.ILookup
import typings.mfiles.IObjectVersion
import typings.mfiles.ITypedValue
import typings.mfiles.IView
import typings.mfiles.MFiles.MFFolderContentItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.FolderContentItem")
@js.native
class FolderContentItem ()
  extends StObject
     with IFolderContentItem {
  
  /* CompleteClass */
  override val FolderContentItemType: MFFolderContentItemType = js.native
  
  /* CompleteClass */
  override val ObjectVersion: IObjectVersion = js.native
  
  /* CompleteClass */
  override val PropertyFolder: ITypedValue = js.native
  
  /* CompleteClass */
  override val TraditionalFolder: ILookup = js.native
  
  /* CompleteClass */
  override val View: IView = js.native
}
