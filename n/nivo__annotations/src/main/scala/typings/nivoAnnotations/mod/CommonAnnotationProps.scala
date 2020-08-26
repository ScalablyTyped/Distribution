package typings.nivoAnnotations.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  containerWidth :number,   containerHeight :number,   x :number,   y :number,   noteX :@nivo/annotations.@nivo/annotations.NoteCoordinate,   noteY :@nivo/annotations.@nivo/annotations.NoteCoordinate,   noteWidth :number | undefined,   noteTextOffset :number | undefined,   note :react.react.ReactNode} & @nivo/core.@nivo/core.MotionProps */
@js.native
trait CommonAnnotationProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var containerHeight: Double = js.native
  var containerWidth: Double = js.native
  var motionDamping: js.UndefOr[Double] = js.native
  var motionStiffness: js.UndefOr[Double] = js.native
  var note: ReactNode = js.native
  var noteTextOffset: js.UndefOr[Double] = js.native
  var noteWidth: js.UndefOr[Double] = js.native
  var noteX: NoteCoordinate = js.native
  var noteY: NoteCoordinate = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object CommonAnnotationProps {
  @scala.inline
  def apply(
    containerHeight: Double,
    containerWidth: Double,
    noteX: NoteCoordinate,
    noteY: NoteCoordinate,
    x: Double,
    y: Double
  ): CommonAnnotationProps = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonAnnotationProps]
  }
  @scala.inline
  implicit class CommonAnnotationPropsOps[Self <: CommonAnnotationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContainerHeight(value: Double): Self = this.set("containerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerWidth(value: Double): Self = this.set("containerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoteX(value: NoteCoordinate): Self = this.set("noteX", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoteY(value: NoteCoordinate): Self = this.set("noteY", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setMotionDamping(value: Double): Self = this.set("motionDamping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotionDamping: Self = this.set("motionDamping", js.undefined)
    @scala.inline
    def setMotionStiffness(value: Double): Self = this.set("motionStiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotionStiffness: Self = this.set("motionStiffness", js.undefined)
    @scala.inline
    def setNote(value: ReactNode): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setNoteTextOffset(value: Double): Self = this.set("noteTextOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoteTextOffset: Self = this.set("noteTextOffset", js.undefined)
    @scala.inline
    def setNoteWidth(value: Double): Self = this.set("noteWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoteWidth: Self = this.set("noteWidth", js.undefined)
  }
  
}

