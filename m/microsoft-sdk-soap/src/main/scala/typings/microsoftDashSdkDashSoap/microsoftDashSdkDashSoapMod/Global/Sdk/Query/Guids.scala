package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Query

import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Collection
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
  def this(args: js.Array[java.lang.String]) = this()
  /**
    * Returns the type of value with namespace prefix.
    */
  def getType(): java.lang.String = js.native
  /**
    * Returns an Sdk.Collection of GUID string values.
    */
  def getValues(): Collection[java.lang.String] = js.native
  /**
    * Specifies the Long values to be compared in the query.
    * @param setValueArgs An array of GUID string values.
    */
  def setValues(setValueArgs: js.Array[java.lang.String]): Unit = js.native
}

