package typings.phaser.Phaser.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the features of the browser running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.features` from within any Scene.
  */
@js.native
trait Features extends js.Object {
  /**
    * Is canvas available?
    */
  var canvas: Boolean = js.native
  /**
    * True if canvas supports a 'copy' bitblt onto itself when the source and destination regions overlap.
    */
  var canvasBitBltShift: Boolean = js.native
  /**
    * Is file available?
    */
  var file: Boolean = js.native
  /**
    * Is fileSystem available?
    */
  var fileSystem: Boolean = js.native
  /**
    * Does the device support the getUserMedia API?
    */
  var getUserMedia: Boolean = js.native
  /**
    * Is the device big or little endian? (only detected if the browser supports TypedArrays)
    */
  var littleEndian: Boolean = js.native
  /**
    * Is localStorage available?
    */
  var localStorage: Boolean = js.native
  /**
    * Is Pointer Lock available?
    */
  var pointerLock: Boolean = js.native
  /**
    * Does the device context support 32bit pixel manipulation using array buffer views?
    */
  var support32bit: Boolean = js.native
  /**
    * Does the device support the Vibration API?
    */
  var vibration: Boolean = js.native
  /**
    * Is webGL available?
    */
  var webGL: Boolean = js.native
  /**
    * Is worker available?
    */
  var worker: Boolean = js.native
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
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], canvasBitBltShift = canvasBitBltShift.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileSystem = fileSystem.asInstanceOf[js.Any], getUserMedia = getUserMedia.asInstanceOf[js.Any], littleEndian = littleEndian.asInstanceOf[js.Any], localStorage = localStorage.asInstanceOf[js.Any], pointerLock = pointerLock.asInstanceOf[js.Any], support32bit = support32bit.asInstanceOf[js.Any], vibration = vibration.asInstanceOf[js.Any], webGL = webGL.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
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
    def setCanvas(value: Boolean): Self = this.set("canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanvasBitBltShift(value: Boolean): Self = this.set("canvasBitBltShift", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: Boolean): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSystem(value: Boolean): Self = this.set("fileSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetUserMedia(value: Boolean): Self = this.set("getUserMedia", value.asInstanceOf[js.Any])
    @scala.inline
    def setLittleEndian(value: Boolean): Self = this.set("littleEndian", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalStorage(value: Boolean): Self = this.set("localStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerLock(value: Boolean): Self = this.set("pointerLock", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupport32bit(value: Boolean): Self = this.set("support32bit", value.asInstanceOf[js.Any])
    @scala.inline
    def setVibration(value: Boolean): Self = this.set("vibration", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebGL(value: Boolean): Self = this.set("webGL", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorker(value: Boolean): Self = this.set("worker", value.asInstanceOf[js.Any])
  }
  
}

