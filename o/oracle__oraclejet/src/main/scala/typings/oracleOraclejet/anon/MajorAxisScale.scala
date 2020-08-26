package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MajorAxisScale
  extends /* key */ StringDictionary[js.Any] {
  var majorAxisScale: String = js.native
  var minorAxisScale: String = js.native
  var viewportEnd: String = js.native
  var viewportStart: String = js.native
}

object MajorAxisScale {
  @scala.inline
  def apply(majorAxisScale: String, minorAxisScale: String, viewportEnd: String, viewportStart: String): MajorAxisScale = {
    val __obj = js.Dynamic.literal(majorAxisScale = majorAxisScale.asInstanceOf[js.Any], minorAxisScale = minorAxisScale.asInstanceOf[js.Any], viewportEnd = viewportEnd.asInstanceOf[js.Any], viewportStart = viewportStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[MajorAxisScale]
  }
  @scala.inline
  implicit class MajorAxisScaleOps[Self <: MajorAxisScale] (val x: Self) extends AnyVal {
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
    def setMajorAxisScale(value: String): Self = this.set("majorAxisScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinorAxisScale(value: String): Self = this.set("minorAxisScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportEnd(value: String): Self = this.set("viewportEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportStart(value: String): Self = this.set("viewportStart", value.asInstanceOf[js.Any])
  }
  
}

