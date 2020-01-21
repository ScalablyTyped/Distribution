package typings.moduleAlias.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * module intialis options type
  */
trait Options extends js.Object {
  var base: String
}

object Options {
  @scala.inline
  def apply(base: String): Options = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

