package typings.nunjucks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nunjucks", "render")
@js.native
object render extends js.Object {
  def apply(name: String): String = js.native
  def apply(name: String, context: js.UndefOr[scala.Nothing], callback: TemplateCallback[String]): Unit = js.native
  def apply(name: String, context: js.Object): String = js.native
  def apply(name: String, context: js.Object, callback: TemplateCallback[String]): Unit = js.native
}

