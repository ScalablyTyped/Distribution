package typings
package postcssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: js.UndefOr[java.lang.String] = js.undefined
  var map: js.UndefOr[postcssLib.postcssMod.postcssNs.SourceMapOptions] = js.undefined
}

object Anon_From {
  @scala.inline
  def apply(from: java.lang.String = null, map: postcssLib.postcssMod.postcssNs.SourceMapOptions = null): Anon_From = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (map != null) __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[Anon_From]
  }
}

