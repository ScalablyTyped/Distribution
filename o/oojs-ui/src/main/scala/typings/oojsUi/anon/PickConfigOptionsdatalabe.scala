package typings.oojsUi.anon

import typings.jquery.JQuery
import typings.oojsUi.OO.ui.Deferrable
import typings.oojsUi.OO.ui.HtmlSnippet
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<oojs-ui.OO.ui.CheckboxMultioptionWidget.ConfigOptions, 'data' | 'label' | 'disabled'> */
trait PickConfigOptionsdatalabe extends StObject {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[Deferrable[String] | JQuery[HTMLElement] | HtmlSnippet] = js.undefined
}
object PickConfigOptionsdatalabe {
  
  inline def apply(): PickConfigOptionsdatalabe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickConfigOptionsdatalabe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickConfigOptionsdatalabe] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(value: Deferrable[String] | JQuery[HTMLElement] | HtmlSnippet): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction0(value: () => String): Self = StObject.set(x, "label", js.Any.fromFunction0(value))
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
