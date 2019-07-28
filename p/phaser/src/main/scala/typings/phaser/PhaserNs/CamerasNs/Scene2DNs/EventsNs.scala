package typings.phaser.PhaserNs.CamerasNs.Scene2DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Cameras.Scene2D.Events")
@js.native
object EventsNs extends js.Object {
  /**
    * The Destroy Camera Event.
    * 
    * This event is dispatched by a Camera instance when it is destroyed by the Camera Manager.
    */
  val DESTROY: js.Any = js.native
  /**
    * The Camera Fade In Complete Event.
    * 
    * This event is dispatched by a Camera instance when the Fade In Effect completes.
    * 
    * Listen to it from a Camera instance using `Camera.on('camerafadeincomplete', listener)`.
    */
  val FADE_IN_COMPLETE: js.Any = js.native
  /**
    * The Camera Fade In Start Event.
    * 
    * This event is dispatched by a Camera instance when the Fade In Effect starts.
    * 
    * Listen to it from a Camera instance using `Camera.on('camerafadeinstart', listener)`.
    */
  val FADE_IN_START: js.Any = js.native
  /**
    * The Camera Fade Out Complete Event.
    * 
    * This event is dispatched by a Camera instance when the Fade Out Effect completes.
    * 
    * Listen to it from a Camera instance using `Camera.on('camerafadeoutcomplete', listener)`.
    */
  val FADE_OUT_COMPLETE: js.Any = js.native
  /**
    * The Camera Fade Out Start Event.
    * 
    * This event is dispatched by a Camera instance when the Fade Out Effect starts.
    * 
    * Listen to it from a Camera instance using `Camera.on('camerafadeoutstart', listener)`.
    */
  val FADE_OUT_START: js.Any = js.native
  /**
    * The Camera Flash Complete Event.
    * 
    * This event is dispatched by a Camera instance when the Flash Effect completes.
    */
  val FLASH_COMPLETE: js.Any = js.native
  /**
    * The Camera Flash Start Event.
    * 
    * This event is dispatched by a Camera instance when the Flash Effect starts.
    */
  val FLASH_START: js.Any = js.native
  /**
    * The Camera Pan Complete Event.
    * 
    * This event is dispatched by a Camera instance when the Pan Effect completes.
    */
  val PAN_COMPLETE: js.Any = js.native
  /**
    * The Camera Pan Start Event.
    * 
    * This event is dispatched by a Camera instance when the Pan Effect starts.
    */
  val PAN_START: js.Any = js.native
  /**
    * The Camera Post-Render Event.
    * 
    * This event is dispatched by a Camera instance after is has finished rendering.
    * It is only dispatched if the Camera is rendering to a texture.
    * 
    * Listen to it from a Camera instance using: `camera.on('postrender', listener)`.
    */
  val POST_RENDER: js.Any = js.native
  /**
    * The Camera Pre-Render Event.
    * 
    * This event is dispatched by a Camera instance when it is about to render.
    * It is only dispatched if the Camera is rendering to a texture.
    * 
    * Listen to it from a Camera instance using: `camera.on('prerender', listener)`.
    */
  val PRE_RENDER: js.Any = js.native
  /**
    * The Camera Shake Complete Event.
    * 
    * This event is dispatched by a Camera instance when the Shake Effect completes.
    */
  val SHAKE_COMPLETE: js.Any = js.native
  /**
    * The Camera Shake Start Event.
    * 
    * This event is dispatched by a Camera instance when the Shake Effect starts.
    */
  val SHAKE_START: js.Any = js.native
  /**
    * The Camera Zoom Complete Event.
    * 
    * This event is dispatched by a Camera instance when the Zoom Effect completes.
    */
  val ZOOM_COMPLETE: js.Any = js.native
  /**
    * The Camera Zoom Start Event.
    * 
    * This event is dispatched by a Camera instance when the Zoom Effect starts.
    */
  val ZOOM_START: js.Any = js.native
}

