package typings.next

import typings.next.nextServerMod.ServerConstructor
import typings.next.nextStrings.staticMarkup
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/server/next", JSImport.Namespace)
@js.native
object nextMod extends js.Object {
  def default(options: NextServerConstructor): typings.next.nextServerMod.default = js.native
  type NextServerConstructor = (Omit[ServerConstructor, staticMarkup]) with AnonDev
}

