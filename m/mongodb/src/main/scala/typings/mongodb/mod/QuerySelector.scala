package typings.mongodb.mod

import typings.mongodb.anon.Geometry
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuerySelector[T] extends StObject {
  
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
  implicit class QuerySelectorMutableBuilder[Self <: QuerySelector[_], T] (val x: Self with QuerySelector[T]) extends AnyVal {
    
    @scala.inline
    def set$all(value: js.Array[_]): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def set$allVarargs(value: js.Any*): Self = StObject.set(x, "$all", js.Array(value :_*))
    
    @scala.inline
    def set$bitsAllClear(value: BitwiseQuery): Self = StObject.set(x, "$bitsAllClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$bitsAllClearUndefined: Self = StObject.set(x, "$bitsAllClear", js.undefined)
    
    @scala.inline
    def set$bitsAllClearVarargs(value: scala.Double*): Self = StObject.set(x, "$bitsAllClear", js.Array(value :_*))
    
    @scala.inline
    def set$bitsAllSet(value: BitwiseQuery): Self = StObject.set(x, "$bitsAllSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$bitsAllSetUndefined: Self = StObject.set(x, "$bitsAllSet", js.undefined)
    
    @scala.inline
    def set$bitsAllSetVarargs(value: scala.Double*): Self = StObject.set(x, "$bitsAllSet", js.Array(value :_*))
    
    @scala.inline
    def set$bitsAnyClear(value: BitwiseQuery): Self = StObject.set(x, "$bitsAnyClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$bitsAnyClearUndefined: Self = StObject.set(x, "$bitsAnyClear", js.undefined)
    
    @scala.inline
    def set$bitsAnyClearVarargs(value: scala.Double*): Self = StObject.set(x, "$bitsAnyClear", js.Array(value :_*))
    
    @scala.inline
    def set$bitsAnySet(value: BitwiseQuery): Self = StObject.set(x, "$bitsAnySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$bitsAnySetUndefined: Self = StObject.set(x, "$bitsAnySet", js.undefined)
    
    @scala.inline
    def set$bitsAnySetVarargs(value: scala.Double*): Self = StObject.set(x, "$bitsAnySet", js.Array(value :_*))
    
    @scala.inline
    def set$elemMatch(value: js.Any): Self = StObject.set(x, "$elemMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$elemMatchUndefined: Self = StObject.set(x, "$elemMatch", js.undefined)
    
    @scala.inline
    def set$eq(value: T): Self = StObject.set(x, "$eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$eqUndefined: Self = StObject.set(x, "$eq", js.undefined)
    
    @scala.inline
    def set$exists(value: Boolean): Self = StObject.set(x, "$exists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$existsUndefined: Self = StObject.set(x, "$exists", js.undefined)
    
    @scala.inline
    def set$expr(value: js.Any): Self = StObject.set(x, "$expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$exprUndefined: Self = StObject.set(x, "$expr", js.undefined)
    
    @scala.inline
    def set$geoIntersects(value: Geometry): Self = StObject.set(x, "$geoIntersects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$geoIntersectsUndefined: Self = StObject.set(x, "$geoIntersects", js.undefined)
    
    @scala.inline
    def set$geoWithin(value: js.Object): Self = StObject.set(x, "$geoWithin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$geoWithinUndefined: Self = StObject.set(x, "$geoWithin", js.undefined)
    
    @scala.inline
    def set$gt(value: T): Self = StObject.set(x, "$gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$gtUndefined: Self = StObject.set(x, "$gt", js.undefined)
    
    @scala.inline
    def set$gte(value: T): Self = StObject.set(x, "$gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$gteUndefined: Self = StObject.set(x, "$gte", js.undefined)
    
    @scala.inline
    def set$in(value: js.Array[T]): Self = StObject.set(x, "$in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$inUndefined: Self = StObject.set(x, "$in", js.undefined)
    
    @scala.inline
    def set$inVarargs(value: T*): Self = StObject.set(x, "$in", js.Array(value :_*))
    
    @scala.inline
    def set$jsonSchema(value: js.Any): Self = StObject.set(x, "$jsonSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$jsonSchemaUndefined: Self = StObject.set(x, "$jsonSchema", js.undefined)
    
    @scala.inline
    def set$lt(value: T): Self = StObject.set(x, "$lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$ltUndefined: Self = StObject.set(x, "$lt", js.undefined)
    
    @scala.inline
    def set$lte(value: T): Self = StObject.set(x, "$lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$lteUndefined: Self = StObject.set(x, "$lte", js.undefined)
    
    @scala.inline
    def set$maxDistance(value: scala.Double): Self = StObject.set(x, "$maxDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$maxDistanceUndefined: Self = StObject.set(x, "$maxDistance", js.undefined)
    
    @scala.inline
    def set$mod(value: js.Tuple2[scala.Double, scala.Double]): Self = StObject.set(x, "$mod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$modUndefined: Self = StObject.set(x, "$mod", js.undefined)
    
    @scala.inline
    def set$ne(value: T): Self = StObject.set(x, "$ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$neUndefined: Self = StObject.set(x, "$ne", js.undefined)
    
    @scala.inline
    def set$near(value: js.Object): Self = StObject.set(x, "$near", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$nearSphere(value: js.Object): Self = StObject.set(x, "$nearSphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$nearSphereUndefined: Self = StObject.set(x, "$nearSphere", js.undefined)
    
    @scala.inline
    def set$nearUndefined: Self = StObject.set(x, "$near", js.undefined)
    
    @scala.inline
    def set$nin(value: js.Array[T]): Self = StObject.set(x, "$nin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$ninUndefined: Self = StObject.set(x, "$nin", js.undefined)
    
    @scala.inline
    def set$ninVarargs(value: T*): Self = StObject.set(x, "$nin", js.Array(value :_*))
    
    @scala.inline
    def set$not(value: QuerySelector[T] | RegExp): Self = StObject.set(x, "$not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$notUndefined: Self = StObject.set(x, "$not", js.undefined)
    
    @scala.inline
    def set$options(value: String): Self = StObject.set(x, "$options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$optionsUndefined: Self = StObject.set(x, "$options", js.undefined)
    
    @scala.inline
    def set$regex(value: RegExp | String): Self = StObject.set(x, "$regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$regexUndefined: Self = StObject.set(x, "$regex", js.undefined)
    
    @scala.inline
    def set$size(value: scala.Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    
    @scala.inline
    def set$type(value: BSONType | BSONTypeAlias): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$typeUndefined: Self = StObject.set(x, "$type", js.undefined)
  }
}
