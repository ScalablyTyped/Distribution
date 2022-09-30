package typings.officeJs.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specify the current version or the original version of the text.
  *
  * @remarks
  * [Api set: WordApi 1.4]
  */
@JSGlobal("Word.ChangeTrackingVersion")
@js.native
object ChangeTrackingVersion extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Word.ChangeTrackingVersion & String] = js.native
  
  /* "Current" */ val current: typings.officeJs.Word.ChangeTrackingVersion.current & String = js.native
  
  /* "Original" */ val original: typings.officeJs.Word.ChangeTrackingVersion.original & String = js.native
}
