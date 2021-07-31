package typings.phonegap

import typings.phonegap.anon.Dst
import typings.phonegap.anon.Value
import typings.phonegap.anon.ValueArray
import typings.phonegap.anon.ValueNumber
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Globalization extends StObject {
  
  def dateToString(
    date: Date,
    successCallback: js.Function1[/* properties */ Value, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  def dateToString(
    date: Date,
    successCallback: js.Function1[/* properties */ Value, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit],
    options: GlobalizationDateOptions
  ): Unit = js.native
  
  def getCurrencyPattern(
    currencyCode: String,
    successCallback: js.Function1[/* parameters */ GlobalizationCurrencyPattern, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  
  def getDateNames(
    successCallback: js.Function1[/* properties */ ValueArray, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  def getDateNames(
    successCallback: js.Function1[/* properties */ ValueArray, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit],
    options: GlobalizationDateNameOptions
  ): Unit = js.native
  
  def getDatePattern(
    successCallback: js.Function1[/* properties */ GlobalizationDatePattern, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  def getDatePattern(
    successCallback: js.Function1[/* properties */ GlobalizationDatePattern, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit],
    options: GlobalizationDateOptions
  ): Unit = js.native
  
  def getFirstDayOfWeek(
    successCallback: js.Function1[/* properties */ ValueNumber, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  
  def getLocaleName(
    successCallback: js.Function1[/* properties */ Value, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  
  def getNumberPattern(
    successCallback: js.Function1[/* parameters */ GlobalizationNumberPattern, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  def getNumberPattern(
    successCallback: js.Function1[/* parameters */ GlobalizationNumberPattern, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit],
    options: GlobalizationNumberOptions
  ): Unit = js.native
  
  def getPreferredLanguage(
    successCallback: js.Function1[/* properties */ Value, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  
  def isDayLightSavingsTime(
    date: Date,
    successCallback: js.Function1[/* properties */ Dst, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  
  def numberToString(
    number: Double,
    successCallback: js.Function1[/* properties */ Value, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  def numberToString(
    number: Double,
    successCallback: js.Function1[/* properties */ Value, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit],
    options: GlobalizationNumberOptions
  ): Unit = js.native
  
  def stringToDate(
    dateString: String,
    successCallback: js.Function1[/* properties */ GlobalizationDate, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  def stringToDate(
    dateString: String,
    successCallback: js.Function1[/* properties */ GlobalizationDate, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit],
    options: GlobalizationDateOptions
  ): Unit = js.native
  
  def stringToNumber(
    string: String,
    successCallback: js.Function1[/* properties */ ValueNumber, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit]
  ): Unit = js.native
  def stringToNumber(
    string: String,
    successCallback: js.Function1[/* properties */ ValueNumber, Unit],
    errorCallback: js.Function1[/* error */ GlobalizationError, Unit],
    options: GlobalizationNumberOptions
  ): Unit = js.native
}
