package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import typings.officeJs.Word.Interfaces.CollectionLoadOptions
import typings.officeJs.Word.Interfaces.CustomXmlPartCollectionData
import typings.officeJs.Word.Interfaces.CustomXmlPartCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the collection of {@link Word.CustomXmlPart} objects.
  *
  * @remarks
  * [Api set: WordApi 1.4]
  */
@js.native
trait CustomXmlPartCollection
  extends StObject
     with ClientObject {
  
  /**
    * Adds a new custom XML part to the document.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * @param xml Required. XML content. Must be a valid XML fragment.
    */
  def add(xml: String): CustomXmlPart = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CustomXmlPartCollection: RequestContext = js.native
  
  /**
    * Gets a new scoped collection of custom XML parts whose namespaces match the given namespace.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * @param namespaceUri Required. The namespace URI.
    */
  def getByNamespace(namespaceUri: String): CustomXmlPartScopedCollection = js.native
  
  /**
    * Gets the number of items in the collection.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a custom XML part based on its ID.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * @param id ID or index of the custom XML part to be retrieved.
    */
  def getItem(id: String): CustomXmlPart = js.native
  
  /**
    * Gets a custom XML part based on its ID. If the CustomXmlPart does not exist, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * @param id Required. ID of the object to be retrieved.
    */
  def getItemOrNullObject(id: String): CustomXmlPart = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[CustomXmlPart] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CustomXmlPartCollection = js.native
  def load(options: CustomXmlPartCollectionLoadOptions & CollectionLoadOptions): CustomXmlPartCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): CustomXmlPartCollection = js.native
  def load(propertyNames: String): CustomXmlPartCollection = js.native
  def load(propertyNames: js.Array[String]): CustomXmlPartCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Word.CustomXmlPartCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.CustomXmlPartCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): CustomXmlPartCollectionData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): CustomXmlPartCollection = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): CustomXmlPartCollection = js.native
}
