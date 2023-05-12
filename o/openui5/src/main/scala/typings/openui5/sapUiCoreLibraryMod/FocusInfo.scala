package typings.openui5.sapUiCoreLibraryMod

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusInfo extends StObject {
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * The position of the cursor.
    */
  var cursorPos: js.UndefOr[int] = js.undefined
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * The ID of the focused control.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * Prevents scrolling.
    */
  var preventScroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * The end position of selection.
    */
  var selectionEnd: js.UndefOr[int] = js.undefined
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * The start position of selection.
    */
  var selectionStart: js.UndefOr[int] = js.undefined
}
object FocusInfo {
  
  inline def apply(): FocusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusInfo] (val x: Self) extends AnyVal {
    
    inline def setCursorPos(value: int): Self = StObject.set(x, "cursorPos", value.asInstanceOf[js.Any])
    
    inline def setCursorPosUndefined: Self = StObject.set(x, "cursorPos", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    inline def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
    
    inline def setSelectionEnd(value: int): Self = StObject.set(x, "selectionEnd", value.asInstanceOf[js.Any])
    
    inline def setSelectionEndUndefined: Self = StObject.set(x, "selectionEnd", js.undefined)
    
    inline def setSelectionStart(value: int): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
    
    inline def setSelectionStartUndefined: Self = StObject.set(x, "selectionStart", js.undefined)
  }
}
