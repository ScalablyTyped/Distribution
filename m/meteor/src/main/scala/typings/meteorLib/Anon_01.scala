package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01[T] extends js.Object {
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[
    meteorLib.mongoMod.MongoNs.ArraysOrEach[T] with meteorLib.mongoMod.MongoNs.Dictionary[_]
  ] = js.undefined
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[
    (stdLib.Partial[stdLib.Record[java.lang.String, meteorLib.mongoMod.MongoNs.CurrentDateModifier]]) with meteorLib.mongoMod.MongoNs.Dictionary[meteorLib.mongoMod.MongoNs.CurrentDateModifier]
  ] = js.undefined
  @JSName("$inc")
  var $inc: js.UndefOr[
    (meteorLib.mongoMod.MongoNs.PartialMapTo[T, scala.Double]) with meteorLib.mongoMod.MongoNs.Dictionary[scala.Double]
  ] = js.undefined
  @JSName("$max")
  var $max: js.UndefOr[
    (meteorLib.mongoMod.MongoNs.PartialMapTo[T, stdLib.Date | scala.Double]) with (meteorLib.mongoMod.MongoNs.Dictionary[stdLib.Date | scala.Double])
  ] = js.undefined
  @JSName("$min")
  var $min: js.UndefOr[
    (meteorLib.mongoMod.MongoNs.PartialMapTo[T, stdLib.Date | scala.Double]) with (meteorLib.mongoMod.MongoNs.Dictionary[stdLib.Date | scala.Double])
  ] = js.undefined
  @JSName("$mul")
  var $mul: js.UndefOr[
    (meteorLib.mongoMod.MongoNs.PartialMapTo[T, scala.Double]) with meteorLib.mongoMod.MongoNs.Dictionary[scala.Double]
  ] = js.undefined
  @JSName("$pop")
  var $pop: js.UndefOr[
    (meteorLib.mongoMod.MongoNs.PartialMapTo[T, meteorLib.meteorLibNumbers.`1` | meteorLib.meteorLibNumbers.`-1`]) with (meteorLib.mongoMod.MongoNs.Dictionary[meteorLib.meteorLibNumbers.`1` | meteorLib.meteorLibNumbers.`-1`])
  ] = js.undefined
  @JSName("$pull")
  var $pull: js.UndefOr[
    meteorLib.mongoMod.MongoNs.ElementsOf[T] with meteorLib.mongoMod.MongoNs.Dictionary[_]
  ] = js.undefined
  @JSName("$pullAll")
  var $pullAll: js.UndefOr[stdLib.Partial[T] with meteorLib.mongoMod.MongoNs.Dictionary[_]] = js.undefined
  @JSName("$push")
  var $push: js.UndefOr[
    meteorLib.mongoMod.MongoNs.PushModifier[T] with meteorLib.mongoMod.MongoNs.Dictionary[_]
  ] = js.undefined
  @JSName("$rename")
  var $rename: js.UndefOr[
    (meteorLib.mongoMod.MongoNs.PartialMapTo[T, java.lang.String]) with meteorLib.mongoMod.MongoNs.Dictionary[java.lang.String]
  ] = js.undefined
  @JSName("$set")
  var $set: js.UndefOr[stdLib.Partial[T] with meteorLib.mongoMod.MongoNs.Dictionary[_]] = js.undefined
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[stdLib.Partial[T] with meteorLib.mongoMod.MongoNs.Dictionary[_]] = js.undefined
  @JSName("$unset")
  var $unset: js.UndefOr[
    (meteorLib.mongoMod.MongoNs.PartialMapTo[T, scala.Boolean | meteorLib.meteorLibNumbers.`1` | meteorLib.meteorLibNumbers.`0`]) with meteorLib.mongoMod.MongoNs.Dictionary[_]
  ] = js.undefined
}

object Anon_01 {
  @scala.inline
  def apply[T](
    $addToSet: meteorLib.mongoMod.MongoNs.ArraysOrEach[T] with meteorLib.mongoMod.MongoNs.Dictionary[_] = null,
    $currentDate: (stdLib.Partial[stdLib.Record[java.lang.String, meteorLib.mongoMod.MongoNs.CurrentDateModifier]]) with meteorLib.mongoMod.MongoNs.Dictionary[meteorLib.mongoMod.MongoNs.CurrentDateModifier] = null,
    $inc: (meteorLib.mongoMod.MongoNs.PartialMapTo[T, scala.Double]) with meteorLib.mongoMod.MongoNs.Dictionary[scala.Double] = null,
    $max: (meteorLib.mongoMod.MongoNs.PartialMapTo[T, stdLib.Date | scala.Double]) with (meteorLib.mongoMod.MongoNs.Dictionary[stdLib.Date | scala.Double]) = null,
    $min: (meteorLib.mongoMod.MongoNs.PartialMapTo[T, stdLib.Date | scala.Double]) with (meteorLib.mongoMod.MongoNs.Dictionary[stdLib.Date | scala.Double]) = null,
    $mul: (meteorLib.mongoMod.MongoNs.PartialMapTo[T, scala.Double]) with meteorLib.mongoMod.MongoNs.Dictionary[scala.Double] = null,
    $pop: (meteorLib.mongoMod.MongoNs.PartialMapTo[T, meteorLib.meteorLibNumbers.`1` | meteorLib.meteorLibNumbers.`-1`]) with (meteorLib.mongoMod.MongoNs.Dictionary[meteorLib.meteorLibNumbers.`1` | meteorLib.meteorLibNumbers.`-1`]) = null,
    $pull: meteorLib.mongoMod.MongoNs.ElementsOf[T] with meteorLib.mongoMod.MongoNs.Dictionary[_] = null,
    $pullAll: stdLib.Partial[T] with meteorLib.mongoMod.MongoNs.Dictionary[_] = null,
    $push: meteorLib.mongoMod.MongoNs.PushModifier[T] with meteorLib.mongoMod.MongoNs.Dictionary[_] = null,
    $rename: (meteorLib.mongoMod.MongoNs.PartialMapTo[T, java.lang.String]) with meteorLib.mongoMod.MongoNs.Dictionary[java.lang.String] = null,
    $set: stdLib.Partial[T] with meteorLib.mongoMod.MongoNs.Dictionary[_] = null,
    $setOnInsert: stdLib.Partial[T] with meteorLib.mongoMod.MongoNs.Dictionary[_] = null,
    $unset: (meteorLib.mongoMod.MongoNs.PartialMapTo[T, scala.Boolean | meteorLib.meteorLibNumbers.`1` | meteorLib.meteorLibNumbers.`0`]) with meteorLib.mongoMod.MongoNs.Dictionary[_] = null
  ): Anon_01[T] = {
    val __obj = js.Dynamic.literal()
    if ($addToSet != null) __obj.updateDynamic("$addToSet")($addToSet)
    if ($currentDate != null) __obj.updateDynamic("$currentDate")($currentDate)
    if ($inc != null) __obj.updateDynamic("$inc")($inc)
    if ($max != null) __obj.updateDynamic("$max")($max)
    if ($min != null) __obj.updateDynamic("$min")($min)
    if ($mul != null) __obj.updateDynamic("$mul")($mul)
    if ($pop != null) __obj.updateDynamic("$pop")($pop)
    if ($pull != null) __obj.updateDynamic("$pull")($pull)
    if ($pullAll != null) __obj.updateDynamic("$pullAll")($pullAll)
    if ($push != null) __obj.updateDynamic("$push")($push)
    if ($rename != null) __obj.updateDynamic("$rename")($rename)
    if ($set != null) __obj.updateDynamic("$set")($set)
    if ($setOnInsert != null) __obj.updateDynamic("$setOnInsert")($setOnInsert)
    if ($unset != null) __obj.updateDynamic("$unset")($unset)
    __obj.asInstanceOf[Anon_01[T]]
  }
}

