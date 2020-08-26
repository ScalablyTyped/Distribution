package typings.micromatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanInfo extends js.Object {
  var base: String = js.native
  var glob: String = js.native
  var input: String = js.native
  var isBrace: Boolean = js.native
  var isBracket: Boolean = js.native
  var isExtglob: Boolean = js.native
  var isGlob: Boolean = js.native
  var isGlobstar: Boolean = js.native
  var negated: Boolean = js.native
  var prefix: String = js.native
  var start: Double = js.native
}

object ScanInfo {
  @scala.inline
  def apply(
    base: String,
    glob: String,
    input: String,
    isBrace: Boolean,
    isBracket: Boolean,
    isExtglob: Boolean,
    isGlob: Boolean,
    isGlobstar: Boolean,
    negated: Boolean,
    prefix: String,
    start: Double
  ): ScanInfo = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], isBrace = isBrace.asInstanceOf[js.Any], isBracket = isBracket.asInstanceOf[js.Any], isExtglob = isExtglob.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any], isGlobstar = isGlobstar.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanInfo]
  }
  @scala.inline
  implicit class ScanInfoOps[Self <: ScanInfo] (val x: Self) extends AnyVal {
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlob(value: String): Self = this.set("glob", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBrace(value: Boolean): Self = this.set("isBrace", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBracket(value: Boolean): Self = this.set("isBracket", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsExtglob(value: Boolean): Self = this.set("isExtglob", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGlob(value: Boolean): Self = this.set("isGlob", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGlobstar(value: Boolean): Self = this.set("isGlobstar", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegated(value: Boolean): Self = this.set("negated", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

