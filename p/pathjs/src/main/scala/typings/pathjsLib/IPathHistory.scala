package typings
package pathjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPathHistory extends js.Object {
  var initial: js.Any
  def listen(fallback: js.Any): scala.Unit
  def popState(event: js.Any): scala.Unit
  def pushState(state: js.Any, title: java.lang.String, path: java.lang.String): scala.Unit
}

