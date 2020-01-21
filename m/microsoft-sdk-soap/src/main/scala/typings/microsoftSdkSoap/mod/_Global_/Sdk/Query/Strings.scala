package typings.microsoftSdkSoap.mod._Global_.Sdk.Query

import typings.microsoftSdkSoap.mod._Global_.Sdk.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the String values to be compared in the query.
  * @param args An array of String values.
  */
@JSGlobal("Sdk.Query.Strings")
@js.native
class Strings protected () extends ValueBase {
  def this(args: js.Array[String]) = this()
  /**
    * Returns the type of value with namespace prefix.
    */
  def getType(): String = js.native
  /**
    * Returns an Sdk.Collection of String values.
    */
  def getValues(): Collection[String] = js.native
  /**
    * Specifies the String values to be compared in the query.
    * @param setValueArgs An array of String values.
    */
  def setValues(setValueArgs: js.Array[String]): Unit = js.native
}

