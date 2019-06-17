package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response[T] extends js.Object {
  /** This is the data you would see in https://developer.github.com/v3/ */
  var data: T = js.native
  /** Response headers */
  var headers: atOctokitRestLib.Anon_Date = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[stdLib.Iterator[_]] = js.native
  /** Response status number */
  var status: scala.Double = js.native
}

