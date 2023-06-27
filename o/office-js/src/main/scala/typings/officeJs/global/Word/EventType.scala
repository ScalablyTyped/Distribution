package typings.officeJs.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the type of a raised event.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
@JSGlobal("Word.EventType")
@js.native
object EventType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Word.EventType & String] = js.native
  
  /* "ContentControlAdded" */ val contentControlAdded: typings.officeJs.Word.EventType.contentControlAdded & String = js.native
  
  /* "ContentControlDataChanged" */ val contentControlDataChanged: typings.officeJs.Word.EventType.contentControlDataChanged & String = js.native
  
  /* "ContentControlDeleted" */ val contentControlDeleted: typings.officeJs.Word.EventType.contentControlDeleted & String = js.native
  
  /* "ContentControlEntered" */ val contentControlEntered: typings.officeJs.Word.EventType.contentControlEntered & String = js.native
  
  /* "ContentControlExited" */ val contentControlExited: typings.officeJs.Word.EventType.contentControlExited & String = js.native
  
  /* "ContentControlSelectionChanged" */ val contentControlSelectionChanged: typings.officeJs.Word.EventType.contentControlSelectionChanged & String = js.native
}
