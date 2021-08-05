package typings.photonui.photonui

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//Widgets
trait FileManager
  extends StObject
     with Base {
  
  var acceptedExts: js.Array[String]
  
  var acceptedMimes: js.Array[String]
  
  var dropZone: HTMLElement
  
  var multiselect: Boolean
  
  def open(): Unit
}
object FileManager {
  
  inline def apply(
    acceptedExts: js.Array[String],
    acceptedMimes: js.Array[String],
    destroy: () => Unit,
    dropZone: HTMLElement,
    multiselect: Boolean,
    open: () => Unit,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit
  ): FileManager = {
    val __obj = js.Dynamic.literal(acceptedExts = acceptedExts.asInstanceOf[js.Any], acceptedMimes = acceptedMimes.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), dropZone = dropZone.asInstanceOf[js.Any], multiselect = multiselect.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback))
    __obj.asInstanceOf[FileManager]
  }
  
  extension [Self <: FileManager](x: Self) {
    
    inline def setAcceptedExts(value: js.Array[String]): Self = StObject.set(x, "acceptedExts", value.asInstanceOf[js.Any])
    
    inline def setAcceptedExtsVarargs(value: String*): Self = StObject.set(x, "acceptedExts", js.Array(value :_*))
    
    inline def setAcceptedMimes(value: js.Array[String]): Self = StObject.set(x, "acceptedMimes", value.asInstanceOf[js.Any])
    
    inline def setAcceptedMimesVarargs(value: String*): Self = StObject.set(x, "acceptedMimes", js.Array(value :_*))
    
    inline def setDropZone(value: HTMLElement): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
    
    inline def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
