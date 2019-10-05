package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeFillType extends js.Object

/**
  *
  * Specifies a shape's fill type.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeFillType")
@js.native
object ShapeFillType extends js.Object {
  /**
    *
    * Gradient fill.
    *
    */
  @js.native
  sealed trait gradient extends ShapeFillType
  
  /**
    *
    * Mixed fill.
    *
    */
  @js.native
  sealed trait mixed extends ShapeFillType
  
  /**
    *
    * No fill.
    *
    */
  @js.native
  sealed trait noFill extends ShapeFillType
  
  /**
    *
    * Pattern fill.
    *
    */
  @js.native
  sealed trait pattern extends ShapeFillType
  
  /**
    *
    * Picture and texture fill.
    *
    */
  @js.native
  sealed trait pictureAndTexture extends ShapeFillType
  
  /**
    *
    * Solid fill.
    *
    */
  @js.native
  sealed trait solid extends ShapeFillType
  
  /* "Gradient" */ val gradient: typings.officeDashJsDashPreview.Excel.ShapeFillType.gradient with String = js.native
  /* "Mixed" */ val mixed: typings.officeDashJsDashPreview.Excel.ShapeFillType.mixed with String = js.native
  /* "NoFill" */ val noFill: typings.officeDashJsDashPreview.Excel.ShapeFillType.noFill with String = js.native
  /* "Pattern" */ val pattern: typings.officeDashJsDashPreview.Excel.ShapeFillType.pattern with String = js.native
  /* "PictureAndTexture" */ val pictureAndTexture: typings.officeDashJsDashPreview.Excel.ShapeFillType.pictureAndTexture with String = js.native
  /* "Solid" */ val solid: typings.officeDashJsDashPreview.Excel.ShapeFillType.solid with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeFillType with String] = js.native
}

