package typings.micromatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanInfoToken extends js.Object {
  var backslashes: js.UndefOr[Boolean] = js.undefined
  var depth: Double
  var isBrace: js.UndefOr[Boolean] = js.undefined
  var isBracket: js.UndefOr[Boolean] = js.undefined
  var isExtglob: js.UndefOr[Boolean] = js.undefined
  var isGlob: Boolean
  var isGlobstar: js.UndefOr[Boolean] = js.undefined
  var isPrefix: js.UndefOr[Boolean] = js.undefined
  var negated: js.UndefOr[Boolean] = js.undefined
  var value: String
}

object ScanInfoToken {
  @scala.inline
  def apply(
    depth: Double,
    isGlob: Boolean,
    value: String,
    backslashes: js.UndefOr[Boolean] = js.undefined,
    isBrace: js.UndefOr[Boolean] = js.undefined,
    isBracket: js.UndefOr[Boolean] = js.undefined,
    isExtglob: js.UndefOr[Boolean] = js.undefined,
    isGlobstar: js.UndefOr[Boolean] = js.undefined,
    isPrefix: js.UndefOr[Boolean] = js.undefined,
    negated: js.UndefOr[Boolean] = js.undefined
  ): ScanInfoToken = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(backslashes)) __obj.updateDynamic("backslashes")(backslashes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isBrace)) __obj.updateDynamic("isBrace")(isBrace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isBracket)) __obj.updateDynamic("isBracket")(isBracket.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isExtglob)) __obj.updateDynamic("isExtglob")(isExtglob.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isGlobstar)) __obj.updateDynamic("isGlobstar")(isGlobstar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrefix)) __obj.updateDynamic("isPrefix")(isPrefix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(negated)) __obj.updateDynamic("negated")(negated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanInfoToken]
  }
}

