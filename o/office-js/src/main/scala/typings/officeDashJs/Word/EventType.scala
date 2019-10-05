package typings.officeDashJs.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

/**
  *
  * Provides information about the type of a raised event. For each object type, please keep the order of: deleted, selection changed, data changed, added.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.EventType")
@js.native
object EventType extends js.Object {
  /**
    *
    * AnnotationAdded represents the event an annotation has been added to the document.
    *
    */
  @js.native
  sealed trait annotationAdded extends EventType
  
  /**
    *
    * AnnotationAdded represents the event an annotation has been updated in the document.
    *
    */
  @js.native
  sealed trait annotationChanged extends EventType
  
  /**
    *
    * AnnotationAdded represents the event an annotation has been deleted from the document.
    *
    */
  @js.native
  sealed trait annotationDeleted extends EventType
  
  /**
    *
    * ContentControlAdded represents the event a content control has been added to the document.
    *
    */
  @js.native
  sealed trait contentControlAdded extends EventType
  
  /**
    *
    * ContentControlDataChanged represents the event that the data in the content control have been changed.
    *
    */
  @js.native
  sealed trait contentControlDataChanged extends EventType
  
  /**
    *
    * ContentControlDeleted represent the event that the content control has been deleted.
    *
    */
  @js.native
  sealed trait contentControlDeleted extends EventType
  
  /**
    *
    * ContentControlSelectionChanged represents the event that the selection in the content control has been changed.
    *
    */
  @js.native
  sealed trait contentControlSelectionChanged extends EventType
  
  /* "AnnotationAdded" */ val annotationAdded: typings.officeDashJs.Word.EventType.annotationAdded with String = js.native
  /* "AnnotationChanged" */ val annotationChanged: typings.officeDashJs.Word.EventType.annotationChanged with String = js.native
  /* "AnnotationDeleted" */ val annotationDeleted: typings.officeDashJs.Word.EventType.annotationDeleted with String = js.native
  /* "ContentControlAdded" */ val contentControlAdded: typings.officeDashJs.Word.EventType.contentControlAdded with String = js.native
  /* "ContentControlDataChanged" */ val contentControlDataChanged: typings.officeDashJs.Word.EventType.contentControlDataChanged with String = js.native
  /* "ContentControlDeleted" */ val contentControlDeleted: typings.officeDashJs.Word.EventType.contentControlDeleted with String = js.native
  /* "ContentControlSelectionChanged" */ val contentControlSelectionChanged: typings.officeDashJs.Word.EventType.contentControlSelectionChanged with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventType with String] = js.native
}

