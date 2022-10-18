package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Term extends StObject {
  
  /**
    * Value received as user input in the `sap.m.SearchField`, and taken as a JavaScript string object.
    */
  var term: js.UndefOr[String] = js.undefined
}
object Term {
  
  inline def apply(): Term = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Term]
  }
  
  extension [Self <: Term](x: Self) {
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
  }
}
