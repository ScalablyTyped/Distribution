package typings.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies whether the add-in was just inserted or was already contained in the document.
  */
@JSGlobal("Office.InitializationReason")
@js.native
object InitializationReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.InitializationReason with Double] = js.native
  
  /* 1 */ val DocumentOpened: typings.officeJs.Office.InitializationReason.DocumentOpened with Double = js.native
  
  /* 0 */ val Inserted: typings.officeJs.Office.InitializationReason.Inserted with Double = js.native
}
