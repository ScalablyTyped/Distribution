package typings.officeJs.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * The insertion location types.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.InsertLocation")
@js.native
object InsertLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Word.InsertLocation & String] = js.native
  
  /* "After" */ val after: typings.officeJs.Word.InsertLocation.after & String = js.native
  
  /* "Before" */ val before: typings.officeJs.Word.InsertLocation.before & String = js.native
  
  /* "End" */ val end: typings.officeJs.Word.InsertLocation.end & String = js.native
  
  /* "Replace" */ val replace: typings.officeJs.Word.InsertLocation.replace & String = js.native
  
  /* "Start" */ val start: typings.officeJs.Word.InsertLocation.start & String = js.native
}
