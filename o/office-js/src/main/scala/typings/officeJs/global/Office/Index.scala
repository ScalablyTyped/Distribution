package typings.officeJs.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the relative PowerPoint slide.
  */
@JSGlobal("Office.Index")
@js.native
object Index extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.Index with Double] = js.native
  
  /* 0 */ val First: typings.officeJs.Office.Index.First with Double = js.native
  
  /* 1 */ val Last: typings.officeJs.Office.Index.Last with Double = js.native
  
  /* 2 */ val Next: typings.officeJs.Office.Index.Next with Double = js.native
  
  /* 3 */ val Previous: typings.officeJs.Office.Index.Previous with Double = js.native
}
