package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query

import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies Boolean values to be compared in the query.
  * @param args An array of Boolean values.
  */
@JSGlobal("Sdk.Query.Booleans")
@js.native
class Booleans protected () extends ValueBase {
  def this(args: js.Array[scala.Boolean]) = this()
  /**
    * Returns the type of value with namespace prefix.
    */
  def getType(): java.lang.String = js.native
  /**
    * Returns an Sdk.Collection of boolean values.
    */
  def getValues(): Collection[scala.Boolean] = js.native
  /**
    * Specifies a Boolean value to be compared in the query.
    * @param setValueArgs An array of boolean values.
    */
  def setValues(setValueArgs: js.Array[scala.Boolean]): Unit = js.native
}

