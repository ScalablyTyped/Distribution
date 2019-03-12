package typings
package naturalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stem extends js.Object {
  def stem(token: java.lang.String): java.lang.String
}

object Anon_Stem {
  @scala.inline
  def apply(stem: java.lang.String => java.lang.String): Anon_Stem = {
    val __obj = js.Dynamic.literal(stem = js.Any.fromFunction1(stem))
  
    __obj.asInstanceOf[Anon_Stem]
  }
}

