package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScenarioObjective extends StObject {
  
  /**
    * The minimum excitement rating required for each rollercoaster.
    */
  var excitement: Double
  
  /**
    * The required number of guests.
    */
  var guests: Double
  
  /**
    * The minimum length required for each rollercoaster.
    */
  var length: Double
  
  /**
    * The minimum monthly income from rides / food.
    */
  var monthlyIncome: Double
  
  /**
    * The minimum park value required.
    */
  var parkValue: Double
  
  /**
    * The objective type.
    */
  var `type`: ScenarioObjective
  
  /**
    * The year the objective must be completed by the end of.
    */
  var year: Double
}
object ScenarioObjective {
  
  inline def apply(
    excitement: Double,
    guests: Double,
    length: Double,
    monthlyIncome: Double,
    parkValue: Double,
    `type`: ScenarioObjective,
    year: Double
  ): ScenarioObjective = {
    val __obj = js.Dynamic.literal(excitement = excitement.asInstanceOf[js.Any], guests = guests.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], monthlyIncome = monthlyIncome.asInstanceOf[js.Any], parkValue = parkValue.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenarioObjective]
  }
  
  extension [Self <: ScenarioObjective](x: Self) {
    
    inline def setExcitement(value: Double): Self = StObject.set(x, "excitement", value.asInstanceOf[js.Any])
    
    inline def setGuests(value: Double): Self = StObject.set(x, "guests", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMonthlyIncome(value: Double): Self = StObject.set(x, "monthlyIncome", value.asInstanceOf[js.Any])
    
    inline def setParkValue(value: Double): Self = StObject.set(x, "parkValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: ScenarioObjective): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
