package typings.oracleOraclejet.ojvalidationDatetimeMod.DateRestrictionValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait DayFormatterInput extends js.Object {
  var date: Double
  var fullYear: Double
  var month: Double
}

object DayFormatterInput {
  @scala.inline
  def apply(date: Double, fullYear: Double, month: Double): DayFormatterInput = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], fullYear = fullYear.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DayFormatterInput]
  }
}

