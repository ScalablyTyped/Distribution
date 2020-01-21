package typings.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract RequestContext object that facilitates requests to the host Office application. 
  * The `Excel.run` and `Word.run` methods provide a request context.
  */
@JSGlobal("OfficeExtension.ClientRequestContext")
@js.native
class ClientRequestContext () extends js.Object {
  def this(url: String) = this()
  /** Debug information */
  val debugInfo: RequestContextDebugInfo = js.native
  /** Request headers */
  var requestHeaders: StringDictionary[String] = js.native
  /** Collection of objects that are tracked for automatic adjustments based on surrounding changes in the document. */
  var trackedObjects: TrackedObjects = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties. 
    * 
    * @param object The object whose properties are loaded.
    * @param option A comma-delimited string, or array of strings, that specifies the properties to load, or an 
    * {@link OfficeExtension.LoadOption} object.
    */
  def load(`object`: ClientObject): Unit = js.native
  def load(`object`: ClientObject, option: String): Unit = js.native
  def load(`object`: ClientObject, option: js.Array[String]): Unit = js.native
  def load(`object`: ClientObject, option: LoadOption): Unit = js.native
  /**
    * Queues up a command to recursively load the specified properties of the object and its navigation properties.
    * 
    * You must call `context.sync()` before reading the properties.
    *
    * @param object The object to be loaded.
    * @param options The key-value pairing of load options for the types, such as 
    *                `{ "Workbook": "worksheets,tables",  "Worksheet": "tables",  "Tables": "name" }`
    * @param maxDepth The maximum recursive depth.
    */
  def loadRecursive(`object`: ClientObject, options: StringDictionary[String | js.Array[String] | LoadOption]): Unit = js.native
  def loadRecursive(
    `object`: ClientObject,
    options: StringDictionary[String | js.Array[String] | LoadOption],
    maxDepth: Double
  ): Unit = js.native
  /**
    * Synchronizes the state between JavaScript proxy objects and the Office document, by executing instructions queued on the request context 
    * and retrieving properties of loaded Office objects for use in your code. 
    * This method returns a promise, which is resolved when the synchronization is complete.
    */
  def sync[T](): js.Promise[T] = js.native
  def sync[T](passThroughValue: T): js.Promise[T] = js.native
  /**
    * Adds a trace message to the queue. If the promise returned by `context.sync()` is rejected due to an error, this adds a ".traceMessages" 
    * array to the OfficeExtension.Error object, containing all trace messages that were executed. 
    * These messages can help you monitor the program execution sequence and detect the cause of the error. 
    */
  def trace(message: String): Unit = js.native
}

