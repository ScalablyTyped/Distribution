package typings
package officeDashJsDashPreviewLib.WordNs

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
  sealed trait annotationAdded
    extends officeDashJsDashPreviewLib.WordNs.EventType
  
  /**
    *
    * AnnotationAdded represents the event an annotation has been updated in the document.
    *
    */
  @js.native
  sealed trait annotationChanged
    extends officeDashJsDashPreviewLib.WordNs.EventType
  
  /**
    *
    * AnnotationAdded represents the event an annotation has been deleted from the document.
    *
    */
  @js.native
  sealed trait annotationDeleted
    extends officeDashJsDashPreviewLib.WordNs.EventType
  
  /**
    *
    * ContentControlAdded represents the event a content control has been added to the document.
    *
    */
  @js.native
  sealed trait contentControlAdded
    extends officeDashJsDashPreviewLib.WordNs.EventType
  
  /**
    *
    * ContentControlDataChanged represents the event that the data in the content control have been changed.
    *
    */
  @js.native
  sealed trait contentControlDataChanged
    extends officeDashJsDashPreviewLib.WordNs.EventType
  
  /**
    *
    * ContentControlDeleted represent the event that the content control has been deleted.
    *
    */
  @js.native
  sealed trait contentControlDeleted
    extends officeDashJsDashPreviewLib.WordNs.EventType
  
  /**
    *
    * ContentControlSelectionChanged represents the event that the selection in the content control has been changed.
    *
    */
  @js.native
  sealed trait contentControlSelectionChanged
    extends officeDashJsDashPreviewLib.WordNs.EventType
  
  /* "AnnotationAdded" */ val annotationAdded: annotationAdded with java.lang.String = js.native
  /* "AnnotationChanged" */ val annotationChanged: annotationChanged with java.lang.String = js.native
  /* "AnnotationDeleted" */ val annotationDeleted: annotationDeleted with java.lang.String = js.native
  /* "ContentControlAdded" */ val contentControlAdded: contentControlAdded with java.lang.String = js.native
  /* "ContentControlDataChanged" */ val contentControlDataChanged: contentControlDataChanged with java.lang.String = js.native
  /* "ContentControlDeleted" */ val contentControlDeleted: contentControlDeleted with java.lang.String = js.native
  /* "ContentControlSelectionChanged" */ val contentControlSelectionChanged: contentControlSelectionChanged with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.EventType with java.lang.String] = js.native
}

