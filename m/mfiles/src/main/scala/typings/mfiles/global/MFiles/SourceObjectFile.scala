package typings.mfiles.global.MFiles

import typings.mfiles.ISourceObjectFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.SourceObjectFile")
@js.native
open class SourceObjectFile ()
  extends StObject
     with ISourceObjectFile {
  
  /* CompleteClass */
  override def Clone(): ISourceObjectFile = js.native
  
  /* CompleteClass */
  var Extension: String = js.native
  
  /* CompleteClass */
  var SourceFilePath: String = js.native
  
  /* CompleteClass */
  var Title: String = js.native
}
