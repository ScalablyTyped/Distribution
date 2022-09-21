package typings.microsoftSdkSoap.mod.global.Sdk.Query

import typings.microsoftSdkSoap.mod.global.Sdk.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies Boolean values to be compared in the query.
  * @param args An array of Boolean values.
  */
@JSGlobal("Sdk.Query.Booleans")
@js.native
open class Booleans protected () extends ValueBase {
  def this(args: js.Array[Boolean]) = this()
  
  /**
    * Returns the type of value with namespace prefix.
    */
  def getType(): String = js.native
  
  /**
    * Returns an Sdk.Collection of boolean values.
    */
  def getValues(): Collection[Boolean] = js.native
  
  /**
    * Specifies a Boolean value to be compared in the query.
    * @param setValueArgs An array of boolean values.
    */
  def setValues(setValueArgs: js.Array[Boolean]): Unit = js.native
}
