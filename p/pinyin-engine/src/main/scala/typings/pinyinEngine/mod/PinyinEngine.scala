package typings.pinyinEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinyinEngine extends js.Object {
  def query(`val`: String): js.Array[String]
}

object PinyinEngine {
  @scala.inline
  def apply(query: String => js.Array[String]): PinyinEngine = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[PinyinEngine]
  }
}

