package typings.openui5.anon

import typings.openui5.sapUiTestOpaBuilderMod.LabelForDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelFor extends StObject {
  
  var labelFor: LabelForDefinition
}
object LabelFor {
  
  inline def apply(labelFor: LabelForDefinition): LabelFor = {
    val __obj = js.Dynamic.literal(labelFor = labelFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelFor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelFor] (val x: Self) extends AnyVal {
    
    inline def setLabelFor(value: LabelForDefinition): Self = StObject.set(x, "labelFor", value.asInstanceOf[js.Any])
  }
}
