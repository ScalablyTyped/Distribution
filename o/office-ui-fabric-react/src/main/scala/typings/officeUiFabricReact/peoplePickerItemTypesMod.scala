package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.IPersonaPropsValidationSt
import typings.officeUiFabricReact.basePickerTypesMod.IBasePickerSuggestionsProps
import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typings.officeUiFabricReact.personaTypesMod.IPersonaCoinStyleProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaStyleProps
import typings.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peoplePickerItemTypesMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSharedProps because var conflicts: className. Inlined theme */ trait IPeoplePickerItemSelectedProps
    extends StObject
       with IPickerItemProps[IPersonaPropsValidationSt] {
    
    /** Call to provide customized styling that will layer on top of the variant rules. */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[IPeoplePickerItemSelectedStyleProps, IPeoplePickerItemSelectedStyles]
      ] = js.undefined
    
    /** Theme provided by High-Order Component. */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IPeoplePickerItemSelectedProps {
    
    @scala.inline
    def apply(IPickerItemProps: IPickerItemProps[IPersonaPropsValidationSt]): IPeoplePickerItemSelectedProps = {
      val __obj = js.Dynamic.literal()
      js.Dynamic.global.Object.assign(__obj, IPickerItemProps)
      __obj.asInstanceOf[IPeoplePickerItemSelectedProps]
    }
    
    @scala.inline
    implicit class IPeoplePickerItemSelectedPropsMutableBuilder[Self <: IPeoplePickerItemSelectedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(
        value: IStyleFunctionOrObject[IPeoplePickerItemSelectedStyleProps, IPeoplePickerItemSelectedStyles]
      ): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IPeoplePickerItemSelectedStyleProps => DeepPartial[IPeoplePickerItemSelectedStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/PeoplePickerItem.types.IPeoplePickerItemSelectedProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/PeoplePickerItem.types.IPeoplePickerItemSelectedProps, 'className' | 'selected' | 'disabled'> & {  invalid :boolean | undefined} */
  trait IPeoplePickerItemSelectedStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Whether it's invalid. */
    var invalid: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var theme: ITheme
  }
  object IPeoplePickerItemSelectedStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IPeoplePickerItemSelectedStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPeoplePickerItemSelectedStyleProps]
    }
    
    @scala.inline
    implicit class IPeoplePickerItemSelectedStylePropsMutableBuilder[Self <: IPeoplePickerItemSelectedStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPeoplePickerItemSelectedStyles extends StObject {
    
    /** Refers to the element holding the content (Persona) of the PeoplePicker item already picked. */
    var itemContent: IStyle
    
    /** Refers to the remove action button on a picked PeoplePicker item. */
    var removeButton: IStyle
    
    /** Root element of picked PeoplePicker item */
    var root: IStyle
    
    /** SubComponent (Persona, PersonaCoin) styles. */
    var subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles
  }
  object IPeoplePickerItemSelectedStyles {
    
    @scala.inline
    def apply(subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles): IPeoplePickerItemSelectedStyles = {
      val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPeoplePickerItemSelectedStyles]
    }
    
    @scala.inline
    implicit class IPeoplePickerItemSelectedStylesMutableBuilder[Self <: IPeoplePickerItemSelectedStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemContent(value: IStyle): Self = StObject.set(x, "itemContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemContentNull: Self = StObject.set(x, "itemContent", null)
      
      @scala.inline
      def setItemContentUndefined: Self = StObject.set(x, "itemContent", js.undefined)
      
      @scala.inline
      def setRemoveButton(value: IStyle): Self = StObject.set(x, "removeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveButtonNull: Self = StObject.set(x, "removeButton", null)
      
      @scala.inline
      def setRemoveButtonUndefined: Self = StObject.set(x, "removeButton", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSubComponentStyles(value: IPeoplePickerItemSelectedSubComponentStyles): Self = StObject.set(x, "subComponentStyles", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPeoplePickerItemSelectedSubComponentStyles extends StObject {
    
    /** Refers to the Persona rendered within the PeoplePickerItemSelected */
    var persona: IStyleFunctionOrObject[IPersonaStyleProps, js.Any]
    
    /** Refers to the PersonaCoin in the Persona rendered within the PeoplePickerItemSelected */
    var personaCoin: js.UndefOr[IStyleFunctionOrObject[IPersonaCoinStyleProps, js.Any]] = js.undefined
  }
  object IPeoplePickerItemSelectedSubComponentStyles {
    
    @scala.inline
    def apply(persona: IStyleFunctionOrObject[IPersonaStyleProps, js.Any]): IPeoplePickerItemSelectedSubComponentStyles = {
      val __obj = js.Dynamic.literal(persona = persona.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPeoplePickerItemSelectedSubComponentStyles]
    }
    
    @scala.inline
    implicit class IPeoplePickerItemSelectedSubComponentStylesMutableBuilder[Self <: IPeoplePickerItemSelectedSubComponentStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPersona(value: IStyleFunctionOrObject[IPersonaStyleProps, js.Any]): Self = StObject.set(x, "persona", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonaCoin(value: IStyleFunctionOrObject[IPersonaCoinStyleProps, js.Any]): Self = StObject.set(x, "personaCoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonaCoinFunction1(value: IPersonaCoinStyleProps => DeepPartial[js.Any]): Self = StObject.set(x, "personaCoin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPersonaCoinUndefined: Self = StObject.set(x, "personaCoin", js.undefined)
      
      @scala.inline
      def setPersonaFunction1(value: IPersonaStyleProps => DeepPartial[js.Any]): Self = StObject.set(x, "persona", js.Any.fromFunction1(value))
    }
  }
  
  trait IPeoplePickerItemSharedProps extends StObject {
    
    /** Additional CSS class(es) to apply to the PeoplePickerItem root element. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Theme provided by High-Order Component. */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IPeoplePickerItemSharedProps {
    
    @scala.inline
    def apply(): IPeoplePickerItemSharedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPeoplePickerItemSharedProps]
    }
    
    @scala.inline
    implicit class IPeoplePickerItemSharedPropsMutableBuilder[Self <: IPeoplePickerItemSharedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IPeoplePickerItemSuggestionProps
    extends StObject
       with IPeoplePickerItemSharedProps {
    
    /**
      * Flag that controls whether each suggested PeoplePicker item (Persona) is rendered with or without secondary text
      * for compact look.
      * @defaultvalue false
      */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /** Persona props for each suggested for picking PeoplePicker item. */
    var personaProps: js.UndefOr[IPersonaProps] = js.undefined
    
    /** Call to provide customized styling that will layer on top of the variant rules. */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[IPeoplePickerItemSuggestionStyleProps, IPeoplePickerItemSuggestionStyles]
      ] = js.undefined
    
    /** General common props for all PeoplePicker items suggestions. */
    var suggestionsProps: js.UndefOr[IBasePickerSuggestionsProps[js.Any]] = js.undefined
  }
  object IPeoplePickerItemSuggestionProps {
    
    @scala.inline
    def apply(): IPeoplePickerItemSuggestionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPeoplePickerItemSuggestionProps]
    }
    
    @scala.inline
    implicit class IPeoplePickerItemSuggestionPropsMutableBuilder[Self <: IPeoplePickerItemSuggestionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setPersonaProps(value: IPersonaProps): Self = StObject.set(x, "personaProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonaPropsUndefined: Self = StObject.set(x, "personaProps", js.undefined)
      
      @scala.inline
      def setStyles(
        value: IStyleFunctionOrObject[IPeoplePickerItemSuggestionStyleProps, IPeoplePickerItemSuggestionStyles]
      ): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IPeoplePickerItemSuggestionStyleProps => DeepPartial[IPeoplePickerItemSuggestionStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setSuggestionsProps(value: IBasePickerSuggestionsProps[js.Any]): Self = StObject.set(x, "suggestionsProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsPropsUndefined: Self = StObject.set(x, "suggestionsProps", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/PeoplePickerItem.types.IPeoplePickerItemSuggestionProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/PeoplePickerItem.types.IPeoplePickerItemSuggestionProps, 'className'> & {} */
  trait IPeoplePickerItemSuggestionStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var theme: ITheme
  }
  object IPeoplePickerItemSuggestionStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IPeoplePickerItemSuggestionStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPeoplePickerItemSuggestionStyleProps]
    }
    
    @scala.inline
    implicit class IPeoplePickerItemSuggestionStylePropsMutableBuilder[Self <: IPeoplePickerItemSuggestionStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPeoplePickerItemSuggestionStyles extends StObject {
    
    /** Refers to the element wrapping the Persona of the suggested PeoplePicker item. */
    var personaWrapper: IStyle
    
    /** Root container element of a suggested PeoplePicker item. */
    var root: IStyle
    
    /** SubComponent (Persona, PersonaCoin) styles. */
    var subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles
  }
  object IPeoplePickerItemSuggestionStyles {
    
    @scala.inline
    def apply(subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles): IPeoplePickerItemSuggestionStyles = {
      val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPeoplePickerItemSuggestionStyles]
    }
    
    @scala.inline
    implicit class IPeoplePickerItemSuggestionStylesMutableBuilder[Self <: IPeoplePickerItemSuggestionStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPersonaWrapper(value: IStyle): Self = StObject.set(x, "personaWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonaWrapperNull: Self = StObject.set(x, "personaWrapper", null)
      
      @scala.inline
      def setPersonaWrapperUndefined: Self = StObject.set(x, "personaWrapper", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSubComponentStyles(value: IPeoplePickerItemSelectedSubComponentStyles): Self = StObject.set(x, "subComponentStyles", value.asInstanceOf[js.Any])
    }
  }
  
  type IPeoplePickerItemWithMenuProps = IPickerItemProps[IPersonaWithMenu]
  
  trait IPersonaWithMenu
    extends StObject
       with IPersonaProps {
    
    /** Additional menuItems to be rendered in a contextualMenu for each Persona. */
    var menuItems: js.UndefOr[js.Array[IContextualMenuItem]] = js.undefined
  }
  object IPersonaWithMenu {
    
    @scala.inline
    def apply(): IPersonaWithMenu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPersonaWithMenu]
    }
    
    @scala.inline
    implicit class IPersonaWithMenuMutableBuilder[Self <: IPersonaWithMenu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMenuItems(value: js.Array[IContextualMenuItem]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
      
      @scala.inline
      def setMenuItemsVarargs(value: IContextualMenuItem*): Self = StObject.set(x, "menuItems", js.Array(value :_*))
    }
  }
}
