package typings.micromatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanInfoWithParts extends ScanInfo {
  var parts: js.Array[String]
  var slashes: js.Array[Double]
}

object ScanInfoWithParts {
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
    parts: js.Array[String],
    prefix: String,
    slashes: js.Array[Double],
    start: Double
  ): ScanInfoWithParts = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], isBrace = isBrace.asInstanceOf[js.Any], isBracket = isBracket.asInstanceOf[js.Any], isExtglob = isExtglob.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any], isGlobstar = isGlobstar.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScanInfoWithParts]
  }
}

