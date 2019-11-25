package typings.meteor.Mongo

import typings.meteor.Anon_CaseSensitive
import typings.std.RegExp
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
  var $comment: js.UndefOr[String] = js.undefined
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[FieldExpression[T] | Query[T]] = js.undefined
  @JSName("$eq")
  var $eq: js.UndefOr[T] = js.undefined
  @JSName("$exists")
  var $exists: js.UndefOr[Boolean] = js.undefined
  @JSName("$expr")
  var $expr: js.UndefOr[FieldExpression[T]] = js.undefined
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
  var $mod: js.UndefOr[js.Array[Double]] = js.undefined
  @JSName("$ne")
  var $ne: js.UndefOr[T] = js.undefined
  @JSName("$near")
  var $near: js.UndefOr[js.Any] = js.undefined
  @JSName("$nearSphere")
  var $nearSphere: js.UndefOr[js.Any] = js.undefined
  @JSName("$nin")
  var $nin: js.UndefOr[js.Array[T]] = js.undefined
  @JSName("$not")
  var $not: js.UndefOr[FieldExpression[T]] = js.undefined
  @JSName("$options")
  var $options: js.UndefOr[String] = js.undefined
  @JSName("$regex")
  var $regex: js.UndefOr[RegExp | String] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[Double] = js.undefined
  @JSName("$text")
  var $text: js.UndefOr[Anon_CaseSensitive] = js.undefined
  @JSName("$type")
  var $type: js.UndefOr[js.Array[BsonType] | BsonType] = js.undefined
  @JSName("$where")
  var $where: js.UndefOr[String | js.Function] = js.undefined
}

object FieldExpression {
  @scala.inline
  def apply[T](
    $all: js.Array[T] = null,
    $bitsAllClear: js.Any = null,
    $bitsAllSet: js.Any = null,
    $bitsAnyClear: js.Any = null,
    $bitsAnySet: js.Any = null,
    $comment: String = null,
    $elemMatch: FieldExpression[T] | Query[T] = null,
    $eq: T = null,
    $exists: js.UndefOr[Boolean] = js.undefined,
    $expr: FieldExpression[T] = null,
    $geoIntersects: js.Any = null,
    $geoWithin: js.Any = null,
    $gt: T = null,
    $gte: T = null,
    $in: js.Array[T] = null,
    $jsonSchema: js.Any = null,
    $lt: T = null,
    $lte: T = null,
    $mod: js.Array[Double] = null,
    $ne: T = null,
    $near: js.Any = null,
    $nearSphere: js.Any = null,
    $nin: js.Array[T] = null,
    $not: FieldExpression[T] = null,
    $options: String = null,
    $regex: RegExp | String = null,
    $size: Int | Double = null,
    $text: Anon_CaseSensitive = null,
    $type: js.Array[BsonType] | BsonType = null,
    $where: String | js.Function = null
  ): FieldExpression[T] = {
    val __obj = js.Dynamic.literal()
    if ($all != null) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if ($bitsAllClear != null) __obj.updateDynamic("$bitsAllClear")($bitsAllClear.asInstanceOf[js.Any])
    if ($bitsAllSet != null) __obj.updateDynamic("$bitsAllSet")($bitsAllSet.asInstanceOf[js.Any])
    if ($bitsAnyClear != null) __obj.updateDynamic("$bitsAnyClear")($bitsAnyClear.asInstanceOf[js.Any])
    if ($bitsAnySet != null) __obj.updateDynamic("$bitsAnySet")($bitsAnySet.asInstanceOf[js.Any])
    if ($comment != null) __obj.updateDynamic("$comment")($comment.asInstanceOf[js.Any])
    if ($elemMatch != null) __obj.updateDynamic("$elemMatch")($elemMatch.asInstanceOf[js.Any])
    if ($eq != null) __obj.updateDynamic("$eq")($eq.asInstanceOf[js.Any])
    if (!js.isUndefined($exists)) __obj.updateDynamic("$exists")($exists.asInstanceOf[js.Any])
    if ($expr != null) __obj.updateDynamic("$expr")($expr.asInstanceOf[js.Any])
    if ($geoIntersects != null) __obj.updateDynamic("$geoIntersects")($geoIntersects.asInstanceOf[js.Any])
    if ($geoWithin != null) __obj.updateDynamic("$geoWithin")($geoWithin.asInstanceOf[js.Any])
    if ($gt != null) __obj.updateDynamic("$gt")($gt.asInstanceOf[js.Any])
    if ($gte != null) __obj.updateDynamic("$gte")($gte.asInstanceOf[js.Any])
    if ($in != null) __obj.updateDynamic("$in")($in.asInstanceOf[js.Any])
    if ($jsonSchema != null) __obj.updateDynamic("$jsonSchema")($jsonSchema.asInstanceOf[js.Any])
    if ($lt != null) __obj.updateDynamic("$lt")($lt.asInstanceOf[js.Any])
    if ($lte != null) __obj.updateDynamic("$lte")($lte.asInstanceOf[js.Any])
    if ($mod != null) __obj.updateDynamic("$mod")($mod.asInstanceOf[js.Any])
    if ($ne != null) __obj.updateDynamic("$ne")($ne.asInstanceOf[js.Any])
    if ($near != null) __obj.updateDynamic("$near")($near.asInstanceOf[js.Any])
    if ($nearSphere != null) __obj.updateDynamic("$nearSphere")($nearSphere.asInstanceOf[js.Any])
    if ($nin != null) __obj.updateDynamic("$nin")($nin.asInstanceOf[js.Any])
    if ($not != null) __obj.updateDynamic("$not")($not.asInstanceOf[js.Any])
    if ($options != null) __obj.updateDynamic("$options")($options.asInstanceOf[js.Any])
    if ($regex != null) __obj.updateDynamic("$regex")($regex.asInstanceOf[js.Any])
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    if ($text != null) __obj.updateDynamic("$text")($text.asInstanceOf[js.Any])
    if ($type != null) __obj.updateDynamic("$type")($type.asInstanceOf[js.Any])
    if ($where != null) __obj.updateDynamic("$where")($where.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldExpression[T]]
  }
}

