package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new ScrollbarComponent.
  * @property orientation - Whether the scrollbar moves horizontally or vertically. Can be:
  *
  * * {@link pc.ORIENTATION_HORIZONTAL}: The scrollbar animates in the horizontal axis.
  * * {@link pc.ORIENTATION_VERTICAL}: The scrollbar animates in the vertical axis.
  *
  * Defaults to pc.ORIENTATION_HORIZONTAL.
  * @property value - The current position value of the scrollbar, in the range 0 to 1. Defaults to 0.
  * @property handleSize - The size of the handle relative to the size of the track, in the range
  * 0 to 1. For a vertical scrollbar, a value of 1 means that the handle will take up the full height of
  * the track.
  * @property handleEntity - The entity to be used as the scrollbar handle. This entity must
  * have a Scrollbar component.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@js.native
trait ScrollbarComponent
  extends StObject
     with Component {
  
  /**
    * The entity to be used as the scrollbar handle. This entity must
    have a Scrollbar component.
    */
  var handleEntity: Entity = js.native
  
  /**
    * The size of the handle relative to the size of the track, in the range
    0 to 1. For a vertical scrollbar, a value of 1 means that the handle will take up the full height of
    the track.
    */
  var handleSize: Double = js.native
  
  /**
    * Whether the scrollbar moves horizontally or vertically. Can be:
    
    * {@link pc.ORIENTATION_HORIZONTAL}: The scrollbar animates in the horizontal axis.
    * {@link pc.ORIENTATION_VERTICAL}: The scrollbar animates in the vertical axis.
    
    Defaults to pc.ORIENTATION_HORIZONTAL.
    */
  var orientation: Double = js.native
  
  /**
    * The current position value of the scrollbar, in the range 0 to 1. Defaults to 0.
    */
  var value: Double = js.native
}
