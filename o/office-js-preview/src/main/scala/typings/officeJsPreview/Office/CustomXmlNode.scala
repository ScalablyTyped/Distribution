package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an XML node in a tree in a document.
  *
  * @remarks
  *
  * **Hosts**: Word
  */
@js.native
trait CustomXmlNode extends StObject {
  
  /**
    * Gets the base name of the node without the namespace prefix, if one exists.
    */
  var baseName: String = js.native
  
  /**
    * Gets the node value.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    *
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is a string that contains the value of the referenced node.
    */
  def getNodeValueAsync(): Unit = js.native
  def getNodeValueAsync(callback: js.Function1[/* result */ AsyncResult[String], Unit]): Unit = js.native
  def getNodeValueAsync(options: Unit, callback: js.Function1[/* result */ AsyncResult[String], Unit]): Unit = js.native
  def getNodeValueAsync(options: AsyncContextOptions): Unit = js.native
  def getNodeValueAsync(options: AsyncContextOptions, callback: js.Function1[/* result */ AsyncResult[String], Unit]): Unit = js.native
  
  /**
    * Gets the nodes associated with the XPath expression.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    *
    * @param xPath The XPath expression that specifies the nodes to get. Required.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is an array of CustomXmlNode objects that represent the nodes specified by the XPath expression passed to the `xPath` parameter.
    */
  def getNodesAsync(xPath: String): Unit = js.native
  def getNodesAsync(xPath: String, callback: js.Function1[/* result */ AsyncResult[js.Array[this.type]], Unit]): Unit = js.native
  def getNodesAsync(
    xPath: String,
    options: Unit,
    callback: js.Function1[/* result */ AsyncResult[js.Array[this.type]], Unit]
  ): Unit = js.native
  def getNodesAsync(xPath: String, options: AsyncContextOptions): Unit = js.native
  def getNodesAsync(
    xPath: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[js.Array[this.type]], Unit]
  ): Unit = js.native
  
  /**
    * Gets the text of an XML node in a custom XML part.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    *
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is a string that contains the inner text of the referenced nodes.
    */
  def getTextAsync(): Unit = js.native
  def getTextAsync(callback: js.Function1[/* result */ AsyncResult[String], Unit]): Unit = js.native
  def getTextAsync(options: Unit, callback: js.Function1[/* result */ AsyncResult[String], Unit]): Unit = js.native
  def getTextAsync(options: AsyncContextOptions): Unit = js.native
  def getTextAsync(options: AsyncContextOptions, callback: js.Function1[/* result */ AsyncResult[String], Unit]): Unit = js.native
  
  /**
    * Gets the node's XML.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    *
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is a string that contains the XML of the referenced node.
    */
  def getXmlAsync(): Unit = js.native
  def getXmlAsync(callback: js.Function1[/* result */ AsyncResult[String], Unit]): Unit = js.native
  def getXmlAsync(options: Unit, callback: js.Function1[/* result */ AsyncResult[String], Unit]): Unit = js.native
  def getXmlAsync(options: AsyncContextOptions): Unit = js.native
  def getXmlAsync(options: AsyncContextOptions, callback: js.Function1[/* result */ AsyncResult[String], Unit]): Unit = js.native
  
  /**
    * Retrieves the string GUID of the CustomXMLPart.
    */
  var namespaceUri: String = js.native
  
  /**
    * Gets the type of the CustomXMLNode.
    */
  var nodeType: String = js.native
  
  /**
    * Sets the node value.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    *
    * @param value The value to be set on the node
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def setNodeValueAsync(value: String): Unit = js.native
  def setNodeValueAsync(value: String, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def setNodeValueAsync(value: String, options: Unit, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def setNodeValueAsync(value: String, options: AsyncContextOptions): Unit = js.native
  def setNodeValueAsync(
    value: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Asynchronously sets the text of an XML node in a custom XML part.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    *
    * @param text Required. The text value of the XML node.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def setTextAsync(text: String): Unit = js.native
  def setTextAsync(text: String, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def setTextAsync(text: String, options: Unit, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def setTextAsync(text: String, options: AsyncContextOptions): Unit = js.native
  def setTextAsync(
    text: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Sets the node XML.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    *
    * @param xml The XML to be set on the node
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def setXmlAsync(xml: String): Unit = js.native
  def setXmlAsync(xml: String, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def setXmlAsync(xml: String, options: Unit, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def setXmlAsync(xml: String, options: AsyncContextOptions): Unit = js.native
  def setXmlAsync(
    xml: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}
