package typings
package podcastLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItunesOwner extends js.Object {
  var email: java.lang.String
  var name: java.lang.String
}

object IItunesOwner {
  @scala.inline
  def apply(email: java.lang.String, name: java.lang.String): IItunesOwner = {
    val __obj = js.Dynamic.literal(email = email, name = name)
  
    __obj.asInstanceOf[IItunesOwner]
  }
}

