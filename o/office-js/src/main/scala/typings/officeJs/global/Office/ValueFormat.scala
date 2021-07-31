package typings.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies whether values, such as numbers and dates, returned by the invoked method are returned with their formatting applied.
  *
  * @remarks
  * 
  * For example, if the valueFormat parameter is specified as "formatted", a number formatted as currency, or a date formatted as mm/dd/yy in the 
  * host application will have its formatting preserved. If the valueFormat parameter is specified as "unformatted", a date will be returned in its 
  * underlying sequential serial number form.
  */
@JSGlobal("Office.ValueFormat")
@js.native
object ValueFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.ValueFormat & Double] = js.native
  
  /* 1 */ val Formatted: typings.officeJs.Office.ValueFormat.Formatted & Double = js.native
  
  /* 0 */ val Unformatted: typings.officeJs.Office.ValueFormat.Unformatted & Double = js.native
}
