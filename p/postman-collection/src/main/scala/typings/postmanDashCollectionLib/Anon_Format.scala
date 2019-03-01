package typings
package postmanDashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: java.lang.String
  var source: java.lang.String
}

object Anon_Format {
  @scala.inline
  def apply(format: java.lang.String, source: java.lang.String): Anon_Format = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Anon_Format]
  }
}

