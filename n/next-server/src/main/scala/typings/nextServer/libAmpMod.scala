package typings.nextServer

import typings.nextServer.anon.AmpFirst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/lib/amp", JSImport.Namespace)
@js.native
object libAmpMod extends js.Object {
  def isInAmpMode(): Boolean = js.native
  def isInAmpMode(hasAmpFirstHybridHasQuery: AmpFirst): Boolean = js.native
  def useAmp(): Boolean = js.native
}

