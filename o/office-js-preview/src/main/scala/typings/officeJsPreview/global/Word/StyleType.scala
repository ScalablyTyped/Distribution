package typings.officeJsPreview.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the type of style.
  *
  * @remarks
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Word.StyleType")
@js.native
object StyleType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Word.StyleType & String] = js.native
  
  /* "Character" */ val character: typings.officeJsPreview.Word.StyleType.character & String = js.native
  
  /* "List" */ val list: typings.officeJsPreview.Word.StyleType.list & String = js.native
  
  /* "Paragraph" */ val paragraph: typings.officeJsPreview.Word.StyleType.paragraph & String = js.native
  
  /* "Table" */ val table: typings.officeJsPreview.Word.StyleType.table & String = js.native
}
