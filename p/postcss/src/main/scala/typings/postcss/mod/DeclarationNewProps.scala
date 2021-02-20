package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclarationNewProps extends StObject {
  
  /**
    * The declaration's property name.
    */
  var prop: js.UndefOr[String] = js.native
  
  var raws: js.UndefOr[DeclarationRaws] = js.native
  
  /**
    * The declaration's value. This value will be cleaned of comments. If the
    * source value contained comments, those comments will be available in the
    * _value.raws property. If you have not changed the value, the result of
    * decl.toString() will include the original raws value (comments and all).
    */
  var value: js.UndefOr[String] = js.native
}
object DeclarationNewProps {
  
  @scala.inline
  def apply(): DeclarationNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclarationNewProps]
  }
  
  @scala.inline
  implicit class DeclarationNewPropsMutableBuilder[Self <: DeclarationNewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
    
    @scala.inline
    def setRaws(value: DeclarationRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
