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
    get: js.Function1[java.lang.String, java.lang.String],
    has: js.Function1[java.lang.String, scala.Boolean],
    parse: js.Function0[scala.Unit]
  ): PDFMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[PDFMetadata]
  }
}

