package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueFormat extends StObject
/**
  * Specifies whether values, such as numbers and dates, returned by the invoked method are returned with their formatting applied.
  *
  * @remarks
  *
  * For example, if the valueFormat parameter is specified as "formatted", a number formatted as currency, or a date formatted as mm/dd/yy in the
  * Office application will have its formatting preserved. If the valueFormat parameter is specified as "unformatted", a date will be returned in its
  * underlying sequential serial number form.
  */
@JSGlobal("Office.ValueFormat")
@js.native
object ValueFormat extends StObject {
  
  /**
    * Return formatted data.
    */
  @js.native
  sealed trait Formatted
    extends StObject
       with ValueFormat
  
  /**
    * Return unformatted data.
    */
  @js.native
  sealed trait Unformatted
    extends StObject
       with ValueFormat
}
