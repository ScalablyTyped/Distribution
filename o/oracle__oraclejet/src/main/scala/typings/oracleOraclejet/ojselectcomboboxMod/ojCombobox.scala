package typings.oracleOraclejet.ojselectcomboboxMod

import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.ojeditablevalueMod.editableValue
import typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.ojAnimateEnd
import typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.ojAnimateStart
import typings.std.CustomEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojCombobox[V, SP /* <: ojComboboxSettableProperties[V, SV, RV] */, SV, RV] extends editableValue[V, SP, SV, RV] {
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojCombobox: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojCombobox: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  
  def setProperties(properties: ojComboboxSettablePropertiesLenient[V, SV, RV]): Unit = js.native
  
  def validate(): js.Promise[_] = js.native
}
object ojCombobox {
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait Optgroup extends StObject {
    
    var children: js.Array[
        typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
      ] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var label: String = js.native
  }
  object Optgroup {
    
    @scala.inline
    def apply(
      children: js.Array[
          typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
        ],
      label: String
    ): typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup]
    }
    
    @scala.inline
    implicit class OptgroupMutableBuilder[Self <: typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(
        value: js.Array[
              typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(
        value: (typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup)*
      ): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait Option extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var value: js.Any = js.native
  }
  object Option {
    
    @scala.inline
    def apply(value: js.Any): typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait OptionContext extends StObject {
    
    var component: Element = js.native
    
    var data: js.Object = js.native
    
    var depth: Double = js.native
    
    var index: Double = js.native
    
    var leaf: Boolean = js.native
    
    var parent: Element = js.native
    
    var parentElement: Element = js.native
  }
  object OptionContext {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class OptionContextMutableBuilder[Self <: OptionContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeaf(value: Boolean): Self = StObject.set(x, "leaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait OptionsKeys extends StObject {
    
    var childKeys: js.UndefOr[OptionsKeys] = js.native
    
    var children: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object OptionsKeys {
    
    @scala.inline
    def apply(): OptionsKeys = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsKeys]
    }
    
    @scala.inline
    implicit class OptionsKeysMutableBuilder[Self <: OptionsKeys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildKeys(value: OptionsKeys): Self = StObject.set(x, "childKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildKeysUndefined: Self = StObject.set(x, "childKeys", js.undefined)
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type ojAnimateEnd = CustomEvent[Action]
  
  type ojAnimateStart = CustomEvent[typings.oracleOraclejet.anon.Element]
}
