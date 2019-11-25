package typings.mongodb.mongodbMod

import typings.mongodb.Anon_Geometry
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuerySelector[T] extends js.Object {
  // Array
  // TODO: define better types for $all and $elemMatch
  @JSName("$all")
  var $all: js.UndefOr[js.Array[_]] = js.undefined
  // Bitwise
  @JSName("$bitsAllClear")
  var $bitsAllClear: js.UndefOr[BitwiseQuery] = js.undefined
  @JSName("$bitsAllSet")
  var $bitsAllSet: js.UndefOr[BitwiseQuery] = js.undefined
  @JSName("$bitsAnyClear")
  var $bitsAnyClear: js.UndefOr[BitwiseQuery] = js.undefined
  @JSName("$bitsAnySet")
  var $bitsAnySet: js.UndefOr[BitwiseQuery] = js.undefined
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[js.Any] = js.undefined
  // Comparison
  @JSName("$eq")
  var $eq: js.UndefOr[T] = js.undefined
  // Element
  /**
    * When `true`, `$exists` matches the documents that contain the field,
    * including documents where the field value is null.
    */
  @JSName("$exists")
  var $exists: js.UndefOr[Boolean] = js.undefined
  // Evaluation
  @JSName("$expr")
  var $expr: js.UndefOr[js.Any] = js.undefined
  // Geospatial
  // TODO: define better types for geo queries
  @JSName("$geoIntersects")
  var $geoIntersects: js.UndefOr[Anon_Geometry] = js.undefined
  @JSName("$geoWithin")
  var $geoWithin: js.UndefOr[js.Object] = js.undefined
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
  @JSName("$maxDistance")
  var $maxDistance: js.UndefOr[scala.Double] = js.undefined
  @JSName("$mod")
  var $mod: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  @JSName("$ne")
  var $ne: js.UndefOr[T] = js.undefined
  @JSName("$near")
  var $near: js.UndefOr[js.Object] = js.undefined
  @JSName("$nearSphere")
  var $nearSphere: js.UndefOr[js.Object] = js.undefined
  @JSName("$nin")
  var $nin: js.UndefOr[js.Array[T]] = js.undefined
  // Logical
  @JSName("$not")
  var $not: js.UndefOr[QuerySelector[T] | RegExp] = js.undefined
  @JSName("$options")
  var $options: js.UndefOr[String] = js.undefined
  @JSName("$regex")
  var $regex: js.UndefOr[RegExp | String] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[scala.Double] = js.undefined
  @JSName("$type")
  var $type: js.UndefOr[BSONType | BSONTypeAlias] = js.undefined
}

object QuerySelector {
  @scala.inline
  def apply[T](
    $all: js.Array[_] = null,
    $bitsAllClear: BitwiseQuery = null,
    $bitsAllSet: BitwiseQuery = null,
    $bitsAnyClear: BitwiseQuery = null,
    $bitsAnySet: BitwiseQuery = null,
    $elemMatch: js.Any = null,
    $eq: T = null,
    $exists: js.UndefOr[Boolean] = js.undefined,
    $expr: js.Any = null,
    $geoIntersects: Anon_Geometry = null,
    $geoWithin: js.Object = null,
    $gt: T = null,
    $gte: T = null,
    $in: js.Array[T] = null,
    $jsonSchema: js.Any = null,
    $lt: T = null,
    $lte: T = null,
    $maxDistance: Int | scala.Double = null,
    $mod: js.Tuple2[scala.Double, scala.Double] = null,
    $ne: T = null,
    $near: js.Object = null,
    $nearSphere: js.Object = null,
    $nin: js.Array[T] = null,
    $not: QuerySelector[T] | RegExp = null,
    $options: String = null,
    $regex: RegExp | String = null,
    $size: Int | scala.Double = null,
    $type: BSONType | BSONTypeAlias = null
  ): QuerySelector[T] = {
    val __obj = js.Dynamic.literal()
    if ($all != null) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if ($bitsAllClear != null) __obj.updateDynamic("$bitsAllClear")($bitsAllClear.asInstanceOf[js.Any])
    if ($bitsAllSet != null) __obj.updateDynamic("$bitsAllSet")($bitsAllSet.asInstanceOf[js.Any])
    if ($bitsAnyClear != null) __obj.updateDynamic("$bitsAnyClear")($bitsAnyClear.asInstanceOf[js.Any])
    if ($bitsAnySet != null) __obj.updateDynamic("$bitsAnySet")($bitsAnySet.asInstanceOf[js.Any])
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
    if ($maxDistance != null) __obj.updateDynamic("$maxDistance")($maxDistance.asInstanceOf[js.Any])
    if ($mod != null) __obj.updateDynamic("$mod")($mod.asInstanceOf[js.Any])
    if ($ne != null) __obj.updateDynamic("$ne")($ne.asInstanceOf[js.Any])
    if ($near != null) __obj.updateDynamic("$near")($near.asInstanceOf[js.Any])
    if ($nearSphere != null) __obj.updateDynamic("$nearSphere")($nearSphere.asInstanceOf[js.Any])
    if ($nin != null) __obj.updateDynamic("$nin")($nin.asInstanceOf[js.Any])
    if ($not != null) __obj.updateDynamic("$not")($not.asInstanceOf[js.Any])
    if ($options != null) __obj.updateDynamic("$options")($options.asInstanceOf[js.Any])
    if ($regex != null) __obj.updateDynamic("$regex")($regex.asInstanceOf[js.Any])
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    if ($type != null) __obj.updateDynamic("$type")($type.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySelector[T]]
  }
}

