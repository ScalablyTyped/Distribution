package typings
package postcssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Map extends js.Object {
  var map: js.UndefOr[postcssLib.postcssMod.SourceMapOptions] = js.undefined
  /**
    * The path where you'll put the output CSS file. You should always
    * set "to" to generate correct source maps.
    */
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Map {
  @scala.inline
  def apply(map: postcssLib.postcssMod.SourceMapOptions = null, to: java.lang.String = null): Anon_Map = {
    val __obj = js.Dynamic.literal()
    if (map != null) __obj.updateDynamic("map")(map)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Anon_Map]
  }
}

