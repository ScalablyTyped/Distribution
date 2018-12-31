package typings
package nodeDashGetoptLib.nodeDashGetoptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parsed options.
  */
trait ParsedOption extends js.Object {
  var argv: js.Array[java.lang.String]
  var options: OptionMap
  def empty(): scala.Boolean
}

