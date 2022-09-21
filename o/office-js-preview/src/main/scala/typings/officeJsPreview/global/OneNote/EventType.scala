package typings.officeJsPreview.global.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: OneNoteApi 1.9]
  */
@JSGlobal("OneNote.EventType")
@js.native
object EventType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.OneNote.EventType & String] = js.native
  
  /* "AlterationSelected" */ val alterationSelected: typings.officeJsPreview.OneNote.EventType.alterationSelected & String = js.native
  
  /* "InkSelectedForCorrection" */ val inkSelectedForCorrection: typings.officeJsPreview.OneNote.EventType.inkSelectedForCorrection & String = js.native
  
  /* "Reset" */ val reset: typings.officeJsPreview.OneNote.EventType.reset & String = js.native
  
  /* "RestrictionsCalculated" */ val restrictionsCalculated: typings.officeJsPreview.OneNote.EventType.restrictionsCalculated & String = js.native
}
