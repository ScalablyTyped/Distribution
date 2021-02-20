package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalAlignment extends StObject
/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.HorizontalAlignment")
@js.native
object HorizontalAlignment extends StObject {
  
  @js.native
  sealed trait center extends HorizontalAlignment
  
  @js.native
  sealed trait centerAcrossSelection extends HorizontalAlignment
  
  @js.native
  sealed trait distributed extends HorizontalAlignment
  
  @js.native
  sealed trait fill extends HorizontalAlignment
  
  @js.native
  sealed trait general extends HorizontalAlignment
  
  @js.native
  sealed trait justify extends HorizontalAlignment
  
  @js.native
  sealed trait left extends HorizontalAlignment
  
  @js.native
  sealed trait right extends HorizontalAlignment
}
