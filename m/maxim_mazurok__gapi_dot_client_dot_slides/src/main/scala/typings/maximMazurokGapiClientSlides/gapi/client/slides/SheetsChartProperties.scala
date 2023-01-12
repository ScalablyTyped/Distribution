package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetsChartProperties extends StObject {
  
  /** The properties of the embedded chart image. */
  var chartImageProperties: js.UndefOr[ImageProperties] = js.undefined
}
object SheetsChartProperties {
  
  inline def apply(): SheetsChartProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsChartProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetsChartProperties] (val x: Self) extends AnyVal {
    
    inline def setChartImageProperties(value: ImageProperties): Self = StObject.set(x, "chartImageProperties", value.asInstanceOf[js.Any])
    
    inline def setChartImagePropertiesUndefined: Self = StObject.set(x, "chartImageProperties", js.undefined)
  }
}
