package typings.mongodb.mod

import typings.mongodb.anon.Geometry
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
  var $geoIntersects: js.UndefOr[Geometry] = js.native
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

object QuerySelector {
  @scala.inline
  def apply[T](): QuerySelector[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuerySelector[T]]
  }
  @scala.inline
  implicit class QuerySelectorOps[Self <: QuerySelector[_], T] (val x: Self with QuerySelector[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$allVarargs(value: js.Any*): Self = this.set("$all", js.Array(value :_*))
    @scala.inline
    def set$all(value: js.Array[_]): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def set$bitsAllClearVarargs(value: scala.Double*): Self = this.set("$bitsAllClear", js.Array(value :_*))
    @scala.inline
    def set$bitsAllClear(value: BitwiseQuery): Self = this.set("$bitsAllClear", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$bitsAllClear: Self = this.set("$bitsAllClear", js.undefined)
    @scala.inline
    def set$bitsAllSetVarargs(value: scala.Double*): Self = this.set("$bitsAllSet", js.Array(value :_*))
    @scala.inline
    def set$bitsAllSet(value: BitwiseQuery): Self = this.set("$bitsAllSet", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$bitsAllSet: Self = this.set("$bitsAllSet", js.undefined)
    @scala.inline
    def set$bitsAnyClearVarargs(value: scala.Double*): Self = this.set("$bitsAnyClear", js.Array(value :_*))
    @scala.inline
    def set$bitsAnyClear(value: BitwiseQuery): Self = this.set("$bitsAnyClear", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$bitsAnyClear: Self = this.set("$bitsAnyClear", js.undefined)
    @scala.inline
    def set$bitsAnySetVarargs(value: scala.Double*): Self = this.set("$bitsAnySet", js.Array(value :_*))
    @scala.inline
    def set$bitsAnySet(value: BitwiseQuery): Self = this.set("$bitsAnySet", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$bitsAnySet: Self = this.set("$bitsAnySet", js.undefined)
    @scala.inline
    def set$elemMatch(value: js.Any): Self = this.set("$elemMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$elemMatch: Self = this.set("$elemMatch", js.undefined)
    @scala.inline
    def set$eq(value: T): Self = this.set("$eq", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$eq: Self = this.set("$eq", js.undefined)
    @scala.inline
    def set$exists(value: Boolean): Self = this.set("$exists", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$exists: Self = this.set("$exists", js.undefined)
    @scala.inline
    def set$expr(value: js.Any): Self = this.set("$expr", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$expr: Self = this.set("$expr", js.undefined)
    @scala.inline
    def set$geoIntersects(value: Geometry): Self = this.set("$geoIntersects", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$geoIntersects: Self = this.set("$geoIntersects", js.undefined)
    @scala.inline
    def set$geoWithin(value: js.Object): Self = this.set("$geoWithin", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$geoWithin: Self = this.set("$geoWithin", js.undefined)
    @scala.inline
    def set$gt(value: T): Self = this.set("$gt", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$gt: Self = this.set("$gt", js.undefined)
    @scala.inline
    def set$gte(value: T): Self = this.set("$gte", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$gte: Self = this.set("$gte", js.undefined)
    @scala.inline
    def set$inVarargs(value: T*): Self = this.set("$in", js.Array(value :_*))
    @scala.inline
    def set$in(value: js.Array[T]): Self = this.set("$in", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$in: Self = this.set("$in", js.undefined)
    @scala.inline
    def set$jsonSchema(value: js.Any): Self = this.set("$jsonSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$jsonSchema: Self = this.set("$jsonSchema", js.undefined)
    @scala.inline
    def set$lt(value: T): Self = this.set("$lt", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$lt: Self = this.set("$lt", js.undefined)
    @scala.inline
    def set$lte(value: T): Self = this.set("$lte", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$lte: Self = this.set("$lte", js.undefined)
    @scala.inline
    def set$maxDistance(value: scala.Double): Self = this.set("$maxDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxDistance: Self = this.set("$maxDistance", js.undefined)
    @scala.inline
    def set$mod(value: js.Tuple2[scala.Double, scala.Double]): Self = this.set("$mod", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$mod: Self = this.set("$mod", js.undefined)
    @scala.inline
    def set$ne(value: T): Self = this.set("$ne", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$ne: Self = this.set("$ne", js.undefined)
    @scala.inline
    def set$near(value: js.Object): Self = this.set("$near", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$near: Self = this.set("$near", js.undefined)
    @scala.inline
    def set$nearSphere(value: js.Object): Self = this.set("$nearSphere", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$nearSphere: Self = this.set("$nearSphere", js.undefined)
    @scala.inline
    def set$ninVarargs(value: T*): Self = this.set("$nin", js.Array(value :_*))
    @scala.inline
    def set$nin(value: js.Array[T]): Self = this.set("$nin", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$nin: Self = this.set("$nin", js.undefined)
    @scala.inline
    def set$not(value: QuerySelector[T] | RegExp): Self = this.set("$not", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$not: Self = this.set("$not", js.undefined)
    @scala.inline
    def set$options(value: String): Self = this.set("$options", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$options: Self = this.set("$options", js.undefined)
    @scala.inline
    def set$regex(value: RegExp | String): Self = this.set("$regex", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$regex: Self = this.set("$regex", js.undefined)
    @scala.inline
    def set$size(value: scala.Double): Self = this.set("$size", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$size: Self = this.set("$size", js.undefined)
    @scala.inline
    def set$type(value: BSONType | BSONTypeAlias): Self = this.set("$type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$type: Self = this.set("$type", js.undefined)
  }
  
}

