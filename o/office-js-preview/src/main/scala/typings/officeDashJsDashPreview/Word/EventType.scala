package typings.officeDashJsDashPreview.Word

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Word.EventType.annotationAdded
import typings.officeDashJsDashPreview.Word.EventType.annotationChanged
import typings.officeDashJsDashPreview.Word.EventType.annotationDeleted
import typings.officeDashJsDashPreview.Word.EventType.contentControlAdded
import typings.officeDashJsDashPreview.Word.EventType.contentControlDataChanged
import typings.officeDashJsDashPreview.Word.EventType.contentControlDeleted
import typings.officeDashJsDashPreview.Word.EventType.contentControlSelectionChanged
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventType with String] = js.native
  /* "AnnotationAdded" */ @js.native
  object annotationAdded extends TopLevel[annotationAdded with String]
  
  /* "AnnotationChanged" */ @js.native
  object annotationChanged extends TopLevel[annotationChanged with String]
  
  /* "AnnotationDeleted" */ @js.native
  object annotationDeleted extends TopLevel[annotationDeleted with String]
  
  /* "ContentControlAdded" */ @js.native
  object contentControlAdded extends TopLevel[contentControlAdded with String]
  
  /* "ContentControlDataChanged" */ @js.native
  object contentControlDataChanged extends TopLevel[contentControlDataChanged with String]
  
  /* "ContentControlDeleted" */ @js.native
  object contentControlDeleted extends TopLevel[contentControlDeleted with String]
  
  /* "ContentControlSelectionChanged" */ @js.native
  object contentControlSelectionChanged extends TopLevel[contentControlSelectionChanged with String]
  
}

