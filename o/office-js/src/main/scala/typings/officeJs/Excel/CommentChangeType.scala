package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommentChangeType extends StObject
/**
  *
  * Represents how the comments in the event were changed.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.CommentChangeType")
@js.native
object CommentChangeType extends StObject {
  
  /**
    * Comments were edited.
    *
    */
  @js.native
  sealed trait commentEdited
    extends StObject
       with CommentChangeType
  
  /**
    * Comments were reopened.
    *
    */
  @js.native
  sealed trait commentReopened
    extends StObject
       with CommentChangeType
  
  /**
    * Comments were resolved.
    *
    */
  @js.native
  sealed trait commentResolved
    extends StObject
       with CommentChangeType
  
  /**
    * Replies were added.
    *
    */
  @js.native
  sealed trait replyAdded
    extends StObject
       with CommentChangeType
  
  /**
    * Replies were deleted.
    *
    */
  @js.native
  sealed trait replyDeleted
    extends StObject
       with CommentChangeType
  
  /**
    * Replies were edited.
    *
    */
  @js.native
  sealed trait replyEdited
    extends StObject
       with CommentChangeType
}
