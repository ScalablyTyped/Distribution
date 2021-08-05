package typings.microsoftSdkSoap.mod.global.Sdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  @JSGlobal("Sdk.Util")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an entity from XML.
    * @param The serialized entity returned from the SOAP service as XML.
    */
  inline def createEntityFromNode(node: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createEntityFromNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Formats a string with the arguments from an array.
    * @param string The string containing placeholders for items in the array.
    * @param args An array of strings to replace the placeholders.
    */
  inline def format(string: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(string.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /**
    * Returns the clinent URL.
    */
  inline def getClientUrl(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientUrl")().asInstanceOf[java.lang.String]
  
  /**
    * Verifies the parameter is a valid enum value.
    * @param enumeration The enumeration.
    * @param value The value to check.
    */
  /**
    * Returns an empty GUID.
    */
  inline def getEmptyGuid(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEmptyGuid")().asInstanceOf[java.lang.String]
  
  /**
    *
    */
  inline def getError(resp: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getError")(resp.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    *
    */
  inline def getXMLHttpRequest(action: java.lang.String, async: scala.Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getXMLHttpRequest")(action.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Verifies the parameter is a string formatted as a GUID.
    * @param value The value to check.
    */
  inline def isGuid(value: java.lang.String): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGuid")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  /**
    * Verifies the parameter is a string formatted as a GUID or null.
    * @param value The value to check.
    */
  inline def isGuidOrNull(value: java.lang.String): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGuidOrNull")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  /**
    * Provides a way to override the client Url when a client-side context is not available.
    * @param url The client URL to use instead of the default.
    */
  inline def setClientUrl(url: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setClientUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
