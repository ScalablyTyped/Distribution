package typings.openui5.anon

import typings.openui5.sapUiTestOpaBuilderMod.AncestorDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ancestor extends StObject {
  
  var ancestor: js.Array[AncestorDefinition]
}
object Ancestor {
  
  inline def apply(ancestor: js.Array[AncestorDefinition]): Ancestor = {
    val __obj = js.Dynamic.literal(ancestor = ancestor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ancestor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ancestor] (val x: Self) extends AnyVal {
    
    inline def setAncestor(value: js.Array[AncestorDefinition]): Self = StObject.set(x, "ancestor", value.asInstanceOf[js.Any])
    
    inline def setAncestorVarargs(value: AncestorDefinition*): Self = StObject.set(x, "ancestor", js.Array(value*))
  }
}
