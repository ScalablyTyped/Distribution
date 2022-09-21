package typings.mfiles.global.MFiles

import typings.mfiles.IFileClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.FileClass")
@js.native
open class FileClass ()
  extends StObject
     with IFileClass {
  
  /* CompleteClass */
  override def Clone(): IFileClass = js.native
  
  /* CompleteClass */
  var DisplayName: String = js.native
  
  /* CompleteClass */
  override val DotAndExtension: String = js.native
  
  /* CompleteClass */
  override val Extension: String = js.native
  
  /* CompleteClass */
  override val FileClass: String = js.native
  
  /* CompleteClass */
  override def LoadByExtension(Extension: String): Unit = js.native
  
  /* CompleteClass */
  override def LoadByFileClass(Extension: String, FileClass: String): Unit = js.native
  
  /* CompleteClass */
  override def SetFileClassInfo(DotAndFileExtension: String, FileClass: String, FileClassDisplayName: String): Unit = js.native
}
