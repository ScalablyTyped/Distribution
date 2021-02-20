package typings.microsoftSdkSoap.mod.global.Sdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.OrganizationRequest")
@js.native
class OrganizationRequest () extends StObject {
  
  /**
    * Gets the request XML.
    */
  def getRequestXml(): java.lang.String = js.native
  
  /**
    * Gets the response type.
    */
  def getResponseType(): OrganizationResponse = js.native
  
  /**
    * Sets the request XML.
    * @param xml The request XML.
    */
  def setRequestXml(xml: java.lang.String): Unit = js.native
  
  /**
    * Sets the response type.
    * @param type A class that inherits from Sdk.OrganizationResponse.
    */
  def setResponseType(`type`: OrganizationResponse): Unit = js.native
}
