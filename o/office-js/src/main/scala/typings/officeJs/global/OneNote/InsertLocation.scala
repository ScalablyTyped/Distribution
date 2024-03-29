package typings.officeJs.global.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.InsertLocation")
@js.native
object InsertLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.OneNote.InsertLocation & String] = js.native
  
  /* "After" */ val after: typings.officeJs.OneNote.InsertLocation.after & String = js.native
  
  /* "Before" */ val before: typings.officeJs.OneNote.InsertLocation.before & String = js.native
}
