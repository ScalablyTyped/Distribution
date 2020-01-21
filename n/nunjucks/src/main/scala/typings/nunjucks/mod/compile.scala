package typings.nunjucks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nunjucks", "compile")
@js.native
object compile extends js.Object {
  def apply(src: String): Template = js.native
  def apply(src: String, env: Environment): Template = js.native
  def apply(src: String, env: Environment, callback: TemplateCallback[Template]): Template = js.native
}

