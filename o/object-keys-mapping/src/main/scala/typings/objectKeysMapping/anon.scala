package typings.objectKeysMapping

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Camelcase extends StObject {
    
    var camelcase: js.UndefOr[Boolean] = js.undefined
  }
  object Camelcase {
    
    @scala.inline
    def apply(): Camelcase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Camelcase]
    }
    
    @scala.inline
    implicit class CamelcaseMutableBuilder[Self <: Camelcase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCamelcase(value: Boolean): Self = StObject.set(x, "camelcase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCamelcaseUndefined: Self = StObject.set(x, "camelcase", js.undefined)
    }
  }
}
