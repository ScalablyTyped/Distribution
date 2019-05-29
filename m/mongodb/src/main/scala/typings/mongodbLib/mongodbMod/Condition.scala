package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition[T, P /* <: java.lang.String */]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  @JSName("$and")
  var $and: js.UndefOr[
    js.Array[
      (FilterQuery[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any]) | (/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any)
    ]
  ] = js.undefined
  @JSName("$bitsAllClear")
  var $bitsAllClear: js.UndefOr[js.Object] = js.undefined
  @JSName("$bitsAllSet")
  var $bitsAllSet: js.UndefOr[js.Object] = js.undefined
  @JSName("$bitsAnyClear")
  var $bitsAnyClear: js.UndefOr[js.Object] = js.undefined
  @JSName("$bitsAnySet")
  var $bitsAnySet: js.UndefOr[js.Object] = js.undefined
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[js.Object] = js.undefined
  @JSName("$eq")
  var $eq: js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any] = js.undefined
  @JSName("$expr")
  var $expr: js.UndefOr[js.Any] = js.undefined
  @JSName("$geoIntersects")
  var $geoIntersects: js.UndefOr[js.Object] = js.undefined
  @JSName("$geoWithin")
  var $geoWithin: js.UndefOr[js.Object] = js.undefined
  @JSName("$gt")
  var $gt: js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any] = js.undefined
  @JSName("$gte")
  var $gte: js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any] = js.undefined
  @JSName("$in")
  var $in: js.UndefOr[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any]
  ] = js.undefined
  @JSName("$jsonSchema")
  var $jsonSchema: js.UndefOr[js.Any] = js.undefined
  @JSName("$lt")
  var $lt: js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any] = js.undefined
  @JSName("$lte")
  var $lte: js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any] = js.undefined
  @JSName("$mod")
  var $mod: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  @JSName("$ne")
  var $ne: js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any] = js.undefined
  @JSName("$near")
  var $near: js.UndefOr[js.Object] = js.undefined
  @JSName("$nearSphere")
  var $nearSphere: js.UndefOr[js.Object] = js.undefined
  @JSName("$nin")
  var $nin: js.UndefOr[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any]
  ] = js.undefined
  @JSName("$not")
  var $not: js.UndefOr[
    (js.Array[
      (FilterQuery[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any]) | (/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any)
    ]) | (/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any)
  ] = js.undefined
  @JSName("$options")
  var $options: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$or")
  var $or: js.UndefOr[
    js.Array[
      (FilterQuery[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any]) | (/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any)
    ]
  ] = js.undefined
  @JSName("$regex")
  var $regex: js.UndefOr[stdLib.RegExp] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[scala.Double] = js.undefined
  @JSName("$text")
  var $text: js.UndefOr[mongodbLib.Anon_CaseSensitive] = js.undefined
  @JSName("$where")
  var $where: js.UndefOr[js.Object] = js.undefined
}

object Condition {
  @scala.inline
  def apply[T, P /* <: java.lang.String */](
    $and: js.Array[
      (FilterQuery[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any]) | (/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any)
    ] = null,
    $bitsAllClear: js.Object = null,
    $bitsAllSet: js.Object = null,
    $bitsAnyClear: js.Object = null,
    $bitsAnySet: js.Object = null,
    $elemMatch: js.Object = null,
    $eq: /* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any = null,
    $expr: js.Any = null,
    $geoIntersects: js.Object = null,
    $geoWithin: js.Object = null,
    $gt: /* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any = null,
    $gte: /* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any = null,
    $in: js.Array[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any] = null,
    $jsonSchema: js.Any = null,
    $lt: /* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any = null,
    $lte: /* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any = null,
    $mod: js.Tuple2[scala.Double, scala.Double] = null,
    $ne: /* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any = null,
    $near: js.Object = null,
    $nearSphere: js.Object = null,
    $nin: js.Array[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any] = null,
    $not: (js.Array[
      (FilterQuery[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any]) | (/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any)
    ]) | (/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any) = null,
    $options: java.lang.String = null,
    $or: js.Array[
      (FilterQuery[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any]) | (/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any)
    ] = null,
    $regex: stdLib.RegExp = null,
    $size: scala.Int | scala.Double = null,
    $text: mongodbLib.Anon_CaseSensitive = null,
    $where: js.Object = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Condition[T, P] = {
    val __obj = js.Dynamic.literal()
    if ($and != null) __obj.updateDynamic("$and")($and)
    if ($bitsAllClear != null) __obj.updateDynamic("$bitsAllClear")($bitsAllClear)
    if ($bitsAllSet != null) __obj.updateDynamic("$bitsAllSet")($bitsAllSet)
    if ($bitsAnyClear != null) __obj.updateDynamic("$bitsAnyClear")($bitsAnyClear)
    if ($bitsAnySet != null) __obj.updateDynamic("$bitsAnySet")($bitsAnySet)
    if ($elemMatch != null) __obj.updateDynamic("$elemMatch")($elemMatch)
    if ($eq != null) __obj.updateDynamic("$eq")($eq)
    if ($expr != null) __obj.updateDynamic("$expr")($expr)
    if ($geoIntersects != null) __obj.updateDynamic("$geoIntersects")($geoIntersects)
    if ($geoWithin != null) __obj.updateDynamic("$geoWithin")($geoWithin)
    if ($gt != null) __obj.updateDynamic("$gt")($gt)
    if ($gte != null) __obj.updateDynamic("$gte")($gte)
    if ($in != null) __obj.updateDynamic("$in")($in)
    if ($jsonSchema != null) __obj.updateDynamic("$jsonSchema")($jsonSchema)
    if ($lt != null) __obj.updateDynamic("$lt")($lt)
    if ($lte != null) __obj.updateDynamic("$lte")($lte)
    if ($mod != null) __obj.updateDynamic("$mod")($mod)
    if ($ne != null) __obj.updateDynamic("$ne")($ne)
    if ($near != null) __obj.updateDynamic("$near")($near)
    if ($nearSphere != null) __obj.updateDynamic("$nearSphere")($nearSphere)
    if ($nin != null) __obj.updateDynamic("$nin")($nin)
    if ($not != null) __obj.updateDynamic("$not")($not.asInstanceOf[js.Any])
    if ($options != null) __obj.updateDynamic("$options")($options)
    if ($or != null) __obj.updateDynamic("$or")($or)
    if ($regex != null) __obj.updateDynamic("$regex")($regex)
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    if ($text != null) __obj.updateDynamic("$text")($text)
    if ($where != null) __obj.updateDynamic("$where")($where)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Condition[T, P]]
  }
}

