package typings
package phaserLib.PhaserNs.DeviceNs

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
  var canvas: scala.Boolean
  /**
    * True if canvas supports a 'copy' bitblt onto itself when the source and destination regions overlap.
    */
  var canvasBitBltShift: scala.Boolean
  /**
    * Is file available?
    */
  var file: scala.Boolean
  /**
    * Is fileSystem available?
    */
  var fileSystem: scala.Boolean
  /**
    * Does the device support the getUserMedia API?
    */
  var getUserMedia: scala.Boolean
  /**
    * Is the device big or little endian? (only detected if the browser supports TypedArrays)
    */
  var littleEndian: scala.Boolean
  /**
    * Is localStorage available?
    */
  var localStorage: scala.Boolean
  /**
    * Is Pointer Lock available?
    */
  var pointerLock: scala.Boolean
  /**
    * Does the device context support 32bit pixel manipulation using array buffer views?
    */
  var support32bit: scala.Boolean
  /**
    * Does the device support the Vibration API?
    */
  var vibration: scala.Boolean
  /**
    * Is webGL available?
    */
  var webGL: scala.Boolean
  /**
    * Is worker available?
    */
  var worker: scala.Boolean
}

object Features {
  @scala.inline
  def apply(
    canvas: scala.Boolean,
    canvasBitBltShift: scala.Boolean,
    file: scala.Boolean,
    fileSystem: scala.Boolean,
    getUserMedia: scala.Boolean,
    littleEndian: scala.Boolean,
    localStorage: scala.Boolean,
    pointerLock: scala.Boolean,
    support32bit: scala.Boolean,
    vibration: scala.Boolean,
    webGL: scala.Boolean,
    worker: scala.Boolean
  ): Features = {
    val __obj = js.Dynamic.literal(canvas = canvas, canvasBitBltShift = canvasBitBltShift, file = file, fileSystem = fileSystem, getUserMedia = getUserMedia, littleEndian = littleEndian, localStorage = localStorage, pointerLock = pointerLock, support32bit = support32bit, vibration = vibration, webGL = webGL, worker = worker)
  
    __obj.asInstanceOf[Features]
  }
}

