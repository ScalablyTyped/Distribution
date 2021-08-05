package typings.phaser.Phaser.Types.Core

import typings.std.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Config object containing various sound settings.
  */
trait AudioConfig extends StObject {
  
  /**
    * An existing Web Audio context.
    */
  var context: js.UndefOr[AudioContext] = js.undefined
  
  /**
    * Use HTML5 Audio instead of Web Audio.
    */
  var disableWebAudio: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable all audio output.
    */
  var noAudio: js.UndefOr[Boolean] = js.undefined
}
object AudioConfig {
  
  inline def apply(): AudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioConfig]
  }
  
  extension [Self <: AudioConfig](x: Self) {
    
    inline def setContext(value: AudioContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDisableWebAudio(value: Boolean): Self = StObject.set(x, "disableWebAudio", value.asInstanceOf[js.Any])
    
    inline def setDisableWebAudioUndefined: Self = StObject.set(x, "disableWebAudio", js.undefined)
    
    inline def setNoAudio(value: Boolean): Self = StObject.set(x, "noAudio", value.asInstanceOf[js.Any])
    
    inline def setNoAudioUndefined: Self = StObject.set(x, "noAudio", js.undefined)
  }
}
