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

object ParsedOption {
  @scala.inline
  def apply(argv: js.Array[java.lang.String], empty: () => scala.Boolean, options: OptionMap): ParsedOption = {
    val __obj = js.Dynamic.literal(argv = argv, empty = js.Any.fromFunction0(empty), options = options)
  
    __obj.asInstanceOf[ParsedOption]
  }
}

