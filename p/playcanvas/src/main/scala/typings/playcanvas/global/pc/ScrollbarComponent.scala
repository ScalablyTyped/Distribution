package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ScrollbarComponent enables a group of entities to behave like a draggable scrollbar.
  *
  * @property {number} orientation Whether the scrollbar moves horizontally or vertically. Can be:
  *
  * - {@link ORIENTATION_HORIZONTAL}: The scrollbar animates in the horizontal axis.
  * - {@link ORIENTATION_VERTICAL}: The scrollbar animates in the vertical axis.
  *
  * Defaults to {@link ORIENTATION_HORIZONTAL}.
  * @property {number} value The current position value of the scrollbar, in the range 0 to 1.
  * Defaults to 0.
  * @property {number} handleSize The size of the handle relative to the size of the track, in the
  * range 0 to 1. For a vertical scrollbar, a value of 1 means that the handle will take up the full
  * height of the track.
  * @property {import('../../entity.js').Entity} handleEntity The entity to be used as the scrollbar
  * handle. This entity must have a Scrollbar component.
  * @augments Component
  */
@JSGlobal("pc.ScrollbarComponent")
@js.native
open class ScrollbarComponent protected ()
  extends typings.playcanvas.mod.ScrollbarComponent {
  /**
    * Create a new ScrollbarComponent.
    *
    * @param {import('./system.js').ScrollbarComponentSystem} system - The ComponentSystem that
    * created this Component.
    * @param {import('../../entity.js').Entity} entity - The Entity that this Component is
    * attached to.
    */
  def this(system: typings.playcanvas.mod.ScrollbarComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
