package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcTypesMod.AriaLabelingProps
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDateInputSrcButtonPresetsMod {
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src/ButtonPresets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ButtonPresets(param0: ButtonPresetsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ButtonPresets")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ButtonPresetsProps
    extends StObject
       with AriaLabelingProps {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    def onSelectionChange(event: SyntheticEvent[typings.std.Element, Event], index: Double): Unit
    
    var selectedIndex: js.UndefOr[Double] = js.undefined
    
    var values: js.Array[String]
  }
  object ButtonPresetsProps {
    
    inline def apply(
      onSelectionChange: (SyntheticEvent[typings.std.Element, Event], Double) => Unit,
      values: js.Array[String]
    ): ButtonPresetsProps = {
      val __obj = js.Dynamic.literal(onSelectionChange = js.Any.fromFunction2(onSelectionChange), values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonPresetsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonPresetsProps] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnSelectionChange(value: (SyntheticEvent[typings.std.Element, Event], Double) => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction2(value))
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
