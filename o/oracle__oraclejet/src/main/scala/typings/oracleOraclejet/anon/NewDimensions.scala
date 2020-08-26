package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewDimensions
  extends /* key */ StringDictionary[js.Any] {
  var header: String | Double = js.native
  var newDimensions: HeightWidth = js.native
  var oldDimensions: HeightWidth = js.native
}

object NewDimensions {
  @scala.inline
  def apply(header: String | Double, newDimensions: HeightWidth, oldDimensions: HeightWidth): NewDimensions = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], newDimensions = newDimensions.asInstanceOf[js.Any], oldDimensions = oldDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewDimensions]
  }
  @scala.inline
  implicit class NewDimensionsOps[Self <: NewDimensions] (val x: Self) extends AnyVal {
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
    def setHeader(value: String | Double): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewDimensions(value: HeightWidth): Self = this.set("newDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldDimensions(value: HeightWidth): Self = this.set("oldDimensions", value.asInstanceOf[js.Any])
  }
  
}

