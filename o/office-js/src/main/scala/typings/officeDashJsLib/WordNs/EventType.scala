package typings
package officeDashJsLib.WordNs

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
    * ContentControlAdded represents the event a content control has been added to the document.
    *
    */
  @js.native
  sealed trait contentControlAdded
    extends officeDashJsLib.WordNs.EventType
  
  /**
    *
    * ContentControlDataChanged represents the event that the data in the content control have been changed.
    *
    */
  @js.native
  sealed trait contentControlDataChanged
    extends officeDashJsLib.WordNs.EventType
  
  /**
    *
    * ContentControlDeleted represent the event that the content control has been deleted.
    *
    */
  @js.native
  sealed trait contentControlDeleted
    extends officeDashJsLib.WordNs.EventType
  
  /**
    *
    * ContentControlSelectionChanged represents the event that the selection in the content control has been changed.
    *
    */
  @js.native
  sealed trait contentControlSelectionChanged
    extends officeDashJsLib.WordNs.EventType
  
  /* "ContentControlAdded" */ val contentControlAdded: contentControlAdded with java.lang.String = js.native
  /* "ContentControlDataChanged" */ val contentControlDataChanged: contentControlDataChanged with java.lang.String = js.native
  /* "ContentControlDeleted" */ val contentControlDeleted: contentControlDeleted with java.lang.String = js.native
  /* "ContentControlSelectionChanged" */ val contentControlSelectionChanged: contentControlSelectionChanged with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.WordNs.EventType with java.lang.String] = js.native
}

