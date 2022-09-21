package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.adaptersMod.Alignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItems extends StObject {
  
  var alignItems: Alignment
  
  var justifyContent: Alignment
}
object AlignItems {
  
  inline def apply(alignItems: Alignment, justifyContent: Alignment): AlignItems = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItems]
  }
  
  extension [Self <: AlignItems](x: Self) {
    
    inline def setAlignItems(value: Alignment): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setJustifyContent(value: Alignment): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
  }
}
