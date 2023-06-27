package typings.officeJs.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the save behavior for `Document.save`.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.SaveBehavior")
@js.native
object SaveBehavior extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Word.SaveBehavior & String] = js.native
  
  /* "Prompt" */ val prompt: typings.officeJs.Word.SaveBehavior.prompt & String = js.native
  
  /* "Save" */ val save: typings.officeJs.Word.SaveBehavior.save & String = js.native
}
