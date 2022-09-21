package typings.mfiles.global.MFiles

import typings.mfiles.IFolderDef
import typings.mfiles.IFolderDefs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.FolderDefs")
@js.native
open class FolderDefs ()
  extends StObject
     with IFolderDefs {
  
  /* CompleteClass */
  override def Add(Index: Double, FolderDef: IFolderDef): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IFolderDefs = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IFolderDef = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}
