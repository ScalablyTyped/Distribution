package typings
package atNivoAnnotationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerHeight extends js.Object {
  var containerHeight: scala.Double
  var containerWidth: scala.Double
  var note: reactLib.reactMod.ReactNode
  var noteTextOffset: js.UndefOr[scala.Double] = js.undefined
  var noteWidth: js.UndefOr[scala.Double] = js.undefined
  var noteX: atNivoAnnotationsLib.atNivoAnnotationsMod.NoteCoordinate
  var noteY: atNivoAnnotationsLib.atNivoAnnotationsMod.NoteCoordinate
  var x: scala.Double
  var y: scala.Double
}

object Anon_ContainerHeight {
  @scala.inline
  def apply(
    containerHeight: scala.Double,
    containerWidth: scala.Double,
    note: reactLib.reactMod.ReactNode,
    noteX: atNivoAnnotationsLib.atNivoAnnotationsMod.NoteCoordinate,
    noteY: atNivoAnnotationsLib.atNivoAnnotationsMod.NoteCoordinate,
    x: scala.Double,
    y: scala.Double,
    noteTextOffset: scala.Int | scala.Double = null,
    noteWidth: scala.Int | scala.Double = null
  ): Anon_ContainerHeight = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight, containerWidth = containerWidth, note = note.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], x = x, y = y)
    if (noteTextOffset != null) __obj.updateDynamic("noteTextOffset")(noteTextOffset.asInstanceOf[js.Any])
    if (noteWidth != null) __obj.updateDynamic("noteWidth")(noteWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerHeight]
  }
}

