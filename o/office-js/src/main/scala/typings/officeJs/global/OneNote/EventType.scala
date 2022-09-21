package typings.officeJs.global.OneNote

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
  def apply(value: String): js.UndefOr[typings.officeJs.OneNote.EventType & String] = js.native
  
  /* "AlterationSelected" */ val alterationSelected: typings.officeJs.OneNote.EventType.alterationSelected & String = js.native
  
  /* "InkSelectedForCorrection" */ val inkSelectedForCorrection: typings.officeJs.OneNote.EventType.inkSelectedForCorrection & String = js.native
  
  /* "Reset" */ val reset: typings.officeJs.OneNote.EventType.reset & String = js.native
  
  /* "RestrictionsCalculated" */ val restrictionsCalculated: typings.officeJs.OneNote.EventType.restrictionsCalculated & String = js.native
}
