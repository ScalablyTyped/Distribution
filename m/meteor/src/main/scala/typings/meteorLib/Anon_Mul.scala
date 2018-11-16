package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Mul[T] extends js.Object {
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[meteorLib.MongoNs.ArraysOrEach[T] with meteorLib.MongoNs.Dictionary[_]] = js.undefined
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[
    (stdLib.Partial[stdLib.Record[java.lang.String, meteorLib.MongoNs.CurrentDateModifier]]) with meteorLib.MongoNs.Dictionary[meteorLib.MongoNs.CurrentDateModifier]
  ] = js.undefined
  @JSName("$inc")
  var $inc: js.UndefOr[
    (meteorLib.MongoNs.PartialMapTo[T, scala.Double]) with meteorLib.MongoNs.Dictionary[scala.Double]
  ] = js.undefined
  @JSName("$max")
  var $max: js.UndefOr[
    (meteorLib.MongoNs.PartialMapTo[T, stdLib.Date | scala.Double]) with (meteorLib.MongoNs.Dictionary[stdLib.Date | scala.Double])
  ] = js.undefined
  @JSName("$min")
  var $min: js.UndefOr[
    (meteorLib.MongoNs.PartialMapTo[T, stdLib.Date | scala.Double]) with (meteorLib.MongoNs.Dictionary[stdLib.Date | scala.Double])
  ] = js.undefined
  @JSName("$mul")
  var $mul: js.UndefOr[
    (meteorLib.MongoNs.PartialMapTo[T, scala.Double]) with meteorLib.MongoNs.Dictionary[scala.Double]
  ] = js.undefined
  @JSName("$pop")
  var $pop: js.UndefOr[
    (meteorLib.MongoNs.PartialMapTo[T, meteorLib.meteorLibNumbers.`1` | meteorLib.meteorLibNumbers.`-1`]) with (meteorLib.MongoNs.Dictionary[meteorLib.meteorLibNumbers.`1` | meteorLib.meteorLibNumbers.`-1`])
  ] = js.undefined
  @JSName("$pull")
  var $pull: js.UndefOr[meteorLib.MongoNs.ElementsOf[T] with meteorLib.MongoNs.Dictionary[_]] = js.undefined
  @JSName("$pullAll")
  var $pullAll: js.UndefOr[stdLib.Partial[T] with meteorLib.MongoNs.Dictionary[_]] = js.undefined
  @JSName("$push")
  var $push: js.UndefOr[meteorLib.MongoNs.PushModifier[T] with meteorLib.MongoNs.Dictionary[_]] = js.undefined
  @JSName("$rename")
  var $rename: js.UndefOr[
    (meteorLib.MongoNs.PartialMapTo[T, java.lang.String]) with meteorLib.MongoNs.Dictionary[java.lang.String]
  ] = js.undefined
  @JSName("$set")
  var $set: js.UndefOr[stdLib.Partial[T] with meteorLib.MongoNs.Dictionary[_]] = js.undefined
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[stdLib.Partial[T] with meteorLib.MongoNs.Dictionary[_]] = js.undefined
  @JSName("$unset")
  var $unset: js.UndefOr[
    (meteorLib.MongoNs.PartialMapTo[T, scala.Boolean | meteorLib.meteorLibNumbers.`1` | meteorLib.meteorLibNumbers.`0`]) with meteorLib.MongoNs.Dictionary[_]
  ] = js.undefined
}

