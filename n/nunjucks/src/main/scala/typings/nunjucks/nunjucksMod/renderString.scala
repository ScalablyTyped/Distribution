package typings.nunjucks.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nunjucks", "renderString")
@js.native
object renderString extends js.Object {
  def apply(src: String, context: js.Object): String = js.native
  def apply(src: String, context: js.Object, callback: TemplateCallback[String]): Unit = js.native
}

