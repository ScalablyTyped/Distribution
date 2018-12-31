package typings
package openui5Lib.sapNs.uiNs.modelNs.xmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.xml.XMLModel")
@js.native
class XMLModel protected ()
  extends openui5Lib.sapNs.uiNs.modelNs.ClientModel {
  /**
    * Constructor for a new XMLModel.
    * @param oData either the URL where to load the XML from or a XML
    */
  def this(oData: js.Any) = this()
  /**
    * Serializes the current XML data of the model into a string.
    */
  def getXML(): scala.Unit = js.native
  def loadData(
    sURL: java.lang.String,
    oParameters: java.lang.String,
    bAsync: scala.Boolean,
    sType: java.lang.String,
    bCache: java.lang.String,
    mHeaders: js.Any
  ): scala.Unit = js.native
  /**
    * Load XML-encoded data from the server using a GET HTTP request and store the resulting XML data in
    * the model.Note: Due to browser security restrictions, most "Ajax" requests are subject to the same
    * origin policy,the request can not successfully retrieve data from a different domain, subdomain, or
    * protocol.
    * @param sURL A string containing the URL to which the request is sent.
    * @param oParameters A map or string that is sent to the server with the request.
    * @param bAsync if the request should be asynchron or not. Default is true.
    * @param sType of request. Default is 'GET'
    * @param bCache force no caching if false. Default is false
    * @param mHeaders An object of additional header key/value pairs to send along with the request
    */
  def loadData(
    sURL: java.lang.String,
    oParameters: js.Any,
    bAsync: scala.Boolean,
    sType: java.lang.String,
    bCache: java.lang.String,
    mHeaders: js.Any
  ): scala.Unit = js.native
  /**
    * Sets the provided XML encoded data object to the model
    * @param oData the data to set to the model
    */
  def setData(oData: js.Any): scala.Unit = js.native
  /**
    * Sets an XML namespace to use in the binding path
    * @param sNameSpace the namespace URI
    * @param sPrefix the prefix for the namespace (optional)
    */
  def setNameSpace(sNameSpace: java.lang.String): scala.Unit = js.native
  def setNameSpace(sNameSpace: java.lang.String, sPrefix: java.lang.String): scala.Unit = js.native
  /**
    * Sets a new value for the given property <code>sPropertyName</code> in the model.If the model value
    * changed all interested parties are informed.
    * @param sPath path of the property to set
    * @param oValue value to set the property to
    * @param oContext the context which will be used to set the property
    * @param bAsyncUpdate whether to update other bindings dependent on this property asynchronously
    * @returns true if the value was set correctly and false if errors occurred like the entry was not
    * found.
    */
  def setProperty(sPath: java.lang.String, oValue: js.Any): scala.Boolean = js.native
  def setProperty(sPath: java.lang.String, oValue: js.Any, oContext: js.Any): scala.Boolean = js.native
  def setProperty(sPath: java.lang.String, oValue: js.Any, oContext: js.Any, bAsyncUpdate: scala.Boolean): scala.Boolean = js.native
  /**
    * Sets the specified XML formatted string text to the model
    * @param sXMLText the XML data as string
    */
  def setXML(sXMLText: java.lang.String): scala.Unit = js.native
}

