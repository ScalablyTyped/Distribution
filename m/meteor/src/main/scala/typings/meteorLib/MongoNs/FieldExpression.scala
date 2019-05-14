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
  var $elemMatch: js.UndefOr[FieldExpression[T] | Query[T]] = js.undefined
  @JSName("$eq")
  var $eq: js.UndefOr[T] = js.undefined
  @JSName("$exists")
  var $exists: js.UndefOr[scala.Boolean] = js.undefined
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
  var $not: js.UndefOr[FieldExpression[T]] = js.undefined
  @JSName("$options")
  var $options: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$regex")
  var $regex: js.UndefOr[stdLib.RegExp | java.lang.String] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[scala.Double] = js.undefined
  @JSName("$text")
  var $text: js.UndefOr[meteorLib.Anon_CaseSensitive] = js.undefined
  @JSName("$type")
  var $type: js.UndefOr[js.Array[BsonType] | BsonType] = js.undefined
  @JSName("$where")
  var $where: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object FieldExpression {
  @scala.inline
  def apply[T](
    $all: js.Array[T] = null,
    $bitsAllClear: js.Any = null,
    $bitsAllSet: js.Any = null,
    $bitsAnyClear: js.Any = null,
    $bitsAnySet: js.Any = null,
    $comment: java.lang.String = null,
    $elemMatch: FieldExpression[T] | Query[T] = null,
    $eq: T = null,
    $exists: js.UndefOr[scala.Boolean] = js.undefined,
    $expr: FieldExpression[T] = null,
    $geoIntersects: js.Any = null,
    $geoWithin: js.Any = null,
    $gt: T = null,
    $gte: T = null,
    $in: js.Array[T] = null,
    $jsonSchema: js.Any = null,
    $lt: T = null,
    $lte: T = null,
    $mod: js.Array[scala.Double] = null,
    $ne: T = null,
    $near: js.Any = null,
    $nearSphere: js.Any = null,
    $nin: js.Array[T] = null,
    $not: FieldExpression[T] = null,
    $options: java.lang.String = null,
    $regex: stdLib.RegExp | java.lang.String = null,
    $size: scala.Int | scala.Double = null,
    $text: meteorLib.Anon_CaseSensitive = null,
    $type: js.Array[BsonType] | BsonType = null,
    $where: java.lang.String | js.Function = null
  ): FieldExpression[T] = {
    val __obj = js.Dynamic.literal()
    if ($all != null) __obj.updateDynamic("$all")($all)
    if ($bitsAllClear != null) __obj.updateDynamic("$bitsAllClear")($bitsAllClear)
    if ($bitsAllSet != null) __obj.updateDynamic("$bitsAllSet")($bitsAllSet)
    if ($bitsAnyClear != null) __obj.updateDynamic("$bitsAnyClear")($bitsAnyClear)
    if ($bitsAnySet != null) __obj.updateDynamic("$bitsAnySet")($bitsAnySet)
    if ($comment != null) __obj.updateDynamic("$comment")($comment)
    if ($elemMatch != null) __obj.updateDynamic("$elemMatch")($elemMatch.asInstanceOf[js.Any])
    if ($eq != null) __obj.updateDynamic("$eq")($eq.asInstanceOf[js.Any])
    if (!js.isUndefined($exists)) __obj.updateDynamic("$exists")($exists)
    if ($expr != null) __obj.updateDynamic("$expr")($expr)
    if ($geoIntersects != null) __obj.updateDynamic("$geoIntersects")($geoIntersects)
    if ($geoWithin != null) __obj.updateDynamic("$geoWithin")($geoWithin)
    if ($gt != null) __obj.updateDynamic("$gt")($gt.asInstanceOf[js.Any])
    if ($gte != null) __obj.updateDynamic("$gte")($gte.asInstanceOf[js.Any])
    if ($in != null) __obj.updateDynamic("$in")($in)
    if ($jsonSchema != null) __obj.updateDynamic("$jsonSchema")($jsonSchema)
    if ($lt != null) __obj.updateDynamic("$lt")($lt.asInstanceOf[js.Any])
    if ($lte != null) __obj.updateDynamic("$lte")($lte.asInstanceOf[js.Any])
    if ($mod != null) __obj.updateDynamic("$mod")($mod)
    if ($ne != null) __obj.updateDynamic("$ne")($ne.asInstanceOf[js.Any])
    if ($near != null) __obj.updateDynamic("$near")($near)
    if ($nearSphere != null) __obj.updateDynamic("$nearSphere")($nearSphere)
    if ($nin != null) __obj.updateDynamic("$nin")($nin)
    if ($not != null) __obj.updateDynamic("$not")($not)
    if ($options != null) __obj.updateDynamic("$options")($options)
    if ($regex != null) __obj.updateDynamic("$regex")($regex.asInstanceOf[js.Any])
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    if ($text != null) __obj.updateDynamic("$text")($text)
    if ($type != null) __obj.updateDynamic("$type")($type.asInstanceOf[js.Any])
    if ($where != null) __obj.updateDynamic("$where")($where.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldExpression[T]]
  }
}

