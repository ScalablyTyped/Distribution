package typings.plotlyJs.anon

import typings.plotlyJs.mod.DTickValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.TickFormatStop> */
trait PartialTickFormatStop extends StObject {
  
  var dtickrange: js.UndefOr[js.Tuple2[DTickValue | Null, DTickValue | Null]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var templateitemname: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object PartialTickFormatStop {
  
  inline def apply(): PartialTickFormatStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTickFormatStop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTickFormatStop] (val x: Self) extends AnyVal {
    
    inline def setDtickrange(value: js.Tuple2[DTickValue | Null, DTickValue | Null]): Self = StObject.set(x, "dtickrange", value.asInstanceOf[js.Any])
    
    inline def setDtickrangeUndefined: Self = StObject.set(x, "dtickrange", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTemplateitemname(value: String): Self = StObject.set(x, "templateitemname", value.asInstanceOf[js.Any])
    
    inline def setTemplateitemnameUndefined: Self = StObject.set(x, "templateitemname", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
