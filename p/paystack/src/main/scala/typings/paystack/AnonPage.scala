package typings.paystack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPage extends js.Object {
  var page: Double
  var perPage: Double
}

object AnonPage {
  @scala.inline
  def apply(page: Double, perPage: Double): AnonPage = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], perPage = perPage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPage]
  }
}

