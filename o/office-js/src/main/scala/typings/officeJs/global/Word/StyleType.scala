package typings.officeJs.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the type of style.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
@JSGlobal("Word.StyleType")
@js.native
object StyleType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Word.StyleType & String] = js.native
  
  /* "Character" */ val character: typings.officeJs.Word.StyleType.character & String = js.native
  
  /* "List" */ val list: typings.officeJs.Word.StyleType.list & String = js.native
  
  /* "Paragraph" */ val paragraph: typings.officeJs.Word.StyleType.paragraph & String = js.native
  
  /* "Table" */ val table: typings.officeJs.Word.StyleType.table & String = js.native
}
