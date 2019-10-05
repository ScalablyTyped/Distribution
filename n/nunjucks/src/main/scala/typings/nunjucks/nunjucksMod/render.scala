package typings.nunjucks.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nunjucks", "render")
@js.native
object render extends js.Object {
  def apply(name: String): String = js.native
  def apply(name: String, context: js.Object): String = js.native
  def apply(name: String, context: js.Object, callback: TemplateCallback[String]): Unit = js.native
}

