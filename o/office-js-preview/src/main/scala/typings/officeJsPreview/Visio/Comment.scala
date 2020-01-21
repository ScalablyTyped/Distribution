package typings.officeJsPreview.Visio

import typings.officeJsPreview.AnonExpand
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.Visio.Interfaces.CommentData
import typings.officeJsPreview.Visio.Interfaces.CommentLoadOptions
import typings.officeJsPreview.Visio.Interfaces.CommentUpdateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Comment.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.Comment")
@js.native
class Comment () extends ClientObject {
  /**
    *
    * A string that specifies the name of the author of the comment.
    *
    * [Api set:  1.1]
    */
  var author: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Comment: RequestContext = js.native
  /**
    *
    * A string that specifies the date when the comment was created.
    *
    * [Api set:  1.1]
    */
  var date: String = js.native
  /**
    *
    * A string that contains the comment text.
    *
    * [Api set:  1.1]
    */
  var text: String = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.Comment` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.Comment` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.Comment` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Comment = js.native
  def load(option: String): Comment = js.native
  def load(option: js.Array[String]): Comment = js.native
  def load(option: AnonExpand): Comment = js.native
  def load(option: CommentLoadOptions): Comment = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Comment): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Visio.Comment): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: CommentUpdateData): Unit = js.native
  def set(properties: CommentUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Visio.Comment object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.CommentData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): CommentData = js.native
}

