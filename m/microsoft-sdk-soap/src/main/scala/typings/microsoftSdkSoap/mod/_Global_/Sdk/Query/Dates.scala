package typings.microsoftSdkSoap.mod._Global_.Sdk.Query

import typings.microsoftSdkSoap.mod._Global_.Sdk.Collection
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the Date values to be compared in the query.
  * @param args An array of Date values.
  */
@JSGlobal("Sdk.Query.Dates")
@js.native
class Dates protected () extends ValueBase {
  def this(args: js.Array[Date]) = this()
  /**
    * Returns the type of value with namespace prefix.
    */
  def getType(): String = js.native
  /**
    * Returns an Sdk.Collection of Date values.
    */
  def getValues(): Collection[Date] = js.native
  /**
    * Specifies the Date values to be compared in the query.
    * @param setValueArgs An array of Date values.
    */
  def setValues(setValueArgs: js.Array[Date]): Unit = js.native
}

