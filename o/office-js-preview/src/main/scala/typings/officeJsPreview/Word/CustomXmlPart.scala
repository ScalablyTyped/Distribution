package typings.officeJsPreview.Word

import typings.officeJsPreview.AnonExpand
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.Word.Interfaces.CustomXmlPartData
import typings.officeJsPreview.Word.Interfaces.CustomXmlPartLoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a custom XML part.
  *
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Word.CustomXmlPart")
@js.native
class CustomXmlPart () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CustomXmlPart: RequestContext = js.native
  /**
    *
    * Gets the ID of the custom XML part. Read only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val id: String = js.native
  /**
    *
    * Gets the namespace URI of the custom XML part. Read only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val namespaceUri: String = js.native
  /**
    *
    * Deletes the custom XML part.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def delete(): Unit = js.native
  /**
    *
    * Deletes an attribute with the given name from the element identified by xpath.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param xpath Required. Absolute path to the single element in XPath notation.
    * @param namespaceMappings Required. An object whose properties represent namespace aliases and the values are the actual namespace URIs.
    * @param name Required. Name of the attribute.
    */
  def deleteAttribute(xpath: String, namespaceMappings: js.Any, name: String): Unit = js.native
  /**
    *
    * Deletes the element identified by xpath.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param xpath Required. Absolute path to the single element in XPath notation.
    * @param namespaceMappings Required. An object whose properties represent namespace aliases and the values are the actual namespace URIs.
    */
  def deleteElement(xpath: String, namespaceMappings: js.Any): Unit = js.native
  /**
    *
    * Gets the full XML content of the custom XML part.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getXml(): ClientResult[String] = js.native
  /**
    *
    * Inserts an attribute with the given name and value to the element identified by xpath.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param xpath Required. Absolute path to the single element in XPath notation.
    * @param namespaceMappings Required. An object whose properties represent namespace aliases and the values are the actual namespace URIs.
    * @param name Required. Name of the attribute.
    * @param value Required. Value of the attribute.
    */
  def insertAttribute(xpath: String, namespaceMappings: js.Any, name: String, value: String): Unit = js.native
  /**
    *
    * Inserts the given XML under the parent element identified by xpath at child position index.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param xpath Required. Absolute path to the single parent element in XPath notation.
    * @param xml Required. XML content to be inserted.
    * @param namespaceMappings Required. An object whose properties represent namespace aliases and the values are the actual namespace URIs.
    * @param index Optional. Zero-based position at which the new XML to be inserted. If omitted, the XML will be appended as the last child of this parent.
    */
  def insertElement(xpath: String, xml: String, namespaceMappings: js.Any): Unit = js.native
  def insertElement(xpath: String, xml: String, namespaceMappings: js.Any, index: Double): Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.CustomXmlPart` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.CustomXmlPart` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.CustomXmlPart` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CustomXmlPart = js.native
  def load(option: String): CustomXmlPart = js.native
  def load(option: js.Array[String]): CustomXmlPart = js.native
  def load(option: AnonExpand): CustomXmlPart = js.native
  def load(option: CustomXmlPartLoadOptions): CustomXmlPart = js.native
  /**
    *
    * Queries the XML content of the custom XML part.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param xpath Required. An XPath query.
    * @param namespaceMappings Required. An object whose properties represent namespace aliases and the values are the actual namespace URIs.
    * @returns An array where each item represents an entry matched by the XPath query.
    */
  def query(xpath: String, namespaceMappings: js.Any): ClientResult[js.Array[String]] = js.native
  /**
    *
    * Sets the full XML content of the custom XML part.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param xml Required. XML content to be set.
    */
  def setXml(xml: String): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.CustomXmlPart object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.CustomXmlPartData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): CustomXmlPartData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): CustomXmlPart = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): CustomXmlPart = js.native
  /**
    *
    * Updates the value of an attribute with the given name of the element identified by xpath.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param xpath Required. Absolute path to the single element in XPath notation.
    * @param namespaceMappings Required. An object whose properties represent namespace aliases and the values are the actual namespace URIs.
    * @param name Required. Name of the attribute.
    * @param value Required. New value of the attribute.
    */
  def updateAttribute(xpath: String, namespaceMappings: js.Any, name: String, value: String): Unit = js.native
  /**
    *
    * Updates the XML of the element identified by xpath.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param xpath Required. Absolute path to the single element in XPath notation.
    * @param xml Required. New XML content to be stored.
    * @param namespaceMappings Required. An object whose properties represent namespace aliases and the values are the actual namespace URIs.
    */
  def updateElement(xpath: String, xml: String, namespaceMappings: js.Any): Unit = js.native
}

