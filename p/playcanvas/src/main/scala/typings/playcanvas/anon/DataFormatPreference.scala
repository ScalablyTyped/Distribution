package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataFormatPreference extends StObject {
  
  var dataFormatPreference: js.UndefOr[String] = js.undefined
  
  var usagePreference: js.UndefOr[String] = js.undefined
}
object DataFormatPreference {
  
  inline def apply(): DataFormatPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFormatPreference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataFormatPreference] (val x: Self) extends AnyVal {
    
    inline def setDataFormatPreference(value: String): Self = StObject.set(x, "dataFormatPreference", value.asInstanceOf[js.Any])
    
    inline def setDataFormatPreferenceUndefined: Self = StObject.set(x, "dataFormatPreference", js.undefined)
    
    inline def setUsagePreference(value: String): Self = StObject.set(x, "usagePreference", value.asInstanceOf[js.Any])
    
    inline def setUsagePreferenceUndefined: Self = StObject.set(x, "usagePreference", js.undefined)
  }
}
