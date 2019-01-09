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
  var $eq: /* import warning: ImportType.apply Failed type conversion: T[P] */ js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any] = js.undefined
  @JSName("$expr")
  var $expr: js.UndefOr[js.Any] = js.undefined
  @JSName("$geoIntersects")
  var $geoIntersects: js.UndefOr[js.Object] = js.undefined
  @JSName("$geoWithin")
  var $geoWithin: js.UndefOr[js.Object] = js.undefined
  @JSName("$gt")
  var $gt: /* import warning: ImportType.apply Failed type conversion: T[P] */ js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any] = js.undefined
  @JSName("$gte")
  var $gte: /* import warning: ImportType.apply Failed type conversion: T[P] */ js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any] = js.undefined
  @JSName("$in")
  var $in: js.UndefOr[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any]
  ] = js.undefined
  @JSName("$jsonSchema")
  var $jsonSchema: js.UndefOr[js.Any] = js.undefined
  @JSName("$lt")
  var $lt: /* import warning: ImportType.apply Failed type conversion: T[P] */ js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any] = js.undefined
  @JSName("$lte")
  var $lte: /* import warning: ImportType.apply Failed type conversion: T[P] */ js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any] = js.undefined
  @JSName("$mod")
  var $mod: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  @JSName("$ne")
  var $ne: /* import warning: ImportType.apply Failed type conversion: T[P] */ js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[P] */ js.Any] = js.undefined
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
  var $where: js.Object
}

