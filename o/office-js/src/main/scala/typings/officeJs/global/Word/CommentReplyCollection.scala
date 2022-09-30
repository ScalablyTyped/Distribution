package typings.officeJs.global.Word

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of {@link Word.CommentReply} objects. Represents all comment replies in one comment thread.
  *
  * @remarks
  * [Api set: WordApi 1.4]
  */
@JSGlobal("Word.CommentReplyCollection")
@js.native
open class CommentReplyCollection ()
  extends StObject
     with typings.officeJs.Word.CommentReplyCollection {
  
  /** The request context associated with the object */
  /* CompleteClass */
  var context: ClientRequestContext = js.native
  
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the 
    * isNullObject property.
    */
  /* CompleteClass */
  var isNullObject: Boolean = js.native
}
