package typings.atNivoAnnotations

import typings.atNivoAnnotations.atNivoAnnotationsMod.NoteCoordinate
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerHeight extends js.Object {
  var containerHeight: Double
  var containerWidth: Double
  var note: ReactNode
  var noteTextOffset: js.UndefOr[Double] = js.undefined
  var noteWidth: js.UndefOr[Double] = js.undefined
  var noteX: NoteCoordinate
  var noteY: NoteCoordinate
  var x: Double
  var y: Double
}

object Anon_ContainerHeight {
  @scala.inline
  def apply(
    containerHeight: Double,
    containerWidth: Double,
    noteX: NoteCoordinate,
    noteY: NoteCoordinate,
    x: Double,
    y: Double,
    note: ReactNode = null,
    noteTextOffset: Int | Double = null,
    noteWidth: Int | Double = null
  ): Anon_ContainerHeight = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight, containerWidth = containerWidth, noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], x = x, y = y)
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (noteTextOffset != null) __obj.updateDynamic("noteTextOffset")(noteTextOffset.asInstanceOf[js.Any])
    if (noteWidth != null) __obj.updateDynamic("noteWidth")(noteWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerHeight]
  }
}

