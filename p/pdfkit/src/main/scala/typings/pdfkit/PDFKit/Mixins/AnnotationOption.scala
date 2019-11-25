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
    if (A != null) __obj.updateDynamic("A")(A.asInstanceOf[js.Any])
    if (B != null) __obj.updateDynamic("B")(B.asInstanceOf[js.Any])
    if (Border != null) __obj.updateDynamic("Border")(Border.asInstanceOf[js.Any])
    if (C != null) __obj.updateDynamic("C")(C.asInstanceOf[js.Any])
    if (Contents != null) __obj.updateDynamic("Contents")(Contents.asInstanceOf[js.Any])
    if (DA != null) __obj.updateDynamic("DA")(DA.asInstanceOf[js.Any])
    if (L != null) __obj.updateDynamic("L")(L.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (QuadPoints != null) __obj.updateDynamic("QuadPoints")(QuadPoints.asInstanceOf[js.Any])
    if (Rect != null) __obj.updateDynamic("Rect")(Rect.asInstanceOf[js.Any])
    if (SubType != null) __obj.updateDynamic("SubType")(SubType.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationOption]
  }
}

