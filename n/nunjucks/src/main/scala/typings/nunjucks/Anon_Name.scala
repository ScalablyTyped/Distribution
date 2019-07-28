package typings.nunjucks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var template: String
}

object Anon_Name {
  @scala.inline
  def apply(name: String, template: String): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, template = template)
  
    __obj.asInstanceOf[Anon_Name]
  }
}

