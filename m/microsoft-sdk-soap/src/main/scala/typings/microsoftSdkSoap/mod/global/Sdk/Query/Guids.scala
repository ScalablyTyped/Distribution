package typings.microsoftSdkSoap.mod.global.Sdk.Query

import typings.microsoftSdkSoap.mod.global.Sdk.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
