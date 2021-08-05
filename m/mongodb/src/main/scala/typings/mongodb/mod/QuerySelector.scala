package typings.mongodb.mod

import typings.mongodb.anon.Geometry
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySelector[T] extends StObject {
  
  // Array
  // TODO: define better types for $all and $elemMatch
  @JSName("$all")
  var $all: js.UndefOr[js.Array[js.Any]] = js.undefined
  
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
  var $geoIntersects: js.UndefOr[Geometry] = js.undefined
  
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
  
  inline def apply[T](): QuerySelector[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuerySelector[T]]
  }
  
  extension [Self <: QuerySelector[?], T](x: Self & QuerySelector[T]) {
    
    inline def set$all(value: js.Array[js.Any]): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def set$allVarargs(value: js.Any*): Self = StObject.set(x, "$all", js.Array(value :_*))
    
    inline def set$bitsAllClear(value: BitwiseQuery): Self = StObject.set(x, "$bitsAllClear", value.asInstanceOf[js.Any])
    
    inline def set$bitsAllClearUndefined: Self = StObject.set(x, "$bitsAllClear", js.undefined)
    
    inline def set$bitsAllClearVarargs(value: scala.Double*): Self = StObject.set(x, "$bitsAllClear", js.Array(value :_*))
    
    inline def set$bitsAllSet(value: BitwiseQuery): Self = StObject.set(x, "$bitsAllSet", value.asInstanceOf[js.Any])
    
    inline def set$bitsAllSetUndefined: Self = StObject.set(x, "$bitsAllSet", js.undefined)
    
    inline def set$bitsAllSetVarargs(value: scala.Double*): Self = StObject.set(x, "$bitsAllSet", js.Array(value :_*))
    
    inline def set$bitsAnyClear(value: BitwiseQuery): Self = StObject.set(x, "$bitsAnyClear", value.asInstanceOf[js.Any])
    
    inline def set$bitsAnyClearUndefined: Self = StObject.set(x, "$bitsAnyClear", js.undefined)
    
    inline def set$bitsAnyClearVarargs(value: scala.Double*): Self = StObject.set(x, "$bitsAnyClear", js.Array(value :_*))
    
    inline def set$bitsAnySet(value: BitwiseQuery): Self = StObject.set(x, "$bitsAnySet", value.asInstanceOf[js.Any])
    
    inline def set$bitsAnySetUndefined: Self = StObject.set(x, "$bitsAnySet", js.undefined)
    
    inline def set$bitsAnySetVarargs(value: scala.Double*): Self = StObject.set(x, "$bitsAnySet", js.Array(value :_*))
    
    inline def set$elemMatch(value: js.Any): Self = StObject.set(x, "$elemMatch", value.asInstanceOf[js.Any])
    
    inline def set$elemMatchUndefined: Self = StObject.set(x, "$elemMatch", js.undefined)
    
    inline def set$eq(value: T): Self = StObject.set(x, "$eq", value.asInstanceOf[js.Any])
    
    inline def set$eqUndefined: Self = StObject.set(x, "$eq", js.undefined)
    
    inline def set$exists(value: Boolean): Self = StObject.set(x, "$exists", value.asInstanceOf[js.Any])
    
    inline def set$existsUndefined: Self = StObject.set(x, "$exists", js.undefined)
    
    inline def set$expr(value: js.Any): Self = StObject.set(x, "$expr", value.asInstanceOf[js.Any])
    
    inline def set$exprUndefined: Self = StObject.set(x, "$expr", js.undefined)
    
    inline def set$geoIntersects(value: Geometry): Self = StObject.set(x, "$geoIntersects", value.asInstanceOf[js.Any])
    
    inline def set$geoIntersectsUndefined: Self = StObject.set(x, "$geoIntersects", js.undefined)
    
    inline def set$geoWithin(value: js.Object): Self = StObject.set(x, "$geoWithin", value.asInstanceOf[js.Any])
    
    inline def set$geoWithinUndefined: Self = StObject.set(x, "$geoWithin", js.undefined)
    
    inline def set$gt(value: T): Self = StObject.set(x, "$gt", value.asInstanceOf[js.Any])
    
    inline def set$gtUndefined: Self = StObject.set(x, "$gt", js.undefined)
    
    inline def set$gte(value: T): Self = StObject.set(x, "$gte", value.asInstanceOf[js.Any])
    
    inline def set$gteUndefined: Self = StObject.set(x, "$gte", js.undefined)
    
    inline def set$in(value: js.Array[T]): Self = StObject.set(x, "$in", value.asInstanceOf[js.Any])
    
    inline def set$inUndefined: Self = StObject.set(x, "$in", js.undefined)
    
    inline def set$inVarargs(value: T*): Self = StObject.set(x, "$in", js.Array(value :_*))
    
    inline def set$jsonSchema(value: js.Any): Self = StObject.set(x, "$jsonSchema", value.asInstanceOf[js.Any])
    
    inline def set$jsonSchemaUndefined: Self = StObject.set(x, "$jsonSchema", js.undefined)
    
    inline def set$lt(value: T): Self = StObject.set(x, "$lt", value.asInstanceOf[js.Any])
    
    inline def set$ltUndefined: Self = StObject.set(x, "$lt", js.undefined)
    
    inline def set$lte(value: T): Self = StObject.set(x, "$lte", value.asInstanceOf[js.Any])
    
    inline def set$lteUndefined: Self = StObject.set(x, "$lte", js.undefined)
    
    inline def set$maxDistance(value: scala.Double): Self = StObject.set(x, "$maxDistance", value.asInstanceOf[js.Any])
    
    inline def set$maxDistanceUndefined: Self = StObject.set(x, "$maxDistance", js.undefined)
    
    inline def set$mod(value: js.Tuple2[scala.Double, scala.Double]): Self = StObject.set(x, "$mod", value.asInstanceOf[js.Any])
    
    inline def set$modUndefined: Self = StObject.set(x, "$mod", js.undefined)
    
    inline def set$ne(value: T): Self = StObject.set(x, "$ne", value.asInstanceOf[js.Any])
    
    inline def set$neUndefined: Self = StObject.set(x, "$ne", js.undefined)
    
    inline def set$near(value: js.Object): Self = StObject.set(x, "$near", value.asInstanceOf[js.Any])
    
    inline def set$nearSphere(value: js.Object): Self = StObject.set(x, "$nearSphere", value.asInstanceOf[js.Any])
    
    inline def set$nearSphereUndefined: Self = StObject.set(x, "$nearSphere", js.undefined)
    
    inline def set$nearUndefined: Self = StObject.set(x, "$near", js.undefined)
    
    inline def set$nin(value: js.Array[T]): Self = StObject.set(x, "$nin", value.asInstanceOf[js.Any])
    
    inline def set$ninUndefined: Self = StObject.set(x, "$nin", js.undefined)
    
    inline def set$ninVarargs(value: T*): Self = StObject.set(x, "$nin", js.Array(value :_*))
    
    inline def set$not(value: QuerySelector[T] | RegExp): Self = StObject.set(x, "$not", value.asInstanceOf[js.Any])
    
    inline def set$notUndefined: Self = StObject.set(x, "$not", js.undefined)
    
    inline def set$options(value: String): Self = StObject.set(x, "$options", value.asInstanceOf[js.Any])
    
    inline def set$optionsUndefined: Self = StObject.set(x, "$options", js.undefined)
    
    inline def set$regex(value: RegExp | String): Self = StObject.set(x, "$regex", value.asInstanceOf[js.Any])
    
    inline def set$regexUndefined: Self = StObject.set(x, "$regex", js.undefined)
    
    inline def set$size(value: scala.Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    
    inline def set$type(value: BSONType | BSONTypeAlias): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
    
    inline def set$typeUndefined: Self = StObject.set(x, "$type", js.undefined)
  }
}
