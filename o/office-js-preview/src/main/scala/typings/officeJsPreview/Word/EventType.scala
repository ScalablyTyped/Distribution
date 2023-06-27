package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
/**
  * Provides information about the type of a raised event.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
@JSGlobal("Word.EventType")
@js.native
object EventType extends StObject {
  
  /**
    * Represents that one or more new comments were added.
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait commentAdded
    extends StObject
       with EventType
  
  /**
    * Represents that a comment or its reply was changed.
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait commentChanged
    extends StObject
       with EventType
  
  /**
    * Represents that one or more comments were deleted.
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait commentDeleted
    extends StObject
       with EventType
  
  /**
    * Represents that a comment was deselected.
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait commentDeselected
    extends StObject
       with EventType
  
  /**
    * Represents that a comment was selected.
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait commentSelected
    extends StObject
       with EventType
  
  /**
    * ContentControlAdded represents the event a content control has been added to the document.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait contentControlAdded
    extends StObject
       with EventType
  
  /**
    * ContentControlDataChanged represents the event that the data in the content control have been changed.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait contentControlDataChanged
    extends StObject
       with EventType
  
  /**
    * ContentControlDeleted represents the event that the content control has been deleted.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait contentControlDeleted
    extends StObject
       with EventType
  
  /**
    * Represents that a content control has been entered.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait contentControlEntered
    extends StObject
       with EventType
  
  /**
    * Represents that a content control has been exited.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait contentControlExited
    extends StObject
       with EventType
  
  /**
    * ContentControlSelectionChanged represents the event that the selection in the content control has been changed.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait contentControlSelectionChanged
    extends StObject
       with EventType
}
