package typings.mfiles.global.MFiles

import typings.mfiles.IFileVer
import typings.mfiles.IObjectFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjectFile")
@js.native
open class ObjectFile ()
  extends StObject
     with IObjectFile {
  
  /* CompleteClass */
  override val ChangeTimeUtc: js.Date = js.native
  
  /* CompleteClass */
  override val CreationTimeUtc: js.Date = js.native
  
  /* CompleteClass */
  override val Extension: String = js.native
  
  /* CompleteClass */
  override val FileGUID: String = js.native
  
  /* CompleteClass */
  override val FileVer: IFileVer = js.native
  
  /* CompleteClass */
  override def GetNameForFileSystem(): String = js.native
  
  /* CompleteClass */
  override val ID: Double = js.native
  
  /* CompleteClass */
  override val LastAccessTimeUtc: js.Date = js.native
  
  /* CompleteClass */
  override val LastWriteTimeUtc: js.Date = js.native
  
  /* CompleteClass */
  override val LogicalSize: Double = js.native
  
  /* CompleteClass */
  override val LogicalSize_32bit: Double = js.native
  
  /* CompleteClass */
  override val Title: String = js.native
  
  /* CompleteClass */
  override def ToJSON(): String = js.native
  
  /* CompleteClass */
  override val Version: Double = js.native
}
