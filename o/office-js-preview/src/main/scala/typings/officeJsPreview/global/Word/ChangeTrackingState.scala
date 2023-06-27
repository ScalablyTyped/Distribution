package typings.officeJsPreview.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specify the track state when ChangeTracking is on.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
@JSGlobal("Word.ChangeTrackingState")
@js.native
object ChangeTrackingState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Word.ChangeTrackingState & String] = js.native
  
  /* "Added" */ val added: typings.officeJsPreview.Word.ChangeTrackingState.added & String = js.native
  
  /* "Deleted" */ val deleted: typings.officeJsPreview.Word.ChangeTrackingState.deleted & String = js.native
  
  /* "Normal" */ val normal: typings.officeJsPreview.Word.ChangeTrackingState.normal & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJsPreview.Word.ChangeTrackingState.unknown & String = js.native
}
