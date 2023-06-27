package typings.officeJs.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the kind of field. Indicates how the field works in relation to updating.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
@JSGlobal("Word.FieldKind")
@js.native
object FieldKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Word.FieldKind & String] = js.native
  
  /* "Cold" */ val cold: typings.officeJs.Word.FieldKind.cold & String = js.native
  
  /* "Hot" */ val hot: typings.officeJs.Word.FieldKind.hot & String = js.native
  
  /* "None" */ val none: typings.officeJs.Word.FieldKind.none & String = js.native
  
  /* "Warm" */ val warm: typings.officeJs.Word.FieldKind.warm & String = js.native
}
