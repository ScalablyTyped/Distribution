package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single CustomXMLPart in an {@link Office.CustomXmlParts} collection.
  *
  * @remarks
  *
  * **Applications**: Word
  */
@js.native
trait CustomXmlPart extends StObject {
  
  /**
    * Adds an event handler to the object using the specified event type.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
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
  def addHandlerAsync(eventType: EventType, handler: js.Function1[/* result */ Any, Unit]): Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ Any, Unit],
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ Any, Unit],
    options: Unit,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def addHandlerAsync(eventType: EventType, handler: js.Function1[/* result */ Any, Unit], options: AsyncContextOptions): Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ Any, Unit],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * True, if the custom XML part is built in; otherwise false.
    */
  var builtIn: Boolean = js.native
  
  /**
    * Deletes the Custom XML Part.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    *
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def deleteAsync(): Unit = js.native
  def deleteAsync(callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def deleteAsync(options: Unit, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def deleteAsync(options: AsyncContextOptions): Unit = js.native
  def deleteAsync(options: AsyncContextOptions, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  
  /**
    * Asynchronously gets any CustomXmlNodes in this custom XML part which match the specified XPath.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    *
    * @param xPath An XPath expression that specifies the nodes you want returned. Required.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is an array of CustomXmlNode objects that represent the nodes specified by the XPath expression passed to the xPath parameter.
    */
  def getNodesAsync(xPath: String): Unit = js.native
  def getNodesAsync(xPath: String, callback: js.Function1[/* result */ AsyncResult[js.Array[CustomXmlNode]], Unit]): Unit = js.native
  def getNodesAsync(
    xPath: String,
    options: Unit,
    callback: js.Function1[/* result */ AsyncResult[js.Array[CustomXmlNode]], Unit]
  ): Unit = js.native
  def getNodesAsync(xPath: String, options: AsyncContextOptions): Unit = js.native
  def getNodesAsync(
    xPath: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[js.Array[CustomXmlNode]], Unit]
  ): Unit = js.native
  
  /**
    * Asynchronously gets the XML inside this custom XML part.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    *
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is a string that contains the XML of the referenced CustomXmlPart object.
    */
  def getXmlAsync(): Unit = js.native
  def getXmlAsync(callback: js.Function1[/* result */ AsyncResult[String], Unit]): Unit = js.native
  def getXmlAsync(options: Unit, callback: js.Function1[/* result */ AsyncResult[String], Unit]): Unit = js.native
  def getXmlAsync(options: AsyncContextOptions): Unit = js.native
  def getXmlAsync(options: AsyncContextOptions, callback: js.Function1[/* result */ AsyncResult[String], Unit]): Unit = js.native
  
  /**
    * Gets the GUID of the CustomXMLPart.
    */
  var id: String = js.native
  
  /**
    * Gets the set of namespace prefix mappings ({@link Office.CustomXmlPrefixMappings}) used against the current CustomXmlPart.
    */
  var namespaceManager: CustomXmlPrefixMappings = js.native
  
  /**
    * Removes an event handler for the specified event type.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    *
    * @param eventType Specifies the type of event to remove. For a CustomXmlPart object, the eventType parameter can be specified as
    *                  `Office.EventType.NodeDeleted`, `Office.EventType.NodeInserted`, and `Office.EventType.NodeReplaced`.
    * @param handler The name of the handler to remove.
    * @param options Provides options to determine which event handler or handlers are removed.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def removeHandlerAsync(eventType: EventType): Unit = js.native
  def removeHandlerAsync(eventType: EventType, handler: js.Function1[/* result */ Any, Unit]): Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ Any, Unit],
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ Any, Unit],
    options: Unit,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def removeHandlerAsync(eventType: EventType, handler: js.Function1[/* result */ Any, Unit], options: RemoveHandlerOptions): Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ Any, Unit],
    options: RemoveHandlerOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def removeHandlerAsync(eventType: EventType, handler: Unit, callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    handler: Unit,
    options: Unit,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def removeHandlerAsync(eventType: EventType, handler: Unit, options: RemoveHandlerOptions): Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    handler: Unit,
    options: RemoveHandlerOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}
