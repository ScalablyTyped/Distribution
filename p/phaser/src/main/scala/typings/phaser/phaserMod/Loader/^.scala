package typings.phaser.phaserMod.Loader

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Loader")
@js.native
object ^ extends js.Object {
  /**
    * File has finished processing.
    */
  var FILE_COMPLETE: integer = js.native
  /**
    * File has been destroyed
    */
  var FILE_DESTROYED: integer = js.native
  /**
    * The File has errored somehow during processing.
    */
  var FILE_ERRORED: integer = js.native
  /**
    * File failed to load
    */
  var FILE_FAILED: integer = js.native
  /**
    * File has loaded successfully, awaiting processing
    */
  var FILE_LOADED: integer = js.native
  /**
    * File has been started to load by the loader (onLoad called)
    */
  var FILE_LOADING: integer = js.native
  /**
    * File is in the load queue but not yet started
    */
  var FILE_PENDING: integer = js.native
  /**
    * File was populated from local data and doesn't need an HTTP request
    */
  var FILE_POPULATED: integer = js.native
  /**
    * File is being processed (onProcess callback)
    */
  var FILE_PROCESSING: integer = js.native
  /**
    * The Loader has completed loading and processing.
    */
  var LOADER_COMPLETE: integer = js.native
  /**
    * The Loader has been destroyed.
    */
  var LOADER_DESTROYED: integer = js.native
  /**
    * The Loader is idle.
    */
  var LOADER_IDLE: integer = js.native
  /**
    * The Loader is actively loading.
    */
  var LOADER_LOADING: integer = js.native
  /**
    * The Loader is processing files is has loaded.
    */
  var LOADER_PROCESSING: integer = js.native
  /**
    * The Loader is shutting down.
    */
  var LOADER_SHUTDOWN: integer = js.native
}

