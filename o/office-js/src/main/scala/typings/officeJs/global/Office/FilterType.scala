package typings.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies whether filtering from the Office application is applied when the data is retrieved.
  */
@JSGlobal("Office.FilterType")
@js.native
object FilterType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.FilterType & Double] = js.native
  
  /* 0 */ val All: typings.officeJs.Office.FilterType.All & Double = js.native
  
  /* 1 */ val OnlyVisible: typings.officeJs.Office.FilterType.OnlyVisible & Double = js.native
}
