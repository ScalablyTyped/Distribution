package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Globalization extends js.Object {
  def dateToString(
    date: stdLib.Date,
    successCallback: js.Function1[/* properties */ Anon_ValueString, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit]
  ): scala.Unit = js.native
  def dateToString(
    date: stdLib.Date,
    successCallback: js.Function1[/* properties */ Anon_ValueString, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit],
    options: GlobalizationDateOptions
  ): scala.Unit = js.native
  def getCurrencyPattern(
    currencyCode: java.lang.String,
    successCallback: js.Function1[/* parameters */ GlobalizationCurrencyPattern, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit]
  ): scala.Unit = js.native
  def getDateNames(
    successCallback: js.Function1[/* properties */ Anon_ValueArray, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit]
  ): scala.Unit = js.native
  def getDateNames(
    successCallback: js.Function1[/* properties */ Anon_ValueArray, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit],
    options: GlobalizationDateNameOptions
  ): scala.Unit = js.native
  def getDatePattern(
    successCallback: js.Function1[/* properties */ GlobalizationDatePattern, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit]
  ): scala.Unit = js.native
  def getDatePattern(
    successCallback: js.Function1[/* properties */ GlobalizationDatePattern, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit],
    options: GlobalizationDateOptions
  ): scala.Unit = js.native
  def getFirstDayOfWeek(
    successCallback: js.Function1[/* properties */ Anon_Value, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit]
  ): scala.Unit = js.native
  def getLocaleName(
    successCallback: js.Function1[/* properties */ Anon_ValueString, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit]
  ): scala.Unit = js.native
  def getNumberPattern(
    successCallback: js.Function1[/* parameters */ GlobalizationNumberPattern, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit]
  ): scala.Unit = js.native
  def getNumberPattern(
    successCallback: js.Function1[/* parameters */ GlobalizationNumberPattern, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit],
    options: GlobalizationNumberOptions
  ): scala.Unit = js.native
  def getPreferredLanguage(
    successCallback: js.Function1[/* properties */ Anon_ValueString, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit]
  ): scala.Unit = js.native
  def isDayLightSavingsTime(
    date: stdLib.Date,
    successCallback: js.Function1[/* properties */ Anon_Dst, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit]
  ): scala.Unit = js.native
  def numberToString(
    number: scala.Double,
    successCallback: js.Function1[/* properties */ Anon_ValueString, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit]
  ): scala.Unit = js.native
  def numberToString(
    number: scala.Double,
    successCallback: js.Function1[/* properties */ Anon_ValueString, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit],
    options: GlobalizationNumberOptions
  ): scala.Unit = js.native
  def stringToDate(
    dateString: java.lang.String,
    successCallback: js.Function1[/* properties */ GlobalizationDate, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit]
  ): scala.Unit = js.native
  def stringToDate(
    dateString: java.lang.String,
    successCallback: js.Function1[/* properties */ GlobalizationDate, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit],
    options: GlobalizationDateOptions
  ): scala.Unit = js.native
  def stringToNumber(
    string: java.lang.String,
    successCallback: js.Function1[/* properties */ Anon_Value, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit]
  ): scala.Unit = js.native
  def stringToNumber(
    string: java.lang.String,
    successCallback: js.Function1[/* properties */ Anon_Value, scala.Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, scala.Unit],
    options: GlobalizationNumberOptions
  ): scala.Unit = js.native
}

