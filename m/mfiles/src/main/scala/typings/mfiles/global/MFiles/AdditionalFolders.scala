package typings.mfiles.global.MFiles

import typings.mfiles.IAdditionalFolder
import typings.mfiles.IAdditionalFolders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AdditionalFolders")
@js.native
class AdditionalFolders ()
  extends StObject
     with IAdditionalFolders {
  
  /* CompleteClass */
  override def Add(Index: Double, AdditionalFolder: IAdditionalFolder): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IAdditionalFolders = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IAdditionalFolder = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}
