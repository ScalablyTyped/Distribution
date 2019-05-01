package typings
package officeDashJsLib.ExcelNs

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
  sealed trait gradient
    extends officeDashJsLib.ExcelNs.ShapeFillType
  
  /**
    *
    * Mixed fill.
    *
    */
  @js.native
  sealed trait mixed
    extends officeDashJsLib.ExcelNs.ShapeFillType
  
  /**
    *
    * No fill.
    *
    */
  @js.native
  sealed trait noFill
    extends officeDashJsLib.ExcelNs.ShapeFillType
  
  /**
    *
    * Pattern fill.
    *
    */
  @js.native
  sealed trait pattern
    extends officeDashJsLib.ExcelNs.ShapeFillType
  
  /**
    *
    * Picture and texture fill.
    *
    */
  @js.native
  sealed trait pictureAndTexture
    extends officeDashJsLib.ExcelNs.ShapeFillType
  
  /**
    *
    * Solid fill.
    *
    */
  @js.native
  sealed trait solid
    extends officeDashJsLib.ExcelNs.ShapeFillType
  
  /* "Gradient" */ val gradient: gradient with java.lang.String = js.native
  /* "Mixed" */ val mixed: mixed with java.lang.String = js.native
  /* "NoFill" */ val noFill: noFill with java.lang.String = js.native
  /* "Pattern" */ val pattern: pattern with java.lang.String = js.native
  /* "PictureAndTexture" */ val pictureAndTexture: pictureAndTexture with java.lang.String = js.native
  /* "Solid" */ val solid: solid with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ShapeFillType with java.lang.String] = js.native
}

