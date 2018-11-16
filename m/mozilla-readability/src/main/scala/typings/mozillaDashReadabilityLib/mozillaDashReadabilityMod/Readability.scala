package typings
package mozillaDashReadabilityLib.mozillaDashReadabilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Readability extends js.Object {
  def isProbablyReaderable(): scala.Boolean = js.native
  def isProbablyReaderable(helperIsVisible: js.Function1[/* node */ js.Any, scala.Boolean]): scala.Boolean = js.native
  def parse(): mozillaDashReadabilityLib.mozillaDashReadabilityMod.ReadabilityNs.ParseResult = js.native
}

