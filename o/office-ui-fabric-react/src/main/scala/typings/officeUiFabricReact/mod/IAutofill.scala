package typings.officeUiFabricReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAutofill
  extends StObject
     with typings.officeUiFabricReact.autofillTypesMod.IAutofill
object IAutofill {
  
  @scala.inline
  def apply(clear: () => Unit, focus: () => Unit, isValueSelected: Boolean, value: String): IAutofill = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), focus = js.Any.fromFunction0(focus), isValueSelected = isValueSelected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], cursorLocation = null, inputElement = null, selectionEnd = null, selectionStart = null)
    __obj.asInstanceOf[IAutofill]
  }
}
