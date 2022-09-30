package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommentChangeType extends StObject
/**
  * Represents how the comments in the event were changed.
  *
  * @remarks
  * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Word.CommentChangeType")
@js.native
object CommentChangeType extends StObject {
  
  /**
    * A comment was edited.
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait edited
    extends StObject
       with CommentChangeType
  
  /**
    * No comment changed event is triggered.
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait none
    extends StObject
       with CommentChangeType
  
  /**
    * A comment was reopened.
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait reopened
    extends StObject
       with CommentChangeType
  
  /**
    * A reply was added.
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait replyAdded
    extends StObject
       with CommentChangeType
  
  /**
    * A reply was deleted.
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait replyDeleted
    extends StObject
       with CommentChangeType
  
  /**
    * A reply was edited.
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait replyEdited
    extends StObject
       with CommentChangeType
  
  /**
    * A comment was resolved.
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait resolved
    extends StObject
       with CommentChangeType
}
