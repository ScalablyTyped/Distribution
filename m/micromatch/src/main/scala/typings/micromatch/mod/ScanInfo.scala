package typings.micromatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanInfo extends js.Object {
  var base: String
  var glob: String
  var input: String
  var isBrace: Boolean
  var isBracket: Boolean
  var isExtglob: Boolean
  var isGlob: Boolean
  var isGlobstar: Boolean
  var negated: Boolean
  var prefix: String
  var start: Double
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
}

