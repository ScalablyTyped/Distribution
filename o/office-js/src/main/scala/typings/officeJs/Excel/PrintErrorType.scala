package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintErrorType extends StObject
/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PrintErrorType")
@js.native
object PrintErrorType extends StObject {
  
  @js.native
  sealed trait asDisplayed
    extends StObject
       with PrintErrorType
  
  @js.native
  sealed trait blank
    extends StObject
       with PrintErrorType
  
  @js.native
  sealed trait dash
    extends StObject
       with PrintErrorType
  
  @js.native
  sealed trait notAvailable
    extends StObject
       with PrintErrorType
}
