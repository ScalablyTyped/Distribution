package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToken extends StObject {
  
  var scopes: String
  
  var startIndex: Double
}
object IToken {
  
  inline def apply(scopes: String, startIndex: Double): IToken = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IToken] (val x: Self) extends AnyVal {
    
    inline def setScopes(value: String): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
  }
}
