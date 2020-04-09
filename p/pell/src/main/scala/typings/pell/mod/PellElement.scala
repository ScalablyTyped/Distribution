package typings.pell.mod

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PellElement extends js.Object {
  var content: HTMLDivElement
}

object PellElement {
  @scala.inline
  def apply(content: HTMLDivElement): PellElement = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PellElement]
  }
}

