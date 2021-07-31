package typings.officeJs.global.Word

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
  def apply(value: String): js.UndefOr[typings.officeJs.Word.EventType & String] = js.native
  
  /* "AnnotationAdded" */ val annotationAdded: typings.officeJs.Word.EventType.annotationAdded & String = js.native
  
  /* "AnnotationChanged" */ val annotationChanged: typings.officeJs.Word.EventType.annotationChanged & String = js.native
  
  /* "AnnotationDeleted" */ val annotationDeleted: typings.officeJs.Word.EventType.annotationDeleted & String = js.native
  
  /* "ContentControlAdded" */ val contentControlAdded: typings.officeJs.Word.EventType.contentControlAdded & String = js.native
  
  /* "ContentControlDataChanged" */ val contentControlDataChanged: typings.officeJs.Word.EventType.contentControlDataChanged & String = js.native
  
  /* "ContentControlDeleted" */ val contentControlDeleted: typings.officeJs.Word.EventType.contentControlDeleted & String = js.native
  
  /* "ContentControlSelectionChanged" */ val contentControlSelectionChanged: typings.officeJs.Word.EventType.contentControlSelectionChanged & String = js.native
}
