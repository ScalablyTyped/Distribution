package typings.microsoftSdkSoap.mod.global.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.Util")
@js.native
object Util extends js.Object {
  
  /**
    * Creates an entity from XML.
    * @param The serialized entity returned from the SOAP service as XML.
    */
  def createEntityFromNode(node: java.lang.String): Unit = js.native
  
  /**
    * Formats a string with the arguments from an array.
    * @param string The string containing placeholders for items in the array.
    * @param args An array of strings to replace the placeholders.
    */
  def format(string: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = js.native
  
  /**
    * Returns the clinent URL.
    */
  def getClientUrl(): java.lang.String = js.native
  
  /**
    * Verifies the parameter is a valid enum value.
    * @param enumeration The enumeration.
    * @param value The value to check.
    */
  /**
    * Returns an empty GUID.
    */
  def getEmptyGuid(): java.lang.String = js.native
  
  /**
    *
    */
  def getError(resp: js.Any): java.lang.String = js.native
  
  /**
    *
    */
  def getXMLHttpRequest(action: java.lang.String, async: scala.Boolean): js.Any = js.native
  
  /**
    * Verifies the parameter is a string formatted as a GUID.
    * @param value The value to check.
    */
  def isGuid(value: java.lang.String): scala.Boolean = js.native
  
  /**
    * Verifies the parameter is a string formatted as a GUID or null.
    * @param value The value to check.
    */
  def isGuidOrNull(value: java.lang.String): scala.Boolean = js.native
  
  /**
    * Provides a way to override the client Url when a client-side context is not available.
    * @param url The client URL to use instead of the default.
    */
  def setClientUrl(url: java.lang.String): Unit = js.native
}
