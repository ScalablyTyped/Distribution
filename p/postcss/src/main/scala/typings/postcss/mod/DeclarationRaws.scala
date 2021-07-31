package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclarationRaws
  extends StObject
     with NodeRaws {
  
  /**
    * The declaration's value. This value will be cleaned of comments.
    * If the source value contained comments, those comments will be
    * available in the _value.raws property. If you have not changed the value, the result of
    * decl.toString() will include the original raws value (comments and all).
    */
  var value: js.UndefOr[String] = js.undefined
}
object DeclarationRaws {
  
  @scala.inline
  def apply(): DeclarationRaws = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclarationRaws]
  }
  
  @scala.inline
  implicit class DeclarationRawsMutableBuilder[Self <: DeclarationRaws] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
