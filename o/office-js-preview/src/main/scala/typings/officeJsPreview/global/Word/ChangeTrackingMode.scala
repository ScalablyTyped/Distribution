package typings.officeJsPreview.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ChangeTracking mode.
  *
  * @remarks
  * [Api set: WordApi 1.4]
  */
@JSGlobal("Word.ChangeTrackingMode")
@js.native
object ChangeTrackingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Word.ChangeTrackingMode & String] = js.native
  
  /* "Off" */ val off: typings.officeJsPreview.Word.ChangeTrackingMode.off & String = js.native
  
  /* "TrackAll" */ val trackAll: typings.officeJsPreview.Word.ChangeTrackingMode.trackAll & String = js.native
  
  /* "TrackMineOnly" */ val trackMineOnly: typings.officeJsPreview.Word.ChangeTrackingMode.trackMineOnly & String = js.native
}
