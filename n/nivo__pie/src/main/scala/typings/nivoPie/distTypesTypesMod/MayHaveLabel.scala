package typings.nivoPie.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MayHaveLabel extends StObject {
  
  var label: js.UndefOr[String | Double] = js.undefined
}
object MayHaveLabel {
  
  inline def apply(): MayHaveLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MayHaveLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MayHaveLabel] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
