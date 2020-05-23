package typings.postcss.anon

import typings.postcss.mod.Processor
import typings.postcss.mod.TransformCallback
import typings.postcss.mod._AcceptedPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Postcss extends _AcceptedPlugin {
  var postcss: TransformCallback | Processor
}

object Postcss {
  @scala.inline
  def apply(postcss: TransformCallback | Processor): Postcss = {
    val __obj = js.Dynamic.literal(postcss = postcss.asInstanceOf[js.Any])
    __obj.asInstanceOf[Postcss]
  }
}

