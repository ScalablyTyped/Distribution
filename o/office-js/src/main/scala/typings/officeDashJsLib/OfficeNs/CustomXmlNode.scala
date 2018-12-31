package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an XML node in a tree in a document.
  *
  * @remarks
  * <table><tr><td>Requirement Sets</td><td>CustomXmlParts</td></tr></table>
  * 
  * **Support details**
  * 
  * A capital Y in the following matrix indicates that this interface is supported in the corresponding Office host application. 
  * An empty cell indicates that the Office host application doesn't support this interface.
  * 
  * For more information about Office host application and server requirements, see 
  * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
  * 
  * *Supported hosts, by platform*
  *  <table>
  *   <tr><th>                       </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
  *   <tr><td><strong> Word </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
  *  </table>
  */
@js.native
trait CustomXmlNode extends js.Object {
  /**
    * Gets the base name of the node without the namespace prefix, if one exists.
    *
    * @remarks
    * <table><tr><td>Requirement Sets</td><td>CustomXmlParts</td></tr></table>
    */
  var baseName: java.lang.String = js.native
  /**
    * Retrieves the string GUID of the CustomXMLPart.
    *
    * @remarks
    * <table><tr><td>Requirement Sets</td><td>CustomXmlParts</td></tr></table>
    */
  var namespaceUri: java.lang.String = js.native
  /**
    * Gets the type of the CustomXMLNode.
    *
    * @remarks
    * <table><tr><td>Requirement Sets</td><td>CustomXmlParts</td></tr></table>
    */
  var nodeType: java.lang.String = js.native
  /**
    * Gets the node value.
    *
    * @remarks
    * <table><tr><td>Requirement Sets</td><td>CustomXmlParts</td></tr></table>
    *
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is a string that contains the value of the referenced node.
    */
  def getNodeValueAsync(): scala.Unit = js.native
  def getNodeValueAsync(options: AsyncContextOptions): scala.Unit = js.native
  def getNodeValueAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets the nodes associated with the XPath expression.
    *
    * @remarks
    * <table><tr><td>Requirement Sets</td><td>CustomXmlParts</td></tr></table>
    *
    * @param xPath The XPath expression that specifies the nodes to get. Required.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is an array of CustomXmlNode objects that represent the nodes specified by the XPath expression passed to the `xPath` parameter.
    */
  def getNodesAsync(xPath: java.lang.String): scala.Unit = js.native
  def getNodesAsync(xPath: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def getNodesAsync(
    xPath: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[js.Array[this.type]], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets the text of an XML node in a custom XML part.
    *
    * @remarks
    * <table><tr><td>Requirement Sets</td><td>CustomXmlParts</td></tr></table>
    *
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is a string that contains the inner text of the referenced nodes.
    */
  def getTextAsync(): scala.Unit = js.native
  def getTextAsync(options: AsyncContextOptions): scala.Unit = js.native
  def getTextAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets the node's XML.
    *
    * @remarks
    * <table><tr><td>Requirement Sets</td><td>CustomXmlParts</td></tr></table>
    *
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is a string that contains the XML of the referenced node.
    */
  def getXmlAsync(): scala.Unit = js.native
  def getXmlAsync(options: AsyncContextOptions): scala.Unit = js.native
  def getXmlAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets the node value.
    *
    * @remarks
    * <table><tr><td>Requirement Sets</td><td>CustomXmlParts</td></tr></table>
    *
    * @param value The value to be set on the node
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def setNodeValueAsync(value: java.lang.String): scala.Unit = js.native
  def setNodeValueAsync(value: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def setNodeValueAsync(
    value: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Asynchronously sets the text of an XML node in a custom XML part.
    *
    * @remarks
    * <table><tr><td>Hosts</td><td>Word</td></tr>
    *
    * <tr><td>Requirement Sets</td><td>CustomXmlParts</td></tr></table>
    *
    * @param text Required. The text value of the XML node.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def setTextAsync(text: java.lang.String): scala.Unit = js.native
  def setTextAsync(text: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def setTextAsync(
    text: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets the node XML.
    *
    * @remarks
    * <table><tr><td>Requirement Sets</td><td>CustomXmlParts</td></tr></table>
    *
    * @param xml The XML to be set on the node
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def setXmlAsync(xml: java.lang.String): scala.Unit = js.native
  def setXmlAsync(xml: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def setXmlAsync(
    xml: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}

