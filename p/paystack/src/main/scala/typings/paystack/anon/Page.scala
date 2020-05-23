package typings.paystack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  var page: Double
  var perPage: Double
}

object Page {
  @scala.inline
  def apply(page: Double, perPage: Double): Page = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], perPage = perPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

