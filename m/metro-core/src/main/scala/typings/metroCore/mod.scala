package typings.metroCore

import typings.metroCore.terminalMod.UnderlyingStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("metro-core", "Terminal")
  @js.native
  open class Terminal protected ()
    extends typings.metroCore.terminalMod.Terminal {
    def this(stream: UnderlyingStream) = this()
  }
}
