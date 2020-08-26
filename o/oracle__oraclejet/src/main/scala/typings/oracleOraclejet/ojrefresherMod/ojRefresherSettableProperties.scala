package typings.oracleOraclejet.ojrefresherMod

import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojRefresherSettableProperties extends baseComponentSettableProperties {
  var target: Element = js.native
  var text: String = js.native
  var threshold: Double = js.native
  def refreshContent(): js.Promise[_] = js.native
}

object ojRefresherSettableProperties {
  @scala.inline
  def apply(refreshContent: () => js.Promise[_], target: Element, text: String, threshold: Double): ojRefresherSettableProperties = {
    val __obj = js.Dynamic.literal(refreshContent = js.Any.fromFunction0(refreshContent), target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRefresherSettableProperties]
  }
  @scala.inline
  implicit class ojRefresherSettablePropertiesOps[Self <: ojRefresherSettableProperties] (val x: Self) extends AnyVal {
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
    def setRefreshContent(value: () => js.Promise[_]): Self = this.set("refreshContent", js.Any.fromFunction0(value))
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
  }
  
}

