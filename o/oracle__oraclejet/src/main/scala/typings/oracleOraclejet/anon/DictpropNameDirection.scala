package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.ascending
import typings.oracleOraclejet.oracleOraclejetStrings.descending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictpropNameDirection
  extends /* key */ StringDictionary[js.Any] {
  var direction: ascending | descending = js.native
  var header: js.Any = js.native
}

object DictpropNameDirection {
  @scala.inline
  def apply(direction: ascending | descending, header: js.Any): DictpropNameDirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameDirection]
  }
  @scala.inline
  implicit class DictpropNameDirectionOps[Self <: DictpropNameDirection] (val x: Self) extends AnyVal {
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
    def setDirection(value: ascending | descending): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
  }
  
}

