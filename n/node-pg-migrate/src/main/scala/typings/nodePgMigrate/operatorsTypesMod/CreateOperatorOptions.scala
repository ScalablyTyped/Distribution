package typings.nodePgMigrate.operatorsTypesMod

import typings.nodePgMigrate.generalTypesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOperatorOptions extends js.Object {
  var commutator: js.UndefOr[Name] = js.undefined
  var hashes: js.UndefOr[Boolean] = js.undefined
  var join: js.UndefOr[Name] = js.undefined
  var left: js.UndefOr[Name] = js.undefined
  var merges: js.UndefOr[Boolean] = js.undefined
  var negator: js.UndefOr[Name] = js.undefined
  var procedure: Name
  var restrict: js.UndefOr[Name] = js.undefined
  var right: js.UndefOr[Name] = js.undefined
}

object CreateOperatorOptions {
  @scala.inline
  def apply(
    procedure: Name,
    commutator: Name = null,
    hashes: js.UndefOr[Boolean] = js.undefined,
    join: Name = null,
    left: Name = null,
    merges: js.UndefOr[Boolean] = js.undefined,
    negator: Name = null,
    restrict: Name = null,
    right: Name = null
  ): CreateOperatorOptions = {
    val __obj = js.Dynamic.literal(procedure = procedure.asInstanceOf[js.Any])
    if (commutator != null) __obj.updateDynamic("commutator")(commutator.asInstanceOf[js.Any])
    if (!js.isUndefined(hashes)) __obj.updateDynamic("hashes")(hashes.get.asInstanceOf[js.Any])
    if (join != null) __obj.updateDynamic("join")(join.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(merges)) __obj.updateDynamic("merges")(merges.get.asInstanceOf[js.Any])
    if (negator != null) __obj.updateDynamic("negator")(negator.asInstanceOf[js.Any])
    if (restrict != null) __obj.updateDynamic("restrict")(restrict.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOperatorOptions]
  }
}

