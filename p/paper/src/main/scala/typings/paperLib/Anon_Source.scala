package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Source extends js.Object {
  var source: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Source {
  @scala.inline
  def apply(source: java.lang.String = null, url: java.lang.String = null): Anon_Source = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Source]
  }
}

