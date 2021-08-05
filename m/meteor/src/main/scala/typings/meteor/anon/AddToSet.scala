package typings.meteor.anon

import typings.meteor.meteorNumbers.`-1`
import typings.meteor.meteorNumbers.`1`
import typings.meteor.mongoMod.Mongo.ArraysOrEach
import typings.meteor.mongoMod.Mongo.CurrentDateModifier
import typings.meteor.mongoMod.Mongo.Dictionary
import typings.meteor.mongoMod.Mongo.ElementsOf
import typings.meteor.mongoMod.Mongo.PartialMapTo
import typings.meteor.mongoMod.Mongo.PushModifier
import typings.std.Date
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddToSet[T] extends StObject {
  
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[ArraysOrEach[T] & Dictionary[js.Any]] = js.undefined
  
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[
    (Partial[Record[/* keyof T */ String, CurrentDateModifier]]) & Dictionary[CurrentDateModifier]
  ] = js.undefined
  
  @JSName("$inc")
  var $inc: js.UndefOr[(PartialMapTo[T, Double]) & Dictionary[Double]] = js.undefined
  
  @JSName("$max")
  var $max: js.UndefOr[(PartialMapTo[T, Date | Double]) & (Dictionary[Date | Double])] = js.undefined
  
  @JSName("$min")
  var $min: js.UndefOr[(PartialMapTo[T, Date | Double]) & (Dictionary[Date | Double])] = js.undefined
  
  @JSName("$mul")
  var $mul: js.UndefOr[(PartialMapTo[T, Double]) & Dictionary[Double]] = js.undefined
  
  @JSName("$pop")
  var $pop: js.UndefOr[(PartialMapTo[T, `1` | `-1`]) & (Dictionary[`1` | `-1`])] = js.undefined
  
  @JSName("$pull")
  var $pull: js.UndefOr[ElementsOf[T] & Dictionary[js.Any]] = js.undefined
  
  @JSName("$pullAll")
  var $pullAll: js.UndefOr[Partial[T] & Dictionary[js.Any]] = js.undefined
  
  @JSName("$push")
  var $push: js.UndefOr[PushModifier[T] & Dictionary[js.Any]] = js.undefined
  
  @JSName("$rename")
  var $rename: js.UndefOr[(PartialMapTo[T, String]) & Dictionary[String]] = js.undefined
  
  @JSName("$set")
  var $set: js.UndefOr[Partial[T] & Dictionary[js.Any]] = js.undefined
  
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[Partial[T] & Dictionary[js.Any]] = js.undefined
  
  @JSName("$unset")
  var $unset: js.UndefOr[
    (PartialMapTo[T, String | Boolean | `1` | typings.meteor.meteorNumbers.`0`]) & Dictionary[js.Any]
  ] = js.undefined
}
object AddToSet {
  
  inline def apply[T](): AddToSet[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddToSet[T]]
  }
  
  extension [Self <: AddToSet[?], T](x: Self & AddToSet[T]) {
    
    inline def set$addToSet(value: ArraysOrEach[T] & Dictionary[js.Any]): Self = StObject.set(x, "$addToSet", value.asInstanceOf[js.Any])
    
    inline def set$addToSetUndefined: Self = StObject.set(x, "$addToSet", js.undefined)
    
    inline def set$currentDate(
      value: (Partial[Record[/* keyof T */ String, CurrentDateModifier]]) & Dictionary[CurrentDateModifier]
    ): Self = StObject.set(x, "$currentDate", value.asInstanceOf[js.Any])
    
    inline def set$currentDateUndefined: Self = StObject.set(x, "$currentDate", js.undefined)
    
    inline def set$inc(value: (PartialMapTo[T, Double]) & Dictionary[Double]): Self = StObject.set(x, "$inc", value.asInstanceOf[js.Any])
    
    inline def set$incUndefined: Self = StObject.set(x, "$inc", js.undefined)
    
    inline def set$max(value: (PartialMapTo[T, Date | Double]) & (Dictionary[Date | Double])): Self = StObject.set(x, "$max", value.asInstanceOf[js.Any])
    
    inline def set$maxUndefined: Self = StObject.set(x, "$max", js.undefined)
    
    inline def set$min(value: (PartialMapTo[T, Date | Double]) & (Dictionary[Date | Double])): Self = StObject.set(x, "$min", value.asInstanceOf[js.Any])
    
    inline def set$minUndefined: Self = StObject.set(x, "$min", js.undefined)
    
    inline def set$mul(value: (PartialMapTo[T, Double]) & Dictionary[Double]): Self = StObject.set(x, "$mul", value.asInstanceOf[js.Any])
    
    inline def set$mulUndefined: Self = StObject.set(x, "$mul", js.undefined)
    
    inline def set$pop(value: (PartialMapTo[T, `1` | `-1`]) & (Dictionary[`1` | `-1`])): Self = StObject.set(x, "$pop", value.asInstanceOf[js.Any])
    
    inline def set$popUndefined: Self = StObject.set(x, "$pop", js.undefined)
    
    inline def set$pull(value: ElementsOf[T] & Dictionary[js.Any]): Self = StObject.set(x, "$pull", value.asInstanceOf[js.Any])
    
    inline def set$pullAll(value: Partial[T] & Dictionary[js.Any]): Self = StObject.set(x, "$pullAll", value.asInstanceOf[js.Any])
    
    inline def set$pullAllUndefined: Self = StObject.set(x, "$pullAll", js.undefined)
    
    inline def set$pullUndefined: Self = StObject.set(x, "$pull", js.undefined)
    
    inline def set$push(value: PushModifier[T] & Dictionary[js.Any]): Self = StObject.set(x, "$push", value.asInstanceOf[js.Any])
    
    inline def set$pushUndefined: Self = StObject.set(x, "$push", js.undefined)
    
    inline def set$rename(value: (PartialMapTo[T, String]) & Dictionary[String]): Self = StObject.set(x, "$rename", value.asInstanceOf[js.Any])
    
    inline def set$renameUndefined: Self = StObject.set(x, "$rename", js.undefined)
    
    inline def set$set(value: Partial[T] & Dictionary[js.Any]): Self = StObject.set(x, "$set", value.asInstanceOf[js.Any])
    
    inline def set$setOnInsert(value: Partial[T] & Dictionary[js.Any]): Self = StObject.set(x, "$setOnInsert", value.asInstanceOf[js.Any])
    
    inline def set$setOnInsertUndefined: Self = StObject.set(x, "$setOnInsert", js.undefined)
    
    inline def set$setUndefined: Self = StObject.set(x, "$set", js.undefined)
    
    inline def set$unset(
      value: (PartialMapTo[T, String | Boolean | `1` | typings.meteor.meteorNumbers.`0`]) & Dictionary[js.Any]
    ): Self = StObject.set(x, "$unset", value.asInstanceOf[js.Any])
    
    inline def set$unsetUndefined: Self = StObject.set(x, "$unset", js.undefined)
  }
}
