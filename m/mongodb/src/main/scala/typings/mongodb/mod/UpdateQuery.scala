package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.mongodb.anon.Type
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
  var $bit: js.UndefOr[
    StringDictionary[typings.mongodb.mongodbStrings.UpdateQuery with TopLevel[js.Any]]
  ] = js.native
  /** https://docs.mongodb.com/manual/reference/operator/update-field/ */
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[OnlyFieldsOfType[TSchema, Date, `true` | Type]] = js.native
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
  var $unset: js.UndefOr[OnlyFieldsOfType[TSchema, _, _empty | `1` | `true`]] = js.native
}

object UpdateQuery {
  @scala.inline
  def apply[TSchema](): UpdateQuery[TSchema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateQuery[TSchema]]
  }
  @scala.inline
  implicit class UpdateQueryOps[Self <: UpdateQuery[_], TSchema] (val x: Self with UpdateQuery[TSchema]) extends AnyVal {
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
    def set$addToSet(value: SetFields[TSchema]): Self = this.set("$addToSet", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$addToSet: Self = this.set("$addToSet", js.undefined)
    @scala.inline
    def set$bit(value: StringDictionary[typings.mongodb.mongodbStrings.UpdateQuery with TopLevel[js.Any]]): Self = this.set("$bit", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$bit: Self = this.set("$bit", js.undefined)
    @scala.inline
    def set$currentDate(value: OnlyFieldsOfType[TSchema, Date, `true` | Type]): Self = this.set("$currentDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$currentDate: Self = this.set("$currentDate", js.undefined)
    @scala.inline
    def set$inc(value: OnlyFieldsOfType[TSchema, js.UndefOr[scala.Double], js.UndefOr[scala.Double]]): Self = this.set("$inc", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$inc: Self = this.set("$inc", js.undefined)
    @scala.inline
    def set$max(value: MatchKeysAndValues[TSchema]): Self = this.set("$max", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$max: Self = this.set("$max", js.undefined)
    @scala.inline
    def set$min(value: MatchKeysAndValues[TSchema]): Self = this.set("$min", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$min: Self = this.set("$min", js.undefined)
    @scala.inline
    def set$mul(value: OnlyFieldsOfType[TSchema, js.UndefOr[scala.Double], js.UndefOr[scala.Double]]): Self = this.set("$mul", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$mul: Self = this.set("$mul", js.undefined)
    @scala.inline
    def set$pop(value: OnlyFieldsOfType[TSchema, js.Array[_], `1` | `-1`]): Self = this.set("$pop", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$pop: Self = this.set("$pop", js.undefined)
    @scala.inline
    def set$pull(value: PullOperator[TSchema]): Self = this.set("$pull", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$pull: Self = this.set("$pull", js.undefined)
    @scala.inline
    def set$pullAll(value: PullAllOperator[TSchema]): Self = this.set("$pullAll", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$pullAll: Self = this.set("$pullAll", js.undefined)
    @scala.inline
    def set$push(value: PushOperator[TSchema]): Self = this.set("$push", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$push: Self = this.set("$push", js.undefined)
    @scala.inline
    def set$rename(value: StringDictionary[String]): Self = this.set("$rename", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$rename: Self = this.set("$rename", js.undefined)
    @scala.inline
    def set$set(value: MatchKeysAndValues[TSchema]): Self = this.set("$set", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$set: Self = this.set("$set", js.undefined)
    @scala.inline
    def set$setOnInsert(value: MatchKeysAndValues[TSchema]): Self = this.set("$setOnInsert", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$setOnInsert: Self = this.set("$setOnInsert", js.undefined)
    @scala.inline
    def set$unset(value: OnlyFieldsOfType[TSchema, _, _empty | `1` | `true`]): Self = this.set("$unset", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$unset: Self = this.set("$unset", js.undefined)
  }
  
}

