package typings.officeJsPreview.Word

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.Word.Interfaces.FieldData
import typings.officeJsPreview.Word.Interfaces.FieldLoadOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a field.
  *
  * @remarks
  * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait Field
  extends StObject
     with ClientObject {
  
  /**
    * Gets the field's code instruction. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  val code: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Field: RequestContext = js.native
  
  /**
    * Deletes the field.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  def delete(): Unit = js.native
  
  /**
    * Gets the next field. Throws an error if this field is the last one.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  def getNext(): Field = js.native
  
  /**
    * Gets the next field. Returns a null object if this field is the last one.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  def getNextOrNullObject(): Field = js.native
  
  /**
    * Gets the whole field as a range.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  def getRange(): Range = js.native
  
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
    * Gets the parent body of the field. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  val parentBody: Body = js.native
  
  /**
    * Gets the content control that contains the field. Throws an error if there isn't a parent content control. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  val parentContentControl: ContentControl = js.native
  
  /**
    * Gets the content control that contains the field. Returns a null object if there isn't a parent content control. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  
  /**
    * Gets the table that contains the field. Throws an error if it is not contained in a table. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  val parentTable: Table = js.native
  
  /**
    * Gets the table cell that contains the field. Throws an error if it is not contained in a table cell. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  val parentTableCell: TableCell = js.native
  
  /**
    * Gets the table cell that contains the field. Returns a null object if it is not contained in a table cell. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  val parentTableCellOrNullObject: TableCell = js.native
  
  /**
    * Gets the table that contains the field. Returns a null object if it is not contained in a table. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  val parentTableOrNullObject: Table = js.native
  
  /**
    * Gets the field's result data. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  val result: String = js.native
  
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
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Field = js.native
}
