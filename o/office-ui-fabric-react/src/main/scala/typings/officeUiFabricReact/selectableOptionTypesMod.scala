package typings.officeUiFabricReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectableOptionTypesMod {
  
  @js.native
  sealed trait SelectableOptionMenuItemType extends StObject
  @JSImport("office-ui-fabric-react/lib/utilities/selectableOption/SelectableOption.types", "SelectableOptionMenuItemType")
  @js.native
  object SelectableOptionMenuItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SelectableOptionMenuItemType with Double] = js.native
    
    @js.native
    sealed trait Divider extends SelectableOptionMenuItemType
    /* 1 */ val Divider: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Divider with Double = js.native
    
    @js.native
    sealed trait Header extends SelectableOptionMenuItemType
    /* 2 */ val Header: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Header with Double = js.native
    
    @js.native
    sealed trait Normal extends SelectableOptionMenuItemType
    /* 0 */ val Normal: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Normal with Double = js.native
  }
  
  @js.native
  trait ISelectableOption extends StObject {
    
    /**
      * The aria label for the dropdown option. If not present, the `text` will be used.
      */
    var ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * Data available to custom onRender functions.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /**
      * Whether the option is disabled
      * @defaultvalue false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether the option is hidden or not.
      * @defaultvalue false
      */
    var hidden: js.UndefOr[Boolean] = js.native
    
    /**
      * ID attribute associated with this option
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * Index for this option
      */
    var index: js.UndefOr[Double] = js.native
    
    /**
      * Text to render for this option
      */
    var itemType: js.UndefOr[SelectableOptionMenuItemType] = js.native
    
    /**
      * Arbitrary string associated with this option.
      */
    var key: String | Double = js.native
    
    /** If option is selected. */
    var selected: js.UndefOr[Boolean] = js.native
    
    /**
      * Text to render for this option
      */
    var text: String = js.native
    
    /**
      * Title attribute (built in tooltip) for a given option.
      */
    var title: js.UndefOr[String] = js.native
  }
  object ISelectableOption {
    
    @scala.inline
    def apply(key: String | Double, text: String): ISelectableOption = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISelectableOption]
    }
    
    @scala.inline
    implicit class ISelectableOptionMutableBuilder[Self <: ISelectableOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setItemType(value: SelectableOptionMenuItemType): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
