package typings.officeJsPreview.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the kind of field. Indicates how the field works in relation to updating.
  *
  * @remarks
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Word.FieldKind")
@js.native
object FieldKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Word.FieldKind & String] = js.native
  
  /* "Cold" */ val cold: typings.officeJsPreview.Word.FieldKind.cold & String = js.native
  
  /* "Hot" */ val hot: typings.officeJsPreview.Word.FieldKind.hot & String = js.native
  
  /* "None" */ val none: typings.officeJsPreview.Word.FieldKind.none & String = js.native
  
  /* "Warm" */ val warm: typings.officeJsPreview.Word.FieldKind.warm & String = js.native
}
