package typings.microsoftSdkSoap.mod.global.Sdk.Query

import typings.microsoftSdkSoap.mod.global.Sdk.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the Date values to be compared in the query.
  * @param args An array of Date values.
  */
@JSGlobal("Sdk.Query.Dates")
@js.native
open class Dates protected () extends ValueBase {
  def this(args: js.Array[js.Date]) = this()
  
  /**
    * Returns the type of value with namespace prefix.
    */
  def getType(): String = js.native
  
  /**
    * Returns an Sdk.Collection of Date values.
    */
  def getValues(): Collection[js.Date] = js.native
  
  /**
    * Specifies the Date values to be compared in the query.
    * @param setValueArgs An array of Date values.
    */
  def setValues(setValueArgs: js.Array[js.Date]): Unit = js.native
}
