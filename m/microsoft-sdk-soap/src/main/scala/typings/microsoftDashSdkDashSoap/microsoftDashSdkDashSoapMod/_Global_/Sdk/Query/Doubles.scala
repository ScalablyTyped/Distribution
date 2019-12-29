package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query

import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the Double values to be compared in the query.
  * @param args An array of Double values.
  */
@JSGlobal("Sdk.Query.Doubles")
@js.native
class Doubles protected () extends ValueBase {
  def this(args: js.Array[Double]) = this()
  /**
    * Returns the type of value with namespace prefix.
    */
  def getType(): String = js.native
  /**
    * Returns an Sdk.Collection of number values.
    */
  def getValues(): Collection[Double] = js.native
  /**
    * Specifies the Double values to be compared in the query.
    * @param setValueArgs An array of number values.
    */
  def setValues(setValueArgs: js.Array[Double]): Unit = js.native
}

