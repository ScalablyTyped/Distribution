package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Header
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAccordionSrcAccordionItemMod {
  
  object AccordionItem {
    
    inline def apply(param0: AccordionItemProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@orbit-ui/react-components/dist/accordion/src/AccordionItem", "AccordionItem")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@orbit-ui/react-components/dist/accordion/src/AccordionItem", "AccordionItem.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait AccordionItemProps extends StObject {
    
    var item: Header
  }
  object AccordionItemProps {
    
    inline def apply(item: Header): AccordionItemProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionItemProps]
    }
    
    extension [Self <: AccordionItemProps](x: Self) {
      
      inline def setItem(value: Header): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
