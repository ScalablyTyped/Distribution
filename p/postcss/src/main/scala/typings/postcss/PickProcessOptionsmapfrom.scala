package typings.postcss

import typings.postcss.mod.SourceMapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<postcss.postcss.ProcessOptions, 'map' | 'from'> */
trait PickProcessOptionsmapfrom extends js.Object {
  var from: js.UndefOr[String] = js.undefined
  var map: js.UndefOr[SourceMapOptions | Boolean] = js.undefined
}

object PickProcessOptionsmapfrom {
  @scala.inline
  def apply(from: String = null, map: SourceMapOptions | Boolean = null): PickProcessOptionsmapfrom = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickProcessOptionsmapfrom]
  }
}

