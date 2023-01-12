package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.And
import typings.mongodb.anon.Or
import typings.mongodb.anon.Type
import typings.mongodb.anon.Xor
import typings.mongodb.mongodbBooleans.`true`
import typings.mongodb.mongodbInts.`-1`
import typings.mongodb.mongodbInts.`1`
import typings.mongodb.mongodbStrings._empty
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFilter[TSchema]
  extends StObject
     with Document {
  
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[SetFields[TSchema]] = js.undefined
  
  @JSName("$bit")
  var $bit: js.UndefOr[OnlyFieldsOfType[TSchema, js.UndefOr[NumericType], And | Or | Xor]] = js.undefined
  
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[OnlyFieldsOfType[TSchema, js.Date | typings.bson.mod.Timestamp, `true` | Type]] = js.undefined
  
  @JSName("$inc")
  var $inc: js.UndefOr[OnlyFieldsOfType[TSchema, js.UndefOr[NumericType], js.UndefOr[NumericType]]] = js.undefined
  
  @JSName("$max")
  var $max: js.UndefOr[MatchKeysAndValues[TSchema]] = js.undefined
  
  @JSName("$min")
  var $min: js.UndefOr[MatchKeysAndValues[TSchema]] = js.undefined
  
  @JSName("$mul")
  var $mul: js.UndefOr[OnlyFieldsOfType[TSchema, js.UndefOr[NumericType], js.UndefOr[NumericType]]] = js.undefined
  
  @JSName("$pop")
  var $pop: js.UndefOr[OnlyFieldsOfType[TSchema, js.Array[Any], `1` | `-1`]] = js.undefined
  
  @JSName("$pull")
  var $pull: js.UndefOr[PullOperator[TSchema]] = js.undefined
  
  @JSName("$pullAll")
  var $pullAll: js.UndefOr[PullAllOperator[TSchema]] = js.undefined
  
  @JSName("$push")
  var $push: js.UndefOr[PushOperator[TSchema]] = js.undefined
  
  @JSName("$rename")
  var $rename: js.UndefOr[Record[String, String]] = js.undefined
  
  @JSName("$set")
  var $set: js.UndefOr[MatchKeysAndValues[TSchema]] = js.undefined
  
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[MatchKeysAndValues[TSchema]] = js.undefined
  
  @JSName("$unset")
  var $unset: js.UndefOr[OnlyFieldsOfType[TSchema, Any, _empty | `true` | `1`]] = js.undefined
}
object UpdateFilter {
  
  inline def apply[TSchema](): UpdateFilter[TSchema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFilter[TSchema]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFilter[?], TSchema] (val x: Self & UpdateFilter[TSchema]) extends AnyVal {
    
    inline def set$addToSet(value: SetFields[TSchema]): Self = StObject.set(x, "$addToSet", value.asInstanceOf[js.Any])
    
    inline def set$addToSetUndefined: Self = StObject.set(x, "$addToSet", js.undefined)
    
    inline def set$bit(value: OnlyFieldsOfType[TSchema, js.UndefOr[NumericType], And | Or | Xor]): Self = StObject.set(x, "$bit", value.asInstanceOf[js.Any])
    
    inline def set$bitUndefined: Self = StObject.set(x, "$bit", js.undefined)
    
    inline def set$currentDate(value: OnlyFieldsOfType[TSchema, js.Date | typings.bson.mod.Timestamp, `true` | Type]): Self = StObject.set(x, "$currentDate", value.asInstanceOf[js.Any])
    
    inline def set$currentDateUndefined: Self = StObject.set(x, "$currentDate", js.undefined)
    
    inline def set$inc(value: OnlyFieldsOfType[TSchema, js.UndefOr[NumericType], js.UndefOr[NumericType]]): Self = StObject.set(x, "$inc", value.asInstanceOf[js.Any])
    
    inline def set$incUndefined: Self = StObject.set(x, "$inc", js.undefined)
    
    inline def set$max(value: MatchKeysAndValues[TSchema]): Self = StObject.set(x, "$max", value.asInstanceOf[js.Any])
    
    inline def set$maxUndefined: Self = StObject.set(x, "$max", js.undefined)
    
    inline def set$min(value: MatchKeysAndValues[TSchema]): Self = StObject.set(x, "$min", value.asInstanceOf[js.Any])
    
    inline def set$minUndefined: Self = StObject.set(x, "$min", js.undefined)
    
    inline def set$mul(value: OnlyFieldsOfType[TSchema, js.UndefOr[NumericType], js.UndefOr[NumericType]]): Self = StObject.set(x, "$mul", value.asInstanceOf[js.Any])
    
    inline def set$mulUndefined: Self = StObject.set(x, "$mul", js.undefined)
    
    inline def set$pop(value: OnlyFieldsOfType[TSchema, js.Array[Any], `1` | `-1`]): Self = StObject.set(x, "$pop", value.asInstanceOf[js.Any])
    
    inline def set$popUndefined: Self = StObject.set(x, "$pop", js.undefined)
    
    inline def set$pull(value: PullOperator[TSchema]): Self = StObject.set(x, "$pull", value.asInstanceOf[js.Any])
    
    inline def set$pullAll(value: PullAllOperator[TSchema]): Self = StObject.set(x, "$pullAll", value.asInstanceOf[js.Any])
    
    inline def set$pullAllUndefined: Self = StObject.set(x, "$pullAll", js.undefined)
    
    inline def set$pullUndefined: Self = StObject.set(x, "$pull", js.undefined)
    
    inline def set$push(value: PushOperator[TSchema]): Self = StObject.set(x, "$push", value.asInstanceOf[js.Any])
    
    inline def set$pushUndefined: Self = StObject.set(x, "$push", js.undefined)
    
    inline def set$rename(value: Record[String, String]): Self = StObject.set(x, "$rename", value.asInstanceOf[js.Any])
    
    inline def set$renameUndefined: Self = StObject.set(x, "$rename", js.undefined)
    
    inline def set$set(value: MatchKeysAndValues[TSchema]): Self = StObject.set(x, "$set", value.asInstanceOf[js.Any])
    
    inline def set$setOnInsert(value: MatchKeysAndValues[TSchema]): Self = StObject.set(x, "$setOnInsert", value.asInstanceOf[js.Any])
    
    inline def set$setOnInsertUndefined: Self = StObject.set(x, "$setOnInsert", js.undefined)
    
    inline def set$setUndefined: Self = StObject.set(x, "$set", js.undefined)
    
    inline def set$unset(value: OnlyFieldsOfType[TSchema, Any, _empty | `true` | `1`]): Self = StObject.set(x, "$unset", value.asInstanceOf[js.Any])
    
    inline def set$unsetUndefined: Self = StObject.set(x, "$unset", js.undefined)
  }
}
