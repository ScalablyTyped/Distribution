package typings.parchment

import typings.parchment.blotMod.BlotConstructor
import typings.parchment.scopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowedChildren extends StObject {
    
    var allowedChildren: js.UndefOr[js.Array[BlotConstructor]] = js.undefined
    
    var blotName: String
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultChild: js.UndefOr[BlotConstructor] = js.undefined
    
    var requiredContainer: js.UndefOr[BlotConstructor] = js.undefined
    
    var scope: Scope
    
    var tagName: String
  }
  object AllowedChildren {
    
    inline def apply(blotName: String, scope: Scope, tagName: String): AllowedChildren = {
      val __obj = js.Dynamic.literal(blotName = blotName.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowedChildren]
    }
    
    extension [Self <: AllowedChildren](x: Self) {
      
      inline def setAllowedChildren(value: js.Array[BlotConstructor]): Self = StObject.set(x, "allowedChildren", value.asInstanceOf[js.Any])
      
      inline def setAllowedChildrenUndefined: Self = StObject.set(x, "allowedChildren", js.undefined)
      
      inline def setAllowedChildrenVarargs(value: BlotConstructor*): Self = StObject.set(x, "allowedChildren", js.Array(value*))
      
      inline def setBlotName(value: String): Self = StObject.set(x, "blotName", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultChild(value: BlotConstructor): Self = StObject.set(x, "defaultChild", value.asInstanceOf[js.Any])
      
      inline def setDefaultChildUndefined: Self = StObject.set(x, "defaultChild", js.undefined)
      
      inline def setRequiredContainer(value: BlotConstructor): Self = StObject.set(x, "requiredContainer", value.asInstanceOf[js.Any])
      
      inline def setRequiredContainerUndefined: Self = StObject.set(x, "requiredContainer", js.undefined)
      
      inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
}
