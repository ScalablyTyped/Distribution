package typings.phaser.PhaserNs.DeviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the features of the browser running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.features` from within any Scene.
  */
trait Features extends js.Object {
  /**
    * Is canvas available?
    */
  var canvas: Boolean
  /**
    * True if canvas supports a 'copy' bitblt onto itself when the source and destination regions overlap.
    */
  var canvasBitBltShift: Boolean
  /**
    * Is file available?
    */
  var file: Boolean
  /**
    * Is fileSystem available?
    */
  var fileSystem: Boolean
  /**
    * Does the device support the getUserMedia API?
    */
  var getUserMedia: Boolean
  /**
    * Is the device big or little endian? (only detected if the browser supports TypedArrays)
    */
  var littleEndian: Boolean
  /**
    * Is localStorage available?
    */
  var localStorage: Boolean
  /**
    * Is Pointer Lock available?
    */
  var pointerLock: Boolean
  /**
    * Does the device context support 32bit pixel manipulation using array buffer views?
    */
  var support32bit: Boolean
  /**
    * Does the device support the Vibration API?
    */
  var vibration: Boolean
  /**
    * Is webGL available?
    */
  var webGL: Boolean
  /**
    * Is worker available?
    */
  var worker: Boolean
}

object Features {
  @scala.inline
  def apply(
    canvas: Boolean,
    canvasBitBltShift: Boolean,
    file: Boolean,
    fileSystem: Boolean,
    getUserMedia: Boolean,
    littleEndian: Boolean,
    localStorage: Boolean,
    pointerLock: Boolean,
    support32bit: Boolean,
    vibration: Boolean,
    webGL: Boolean,
    worker: Boolean
  ): Features = {
    val __obj = js.Dynamic.literal(canvas = canvas, canvasBitBltShift = canvasBitBltShift, file = file, fileSystem = fileSystem, getUserMedia = getUserMedia, littleEndian = littleEndian, localStorage = localStorage, pointerLock = pointerLock, support32bit = support32bit, vibration = vibration, webGL = webGL, worker = worker)
  
    __obj.asInstanceOf[Features]
  }
}

