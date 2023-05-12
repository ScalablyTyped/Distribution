package typings.openui5.anon

import typings.openui5.sapUiTestOpaBuilderMod.I18NTextDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I18NText extends StObject {
  
  var i18NText: I18NTextDefinition
}
object I18NText {
  
  inline def apply(i18NText: I18NTextDefinition): I18NText = {
    val __obj = js.Dynamic.literal(i18NText = i18NText.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18NText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: I18NText] (val x: Self) extends AnyVal {
    
    inline def setI18NText(value: I18NTextDefinition): Self = StObject.set(x, "i18NText", value.asInstanceOf[js.Any])
  }
}
