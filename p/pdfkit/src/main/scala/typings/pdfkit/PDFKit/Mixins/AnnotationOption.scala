package typings.pdfkit.PDFKit.Mixins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationOption extends js.Object {
  var A: js.UndefOr[js.Any] = js.undefined
  var B: js.UndefOr[js.Any] = js.undefined
  var Border: js.UndefOr[js.Array[Double]] = js.undefined
  var C: js.UndefOr[js.Any] = js.undefined
  var Contents: js.UndefOr[String] = js.undefined
  var DA: js.UndefOr[String] = js.undefined
  var L: js.UndefOr[js.Any] = js.undefined
  var Name: js.UndefOr[String] = js.undefined
  var QuadPoints: js.UndefOr[js.Array[Double]] = js.undefined
  var Rect: js.UndefOr[js.Any] = js.undefined
  var SubType: js.UndefOr[String] = js.undefined
  var Type: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
}

object AnnotationOption {
  @scala.inline
  def apply(
    A: js.Any = null,
    B: js.Any = null,
    Border: js.Array[Double] = null,
    C: js.Any = null,
    Contents: String = null,
    DA: String = null,
    L: js.Any = null,
    Name: String = null,
    QuadPoints: js.Array[Double] = null,
    Rect: js.Any = null,
    SubType: String = null,
    Type: String = null,
    color: String = null
  ): AnnotationOption = {
    val __obj = js.Dynamic.literal()
    if (A != null) __obj.updateDynamic("A")(A)
    if (B != null) __obj.updateDynamic("B")(B)
    if (Border != null) __obj.updateDynamic("Border")(Border)
    if (C != null) __obj.updateDynamic("C")(C)
    if (Contents != null) __obj.updateDynamic("Contents")(Contents)
    if (DA != null) __obj.updateDynamic("DA")(DA)
    if (L != null) __obj.updateDynamic("L")(L)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (QuadPoints != null) __obj.updateDynamic("QuadPoints")(QuadPoints)
    if (Rect != null) __obj.updateDynamic("Rect")(Rect)
    if (SubType != null) __obj.updateDynamic("SubType")(SubType)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[AnnotationOption]
  }
}

