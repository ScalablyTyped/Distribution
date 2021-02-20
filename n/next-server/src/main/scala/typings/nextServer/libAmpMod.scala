package typings.nextServer

import typings.nextServer.anon.AmpFirst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAmpMod {
  
  @JSImport("next-server/dist/lib/amp", "isInAmpMode")
  @js.native
  def isInAmpMode(): Boolean = js.native
  @JSImport("next-server/dist/lib/amp", "isInAmpMode")
  @js.native
  def isInAmpMode(hasAmpFirstHybridHasQuery: AmpFirst): Boolean = js.native
  
  @JSImport("next-server/dist/lib/amp", "useAmp")
  @js.native
  def useAmp(): Boolean = js.native
}
