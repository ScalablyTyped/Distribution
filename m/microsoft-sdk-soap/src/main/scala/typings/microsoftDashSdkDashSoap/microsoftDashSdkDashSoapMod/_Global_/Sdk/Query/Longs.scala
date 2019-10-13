package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query

import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the Long values to be compared in the query.
  * @param args An array of Long values.
  */
@JSGlobal("Sdk.Query.Longs")
@js.native
class Longs protected () extends ValueBase {
  def this(args: js.Array[scala.Double]) = this()
  /**
    * Returns the type of value with namespace prefix.
    */
  def getType(): java.lang.String = js.native
  /**
    * Returns an Sdk.Collection of number values.
    */
  def getValues(): Collection[scala.Double] = js.native
  /**
    * Specifies the Long values to be compared in the query.
    * @param setValueArgs An array of number values.
    */
  def setValues(setValueArgs: js.Array[scala.Double]): Unit = js.native
}

