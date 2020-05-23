package typings.meteor.anon

import typings.meteor.Mongo.ArraysOrEach
import typings.meteor.Mongo.CurrentDateModifier
import typings.meteor.Mongo.Dictionary
import typings.meteor.Mongo.ElementsOf
import typings.meteor.Mongo.PartialMapTo
import typings.meteor.Mongo.PushModifier
import typings.meteor.meteorNumbers.`-1`
import typings.meteor.meteorNumbers.`0`
import typings.meteor.meteorNumbers.`1`
import typings.std.Date
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentDate[T] extends js.Object {
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[ArraysOrEach[T] with Dictionary[_]] = js.undefined
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[
    (Partial[Record[/* keyof T */ String, CurrentDateModifier]]) with Dictionary[CurrentDateModifier]
  ] = js.undefined
  @JSName("$inc")
  var $inc: js.UndefOr[(PartialMapTo[T, Double]) with Dictionary[Double]] = js.undefined
  @JSName("$max")
  var $max: js.UndefOr[(PartialMapTo[T, Date | Double]) with (Dictionary[Date | Double])] = js.undefined
  @JSName("$min")
  var $min: js.UndefOr[(PartialMapTo[T, Date | Double]) with (Dictionary[Date | Double])] = js.undefined
  @JSName("$mul")
  var $mul: js.UndefOr[(PartialMapTo[T, Double]) with Dictionary[Double]] = js.undefined
  @JSName("$pop")
  var $pop: js.UndefOr[(PartialMapTo[T, `1` | `-1`]) with (Dictionary[`1` | `-1`])] = js.undefined
  @JSName("$pull")
  var $pull: js.UndefOr[ElementsOf[T] with Dictionary[_]] = js.undefined
  @JSName("$pullAll")
  var $pullAll: js.UndefOr[Partial[T] with Dictionary[_]] = js.undefined
  @JSName("$push")
  var $push: js.UndefOr[PushModifier[T] with Dictionary[_]] = js.undefined
  @JSName("$rename")
  var $rename: js.UndefOr[(PartialMapTo[T, String]) with Dictionary[String]] = js.undefined
  @JSName("$set")
  var $set: js.UndefOr[Partial[T] with Dictionary[_]] = js.undefined
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[Partial[T] with Dictionary[_]] = js.undefined
  @JSName("$unset")
  var $unset: js.UndefOr[(PartialMapTo[T, String | Boolean | `1` | `0`]) with Dictionary[_]] = js.undefined
}

object CurrentDate {
  @scala.inline
  def apply[T](
    $addToSet: ArraysOrEach[T] with Dictionary[_] = null,
    $currentDate: (Partial[Record[/* keyof T */ String, CurrentDateModifier]]) with Dictionary[CurrentDateModifier] = null,
    $inc: (PartialMapTo[T, Double]) with Dictionary[Double] = null,
    $max: (PartialMapTo[T, Date | Double]) with (Dictionary[Date | Double]) = null,
    $min: (PartialMapTo[T, Date | Double]) with (Dictionary[Date | Double]) = null,
    $mul: (PartialMapTo[T, Double]) with Dictionary[Double] = null,
    $pop: (PartialMapTo[T, `1` | `-1`]) with (Dictionary[`1` | `-1`]) = null,
    $pull: ElementsOf[T] with Dictionary[_] = null,
    $pullAll: Partial[T] with Dictionary[_] = null,
    $push: PushModifier[T] with Dictionary[_] = null,
    $rename: (PartialMapTo[T, String]) with Dictionary[String] = null,
    $set: Partial[T] with Dictionary[_] = null,
    $setOnInsert: Partial[T] with Dictionary[_] = null,
    $unset: (PartialMapTo[T, String | Boolean | `1` | `0`]) with Dictionary[_] = null
  ): CurrentDate[T] = {
    val __obj = js.Dynamic.literal()
    if ($addToSet != null) __obj.updateDynamic("$addToSet")($addToSet.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[CurrentDate[T]]
  }
}

