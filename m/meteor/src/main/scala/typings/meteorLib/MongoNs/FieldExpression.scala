package typings
package meteorLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FieldExpression[T] extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[js.Array[T]] = js.undefined
  @JSName("$bitsAllClear")
  var $bitsAllClear: js.UndefOr[js.Any] = js.undefined
  @JSName("$bitsAllSet")
  var $bitsAllSet: js.UndefOr[js.Any] = js.undefined
  @JSName("$bitsAnyClear")
  var $bitsAnyClear: js.UndefOr[js.Any] = js.undefined
  @JSName("$bitsAnySet")
  var $bitsAnySet: js.UndefOr[js.Any] = js.undefined
  @JSName("$comment")
  var $comment: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[Query[T]] = js.undefined
  @JSName("$eq")
  var $eq: js.UndefOr[T] = js.undefined
  @JSName("$exists")
  var $exists: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$expr")
  var $expr: js.UndefOr[js.Object] = js.undefined
  @JSName("$geoIntersects")
  var $geoIntersects: js.UndefOr[js.Any] = js.undefined
  @JSName("$geoWithin")
  var $geoWithin: js.UndefOr[js.Any] = js.undefined
  @JSName("$gt")
  var $gt: js.UndefOr[T] = js.undefined
  @JSName("$gte")
  var $gte: js.UndefOr[T] = js.undefined
  @JSName("$in")
  var $in: js.UndefOr[js.Array[T]] = js.undefined
  @JSName("$jsonSchema")
  var $jsonSchema: js.UndefOr[js.Any] = js.undefined
  @JSName("$lt")
  var $lt: js.UndefOr[T] = js.undefined
  @JSName("$lte")
  var $lte: js.UndefOr[T] = js.undefined
  @JSName("$mod")
  var $mod: js.UndefOr[js.Array[scala.Double]] = js.undefined
  @JSName("$ne")
  var $ne: js.UndefOr[T] = js.undefined
  @JSName("$near")
  var $near: js.UndefOr[js.Any] = js.undefined
  @JSName("$nearSphere")
  var $nearSphere: js.UndefOr[js.Any] = js.undefined
  @JSName("$nin")
  var $nin: js.UndefOr[js.Array[T]] = js.undefined
  @JSName("$not")
  var $not: js.UndefOr[js.Object] = js.undefined
  @JSName("$options")
  var $options: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$regex")
  var $regex: js.UndefOr[stdLib.RegExp | java.lang.String] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[scala.Double] = js.undefined
  @JSName("$text")
  var $text: js.UndefOr[meteorLib.Anon_Search] = js.undefined
  @JSName("$type")
  var $type: js.UndefOr[js.Array[BsonType] | BsonType] = js.undefined
  @JSName("$where")
  var $where: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

