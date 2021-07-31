package typings.meteor.anon

import typings.meteor.Mongo.CurrentDateModifier
import typings.meteor.meteorStrings.date
import typings.meteor.meteorStrings.timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with CurrentDateModifier
     with typings.meteor.mongoMod.Mongo.CurrentDateModifier {
  
  @JSName("$type")
  var $type: timestamp | date
}
object Type {
  
  @scala.inline
  def apply($type: timestamp | date): Type = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$type(value: timestamp | date): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
  }
}
