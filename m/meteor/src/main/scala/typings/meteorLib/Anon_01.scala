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

