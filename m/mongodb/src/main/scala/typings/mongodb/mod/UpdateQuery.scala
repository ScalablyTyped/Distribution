package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.AnonType
import typings.mongodb.mongodbBooleans.`true`
import typings.mongodb.mongodbNumbers.`-1`
import typings.mongodb.mongodbNumbers.`1`
import typings.mongodb.mongodbStrings._empty
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateQuery[TSchema] extends js.Object {
  /** https://docs.mongodb.com/manual/reference/operator/update-array/ */
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[SetFields[TSchema]] = js.native
  /** https://docs.mongodb.com/manual/reference/operator/update-bitwise/ */
  @JSName("$bit")
  var $bit: js.UndefOr[StringDictionary[typings.mongodb.mongodbStrings.UpdateQuery with js.Any]] = js.native
  /** https://docs.mongodb.com/manual/reference/operator/update-field/ */
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[OnlyFieldsOfType[TSchema, Date, `true` | AnonType]] = js.native
  @JSName("$inc")
  var $inc: js.UndefOr[OnlyFieldsOfType[TSchema, js.UndefOr[scala.Double], js.UndefOr[scala.Double]]] = js.native
  @JSName("$max")
  var $max: js.UndefOr[MatchKeysAndValues[TSchema]] = js.native
  @JSName("$min")
  var $min: js.UndefOr[MatchKeysAndValues[TSchema]] = js.native
  @JSName("$mul")
  var $mul: js.UndefOr[OnlyFieldsOfType[TSchema, js.UndefOr[scala.Double], js.UndefOr[scala.Double]]] = js.native
  @JSName("$pop")
  var $pop: js.UndefOr[OnlyFieldsOfType[TSchema, js.Array[_], `1` | `-1`]] = js.native
  @JSName("$pull")
  var $pull: js.UndefOr[PullOperator[TSchema]] = js.native
  @JSName("$pullAll")
  var $pullAll: js.UndefOr[PullAllOperator[TSchema]] = js.native
  @JSName("$push")
  var $push: js.UndefOr[PushOperator[TSchema]] = js.native
  @JSName("$rename")
  var $rename: js.UndefOr[StringDictionary[String]] = js.native
  @JSName("$set")
  var $set: js.UndefOr[MatchKeysAndValues[TSchema]] = js.native
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[MatchKeysAndValues[TSchema]] = js.native
  @JSName("$unset")
  var $unset: js.UndefOr[OnlyFieldsOfType[TSchema, _, _empty]] = js.native
}

