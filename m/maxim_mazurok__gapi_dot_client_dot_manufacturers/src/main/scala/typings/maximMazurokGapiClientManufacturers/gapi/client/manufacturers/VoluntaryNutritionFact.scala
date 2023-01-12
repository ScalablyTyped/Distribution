package typings.maximMazurokGapiClientManufacturers.gapi.client.manufacturers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoluntaryNutritionFact extends StObject {
  
  /** Daily percentage. */
  var dailyPercentage: js.UndefOr[Double] = js.undefined
  
  /** Name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Value. */
  var value: js.UndefOr[FloatUnit] = js.undefined
}
object VoluntaryNutritionFact {
  
  inline def apply(): VoluntaryNutritionFact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoluntaryNutritionFact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoluntaryNutritionFact] (val x: Self) extends AnyVal {
    
    inline def setDailyPercentage(value: Double): Self = StObject.set(x, "dailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setDailyPercentageUndefined: Self = StObject.set(x, "dailyPercentage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: FloatUnit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
