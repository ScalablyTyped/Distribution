package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeType extends StObject
/**
  *
  * Specifies the type of a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeType")
@js.native
object ShapeType extends StObject {
  
  @js.native
  sealed trait geometricShape
    extends StObject
       with ShapeType
  
  @js.native
  sealed trait group
    extends StObject
       with ShapeType
  
  @js.native
  sealed trait image
    extends StObject
       with ShapeType
  
  @js.native
  sealed trait line
    extends StObject
       with ShapeType
  
  @js.native
  sealed trait unsupported
    extends StObject
       with ShapeType
}
