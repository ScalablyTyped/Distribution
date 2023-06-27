package typings.officeJs.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An enum that specifies an event's source. It can be local or remote (through coauthoring).
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
@JSGlobal("Word.EventSource")
@js.native
object EventSource extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Word.EventSource & String] = js.native
  
  /* "Local" */ val local: typings.officeJs.Word.EventSource.local & String = js.native
  
  /* "Remote" */ val remote: typings.officeJs.Word.EventSource.remote & String = js.native
}
