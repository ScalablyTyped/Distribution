package typings.officeJsPreview.Visio

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.Visio.Interfaces.CommentData
import typings.officeJsPreview.Visio.Interfaces.CommentLoadOptions
import typings.officeJsPreview.Visio.Interfaces.CommentUpdateData
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Comment.
  *
  * [Api set:  1.1]
  */
@js.native
trait Comment
  extends StObject
     with ClientObject {
  
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
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Comment = js.native
  def load(options: CommentLoadOptions): Comment = js.native
  def load(propertyNamesAndPaths: Expand): Comment = js.native
  def load(propertyNames: String): Comment = js.native
  def load(propertyNames: js.Array[String]): Comment = js.native
  
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
    * Set mock data
    */
  def setMockData(data: CommentData): Unit = js.native
  
  /**
    *
    * A string that contains the comment text.
    *
    * [Api set:  1.1]
    */
  var text: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Visio.Comment object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.CommentData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): CommentData = js.native
}
