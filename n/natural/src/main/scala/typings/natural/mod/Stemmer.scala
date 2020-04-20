package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stemmer extends js.Object {
  def attach(): Unit
  def stem(token: String): String
  def tokenizeAndStem(text: String): js.Array[String]
}

object Stemmer {
  @scala.inline
  def apply(attach: () => Unit, stem: String => String, tokenizeAndStem: String => js.Array[String]): Stemmer = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), stem = js.Any.fromFunction1(stem), tokenizeAndStem = js.Any.fromFunction1(tokenizeAndStem))
    __obj.asInstanceOf[Stemmer]
  }
}

