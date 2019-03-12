package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFMetadata extends js.Object {
  def get(name: java.lang.String): java.lang.String
  def has(name: java.lang.String): scala.Boolean
  def parse(): scala.Unit
}

object PDFMetadata {
  @scala.inline
  def apply(
    get: java.lang.String => java.lang.String,
    has: java.lang.String => scala.Boolean,
    parse: () => scala.Unit
  ): PDFMetadata = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), parse = js.Any.fromFunction0(parse))
  
    __obj.asInstanceOf[PDFMetadata]
  }
}

