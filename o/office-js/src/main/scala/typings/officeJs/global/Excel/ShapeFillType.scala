package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies a shape's fill type.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeFillType")
@js.native
object ShapeFillType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ShapeFillType & String] = js.native
  
  /* "Gradient" */ val gradient: typings.officeJs.Excel.ShapeFillType.gradient & String = js.native
  
  /* "Mixed" */ val mixed: typings.officeJs.Excel.ShapeFillType.mixed & String = js.native
  
  /* "NoFill" */ val noFill: typings.officeJs.Excel.ShapeFillType.noFill & String = js.native
  
  /* "Pattern" */ val pattern: typings.officeJs.Excel.ShapeFillType.pattern & String = js.native
  
  /* "PictureAndTexture" */ val pictureAndTexture: typings.officeJs.Excel.ShapeFillType.pictureAndTexture & String = js.native
  
  /* "Solid" */ val solid: typings.officeJs.Excel.ShapeFillType.solid & String = js.native
}
