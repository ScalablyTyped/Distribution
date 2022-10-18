package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.Geometry
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterOperators[TValue]
  extends StObject
     with NonObjectIdLikeDocument {
  
  @JSName("$all")
  var $all: js.UndefOr[js.Array[Any]] = js.undefined
  
  @JSName("$bitsAllClear")
  var $bitsAllClear: js.UndefOr[BitwiseFilter] = js.undefined
  
  @JSName("$bitsAllSet")
  var $bitsAllSet: js.UndefOr[BitwiseFilter] = js.undefined
  
  @JSName("$bitsAnyClear")
  var $bitsAnyClear: js.UndefOr[BitwiseFilter] = js.undefined
  
  @JSName("$bitsAnySet")
  var $bitsAnySet: js.UndefOr[BitwiseFilter] = js.undefined
  
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[Document] = js.undefined
  
  @JSName("$eq")
  var $eq: js.UndefOr[TValue] = js.undefined
  
  /**
    * When `true`, `$exists` matches the documents that contain the field,
    * including documents where the field value is null.
    */
  @JSName("$exists")
  var $exists: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$expr")
  var $expr: js.UndefOr[Record[String, Any]] = js.undefined
  
  @JSName("$geoIntersects")
  var $geoIntersects: js.UndefOr[Geometry] = js.undefined
  
  @JSName("$geoWithin")
  var $geoWithin: js.UndefOr[Document] = js.undefined
  
  @JSName("$gt")
  var $gt: js.UndefOr[TValue] = js.undefined
  
  @JSName("$gte")
  var $gte: js.UndefOr[TValue] = js.undefined
  
  @JSName("$in")
  var $in: js.UndefOr[js.Array[TValue]] = js.undefined
  
  @JSName("$jsonSchema")
  var $jsonSchema: js.UndefOr[Record[String, Any]] = js.undefined
  
  @JSName("$lt")
  var $lt: js.UndefOr[TValue] = js.undefined
  
  @JSName("$lte")
  var $lte: js.UndefOr[TValue] = js.undefined
  
  @JSName("$maxDistance")
  var $maxDistance: js.UndefOr[scala.Double] = js.undefined
  
  @JSName("$mod")
  var $mod: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TValue extends number ? [number, number] : never */ js.Any
  ] = js.undefined
  
  @JSName("$ne")
  var $ne: js.UndefOr[TValue] = js.undefined
  
  @JSName("$near")
  var $near: js.UndefOr[Document] = js.undefined
  
  @JSName("$nearSphere")
  var $nearSphere: js.UndefOr[Document] = js.undefined
  
  @JSName("$nin")
  var $nin: js.UndefOr[js.Array[TValue]] = js.undefined
  
  @JSName("$not")
  var $not: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TValue extends string ? mongodb.mongodb.FilterOperators<TValue> | std.RegExp : mongodb.mongodb.FilterOperators<TValue> */ js.Any
  ] = js.undefined
  
  @JSName("$options")
  var $options: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TValue extends string ? string : never */ js.Any
  ] = js.undefined
  
  @JSName("$rand")
  var $rand: js.UndefOr[Record[String, scala.Nothing]] = js.undefined
  
  @JSName("$regex")
  var $regex: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TValue extends string ? std.RegExp | bson.bson.BSONRegExp | string : never */ js.Any
  ] = js.undefined
  
  @JSName("$size")
  var $size: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TValue extends std.ReadonlyArray<any> ? number : never */ js.Any
  ] = js.undefined
  
  @JSName("$type")
  var $type: js.UndefOr[BSONType | BSONTypeAlias] = js.undefined
}
object FilterOperators {
  
  inline def apply[TValue](): FilterOperators[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOperators[TValue]]
  }
  
  extension [Self <: FilterOperators[?], TValue](x: Self & FilterOperators[TValue]) {
    
    inline def set$all(value: js.Array[Any]): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def set$allVarargs(value: Any*): Self = StObject.set(x, "$all", js.Array(value*))
    
    inline def set$bitsAllClear(value: BitwiseFilter): Self = StObject.set(x, "$bitsAllClear", value.asInstanceOf[js.Any])
    
    inline def set$bitsAllClearUndefined: Self = StObject.set(x, "$bitsAllClear", js.undefined)
    
    inline def set$bitsAllClearVarargs(value: scala.Double*): Self = StObject.set(x, "$bitsAllClear", js.Array(value*))
    
    inline def set$bitsAllSet(value: BitwiseFilter): Self = StObject.set(x, "$bitsAllSet", value.asInstanceOf[js.Any])
    
    inline def set$bitsAllSetUndefined: Self = StObject.set(x, "$bitsAllSet", js.undefined)
    
    inline def set$bitsAllSetVarargs(value: scala.Double*): Self = StObject.set(x, "$bitsAllSet", js.Array(value*))
    
    inline def set$bitsAnyClear(value: BitwiseFilter): Self = StObject.set(x, "$bitsAnyClear", value.asInstanceOf[js.Any])
    
    inline def set$bitsAnyClearUndefined: Self = StObject.set(x, "$bitsAnyClear", js.undefined)
    
    inline def set$bitsAnyClearVarargs(value: scala.Double*): Self = StObject.set(x, "$bitsAnyClear", js.Array(value*))
    
    inline def set$bitsAnySet(value: BitwiseFilter): Self = StObject.set(x, "$bitsAnySet", value.asInstanceOf[js.Any])
    
    inline def set$bitsAnySetUndefined: Self = StObject.set(x, "$bitsAnySet", js.undefined)
    
    inline def set$bitsAnySetVarargs(value: scala.Double*): Self = StObject.set(x, "$bitsAnySet", js.Array(value*))
    
    inline def set$elemMatch(value: Document): Self = StObject.set(x, "$elemMatch", value.asInstanceOf[js.Any])
    
    inline def set$elemMatchUndefined: Self = StObject.set(x, "$elemMatch", js.undefined)
    
    inline def set$eq(value: TValue): Self = StObject.set(x, "$eq", value.asInstanceOf[js.Any])
    
    inline def set$eqUndefined: Self = StObject.set(x, "$eq", js.undefined)
    
    inline def set$exists(value: Boolean): Self = StObject.set(x, "$exists", value.asInstanceOf[js.Any])
    
    inline def set$existsUndefined: Self = StObject.set(x, "$exists", js.undefined)
    
    inline def set$expr(value: Record[String, Any]): Self = StObject.set(x, "$expr", value.asInstanceOf[js.Any])
    
    inline def set$exprUndefined: Self = StObject.set(x, "$expr", js.undefined)
    
    inline def set$geoIntersects(value: Geometry): Self = StObject.set(x, "$geoIntersects", value.asInstanceOf[js.Any])
    
    inline def set$geoIntersectsUndefined: Self = StObject.set(x, "$geoIntersects", js.undefined)
    
    inline def set$geoWithin(value: Document): Self = StObject.set(x, "$geoWithin", value.asInstanceOf[js.Any])
    
    inline def set$geoWithinUndefined: Self = StObject.set(x, "$geoWithin", js.undefined)
    
    inline def set$gt(value: TValue): Self = StObject.set(x, "$gt", value.asInstanceOf[js.Any])
    
    inline def set$gtUndefined: Self = StObject.set(x, "$gt", js.undefined)
    
    inline def set$gte(value: TValue): Self = StObject.set(x, "$gte", value.asInstanceOf[js.Any])
    
    inline def set$gteUndefined: Self = StObject.set(x, "$gte", js.undefined)
    
    inline def set$in(value: js.Array[TValue]): Self = StObject.set(x, "$in", value.asInstanceOf[js.Any])
    
    inline def set$inUndefined: Self = StObject.set(x, "$in", js.undefined)
    
    inline def set$inVarargs(value: TValue*): Self = StObject.set(x, "$in", js.Array(value*))
    
    inline def set$jsonSchema(value: Record[String, Any]): Self = StObject.set(x, "$jsonSchema", value.asInstanceOf[js.Any])
    
    inline def set$jsonSchemaUndefined: Self = StObject.set(x, "$jsonSchema", js.undefined)
    
    inline def set$lt(value: TValue): Self = StObject.set(x, "$lt", value.asInstanceOf[js.Any])
    
    inline def set$ltUndefined: Self = StObject.set(x, "$lt", js.undefined)
    
    inline def set$lte(value: TValue): Self = StObject.set(x, "$lte", value.asInstanceOf[js.Any])
    
    inline def set$lteUndefined: Self = StObject.set(x, "$lte", js.undefined)
    
    inline def set$maxDistance(value: scala.Double): Self = StObject.set(x, "$maxDistance", value.asInstanceOf[js.Any])
    
    inline def set$maxDistanceUndefined: Self = StObject.set(x, "$maxDistance", js.undefined)
    
    inline def set$mod(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TValue extends number ? [number, number] : never */ js.Any
    ): Self = StObject.set(x, "$mod", value.asInstanceOf[js.Any])
    
    inline def set$modUndefined: Self = StObject.set(x, "$mod", js.undefined)
    
    inline def set$ne(value: TValue): Self = StObject.set(x, "$ne", value.asInstanceOf[js.Any])
    
    inline def set$neUndefined: Self = StObject.set(x, "$ne", js.undefined)
    
    inline def set$near(value: Document): Self = StObject.set(x, "$near", value.asInstanceOf[js.Any])
    
    inline def set$nearSphere(value: Document): Self = StObject.set(x, "$nearSphere", value.asInstanceOf[js.Any])
    
    inline def set$nearSphereUndefined: Self = StObject.set(x, "$nearSphere", js.undefined)
    
    inline def set$nearUndefined: Self = StObject.set(x, "$near", js.undefined)
    
    inline def set$nin(value: js.Array[TValue]): Self = StObject.set(x, "$nin", value.asInstanceOf[js.Any])
    
    inline def set$ninUndefined: Self = StObject.set(x, "$nin", js.undefined)
    
    inline def set$ninVarargs(value: TValue*): Self = StObject.set(x, "$nin", js.Array(value*))
    
    inline def set$not(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TValue extends string ? mongodb.mongodb.FilterOperators<TValue> | std.RegExp : mongodb.mongodb.FilterOperators<TValue> */ js.Any
    ): Self = StObject.set(x, "$not", value.asInstanceOf[js.Any])
    
    inline def set$notUndefined: Self = StObject.set(x, "$not", js.undefined)
    
    inline def set$options(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TValue extends string ? string : never */ js.Any
    ): Self = StObject.set(x, "$options", value.asInstanceOf[js.Any])
    
    inline def set$optionsUndefined: Self = StObject.set(x, "$options", js.undefined)
    
    inline def set$rand(value: Record[String, scala.Nothing]): Self = StObject.set(x, "$rand", value.asInstanceOf[js.Any])
    
    inline def set$randUndefined: Self = StObject.set(x, "$rand", js.undefined)
    
    inline def set$regex(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TValue extends string ? std.RegExp | bson.bson.BSONRegExp | string : never */ js.Any
    ): Self = StObject.set(x, "$regex", value.asInstanceOf[js.Any])
    
    inline def set$regexUndefined: Self = StObject.set(x, "$regex", js.undefined)
    
    inline def set$size(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TValue extends std.ReadonlyArray<any> ? number : never */ js.Any
    ): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    
    inline def set$type(value: BSONType | BSONTypeAlias): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
    
    inline def set$typeUndefined: Self = StObject.set(x, "$type", js.undefined)
  }
}
