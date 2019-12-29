package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query

import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the Sdk.Query.Guids values to be compared in the query.
  * @param args An array of GUID string values.
  */
@JSGlobal("Sdk.Query.Guids")
@js.native
class Guids protected () extends ValueBase {
  def this(args: js.Array[String]) = this()
  /**
    * Returns the type of value with namespace prefix.
    */
  def getType(): String = js.native
  /**
    * Returns an Sdk.Collection of GUID string values.
    */
  def getValues(): Collection[String] = js.native
  /**
    * Specifies the Long values to be compared in the query.
    * @param setValueArgs An array of GUID string values.
    */
  def setValues(setValueArgs: js.Array[String]): Unit = js.native
}

