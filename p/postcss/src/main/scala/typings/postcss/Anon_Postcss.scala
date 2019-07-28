package typings.postcss

import typings.postcss.postcssMod.Processor
import typings.postcss.postcssMod.TransformCallback
import typings.postcss.postcssMod._AcceptedPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Postcss extends _AcceptedPlugin {
  var postcss: TransformCallback | Processor
}

object Anon_Postcss {
  @scala.inline
  def apply(postcss: TransformCallback | Processor): Anon_Postcss = {
    val __obj = js.Dynamic.literal(postcss = postcss.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Postcss]
  }
}

