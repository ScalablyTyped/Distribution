package typings.mfiles.global.MFiles

import typings.mfiles.IExpression
import typings.mfiles.IFolderNameListing
import typings.mfiles.ITypedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.FolderNameListing")
@js.native
class FolderNameListing ()
  extends StObject
     with IFolderNameListing {
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): ITypedValue = js.native
  
  /* CompleteClass */
  override val MoreValues: Boolean = js.native
  
  /* CompleteClass */
  override def SortWithExpression(Expression: IExpression, Locale: Double): Unit = js.native
}
