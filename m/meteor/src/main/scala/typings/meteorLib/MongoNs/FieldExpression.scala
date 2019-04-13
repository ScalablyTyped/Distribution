package typings
package meteorLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldExpression[T] extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[js.Array[T]] = js.native
  @JSName("$bitsAllClear")
  var $bitsAllClear: js.UndefOr[js.Any] = js.native
  @JSName("$bitsAllSet")
  var $bitsAllSet: js.UndefOr[js.Any] = js.native
  @JSName("$bitsAnyClear")
  var $bitsAnyClear: js.UndefOr[js.Any] = js.native
  @JSName("$bitsAnySet")
  var $bitsAnySet: js.UndefOr[js.Any] = js.native
  @JSName("$comment")
  var $comment: js.UndefOr[java.lang.String] = js.native
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[FieldExpression[T] | Query[T]] = js.native
  @JSName("$eq")
  var $eq: js.UndefOr[T] = js.native
  @JSName("$exists")
  var $exists: js.UndefOr[scala.Boolean] = js.native
  @JSName("$expr")
  var $expr: js.UndefOr[FieldExpression[T]] = js.native
  @JSName("$geoIntersects")
  var $geoIntersects: js.UndefOr[js.Any] = js.native
  @JSName("$geoWithin")
  var $geoWithin: js.UndefOr[js.Any] = js.native
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
  @JSName("$mod")
  var $mod: js.UndefOr[js.Array[scala.Double]] = js.native
  @JSName("$ne")
  var $ne: js.UndefOr[T] = js.native
  @JSName("$near")
  var $near: js.UndefOr[js.Any] = js.native
  @JSName("$nearSphere")
  var $nearSphere: js.UndefOr[js.Any] = js.native
  @JSName("$nin")
  var $nin: js.UndefOr[js.Array[T]] = js.native
  @JSName("$not")
  var $not: js.UndefOr[FieldExpression[T]] = js.native
  @JSName("$options")
  var $options: js.UndefOr[java.lang.String] = js.native
  @JSName("$regex")
  var $regex: js.UndefOr[stdLib.RegExp | java.lang.String] = js.native
  @JSName("$size")
  var $size: js.UndefOr[scala.Double] = js.native
  @JSName("$text")
  var $text: js.UndefOr[meteorLib.Anon_CaseSensitive] = js.native
  @JSName("$type")
  var $type: js.UndefOr[js.Array[BsonType] | BsonType] = js.native
  @JSName("$where")
  var $where: js.UndefOr[java.lang.String | js.Function] = js.native
}

