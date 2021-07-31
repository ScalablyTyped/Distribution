package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BindingType extends StObject
/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BindingType")
@js.native
object BindingType extends StObject {
  
  @js.native
  sealed trait range
    extends StObject
       with BindingType
  
  @js.native
  sealed trait table
    extends StObject
       with BindingType
  
  @js.native
  sealed trait text
    extends StObject
       with BindingType
}
