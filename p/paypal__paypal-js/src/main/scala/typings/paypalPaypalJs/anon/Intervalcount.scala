package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.paypalPaypalJsStrings.DAY
import typings.paypalPaypalJs.paypalPaypalJsStrings.MONTH
import typings.paypalPaypalJs.paypalPaypalJsStrings.SEMI_MONTH
import typings.paypalPaypalJs.paypalPaypalJsStrings.WEEK
import typings.paypalPaypalJs.paypalPaypalJsStrings.YEAR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Intervalcount extends StObject {
  
  /**
    * The number of intervals after which a subscriber is billed.
    * For example, if the `interval_unit` is `DAY` with an `interval_count` of  `2`,
    * the subscription is billed once every two days.
    */
  var interval_count: Double
  
  /** The interval at which the subscription is charged or billed. */
  var interval_unit: DAY | WEEK | SEMI_MONTH | MONTH | YEAR
}
object Intervalcount {
  
  inline def apply(interval_count: Double, interval_unit: DAY | WEEK | SEMI_MONTH | MONTH | YEAR): Intervalcount = {
    val __obj = js.Dynamic.literal(interval_count = interval_count.asInstanceOf[js.Any], interval_unit = interval_unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intervalcount]
  }
  
  extension [Self <: Intervalcount](x: Self) {
    
    inline def setInterval_count(value: Double): Self = StObject.set(x, "interval_count", value.asInstanceOf[js.Any])
    
    inline def setInterval_unit(value: DAY | WEEK | SEMI_MONTH | MONTH | YEAR): Self = StObject.set(x, "interval_unit", value.asInstanceOf[js.Any])
  }
}
