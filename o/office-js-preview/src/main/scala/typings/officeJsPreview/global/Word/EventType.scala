package typings.officeJsPreview.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the type of a raised event. For each object type, please keep the order of: deleted, selection changed, data changed, added.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.EventType")
@js.native
object EventType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Word.EventType & String] = js.native
  
  /* "AnnotationAdded" */ val annotationAdded: typings.officeJsPreview.Word.EventType.annotationAdded & String = js.native
  
  /* "AnnotationChanged" */ val annotationChanged: typings.officeJsPreview.Word.EventType.annotationChanged & String = js.native
  
  /* "AnnotationDeleted" */ val annotationDeleted: typings.officeJsPreview.Word.EventType.annotationDeleted & String = js.native
  
  /* "ContentControlAdded" */ val contentControlAdded: typings.officeJsPreview.Word.EventType.contentControlAdded & String = js.native
  
  /* "ContentControlDataChanged" */ val contentControlDataChanged: typings.officeJsPreview.Word.EventType.contentControlDataChanged & String = js.native
  
  /* "ContentControlDeleted" */ val contentControlDeleted: typings.officeJsPreview.Word.EventType.contentControlDeleted & String = js.native
  
  /* "ContentControlSelectionChanged" */ val contentControlSelectionChanged: typings.officeJsPreview.Word.EventType.contentControlSelectionChanged & String = js.native
}
