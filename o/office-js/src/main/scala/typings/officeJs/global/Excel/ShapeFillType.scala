package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ShapeFillType with String] = js.native
  
  /* "Gradient" */ val gradient: typings.officeJs.Excel.ShapeFillType.gradient with String = js.native
  
  /* "Mixed" */ val mixed: typings.officeJs.Excel.ShapeFillType.mixed with String = js.native
  
  /* "NoFill" */ val noFill: typings.officeJs.Excel.ShapeFillType.noFill with String = js.native
  
  /* "Pattern" */ val pattern: typings.officeJs.Excel.ShapeFillType.pattern with String = js.native
  
  /* "PictureAndTexture" */ val pictureAndTexture: typings.officeJs.Excel.ShapeFillType.pictureAndTexture with String = js.native
  
  /* "Solid" */ val solid: typings.officeJs.Excel.ShapeFillType.solid with String = js.native
}
