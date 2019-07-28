package typings.mozillaDashReadability.mozillaDashReadabilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Readability extends js.Object {
  def isProbablyReaderable(): Boolean = js.native
  def isProbablyReaderable(helperIsVisible: js.Function1[/* node */ js.Any, Boolean]): Boolean = js.native
  def parse(): ParseResult = js.native
}

