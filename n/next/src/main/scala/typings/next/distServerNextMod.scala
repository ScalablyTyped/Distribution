package typings.next

import typings.next.distNextDashServerServerNextDashServerMod.ServerConstructor
import typings.next.distServerNextMod.NextServerConstructor
import typings.next.nextStrings.staticMarkup
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/server/next", JSImport.Namespace)
@js.native
object distServerNextMod extends js.Object {
  def default(options: NextServerConstructor): typings.next.distNextDashServerServerNextDashServerMod.default = js.native
  type NextServerConstructor = (Omit[ServerConstructor, staticMarkup]) with Anon_Dev
}

