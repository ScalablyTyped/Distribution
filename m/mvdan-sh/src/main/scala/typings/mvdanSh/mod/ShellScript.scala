package typings.mvdanSh.mod

import typings.mvdanSh.anon.BinaryNextLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellScript extends js.Object {
  var syntax: BinaryNextLine
}

object ShellScript {
  @scala.inline
  def apply(syntax: BinaryNextLine): ShellScript = {
    val __obj = js.Dynamic.literal(syntax = syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellScript]
  }
}

