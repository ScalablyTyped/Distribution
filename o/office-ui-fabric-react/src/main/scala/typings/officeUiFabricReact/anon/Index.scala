package typings.officeUiFabricReact.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: Double
  var targetElement: HTMLElement
  var value: js.Any
}

object Index {
  @scala.inline
  def apply(index: Double, targetElement: HTMLElement, value: js.Any): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

