package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PageOrientation extends StObject
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.PageOrientation")
@js.native
object PageOrientation extends StObject {
  
  @js.native
  sealed trait landscape
    extends StObject
       with PageOrientation
  
  @js.native
  sealed trait portrait
    extends StObject
       with PageOrientation
}
