package typings.micromatch.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var glob: String
  var input: String
  var output: String
  var regex: RegExp
}

object Item {
  @scala.inline
  def apply(glob: String, input: String, output: String, regex: RegExp): Item = {
    val __obj = js.Dynamic.literal(glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Item]
  }
}

