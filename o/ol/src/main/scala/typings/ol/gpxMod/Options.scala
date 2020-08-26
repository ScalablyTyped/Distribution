package typings.ol.gpxMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var readExtensions: js.UndefOr[
    js.Function2[
      /* p0 */ typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], 
      /* p1 */ Node, 
      Unit
    ]
  ] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReadExtensions(
      value: (/* p0 */ typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], /* p1 */ Node) => Unit
    ): Self = this.set("readExtensions", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReadExtensions: Self = this.set("readExtensions", js.undefined)
  }
  
}

