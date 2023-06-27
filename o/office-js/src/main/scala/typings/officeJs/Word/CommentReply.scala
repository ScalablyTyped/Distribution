package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Word.Interfaces.CommentReplyData
import typings.officeJs.Word.Interfaces.CommentReplyLoadOptions
import typings.officeJs.Word.Interfaces.CommentReplyUpdateData
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a comment reply in the document.
  *
  * @remarks
  * [Api set: WordApi 1.4]
  */
@js.native
trait CommentReply
  extends StObject
     with ClientObject {
  
  /**
    * Gets the email of the comment reply's author.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val authorEmail: String = js.native
  
  /**
    * Gets the name of the comment reply's author.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val authorName: String = js.native
  
  /**
    * Specifies the comment reply's content. The string is plain text.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var content: String = js.native
  
  /**
    * Specifies the commentReply's content range.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var contentRange: CommentContentRange = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CommentReply: RequestContext = js.native
  
  /**
    * Gets the creation date of the comment reply.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val creationDate: js.Date = js.native
  
  /**
    * Deletes the comment reply.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  def delete(): Unit = js.native
  
  /**
    * Gets the ID of the comment reply.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CommentReply = js.native
  def load(options: CommentReplyLoadOptions): CommentReply = js.native
  def load(propertyNamesAndPaths: Expand): CommentReply = js.native
  def load(propertyNames: String): CommentReply = js.native
  def load(propertyNames: js.Array[String]): CommentReply = js.native
  
  /**
    * Gets the parent comment of this reply.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val parentComment: Comment = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: CommentReply): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: CommentReplyUpdateData): Unit = js.native
  def set(properties: CommentReplyUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.CommentReply object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.CommentReplyData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): CommentReplyData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): CommentReply = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): CommentReply = js.native
}
