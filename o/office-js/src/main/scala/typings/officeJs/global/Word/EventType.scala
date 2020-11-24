package typings.officeJs.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the type of a raised event. For each object type, please keep the order of: deleted, selection changed, data changed, added.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.EventType")
@js.native
object EventType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Word.EventType with String] = js.native
  
  /* "AnnotationAdded" */ val annotationAdded: typings.officeJs.Word.EventType.annotationAdded with String = js.native
  
  /* "AnnotationChanged" */ val annotationChanged: typings.officeJs.Word.EventType.annotationChanged with String = js.native
  
  /* "AnnotationDeleted" */ val annotationDeleted: typings.officeJs.Word.EventType.annotationDeleted with String = js.native
  
  /* "ContentControlAdded" */ val contentControlAdded: typings.officeJs.Word.EventType.contentControlAdded with String = js.native
  
  /* "ContentControlDataChanged" */ val contentControlDataChanged: typings.officeJs.Word.EventType.contentControlDataChanged with String = js.native
  
  /* "ContentControlDeleted" */ val contentControlDeleted: typings.officeJs.Word.EventType.contentControlDeleted with String = js.native
  
  /* "ContentControlSelectionChanged" */ val contentControlSelectionChanged: typings.officeJs.Word.EventType.contentControlSelectionChanged with String = js.native
}
