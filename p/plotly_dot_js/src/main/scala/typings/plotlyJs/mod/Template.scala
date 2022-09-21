package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialLayout
import typings.plotlyJs.anon.typeinPlotTypeArrayPartia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Template extends StObject {
  
  var data: js.UndefOr[typeinPlotTypeArrayPartia] = js.undefined
  
  var layout: js.UndefOr[PartialLayout] = js.undefined
}
object Template {
  
  inline def apply(): Template = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Template]
  }
  
  extension [Self <: Template](x: Self) {
    
    inline def setData(value: typeinPlotTypeArrayPartia): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLayout(value: PartialLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}
