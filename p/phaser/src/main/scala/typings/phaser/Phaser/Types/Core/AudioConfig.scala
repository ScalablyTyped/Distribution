package typings.phaser.Phaser.Types.Core

import typings.std.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Config object containing various sound settings.
  */
@js.native
trait AudioConfig extends StObject {
  
  /**
    * An existing Web Audio context.
    */
  var context: js.UndefOr[AudioContext] = js.native
  
  /**
    * Use HTML5 Audio instead of Web Audio.
    */
  var disableWebAudio: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable all audio output.
    */
  var noAudio: js.UndefOr[Boolean] = js.native
}
object AudioConfig {
  
  @scala.inline
  def apply(): AudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioConfig]
  }
  
  @scala.inline
  implicit class AudioConfigMutableBuilder[Self <: AudioConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: AudioContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDisableWebAudio(value: Boolean): Self = StObject.set(x, "disableWebAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableWebAudioUndefined: Self = StObject.set(x, "disableWebAudio", js.undefined)
    
    @scala.inline
    def setNoAudio(value: Boolean): Self = StObject.set(x, "noAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoAudioUndefined: Self = StObject.set(x, "noAudio", js.undefined)
  }
}
