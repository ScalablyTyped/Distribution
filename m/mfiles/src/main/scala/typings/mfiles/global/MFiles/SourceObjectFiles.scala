package typings.mfiles.global.MFiles

import typings.mfiles.ISourceObjectFile
import typings.mfiles.ISourceObjectFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.SourceObjectFiles")
@js.native
class SourceObjectFiles ()
  extends StObject
     with ISourceObjectFiles {
  
  /* CompleteClass */
  override def Add(Index: Double, SourceObjectFile: ISourceObjectFile): Unit = js.native
  
  /* CompleteClass */
  override def AddEmptyFile(Title: String, Extension: String): ISourceObjectFile = js.native
  
  /* CompleteClass */
  override def AddFile(Title: String, Extension: String, SourcePath: String): ISourceObjectFile = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): ISourceObjectFile = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}
