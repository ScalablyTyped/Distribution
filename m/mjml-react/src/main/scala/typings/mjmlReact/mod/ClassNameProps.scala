package typings.mjmlReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassNameProps extends StObject {
  
  var cssClass: js.UndefOr[String] = js.native
}
object ClassNameProps {
  
  @scala.inline
  def apply(): ClassNameProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassNameProps]
  }
  
  @scala.inline
  implicit class ClassNamePropsMutableBuilder[Self <: ClassNameProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
  }
}
