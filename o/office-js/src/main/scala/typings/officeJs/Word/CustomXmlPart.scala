package typings.officeJs.Word

import org.scalablytyped.runtime.StringDictionary
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.Word.Interfaces.CustomXmlPartData
import typings.officeJs.Word.Interfaces.CustomXmlPartLoadOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a custom XML part.
  *
  * @remarks
  * [Api set: WordApi 1.4]
  */
@js.native
trait CustomXmlPart
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CustomXmlPart: RequestContext = js.native
  
  /**
    * Deletes the custom XML part.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  def delete(): Unit = js.native
  
  /**
    * Deletes an attribute with the given name from the element identified by xpath.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * If any element in the tree has an xmlns attribute (whose value is typically, but not always, a URI),
    * an alias for that attribute value must prefix the element name in the xpath parameter. For example, suppose
    * the tree is the following:
    *
    * ```xml
    * <Day>
    *   <Month xmlns="http://calendartypes.org/xsds/GregorianCalendar">
    *     <Week>something</Week>
    *   </Month>
    * </Day>
    * ```
    *
    * The xpath to `<Week>` must be \/Day\/greg:Month\/Week, where greg is an alias that is mapped to
    * "http:\/\/calendartypes.org\/xsds\/GregorianCalendar" in the namespaceMappings parameter.
    *
    * @param xpath Required. Absolute path to the single element in XPath notation.
    * @param namespaceMappings Required. An object whose property values are namespace names and whose property names are aliases for the corresponding namespaces. For example, `{greg: "http://calendartypes.org/xsds/GregorianCalendar"}`. The property names (such as "greg") can be any string that does not used reserved XPath characters, such as the forward slash "/".
    * @param name Required. Name of the attribute.
    */
  def deleteAttribute(xpath: String, namespaceMappings: StringDictionary[String], name: String): Unit = js.native
  
  /**
    * Deletes the element identified by xpath.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * If any element in the tree has an xmlns attribute (whose value is typically, but not always, a URI),
    * an alias for that attribute value must prefix the element name in the xpath parameter. For example, suppose
    * the tree is the following:
    *
    * ```xml
    * <Day>
    *   <Month xmlns="http://calendartypes.org/xsds/GregorianCalendar">
    *     <Week>something</Week>
    *   </Month>
    * </Day>
    * ```
    *
    * The xpath to `<Week>` must be \/Day\/greg:Month\/Week, where greg is an alias that is mapped to
    * "http:\/\/calendartypes.org\/xsds\/GregorianCalendar" in the namespaceMappings parameter.
    *
    * @param xpath Required. Absolute path to the single element in XPath notation.
    * @param namespaceMappings Required. An object whose property values are namespace names and whose property names are aliases for the corresponding namespaces. For example, `{greg: "http://calendartypes.org/xsds/GregorianCalendar"}`. The property names (such as "greg") can be any string that does not used reserved XPath characters, such as the forward slash "/".
    */
  def deleteElement(xpath: String, namespaceMappings: StringDictionary[String]): Unit = js.native
  
  /**
    * Gets the full XML content of the custom XML part.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  def getXml(): ClientResult[String] = js.native
  
  /**
    * Gets the ID of the custom XML part.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val id: String = js.native
  
  /**
    * Inserts an attribute with the given name and value to the element identified by xpath.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * If any element in the tree has an xmlns attribute (whose value is typically, but not always, a URI),
    * an alias for that attribute value must prefix the element name in the xpath parameter. For example, suppose
    * the tree is the following:
    *
    * ```xml
    * <Day>
    *   <Month xmlns="http://calendartypes.org/xsds/GregorianCalendar">
    *     <Week>something</Week>
    *   </Month>
    * </Day>
    * ```
    *
    * The xpath to `<Week>` must be \/Day\/greg:Month\/Week, where greg is an alias that is mapped to
    * "http:\/\/calendartypes.org\/xsds\/GregorianCalendar" in the namespaceMappings parameter.
    *
    * @param xpath Required. Absolute path to the single element in XPath notation.
    * @param namespaceMappings Required. An object whose property values are namespace names and whose property names are aliases for the corresponding namespaces. For example, `{greg: "http://calendartypes.org/xsds/GregorianCalendar"}`. The property names (such as "greg") can be any string that does not used reserved XPath characters, such as the forward slash "/".
    * @param name Required. Name of the attribute.
    * @param value Required. Value of the attribute.
    */
  def insertAttribute(xpath: String, namespaceMappings: StringDictionary[String], name: String, value: String): Unit = js.native
  
  /**
    * Inserts the given XML under the parent element identified by xpath at child position index.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * If any element in the tree has an xmlns attribute (whose value is typically, but not always, a URI),
    * an alias for that attribute value must prefix the element name in the xpath parameter. For example, suppose
    * the tree is the following:
    *
    * ```xml
    * <Day>
    *   <Month xmlns="http://calendartypes.org/xsds/GregorianCalendar">
    *     <Week>something</Week>
    *   </Month>
    * </Day>
    * ```
    *
    * The xpath to `<Week>` must be \/Day\/greg:Month\/Week, where greg is an alias that is mapped to
    * "http:\/\/calendartypes.org\/xsds\/GregorianCalendar" in the namespaceMappings parameter.
    *
    * @param xpath Required. Absolute path to the single parent element in XPath notation.
    * @param xml Required. XML content to be inserted.
    * @param namespaceMappings Required. An object whose property values are namespace names and whose property names are aliases for the corresponding namespaces. For example, `{greg: "http://calendartypes.org/xsds/GregorianCalendar"}`. The property names (such as "greg") can be any string that does not used reserved XPath characters, such as the forward slash "/".
    * @param index Optional. Zero-based position at which the new XML to be inserted. If omitted, the XML will be appended as the last child of this parent.
    */
  def insertElement(xpath: String, xml: String, namespaceMappings: StringDictionary[String]): Unit = js.native
  def insertElement(xpath: String, xml: String, namespaceMappings: StringDictionary[String], index: Double): Unit = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CustomXmlPart = js.native
  def load(options: CustomXmlPartLoadOptions): CustomXmlPart = js.native
  def load(propertyNamesAndPaths: Expand): CustomXmlPart = js.native
  def load(propertyNames: String): CustomXmlPart = js.native
  def load(propertyNames: js.Array[String]): CustomXmlPart = js.native
  
  /**
    * Gets the namespace URI of the custom XML part.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val namespaceUri: String = js.native
  
  /**
    * Queries the XML content of the custom XML part.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * If any element in the tree has an xmlns attribute (whose value is typically, but not always, a URI),
    * an alias for that attribute value must prefix the element name in the xpath parameter. For example, suppose
    * the tree is the following:
    *
    * ```xml
    * <Day>
    *   <Month xmlns="http://calendartypes.org/xsds/GregorianCalendar">
    *     <Week>something</Week>
    *   </Month>
    * </Day>
    * ```
    *
    * The xpath to `<Week>` must be \/Day\/greg:Month\/Week, where greg is an alias that is mapped to
    * "http:\/\/calendartypes.org\/xsds\/GregorianCalendar" in the namespaceMappings parameter.
    *
    * @param xpath Required. An XPath query.
    * @param namespaceMappings Required. An object whose property values are namespace names and whose property names are aliases for the corresponding namespaces. For example, `{greg: "http://calendartypes.org/xsds/GregorianCalendar"}`. The property names (such as "greg") can be any string that does not used reserved XPath characters, such as the forward slash "/".
    * @returns An array where each item represents an entry matched by the XPath query.
    */
  def query(xpath: String, namespaceMappings: StringDictionary[String]): ClientResult[js.Array[String]] = js.native
  
  /**
    * Sets the full XML content of the custom XML part.
    *
    * @remarks
    * [Api set: WordApi 1.4]
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
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): CustomXmlPart = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): CustomXmlPart = js.native
  
  /**
    * Updates the value of an attribute with the given name of the element identified by xpath.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * If any element in the tree has an xmlns attribute (whose value is typically, but not always, a URI),
    * an alias for that attribute value must prefix the element name in the xpath parameter. For example, suppose
    * the tree is the following:
    *
    * ```xml
    * <Day>
    *   <Month xmlns="http://calendartypes.org/xsds/GregorianCalendar">
    *     <Week>something</Week>
    *   </Month>
    * </Day>
    * ```
    *
    * The xpath to `<Week>` must be \/Day\/greg:Month\/Week, where greg is an alias that is mapped to
    * "http:\/\/calendartypes.org\/xsds\/GregorianCalendar" in the namespaceMappings parameter.
    *
    * @param xpath Required. Absolute path to the single element in XPath notation.
    * @param namespaceMappings Required. An object whose property values are namespace names and whose property names are aliases for the corresponding namespaces. For example, `{greg: "http://calendartypes.org/xsds/GregorianCalendar"}`. The property names (such as "greg") can be any string that does not used reserved XPath characters, such as the forward slash "/".
    * @param name Required. Name of the attribute.
    * @param value Required. New value of the attribute.
    */
  def updateAttribute(xpath: String, namespaceMappings: StringDictionary[String], name: String, value: String): Unit = js.native
  
  /**
    * Updates the XML of the element identified by xpath.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * If any element in the tree has an xmlns attribute (whose value is typically, but not always, a URI),
    * an alias for that attribute value must prefix the element name in the xpath parameter. For example, suppose
    * the tree is the following:
    *
    * ```xml
    * <Day>
    *   <Month xmlns="http://calendartypes.org/xsds/GregorianCalendar">
    *     <Week>something</Week>
    *   </Month>
    * </Day>
    * ```
    *
    * The xpath to `<Week>` must be \/Day\/greg:Month\/Week, where greg is an alias that is mapped to
    * "http:\/\/calendartypes.org\/xsds\/GregorianCalendar" in the namespaceMappings parameter.
    *
    * @param xpath Required. Absolute path to the single element in XPath notation.
    * @param xml Required. New XML content to be stored.
    * @param namespaceMappings Required. An object whose property values are namespace names and whose property names are aliases for the corresponding namespaces. For example, `{greg: "http://calendartypes.org/xsds/GregorianCalendar"}`. The property names (such as "greg") can be any string that does not used reserved XPath characters, such as the forward slash "/".
    */
  def updateElement(xpath: String, xml: String, namespaceMappings: StringDictionary[String]): Unit = js.native
}
