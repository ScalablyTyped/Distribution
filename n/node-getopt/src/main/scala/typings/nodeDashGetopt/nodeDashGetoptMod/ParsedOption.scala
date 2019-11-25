package typings.nodeDashGetopt.nodeDashGetoptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parsed options.
  */
trait ParsedOption extends js.Object {
  var argv: js.Array[String]
  var options: OptionMap
  def empty(): Boolean
}

object ParsedOption {
  @scala.inline
  def apply(argv: js.Array[String], empty: () => Boolean, options: OptionMap): ParsedOption = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], empty = js.Any.fromFunction0(empty), options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedOption]
  }
}

