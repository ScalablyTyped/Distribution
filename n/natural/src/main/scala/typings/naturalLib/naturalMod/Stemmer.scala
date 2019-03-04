package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stemmer extends js.Object {
  def stem(token: java.lang.String): java.lang.String
}

object Stemmer {
  @scala.inline
  def apply(stem: js.Function1[java.lang.String, java.lang.String]): Stemmer = {
    val __obj = js.Dynamic.literal(stem = stem)
  
    __obj.asInstanceOf[Stemmer]
  }
}

