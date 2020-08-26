package typings.micromatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanInfoToken extends js.Object {
  var backslashes: js.UndefOr[Boolean] = js.native
  var depth: Double = js.native
  var isBrace: js.UndefOr[Boolean] = js.native
  var isBracket: js.UndefOr[Boolean] = js.native
  var isExtglob: js.UndefOr[Boolean] = js.native
  var isGlob: Boolean = js.native
  var isGlobstar: js.UndefOr[Boolean] = js.native
  var isPrefix: js.UndefOr[Boolean] = js.native
  var negated: js.UndefOr[Boolean] = js.native
  var value: String = js.native
}

object ScanInfoToken {
  @scala.inline
  def apply(depth: Double, isGlob: Boolean, value: String): ScanInfoToken = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanInfoToken]
  }
  @scala.inline
  implicit class ScanInfoTokenOps[Self <: ScanInfoToken] (val x: Self) extends AnyVal {
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGlob(value: Boolean): Self = this.set("isGlob", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackslashes(value: Boolean): Self = this.set("backslashes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackslashes: Self = this.set("backslashes", js.undefined)
    @scala.inline
    def setIsBrace(value: Boolean): Self = this.set("isBrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBrace: Self = this.set("isBrace", js.undefined)
    @scala.inline
    def setIsBracket(value: Boolean): Self = this.set("isBracket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBracket: Self = this.set("isBracket", js.undefined)
    @scala.inline
    def setIsExtglob(value: Boolean): Self = this.set("isExtglob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExtglob: Self = this.set("isExtglob", js.undefined)
    @scala.inline
    def setIsGlobstar(value: Boolean): Self = this.set("isGlobstar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsGlobstar: Self = this.set("isGlobstar", js.undefined)
    @scala.inline
    def setIsPrefix(value: Boolean): Self = this.set("isPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPrefix: Self = this.set("isPrefix", js.undefined)
    @scala.inline
    def setNegated(value: Boolean): Self = this.set("negated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegated: Self = this.set("negated", js.undefined)
  }
  
}

