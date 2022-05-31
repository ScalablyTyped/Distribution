package typings.oracleOraclejet.ojselectcomboboxMod

import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.ojeditablevalueMod.editableValue
import typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.ojAnimateEnd
import typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.ojAnimateStart
import typings.std.CustomEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojCombobox[V, SP /* <: ojComboboxSettableProperties[V, SV, RV] */, SV, RV]
  extends StObject
     with editableValue[V, SP, SV, RV] {
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojCombobox: (js.Function1[/* event */ ojAnimateEnd, js.Any]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojCombobox: (js.Function1[/* event */ ojAnimateStart, js.Any]) | Null = js.native
  
  def setProperties(properties: ojComboboxSettablePropertiesLenient[V, SV, RV]): Unit = js.native
  
  def validate(): js.Promise[js.Any] = js.native
}
object ojCombobox {
  
  // tslint:disable-next-line interface-over-type-literal
  trait Optgroup extends StObject {
    
    var children: js.Array[
        typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
      ]
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: String
  }
  object Optgroup {
    
    inline def apply(
      children: js.Array[
          typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
        ],
      label: String
    ): typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup]
    }
    
    extension [Self <: typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup](x: Self) {
      
      inline def setChildren(
        value: js.Array[
              typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(
        value: (typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup)*
      ): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait Option extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var value: js.Any
  }
  object Option {
    
    inline def apply(value: js.Any): typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option]
    }
    
    extension [Self <: typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait OptionContext extends StObject {
    
    var component: Element
    
    var data: js.Object
    
    var depth: Double
    
    var index: Double
    
    var leaf: Boolean
    
    var parent: Element
    
    var parentElement: Element
  }
  object OptionContext {
    
    inline def apply(
      component: Element,
      data: js.Object,
      depth: Double,
      index: Double,
      leaf: Boolean,
      parent: Element,
      parentElement: Element
    ): OptionContext = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionContext]
    }
    
    extension [Self <: OptionContext](x: Self) {
      
      inline def setComponent(value: Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLeaf(value: Boolean): Self = StObject.set(x, "leaf", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait OptionsKeys extends StObject {
    
    var childKeys: js.UndefOr[OptionsKeys] = js.undefined
    
    var children: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object OptionsKeys {
    
    inline def apply(): OptionsKeys = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsKeys]
    }
    
    extension [Self <: OptionsKeys](x: Self) {
      
      inline def setChildKeys(value: OptionsKeys): Self = StObject.set(x, "childKeys", value.asInstanceOf[js.Any])
      
      inline def setChildKeysUndefined: Self = StObject.set(x, "childKeys", js.undefined)
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type ojAnimateEnd = CustomEvent[Action]
  
  type ojAnimateStart = CustomEvent[typings.oracleOraclejet.anon.Element]
}
