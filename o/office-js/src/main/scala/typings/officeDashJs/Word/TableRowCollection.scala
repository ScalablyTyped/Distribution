package typings.officeDashJs.Word

import typings.officeDashJs.OfficeExtension.ClientObject
import typings.officeDashJs.OfficeExtension.LoadOption
import typings.officeDashJs.Word.Interfaces.CollectionLoadOptions
import typings.officeDashJs.Word.Interfaces.TableRowCollectionData
import typings.officeDashJs.Word.Interfaces.TableRowCollectionLoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the collection of the document's TableRow objects.
  *
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.TableRowCollection")
@js.native
class TableRowCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableRowCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[TableRow] = js.native
  /**
    *
    * Gets the first row in this collection. Throws an error if this collection is empty.
    *
    * [Api set: WordApi 1.3]
    */
  def getFirst(): TableRow = js.native
  /**
    *
    * Gets the first row in this collection. Returns a null object if this collection is empty.
    *
    * [Api set: WordApi 1.3]
    */
  def getFirstOrNullObject(): TableRow = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.TableRowCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.TableRowCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.TableRowCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableRowCollection = js.native
  def load(option: TableRowCollectionLoadOptions with CollectionLoadOptions): TableRowCollection = js.native
  def load(option: String): TableRowCollection = js.native
  def load(option: js.Array[String]): TableRowCollection = js.native
  def load(option: LoadOption): TableRowCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Word.TableRowCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.TableRowCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): TableRowCollectionData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): TableRowCollection = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): TableRowCollection = js.native
}

