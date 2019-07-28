package typings.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFMetadata extends js.Object {
  def get(name: String): String
  def has(name: String): Boolean
  def parse(): Unit
}

object PDFMetadata {
  @scala.inline
  def apply(get: String => String, has: String => Boolean, parse: () => Unit): PDFMetadata = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), parse = js.Any.fromFunction0(parse))
  
    __obj.asInstanceOf[PDFMetadata]
  }
}

