package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.typesMod.AriaLabelingProps
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuPresetsMod {
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src/MenuPresets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MenuPresets(hasValuesSelectedIndexOnSelectionChange: MenuPresetsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuPresets")(hasValuesSelectedIndexOnSelectionChange.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MenuPresetsProps
    extends StObject
       with AriaLabelingProps {
    
    def onSelectionChange(event: SyntheticEvent[typings.std.Element, Event], index: Double): Unit
    
    var selectedIndex: js.UndefOr[Double] = js.undefined
    
    var values: js.Array[String]
  }
  object MenuPresetsProps {
    
    inline def apply(
      onSelectionChange: (SyntheticEvent[typings.std.Element, Event], Double) => Unit,
      values: js.Array[String]
    ): MenuPresetsProps = {
      val __obj = js.Dynamic.literal(onSelectionChange = js.Any.fromFunction2(onSelectionChange), values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuPresetsProps]
    }
    
    extension [Self <: MenuPresetsProps](x: Self) {
      
      inline def setOnSelectionChange(value: (SyntheticEvent[typings.std.Element, Event], Double) => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction2(value))
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
