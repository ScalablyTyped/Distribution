package typings.photonui.global.photonui

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//Widgets
@JSGlobal("photonui.FileManager")
@js.native
open class FileManager ()
  extends StObject
     with typings.photonui.photonui.FileManager {
  
  /* CompleteClass */
  var acceptedExts: js.Array[String] = js.native
  
  /* CompleteClass */
  var acceptedMimes: js.Array[String] = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* CompleteClass */
  var dropZone: HTMLElement = js.native
  
  /* CompleteClass */
  var multiselect: Boolean = js.native
  
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /* CompleteClass */
  override def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: Any): Unit = js.native
  
  /* CompleteClass */
  override def removeCallback(id: String): Unit = js.native
}
