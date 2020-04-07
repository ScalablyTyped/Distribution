package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.AnonType
import typings.mongodb.keyinandorxornumber
import typings.mongodb.mongodbBooleans.`true`
import typings.mongodb.mongodbNumbers.`-1`
import typings.mongodb.mongodbNumbers.`1`
import typings.mongodb.mongodbStrings._empty
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateQuery[TSchema] extends js.Object {
  /** https://docs.mongodb.com/manual/reference/operator/update-array/ */
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[SetFields[TSchema]] = js.undefined
  /** https://docs.mongodb.com/manual/reference/operator/update-bitwise/ */
  @JSName("$bit")
  var $bit: js.UndefOr[StringDictionary[keyinandorxornumber]] = js.undefined
  /** https://docs.mongodb.com/manual/reference/operator/update-field/ */
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[OnlyFieldsOfType[TSchema, Date, `true` | AnonType]] = js.undefined
  @JSName("$inc")
  var $inc: js.UndefOr[OnlyFieldsOfType[TSchema, js.UndefOr[scala.Double], js.UndefOr[scala.Double]]] = js.undefined
  @JSName("$max")
  var $max: js.UndefOr[MatchKeysAndValues[TSchema]] = js.undefined
  @JSName("$min")
  var $min: js.UndefOr[MatchKeysAndValues[TSchema]] = js.undefined
  @JSName("$mul")
  var $mul: js.UndefOr[OnlyFieldsOfType[TSchema, js.UndefOr[scala.Double], js.UndefOr[scala.Double]]] = js.undefined
  @JSName("$pop")
  var $pop: js.UndefOr[OnlyFieldsOfType[TSchema, js.Array[_], `1` | `-1`]] = js.undefined
  @JSName("$pull")
  var $pull: js.UndefOr[PullOperator[TSchema]] = js.undefined
  @JSName("$pullAll")
  var $pullAll: js.UndefOr[PullAllOperator[TSchema]] = js.undefined
  @JSName("$push")
  var $push: js.UndefOr[PushOperator[TSchema]] = js.undefined
  @JSName("$rename")
  var $rename: js.UndefOr[StringDictionary[String]] = js.undefined
  @JSName("$set")
  var $set: js.UndefOr[MatchKeysAndValues[TSchema]] = js.undefined
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[MatchKeysAndValues[TSchema]] = js.undefined
  @JSName("$unset")
  var $unset: js.UndefOr[OnlyFieldsOfType[TSchema, _, _empty]] = js.undefined
}

object UpdateQuery {
  @scala.inline
  def apply[TSchema](
    $addToSet: SetFields[TSchema] = null,
    $bit: StringDictionary[keyinandorxornumber] = null,
    $currentDate: OnlyFieldsOfType[TSchema, Date, `true` | AnonType] = null,
    $inc: OnlyFieldsOfType[TSchema, js.UndefOr[scala.Double], js.UndefOr[scala.Double]] = null,
    $max: MatchKeysAndValues[TSchema] = null,
    $min: MatchKeysAndValues[TSchema] = null,
    $mul: OnlyFieldsOfType[TSchema, js.UndefOr[scala.Double], js.UndefOr[scala.Double]] = null,
    $pop: OnlyFieldsOfType[TSchema, js.Array[_], `1` | `-1`] = null,
    $pull: PullOperator[TSchema] = null,
    $pullAll: PullAllOperator[TSchema] = null,
    $push: PushOperator[TSchema] = null,
    $rename: StringDictionary[String] = null,
    $set: MatchKeysAndValues[TSchema] = null,
    $setOnInsert: MatchKeysAndValues[TSchema] = null,
    $unset: OnlyFieldsOfType[TSchema, _, _empty] = null
  ): UpdateQuery[TSchema] = {
    val __obj = js.Dynamic.literal()
    if ($addToSet != null) __obj.updateDynamic("$addToSet")($addToSet.asInstanceOf[js.Any])
    if ($bit != null) __obj.updateDynamic("$bit")($bit.asInstanceOf[js.Any])
    if ($currentDate != null) __obj.updateDynamic("$currentDate")($currentDate.asInstanceOf[js.Any])
    if ($inc != null) __obj.updateDynamic("$inc")($inc.asInstanceOf[js.Any])
    if ($max != null) __obj.updateDynamic("$max")($max.asInstanceOf[js.Any])
    if ($min != null) __obj.updateDynamic("$min")($min.asInstanceOf[js.Any])
    if ($mul != null) __obj.updateDynamic("$mul")($mul.asInstanceOf[js.Any])
    if ($pop != null) __obj.updateDynamic("$pop")($pop.asInstanceOf[js.Any])
    if ($pull != null) __obj.updateDynamic("$pull")($pull.asInstanceOf[js.Any])
    if ($pullAll != null) __obj.updateDynamic("$pullAll")($pullAll.asInstanceOf[js.Any])
    if ($push != null) __obj.updateDynamic("$push")($push.asInstanceOf[js.Any])
    if ($rename != null) __obj.updateDynamic("$rename")($rename.asInstanceOf[js.Any])
    if ($set != null) __obj.updateDynamic("$set")($set.asInstanceOf[js.Any])
    if ($setOnInsert != null) __obj.updateDynamic("$setOnInsert")($setOnInsert.asInstanceOf[js.Any])
    if ($unset != null) __obj.updateDynamic("$unset")($unset.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQuery[TSchema]]
  }
}

