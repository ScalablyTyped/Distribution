package typings.openpgp

import typings.openpgp.openpgpStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: utf8
}

object Anon_Format {
  @scala.inline
  def apply(format: utf8): Anon_Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Format]
  }
}

