package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @constructor
  * @name pc.ScrollbarComponent
  * @extends pc.Component
  * @description Create a new ScrollbarComponent
  * @classdesc A ScrollbarComponent enables a group of entities to behave like a draggable scrollbar.
  * @param {pc.ScrollbarComponentSystem} system The ComponentSystem that created this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to.
  * @property {Number} orientation Whether the scrollbar moves horizontally or vertically. Can be:
  * <ul>
  *     <li>{@link pc.ORIENTATION_HORIZONTAL}: The scrollbar animates in the horizontal axis.</li>
  *     <li>{@link pc.ORIENTATION_VERTICAL}: The scrollbar animates in the vertical axis.</li>
  * </ul>
  * Defaults to pc.ORIENTATION_HORIZONTAL.
  * @property {Number} value The current position value of the scrollbar, in the range 0 to 1. Defaults to 0.
  * @property {Number} handleSize The size of the handle relative to the size of the track, in the range
  * 0 to 1. For a vertical scrollbar, a value of 1 means that the handle will take up the full height of
  * the track.
  * @property {pc.Entity} handleEntity The entity to be used as the scrollbar handle. This entity must
  * have a Scrollbar component.
  */
@JSImport("playcanvas", "ScrollbarComponent")
@js.native
class ScrollbarComponent protected ()
  extends typings.playcanvas.pc.ScrollbarComponent {
  def this(system: typings.playcanvas.pc.ScrollbarComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

