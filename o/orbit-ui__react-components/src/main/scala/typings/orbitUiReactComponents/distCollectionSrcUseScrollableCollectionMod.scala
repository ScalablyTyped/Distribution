package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Style
import typings.orbitUiReactComponents.anon.StyleHeight
import typings.react.mod.RefObject
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCollectionSrcUseScrollableCollectionMod {
  
  @JSImport("@orbit-ui/react-components/dist/collection/src/useScrollableCollection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useScrollableCollection(containerRef: RefObject[Element]): Style | StyleHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollableCollection")(containerRef.asInstanceOf[js.Any]).asInstanceOf[Style | StyleHeight]
  inline def useScrollableCollection(containerRef: RefObject[Element], param1: UseScrollableCollectionOptions): Style | StyleHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollableCollection")(containerRef.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Style | StyleHeight]
  
  trait UseScrollableCollectionOptions extends StObject {
    
    var borderHeight: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dividerSelector: js.UndefOr[String] = js.undefined
    
    var itemSelector: js.UndefOr[String] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var paddingHeight: js.UndefOr[Double] = js.undefined
    
    var sectionSelector: js.UndefOr[String] = js.undefined
  }
  object UseScrollableCollectionOptions {
    
    inline def apply(): UseScrollableCollectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseScrollableCollectionOptions]
    }
    
    extension [Self <: UseScrollableCollectionOptions](x: Self) {
      
      inline def setBorderHeight(value: Double): Self = StObject.set(x, "borderHeight", value.asInstanceOf[js.Any])
      
      inline def setBorderHeightUndefined: Self = StObject.set(x, "borderHeight", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDividerSelector(value: String): Self = StObject.set(x, "dividerSelector", value.asInstanceOf[js.Any])
      
      inline def setDividerSelectorUndefined: Self = StObject.set(x, "dividerSelector", js.undefined)
      
      inline def setItemSelector(value: String): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
      
      inline def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setPaddingHeight(value: Double): Self = StObject.set(x, "paddingHeight", value.asInstanceOf[js.Any])
      
      inline def setPaddingHeightUndefined: Self = StObject.set(x, "paddingHeight", js.undefined)
      
      inline def setSectionSelector(value: String): Self = StObject.set(x, "sectionSelector", value.asInstanceOf[js.Any])
      
      inline def setSectionSelectorUndefined: Self = StObject.set(x, "sectionSelector", js.undefined)
    }
  }
}
