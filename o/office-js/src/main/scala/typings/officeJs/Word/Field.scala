package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Word.Interfaces.FieldData
import typings.officeJs.Word.Interfaces.FieldLoadOptions
import typings.officeJs.Word.Interfaces.FieldUpdateData
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Cold
import typings.officeJs.officeJsStrings.End
import typings.officeJs.officeJsStrings.Hot
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Select
import typings.officeJs.officeJsStrings.Start
import typings.officeJs.officeJsStrings.Warm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a field.
  *
  * @remarks
  * [Api set: WordApi 1.4]
  */
@js.native
trait Field
  extends StObject
     with ClientObject {
  
  /**
    * Specifies the field's code instruction.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * Note: The ability to set the code was introduced in WordApi 1.5.
    */
  var code: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Field: RequestContext = js.native
  
  /**
    * Specifies data in an "Addin" field. If the field isn't an "Addin" field, it is null and it will throw a general exception when code attempts to set it.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var data: String = js.native
  
  /**
    * Deletes the field.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  def delete(): Unit = js.native
  
  /**
    * Gets the next field. Throws an `ItemNotFound` error if this field is the last one.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  def getNext(): Field = js.native
  
  /**
    * Gets the next field. If this field is the last one, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  def getNextOrNullObject(): Field = js.native
  
  /**
    * Gets the field's kind.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  val kind: FieldKind | None | Hot | Warm | Cold = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Field = js.native
  def load(options: FieldLoadOptions): Field = js.native
  def load(propertyNamesAndPaths: Expand): Field = js.native
  def load(propertyNames: String): Field = js.native
  def load(propertyNames: js.Array[String]): Field = js.native
  
  /**
    * Specifies whether the field is locked. `true` if the field is locked, `false` otherwise.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var locked: Boolean = js.native
  
  /**
    * Gets the parent body of the field.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val parentBody: Body = js.native
  
  /**
    * Gets the content control that contains the field. Throws an `ItemNotFound` error if there isn't a parent content control.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val parentContentControl: ContentControl = js.native
  
  /**
    * Gets the content control that contains the field. If there isn't a parent content control, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  
  /**
    * Gets the table that contains the field. Throws an `ItemNotFound` error if it is not contained in a table.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val parentTable: Table = js.native
  
  /**
    * Gets the table cell that contains the field. Throws an `ItemNotFound` error if it is not contained in a table cell.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val parentTableCell: TableCell = js.native
  
  /**
    * Gets the table cell that contains the field. If it is not contained in a table cell, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val parentTableCellOrNullObject: TableCell = js.native
  
  /**
    * Gets the table that contains the field. If it is not contained in a table, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val parentTableOrNullObject: Table = js.native
  
  /**
    * Gets the field's result data.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val result: Range = js.native
  
  /**
    * Selects the field.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    *
    * @param selectionMode Optional. The selection mode must be 'Select', 'Start', or 'End'. 'Select' is the default.
    */
  def select(): Unit = js.native
  def select(selectionMode: Select | Start | End): Unit = js.native
  def select(selectionMode: SelectionMode): Unit = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Field): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: FieldUpdateData): Unit = js.native
  def set(properties: FieldUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Field object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.FieldData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): FieldData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): Field = js.native
  
  /**
    * Gets the field's type.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  val `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91, starting with typings.officeJs.Word.FieldType, typings.officeJs.officeJsStrings.Addin, typings.officeJs.officeJsStrings.AddressBlock */ Any = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Field = js.native
  
  /**
    * Updates the field.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  def updateResult(): Unit = js.native
}
