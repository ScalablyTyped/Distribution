package typings.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies whether the document in the associated application is read-only or read-write.
  *
  * @remarks
  *
  * Returned by the mode property of the {@link Office.Document | Document} object.
  */
@JSGlobal("Office.DocumentMode")
@js.native
object DocumentMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.DocumentMode & Double] = js.native
  
  /* 0 */ val ReadOnly: typings.officeJs.Office.DocumentMode.ReadOnly & Double = js.native
  
  /* 1 */ val ReadWrite: typings.officeJs.Office.DocumentMode.ReadWrite & Double = js.native
}
