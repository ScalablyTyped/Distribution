package typings.nunjucks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autoescape extends js.Object {
  var autoescape: Boolean
}

object Autoescape {
  @scala.inline
  def apply(autoescape: Boolean): Autoescape = {
    val __obj = js.Dynamic.literal(autoescape = autoescape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autoescape]
  }
}

