package typings.atNivoAnnotations.atNivoAnnotationsMod

import typings.atNivoAnnotations.atNivoAnnotationsStrings.circle
import typings.atNivoAnnotations.atNivoAnnotationsStrings.dot
import typings.atNivoAnnotations.atNivoAnnotationsStrings.rect
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/annotations.@nivo/annotations.CircleAnnotationProps | @nivo/annotations.@nivo/annotations.DotAnnotationProps | @nivo/annotations.@nivo/annotations.RectAnnotationProps */
trait AnnotationProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var containerHeight: js.UndefOr[Double] = js.undefined
  var containerWidth: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var motionDamping: js.UndefOr[Double] = js.undefined
  var motionStiffness: js.UndefOr[Double] = js.undefined
  var note: js.UndefOr[ReactNode] = js.undefined
  var noteTextOffset: js.UndefOr[Double] = js.undefined
  var noteWidth: js.UndefOr[Double] = js.undefined
  var noteX: js.UndefOr[NoteCoordinate] = js.undefined
  var noteY: js.UndefOr[NoteCoordinate] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[circle | dot | rect] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object AnnotationProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    containerHeight: Int | Double = null,
    containerWidth: Int | Double = null,
    height: Int | Double = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    note: ReactNode = null,
    noteTextOffset: Int | Double = null,
    noteWidth: Int | Double = null,
    noteX: NoteCoordinate = null,
    noteY: NoteCoordinate = null,
    size: Int | Double = null,
    `type`: circle = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): AnnotationProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (containerHeight != null) __obj.updateDynamic("containerHeight")(containerHeight.asInstanceOf[js.Any])
    if (containerWidth != null) __obj.updateDynamic("containerWidth")(containerWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (noteTextOffset != null) __obj.updateDynamic("noteTextOffset")(noteTextOffset.asInstanceOf[js.Any])
    if (noteWidth != null) __obj.updateDynamic("noteWidth")(noteWidth.asInstanceOf[js.Any])
    if (noteX != null) __obj.updateDynamic("noteX")(noteX.asInstanceOf[js.Any])
    if (noteY != null) __obj.updateDynamic("noteY")(noteY.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationProps]
  }
}

