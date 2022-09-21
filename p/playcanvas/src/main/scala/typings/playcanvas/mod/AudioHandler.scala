package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading {@link Sound} resources.
  *
  * @implements {ResourceHandler}
  */
@JSImport("playcanvas", "AudioHandler")
@js.native
open class AudioHandler protected ()
  extends StObject
     with ResourceHandler {
  /**
    * Create a new AudioHandler instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
  
  /**
    * Loads an audio asset using an AudioContext by URL and calls success or error with the
    * created resource or error respectively.
    *
    * @param {string} url - The url of the audio asset.
    * @param {Function} success - Function to be called if the audio asset was loaded or if we
    * just want to continue without errors even if the audio is not loaded.
    * @param {Function} error - Function to be called if there was an error while loading the
    * audio asset.
    * @private
    */
  /* private */ var _createSound: Any = js.native
  
  def _isSupported(url: Any): Boolean = js.native
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  def load(url: Any, callback: Any): Unit = js.native
  
  var manager: SoundManager = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any): Any = js.native
  
  @JSName("patch")
  def patch_MAudioHandler(asset: Any, assets: Any): Unit = js.native
}
