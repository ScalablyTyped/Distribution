package typings.postcss.anon

import typings.postcss.mod.SourceMapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map extends js.Object {
  var map: js.UndefOr[SourceMapOptions] = js.undefined
  /**
    * The path where you'll put the output CSS file. You should always
    * set "to" to generate correct source maps.
    */
  var to: js.UndefOr[String] = js.undefined
}

object Map {
  @scala.inline
  def apply(map: SourceMapOptions = null, to: String = null): Map = {
    val __obj = js.Dynamic.literal()
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
}

