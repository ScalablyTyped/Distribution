package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Word.Interfaces.ListItemData
import typings.officeJs.Word.Interfaces.ListItemLoadOptions
import typings.officeJs.Word.Interfaces.ListItemUpdateData
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the paragraph list item format.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
@js.native
trait ListItem
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ListItem: RequestContext = js.native
  
  /**
    * Gets the list item parent, or the closest ancestor if the parent does not exist. Throws an `ItemNotFound` error if the list item has no ancestor.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param parentOnly Optional. Specifies only the list item's parent will be returned. The default is false that specifies to get the lowest ancestor.
    */
  def getAncestor(): Paragraph = js.native
  def getAncestor(parentOnly: Boolean): Paragraph = js.native
  
  /**
    * Gets the list item parent, or the closest ancestor if the parent does not exist. If the list item has no ancestor, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param parentOnly Optional. Specifies only the list item's parent will be returned. The default is false that specifies to get the lowest ancestor.
    */
  def getAncestorOrNullObject(): Paragraph = js.native
  def getAncestorOrNullObject(parentOnly: Boolean): Paragraph = js.native
  
  /**
    * Gets all descendant list items of the list item.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param directChildrenOnly Optional. Specifies only the list item's direct children will be returned. The default is false that indicates to get all descendant items.
    */
  def getDescendants(): ParagraphCollection = js.native
  def getDescendants(directChildrenOnly: Boolean): ParagraphCollection = js.native
  
  /**
    * Gets or sets the level of the item in the list.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var level: Double = js.native
  
  /**
    * Gets the list item bullet, number, or picture as a string.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val listString: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ListItem = js.native
  def load(options: ListItemLoadOptions): ListItem = js.native
  def load(propertyNamesAndPaths: Expand): ListItem = js.native
  def load(propertyNames: String): ListItem = js.native
  def load(propertyNames: js.Array[String]): ListItem = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ListItemUpdateData): Unit = js.native
  def set(properties: ListItemUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ListItem): Unit = js.native
  
  /**
    * Gets the list item order number in relation to its siblings.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val siblingIndex: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.ListItem object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.ListItemData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ListItemData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): ListItem = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): ListItem = js.native
}
