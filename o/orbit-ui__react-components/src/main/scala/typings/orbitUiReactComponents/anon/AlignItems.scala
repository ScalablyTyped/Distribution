package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.distLayoutSrcAdaptersMod.Alignment
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlignItems] (val x: Self) extends AnyVal {
    
    inline def setAlignItems(value: Alignment): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setJustifyContent(value: Alignment): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
  }
}
