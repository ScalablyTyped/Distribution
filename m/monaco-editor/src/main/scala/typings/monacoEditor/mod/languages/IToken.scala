package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToken extends StObject {
  
  var scopes: String = js.native
  
  var startIndex: Double = js.native
}
object IToken {
  
  @scala.inline
  def apply(scopes: String, startIndex: Double): IToken = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToken]
  }
  
  @scala.inline
  implicit class ITokenMutableBuilder[Self <: IToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopes(value: String): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
  }
}
