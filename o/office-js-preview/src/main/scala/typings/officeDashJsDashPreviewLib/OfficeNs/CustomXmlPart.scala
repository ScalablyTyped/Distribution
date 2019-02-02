package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single CustomXMLPart in an {@link Office.CustomXmlParts} collection.
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
trait CustomXmlPart extends js.Object {
  /**
    * True, if the custom XML part is built in; otherwise false.
    */
  var builtIn: scala.Boolean = js.native
  /**
    * Gets the GUID of the CustomXMLPart.
    */
  var id: java.lang.String = js.native
  /**
    * Gets the set of namespace prefix mappings ({@link Office.CustomXmlPrefixMappings}) used against the current CustomXmlPart.
    */
  var namespaceManager: CustomXmlPrefixMappings = js.native
  /**
    * Adds an event handler to the object using the specified event type.
    *
    * @remarks
    *
    * You can add multiple event handlers for the specified eventType as long as the name of each event handler function is unique.
    *
    * @param eventType Specifies the type of event to add. For a CustomXmlPart object, the eventType parameter can be specified as 
    *                  `Office.EventType.NodeDeleted`, `Office.EventType.NodeInserted`, and `Office.EventType.NodeReplaced`.
    * @param handler The event handler function to add, whose only parameter is of type {@link Office.NodeDeletedEventArgs}, 
    *                {@link Office.NodeInsertedEventArgs}, or {@link Office.NodeReplacedEventArgs}
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def addHandlerAsync(eventType: EventType, handler: js.Function1[/* result */ js.Any, scala.Unit]): scala.Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ js.Any, scala.Unit],
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ js.Any, scala.Unit],
    options: AsyncContextOptions
  ): scala.Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ js.Any, scala.Unit],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Deletes the Custom XML Part.
    *
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def deleteAsync(): scala.Unit = js.native
  def deleteAsync(callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]): scala.Unit = js.native
  def deleteAsync(options: AsyncContextOptions): scala.Unit = js.native
  def deleteAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Asynchronously gets any CustomXmlNodes in this custom XML part which match the specified XPath.
    *
    * @param xPath An XPath expression that specifies the nodes you want returned. Required.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is an array of CustomXmlNode objects that represent the nodes specified by the XPath expression passed to the xPath parameter.
    */
  def getNodesAsync(xPath: java.lang.String): scala.Unit = js.native
  def getNodesAsync(
    xPath: java.lang.String,
    callback: js.Function1[/* result */ AsyncResult[js.Array[CustomXmlNode]], scala.Unit]
  ): scala.Unit = js.native
  def getNodesAsync(xPath: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def getNodesAsync(
    xPath: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[js.Array[CustomXmlNode]], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Asynchronously gets the XML inside this custom XML part.
    *
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is a string that contains the XML of the referenced CustomXmlPart object.
    */
  def getXmlAsync(): scala.Unit = js.native
  def getXmlAsync(callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]): scala.Unit = js.native
  def getXmlAsync(options: AsyncContextOptions): scala.Unit = js.native
  def getXmlAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Removes an event handler for the specified event type.
    *
    * @param eventType Specifies the type of event to remove. For a CustomXmlPart object, the eventType parameter can be specified as 
    *                  `Office.EventType.NodeDeleted`, `Office.EventType.NodeInserted`, and `Office.EventType.NodeReplaced`.
    * @param handler The name of the handler to remove.
    * @param options Provides options to determine which event handler or handlers are removed.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def removeHandlerAsync(eventType: EventType): scala.Unit = js.native
  def removeHandlerAsync(eventType: EventType, handler: js.Function1[/* result */ js.Any, scala.Unit]): scala.Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ js.Any, scala.Unit],
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ js.Any, scala.Unit],
    options: RemoveHandlerOptions
  ): scala.Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ js.Any, scala.Unit],
    options: RemoveHandlerOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}

