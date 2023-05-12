package typings.metroConfig

import typings.metroConfig.srcConfigTypesMod.ConfigT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDefaultsMod {
  
  @js.native
  trait getDefaultConfig extends StObject {
    
    def apply(): js.Promise[ConfigT] = js.native
    def apply(rootPath: String): js.Promise[ConfigT] = js.native
    
    def getDefaultValues(): ConfigT = js.native
    def getDefaultValues(rootPath: String): ConfigT = js.native
  }
}
