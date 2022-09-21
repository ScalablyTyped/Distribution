package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Park_ extends StObject {
  
  var bankLoan: Double = js.native
  
  var cash: Double = js.native
  
  /**
    * The company value, will be updated every 512 ticks.
    * Calculation is: `park.value + park.cash - park.bankLoan`
    */
  var companyValue: Double = js.native
  
  /**
    * The purchase price of one tile for construction rights.
    */
  var constructionRightsPrice: Double = js.native
  
  /**
    * The current entrance fee for the park.
    */
  var entranceFee: Double = js.native
  
  /**
    * Gets whether a given flag is set or not.
    * @param key The flag to test.
    */
  def getFlag(flag: ParkFlags): Boolean = js.native
  
  /**
    * The number of guests within the park, not including any outside the park but still
    * on the map.
    */
  val guests: Double = js.native
  
  /**
    * The purchase price of one tile for park ownership.
    */
  var landPrice: Double = js.native
  
  var maxBankLoan: Double = js.native
  
  var messages: js.Array[ParkMessage] = js.native
  
  var name: String = js.native
  
  /**
    * The number of tiles on the map with park ownership or construction rights.
    * Updated every 4096 ticks.
    */
  val parkSize: Double = js.native
  
  def postMessage(message: String): Unit = js.native
  def postMessage(message: ParkMessageDesc): Unit = js.native
  
  var rating: Double = js.native
  
  /**
    * Sets the given flag to the given value.
    * @param key The flag to set.
    * @param value Whether to set or clear the flag.
    */
  def setFlag(flag: ParkFlags, value: Boolean): Unit = js.native
  
  /**
    * The total number of guests that have entered the park.
    */
  var totalAdmissions: Double = js.native
  
  /**
    * The total amount of income gained from admissions into the park.
    */
  var totalIncomeFromAdmissions: Double = js.native
  
  /**
    * The park value, will be updated every 512 ticks.
    */
  var value: Double = js.native
}
