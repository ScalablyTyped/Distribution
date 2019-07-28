package typings.postcss

import typings.postcss.postcssMod.SourceMapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Map extends js.Object {
  var map: js.UndefOr[SourceMapOptions] = js.undefined
  /**
    * The path where you'll put the output CSS file. You should always
    * set "to" to generate correct source maps.
    */
  var to: js.UndefOr[String] = js.undefined
}

object Anon_Map {
  @scala.inline
  def apply(map: SourceMapOptions = null, to: String = null): Anon_Map = {
    val __obj = js.Dynamic.literal()
    if (map != null) __obj.updateDynamic("map")(map)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Anon_Map]
  }
}

