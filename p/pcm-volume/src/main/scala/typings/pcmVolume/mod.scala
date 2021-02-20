package typings.pcmVolume

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pcm-volume", JSImport.Namespace)
  @js.native
  class ^ () extends Volume
  
  @js.native
  trait Volume extends Transform {
    
    def setVolume(volume: Double): Unit = js.native
  }
}
