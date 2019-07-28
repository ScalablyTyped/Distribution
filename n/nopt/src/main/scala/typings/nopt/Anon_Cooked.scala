package typings.nopt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cooked extends js.Object {
  var cooked: js.Array[String]
  var original: js.Array[String]
  var remain: js.Array[String]
}

object Anon_Cooked {
  @scala.inline
  def apply(cooked: js.Array[String], original: js.Array[String], remain: js.Array[String]): Anon_Cooked = {
    val __obj = js.Dynamic.literal(cooked = cooked, original = original, remain = remain)
  
    __obj.asInstanceOf[Anon_Cooked]
  }
}

