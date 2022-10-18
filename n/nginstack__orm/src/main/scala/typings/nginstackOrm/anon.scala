package typings.nginstackOrm

import typings.nginstackOrm.libEntityMod.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fields extends StObject {
    
    var fields: js.Array[String] | (js.Function1[/* arg0 */ Field, Boolean])
    
    var userKey: Double
  }
  object Fields {
    
    inline def apply(fields: js.Array[String] | (js.Function1[/* arg0 */ Field, Boolean]), userKey: Double): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], userKey = userKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setFields(value: js.Array[String] | (js.Function1[/* arg0 */ Field, Boolean])): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsFunction1(value: /* arg0 */ Field => Boolean): Self = StObject.set(x, "fields", js.Any.fromFunction1(value))
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setUserKey(value: Double): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait Inserted extends StObject {
    
    var inserted: js.Array[Double]
    
    var updated: js.Array[Double]
  }
  object Inserted {
    
    inline def apply(inserted: js.Array[Double], updated: js.Array[Double]): Inserted = {
      val __obj = js.Dynamic.literal(inserted = inserted.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Inserted]
    }
    
    extension [Self <: Inserted](x: Self) {
      
      inline def setInserted(value: js.Array[Double]): Self = StObject.set(x, "inserted", value.asInstanceOf[js.Any])
      
      inline def setInsertedVarargs(value: Double*): Self = StObject.set(x, "inserted", js.Array(value*))
      
      inline def setUpdated(value: js.Array[Double]): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      inline def setUpdatedVarargs(value: Double*): Self = StObject.set(x, "updated", js.Array(value*))
    }
  }
  
  trait UserKey extends StObject {
    
    var fields: js.Array[String] | (js.Function1[/* arg0 */ typings.nginstackOrm.libEntitySetMod.Field, Boolean])
    
    var userKey: Double
  }
  object UserKey {
    
    inline def apply(
      fields: js.Array[String] | (js.Function1[/* arg0 */ typings.nginstackOrm.libEntitySetMod.Field, Boolean]),
      userKey: Double
    ): UserKey = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], userKey = userKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserKey]
    }
    
    extension [Self <: UserKey](x: Self) {
      
      inline def setFields(
        value: js.Array[String] | (js.Function1[/* arg0 */ typings.nginstackOrm.libEntitySetMod.Field, Boolean])
      ): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsFunction1(value: /* arg0 */ typings.nginstackOrm.libEntitySetMod.Field => Boolean): Self = StObject.set(x, "fields", js.Any.fromFunction1(value))
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setUserKey(value: Double): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    }
  }
}
