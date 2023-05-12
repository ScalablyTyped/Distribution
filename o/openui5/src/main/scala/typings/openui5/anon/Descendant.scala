package typings.openui5.anon

import typings.openui5.sapUiTestOpaBuilderMod.DescendantDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descendant extends StObject {
  
  var descendant: js.Array[DescendantDefinition]
}
object Descendant {
  
  inline def apply(descendant: js.Array[DescendantDefinition]): Descendant = {
    val __obj = js.Dynamic.literal(descendant = descendant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descendant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Descendant] (val x: Self) extends AnyVal {
    
    inline def setDescendant(value: js.Array[DescendantDefinition]): Self = StObject.set(x, "descendant", value.asInstanceOf[js.Any])
    
    inline def setDescendantVarargs(value: DescendantDefinition*): Self = StObject.set(x, "descendant", js.Array(value*))
  }
}
