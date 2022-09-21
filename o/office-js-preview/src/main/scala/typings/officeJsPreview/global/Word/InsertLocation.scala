package typings.officeJsPreview.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The insertion location types.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  *
  * To be used with an API call, such as `obj.insertSomething(newStuff, location);`.
  * If the location is "Before" or "After", the new content will be outside of the modified object.
  * If the location is "Start" or "End", the new content will be included as part of the modified object.
  */
@JSGlobal("Word.InsertLocation")
@js.native
object InsertLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Word.InsertLocation & String] = js.native
  
  /* "After" */ val after: typings.officeJsPreview.Word.InsertLocation.after & String = js.native
  
  /* "Before" */ val before: typings.officeJsPreview.Word.InsertLocation.before & String = js.native
  
  /* "End" */ val end: typings.officeJsPreview.Word.InsertLocation.end & String = js.native
  
  /* "Replace" */ val replace: typings.officeJsPreview.Word.InsertLocation.replace & String = js.native
  
  /* "Start" */ val start: typings.officeJsPreview.Word.InsertLocation.start & String = js.native
}
