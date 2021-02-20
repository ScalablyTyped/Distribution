package typings.plotlyJs.anon

import typings.plotlyJs.mod.DTickValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.TickFormatStop> */
@js.native
trait PartialTickFormatStop extends StObject {
  
  var dtickrange: js.UndefOr[js.Tuple2[DTickValue | Null, DTickValue | Null]] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var templateitemname: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object PartialTickFormatStop {
  
  @scala.inline
  def apply(): PartialTickFormatStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTickFormatStop]
  }
  
  @scala.inline
  implicit class PartialTickFormatStopMutableBuilder[Self <: PartialTickFormatStop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDtickrange(value: js.Tuple2[DTickValue | Null, DTickValue | Null]): Self = StObject.set(x, "dtickrange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtickrangeUndefined: Self = StObject.set(x, "dtickrange", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTemplateitemname(value: String): Self = StObject.set(x, "templateitemname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateitemnameUndefined: Self = StObject.set(x, "templateitemname", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
