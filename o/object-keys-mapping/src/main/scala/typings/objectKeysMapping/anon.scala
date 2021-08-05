package typings.objectKeysMapping

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Camelcase extends StObject {
    
    var camelcase: js.UndefOr[Boolean] = js.undefined
  }
  object Camelcase {
    
    inline def apply(): Camelcase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Camelcase]
    }
    
    extension [Self <: Camelcase](x: Self) {
      
      inline def setCamelcase(value: Boolean): Self = StObject.set(x, "camelcase", value.asInstanceOf[js.Any])
      
      inline def setCamelcaseUndefined: Self = StObject.set(x, "camelcase", js.undefined)
    }
  }
}
