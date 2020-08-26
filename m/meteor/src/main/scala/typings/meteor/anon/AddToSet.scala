package typings.meteor.anon

import typings.meteor.meteorNumbers.`-1`
import typings.meteor.meteorNumbers.`1`
import typings.meteor.mongoMod.Mongo.ArraysOrEach
import typings.meteor.mongoMod.Mongo.CurrentDateModifier
import typings.meteor.mongoMod.Mongo.Dictionary
import typings.meteor.mongoMod.Mongo.ElementsOf
import typings.meteor.mongoMod.Mongo.PartialMapTo
import typings.meteor.mongoMod.Mongo.PushModifier
import typings.std.Date
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddToSet[T] extends js.Object {
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[ArraysOrEach[T] with Dictionary[_]] = js.native
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[
    (Partial[Record[/* keyof T */ String, CurrentDateModifier]]) with Dictionary[CurrentDateModifier]
  ] = js.native
  @JSName("$inc")
  var $inc: js.UndefOr[(PartialMapTo[T, Double]) with Dictionary[Double]] = js.native
  @JSName("$max")
  var $max: js.UndefOr[(PartialMapTo[T, Date | Double]) with (Dictionary[Date | Double])] = js.native
  @JSName("$min")
  var $min: js.UndefOr[(PartialMapTo[T, Date | Double]) with (Dictionary[Date | Double])] = js.native
  @JSName("$mul")
  var $mul: js.UndefOr[(PartialMapTo[T, Double]) with Dictionary[Double]] = js.native
  @JSName("$pop")
  var $pop: js.UndefOr[(PartialMapTo[T, `1` | `-1`]) with (Dictionary[`1` | `-1`])] = js.native
  @JSName("$pull")
  var $pull: js.UndefOr[ElementsOf[T] with Dictionary[_]] = js.native
  @JSName("$pullAll")
  var $pullAll: js.UndefOr[Partial[T] with Dictionary[_]] = js.native
  @JSName("$push")
  var $push: js.UndefOr[PushModifier[T] with Dictionary[_]] = js.native
  @JSName("$rename")
  var $rename: js.UndefOr[(PartialMapTo[T, String]) with Dictionary[String]] = js.native
  @JSName("$set")
  var $set: js.UndefOr[Partial[T] with Dictionary[_]] = js.native
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[Partial[T] with Dictionary[_]] = js.native
  @JSName("$unset")
  var $unset: js.UndefOr[
    (PartialMapTo[T, String | Boolean | `1` | typings.meteor.meteorNumbers.`0`]) with Dictionary[_]
  ] = js.native
}

object AddToSet {
  @scala.inline
  def apply[T](): AddToSet[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddToSet[T]]
  }
  @scala.inline
  implicit class AddToSetOps[Self <: AddToSet[_], T] (val x: Self with AddToSet[T]) extends AnyVal {
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
    def set$addToSet(value: ArraysOrEach[T] with Dictionary[_]): Self = this.set("$addToSet", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$addToSet: Self = this.set("$addToSet", js.undefined)
    @scala.inline
    def set$currentDate(
      value: (Partial[Record[/* keyof T */ String, CurrentDateModifier]]) with Dictionary[CurrentDateModifier]
    ): Self = this.set("$currentDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$currentDate: Self = this.set("$currentDate", js.undefined)
    @scala.inline
    def set$inc(value: (PartialMapTo[T, Double]) with Dictionary[Double]): Self = this.set("$inc", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$inc: Self = this.set("$inc", js.undefined)
    @scala.inline
    def set$max(value: (PartialMapTo[T, Date | Double]) with (Dictionary[Date | Double])): Self = this.set("$max", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$max: Self = this.set("$max", js.undefined)
    @scala.inline
    def set$min(value: (PartialMapTo[T, Date | Double]) with (Dictionary[Date | Double])): Self = this.set("$min", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$min: Self = this.set("$min", js.undefined)
    @scala.inline
    def set$mul(value: (PartialMapTo[T, Double]) with Dictionary[Double]): Self = this.set("$mul", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$mul: Self = this.set("$mul", js.undefined)
    @scala.inline
    def set$pop(value: (PartialMapTo[T, `1` | `-1`]) with (Dictionary[`1` | `-1`])): Self = this.set("$pop", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$pop: Self = this.set("$pop", js.undefined)
    @scala.inline
    def set$pull(value: ElementsOf[T] with Dictionary[_]): Self = this.set("$pull", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$pull: Self = this.set("$pull", js.undefined)
    @scala.inline
    def set$pullAll(value: Partial[T] with Dictionary[_]): Self = this.set("$pullAll", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$pullAll: Self = this.set("$pullAll", js.undefined)
    @scala.inline
    def set$push(value: PushModifier[T] with Dictionary[_]): Self = this.set("$push", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$push: Self = this.set("$push", js.undefined)
    @scala.inline
    def set$rename(value: (PartialMapTo[T, String]) with Dictionary[String]): Self = this.set("$rename", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$rename: Self = this.set("$rename", js.undefined)
    @scala.inline
    def set$set(value: Partial[T] with Dictionary[_]): Self = this.set("$set", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$set: Self = this.set("$set", js.undefined)
    @scala.inline
    def set$setOnInsert(value: Partial[T] with Dictionary[_]): Self = this.set("$setOnInsert", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$setOnInsert: Self = this.set("$setOnInsert", js.undefined)
    @scala.inline
    def set$unset(
      value: (PartialMapTo[T, String | Boolean | `1` | typings.meteor.meteorNumbers.`0`]) with Dictionary[_]
    ): Self = this.set("$unset", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$unset: Self = this.set("$unset", js.undefined)
  }
  
}

