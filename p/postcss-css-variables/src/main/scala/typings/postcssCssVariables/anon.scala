package typings.postcssCssVariables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsImportant extends StObject {
    
    var isImportant: js.UndefOr[Boolean] = js.undefined
    
    var value: String
  }
  object IsImportant {
    
    inline def apply(value: String): IsImportant = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsImportant]
    }
    
    extension [Self <: IsImportant](x: Self) {
      
      inline def setIsImportant(value: Boolean): Self = StObject.set(x, "isImportant", value.asInstanceOf[js.Any])
      
      inline def setIsImportantUndefined: Self = StObject.set(x, "isImportant", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
