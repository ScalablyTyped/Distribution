package typings.phaser.Phaser.Types.Core

import typings.phaser.Phaser.Game
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbacksConfig extends StObject {
  
  /**
    * A function to run at the end of the boot sequence. At this point, all the game systems have started and plugins have been loaded.
    */
  var postBoot: js.UndefOr[BootCallback] = js.native
  
  /**
    * A function to run at the start of the boot sequence.
    */
  var preBoot: js.UndefOr[BootCallback] = js.native
}
object CallbacksConfig {
  
  @scala.inline
  def apply(): CallbacksConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbacksConfig]
  }
  
  @scala.inline
  implicit class CallbacksConfigMutableBuilder[Self <: CallbacksConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostBoot(value: /* game */ Game => Unit): Self = StObject.set(x, "postBoot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostBootUndefined: Self = StObject.set(x, "postBoot", js.undefined)
    
    @scala.inline
    def setPreBoot(value: /* game */ Game => Unit): Self = StObject.set(x, "preBoot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreBootUndefined: Self = StObject.set(x, "preBoot", js.undefined)
  }
}
