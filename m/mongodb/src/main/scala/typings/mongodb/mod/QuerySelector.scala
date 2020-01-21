package typings.mongodb.mod

import typings.mongodb.AnonGeometry
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuerySelector[T] extends js.Object {
  // Array
  // TODO: define better types for $all and $elemMatch
  @JSName("$all")
  var $all: js.UndefOr[js.Array[_]] = js.native
  // Bitwise
  @JSName("$bitsAllClear")
  var $bitsAllClear: js.UndefOr[BitwiseQuery] = js.native
  @JSName("$bitsAllSet")
  var $bitsAllSet: js.UndefOr[BitwiseQuery] = js.native
  @JSName("$bitsAnyClear")
  var $bitsAnyClear: js.UndefOr[BitwiseQuery] = js.native
  @JSName("$bitsAnySet")
  var $bitsAnySet: js.UndefOr[BitwiseQuery] = js.native
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[js.Any] = js.native
  // Comparison
  @JSName("$eq")
  var $eq: js.UndefOr[T] = js.native
  // Element
  /**
    * When `true`, `$exists` matches the documents that contain the field,
    * including documents where the field value is null.
    */
  @JSName("$exists")
  var $exists: js.UndefOr[Boolean] = js.native
  // Evaluation
  @JSName("$expr")
  var $expr: js.UndefOr[js.Any] = js.native
  // Geospatial
  // TODO: define better types for geo queries
  @JSName("$geoIntersects")
  var $geoIntersects: js.UndefOr[AnonGeometry] = js.native
  @JSName("$geoWithin")
  var $geoWithin: js.UndefOr[js.Object] = js.native
  @JSName("$gt")
  var $gt: js.UndefOr[T] = js.native
  @JSName("$gte")
  var $gte: js.UndefOr[T] = js.native
  @JSName("$in")
  var $in: js.UndefOr[js.Array[T]] = js.native
  @JSName("$jsonSchema")
  var $jsonSchema: js.UndefOr[js.Any] = js.native
  @JSName("$lt")
  var $lt: js.UndefOr[T] = js.native
  @JSName("$lte")
  var $lte: js.UndefOr[T] = js.native
  @JSName("$maxDistance")
  var $maxDistance: js.UndefOr[scala.Double] = js.native
  @JSName("$mod")
  var $mod: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.native
  @JSName("$ne")
  var $ne: js.UndefOr[T] = js.native
  @JSName("$near")
  var $near: js.UndefOr[js.Object] = js.native
  @JSName("$nearSphere")
  var $nearSphere: js.UndefOr[js.Object] = js.native
  @JSName("$nin")
  var $nin: js.UndefOr[js.Array[T]] = js.native
  // Logical
  @JSName("$not")
  var $not: js.UndefOr[QuerySelector[T] | RegExp] = js.native
  @JSName("$options")
  var $options: js.UndefOr[String] = js.native
  @JSName("$regex")
  var $regex: js.UndefOr[RegExp | String] = js.native
  @JSName("$size")
  var $size: js.UndefOr[scala.Double] = js.native
  @JSName("$type")
  var $type: js.UndefOr[BSONType | BSONTypeAlias] = js.native
}

