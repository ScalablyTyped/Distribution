package typings.micromatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanInfoWithTokens extends ScanInfoWithParts {
  var maxDepth: Double = js.native
  var tokens: js.Array[ScanInfoToken] = js.native
}

object ScanInfoWithTokens {
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
    maxDepth: Double,
    negated: Boolean,
    parts: js.Array[String],
    prefix: String,
    slashes: js.Array[Double],
    start: Double,
    tokens: js.Array[ScanInfoToken]
  ): ScanInfoWithTokens = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], isBrace = isBrace.asInstanceOf[js.Any], isBracket = isBracket.asInstanceOf[js.Any], isExtglob = isExtglob.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any], isGlobstar = isGlobstar.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanInfoWithTokens]
  }
  @scala.inline
  implicit class ScanInfoWithTokensOps[Self <: ScanInfoWithTokens] (val x: Self) extends AnyVal {
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
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokensVarargs(value: ScanInfoToken*): Self = this.set("tokens", js.Array(value :_*))
    @scala.inline
    def setTokens(value: js.Array[ScanInfoToken]): Self = this.set("tokens", value.asInstanceOf[js.Any])
  }
  
}

