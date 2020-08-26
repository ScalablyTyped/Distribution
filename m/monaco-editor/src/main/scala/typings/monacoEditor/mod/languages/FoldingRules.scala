package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldingRules extends js.Object {
  /**
    * Region markers used by the language.
    */
  var markers: js.UndefOr[FoldingMarkers] = js.native
  /**
    * Used by the indentation based strategy to decide whether empty lines belong to the previous or the next block.
    * A language adheres to the off-side rule if blocks in that language are expressed by their indentation.
    * See [wikipedia](https://en.wikipedia.org/wiki/Off-side_rule) for more information.
    * If not set, `false` is used and empty lines belong to the previous block.
    */
  var offSide: js.UndefOr[Boolean] = js.native
}

object FoldingRules {
  @scala.inline
  def apply(): FoldingRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoldingRules]
  }
  @scala.inline
  implicit class FoldingRulesOps[Self <: FoldingRules] (val x: Self) extends AnyVal {
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
    def setMarkers(value: FoldingMarkers): Self = this.set("markers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkers: Self = this.set("markers", js.undefined)
    @scala.inline
    def setOffSide(value: Boolean): Self = this.set("offSide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffSide: Self = this.set("offSide", js.undefined)
  }
  
}

