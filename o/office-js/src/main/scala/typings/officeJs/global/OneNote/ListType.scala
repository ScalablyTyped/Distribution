package typings.officeJs.global.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.ListType")
@js.native
object ListType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.OneNote.ListType with String] = js.native
  
  /* "Bullet" */ val bullet: typings.officeJs.OneNote.ListType.bullet with String = js.native
  
  /* "None" */ val none: typings.officeJs.OneNote.ListType.none with String = js.native
  
  /* "Number" */ val number: typings.officeJs.OneNote.ListType.number with String = js.native
}
