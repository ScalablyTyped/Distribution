package typings.officeJs.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the close behavior for `Document.close`.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
@JSGlobal("Word.CloseBehavior")
@js.native
object CloseBehavior extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Word.CloseBehavior & String] = js.native
  
  /* "Save" */ val save: typings.officeJs.Word.CloseBehavior.save & String = js.native
  
  /* "SkipSave" */ val skipSave: typings.officeJs.Word.CloseBehavior.skipSave & String = js.native
}
