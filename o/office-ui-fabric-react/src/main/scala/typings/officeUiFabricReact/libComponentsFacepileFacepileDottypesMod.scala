package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonProps
import typings.officeUiFabricReact.libComponentsFacepileFacepileDotbaseMod.FacepileBase
import typings.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipProps
import typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaSharedProps
import typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.PersonaInitialsColor
import typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.PersonaSize
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import typings.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFacepileFacepileDottypesMod {
  
  @js.native
  sealed trait OverflowButtonType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Facepile/Facepile.types", "OverflowButtonType")
  @js.native
  object OverflowButtonType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OverflowButtonType & Double] = js.native
    
    /** +1 overflow icon */
    @js.native
    sealed trait descriptive
      extends StObject
         with OverflowButtonType
    /* 1 */ val descriptive: typings.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.OverflowButtonType.descriptive & Double = js.native
    
    /** Chevron overflow icon */
    @js.native
    sealed trait downArrow
      extends StObject
         with OverflowButtonType
    /* 3 */ val downArrow: typings.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.OverflowButtonType.downArrow & Double = js.native
    
    /** More overflow icon */
    @js.native
    sealed trait more
      extends StObject
         with OverflowButtonType
    /* 2 */ val more: typings.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.OverflowButtonType.more & Double = js.native
    
    /** No overflow */
    @js.native
    sealed trait none
      extends StObject
         with OverflowButtonType
    /* 0 */ val none: typings.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.OverflowButtonType.none & Double = js.native
  }
  
  trait IFacepile extends StObject
  
  trait IFacepilePersona
    extends StObject
       with ButtonHTMLAttributes[HTMLButtonElement | HTMLDivElement] {
    
    /**
      * Whether initials are calculated for phone numbers and number sequences.
      * Example: Set property to true to get initials for project names consisting of numbers only.
      * @defaultvalue false
      */
    var allowPhoneInitials: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Extra data - not used directly but can be handy for passing additional data to custom event
      * handlers.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * The user's initials to display in the image area when there is no image.
      * @defaultvalue [Derived from personaName]
      */
    var imageInitials: js.UndefOr[String] = js.undefined
    
    /**
      * Url to the image to use, should be a square aspect ratio and big enough to fit in the image area.
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The background color when the user's initials are displayed.
      * @defaultvalue [Derived from personaName]
      */
    var initialsColor: js.UndefOr[PersonaInitialsColor] = js.undefined
    
    /**
      * Optional keytip for this button that is only added when 'onClick' is defined for the persona
      */
    var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
    
    /**
      * If provided, persona will be rendered with cursor:pointer and the handler will be
      * called on click.
      */
    @JSName("onClick")
    var onClick_IFacepilePersona: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
          /* persona */ js.UndefOr[this.type], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * If provided, the handler will be called on mouse move.
      */
    @JSName("onMouseMove")
    var onMouseMove_IFacepilePersona: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
          /* persona */ js.UndefOr[this.type], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * If provided, the handler will be called when mouse moves out of the component.
      */
    @JSName("onMouseOut")
    var onMouseOut_IFacepilePersona: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
          /* persona */ js.UndefOr[this.type], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Name of the person.
      */
    var personaName: js.UndefOr[String] = js.undefined
  }
  object IFacepilePersona {
    
    inline def apply(): IFacepilePersona = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFacepilePersona]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFacepilePersona] (val x: Self) extends AnyVal {
      
      inline def setAllowPhoneInitials(value: Boolean): Self = StObject.set(x, "allowPhoneInitials", value.asInstanceOf[js.Any])
      
      inline def setAllowPhoneInitialsUndefined: Self = StObject.set(x, "allowPhoneInitials", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setImageInitials(value: String): Self = StObject.set(x, "imageInitials", value.asInstanceOf[js.Any])
      
      inline def setImageInitialsUndefined: Self = StObject.set(x, "imageInitials", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setInitialsColor(value: PersonaInitialsColor): Self = StObject.set(x, "initialsColor", value.asInstanceOf[js.Any])
      
      inline def setInitialsColorUndefined: Self = StObject.set(x, "initialsColor", js.undefined)
      
      inline def setKeytipProps(value: IKeytipProps): Self = StObject.set(x, "keytipProps", value.asInstanceOf[js.Any])
      
      inline def setKeytipPropsUndefined: Self = StObject.set(x, "keytipProps", js.undefined)
      
      inline def setOnClick(
        value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* persona */ js.UndefOr[IFacepilePersona]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseMove(
        value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* persona */ js.UndefOr[IFacepilePersona]) => Unit
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(
        value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* persona */ js.UndefOr[IFacepilePersona]) => Unit
      ): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction2(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setPersonaName(value: String): Self = StObject.set(x, "personaName", value.asInstanceOf[js.Any])
      
      inline def setPersonaNameUndefined: Self = StObject.set(x, "personaName", js.undefined)
    }
  }
  
  trait IFacepileProps
    extends StObject
       with ClassAttributes[FacepileBase] {
    
    /** Button properties for the add face button */
    var addButtonProps: js.UndefOr[IButtonProps] = js.undefined
    
    /** ARIA label for persona list */
    var ariaDescription: js.UndefOr[String] = js.undefined
    
    /**
      * Defines the aria label that the screen readers use when focus goes on a list of personas.
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Deprecated at v0.70, use `overflowButtonProps` instead.
      * @deprecated Use `overflowButtonProps` instead.
      */
    var chevronButtonProps: js.UndefOr[IButtonProps] = js.undefined
    
    /**
      * Additional css class to apply to the Facepile
      * @defaultvalue undefined
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Optional callback to access the IFacepile interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IFacepile]] = js.undefined
    
    /** Method to access properties on the underlying Persona control */
    var getPersonaProps: js.UndefOr[js.Function1[/* persona */ IFacepilePersona, IPersonaSharedProps]] = js.undefined
    
    /** Maximum number of personas to show */
    var maxDisplayablePersonas: js.UndefOr[Double] = js.undefined
    
    /** Optional custom renderer for the persona, gets called when there is one persona in personas array*/
    var onRenderPersona: js.UndefOr[IRenderFunction[IFacepilePersona]] = js.undefined
    
    /** Optional custom renderer for the persona coins, gets called when there are multiple persona in personas array*/
    var onRenderPersonaCoin: js.UndefOr[IRenderFunction[IFacepilePersona]] = js.undefined
    
    /** Properties for the overflow icon */
    var overflowButtonProps: js.UndefOr[IButtonProps] = js.undefined
    
    /** Type of overflow icon to use */
    var overflowButtonType: js.UndefOr[OverflowButtonType] = js.undefined
    
    /**
      * Personas to place in the overflow
      */
    var overflowPersonas: js.UndefOr[js.Array[IFacepilePersona]] = js.undefined
    
    /** Size to display the personas */
    var personaSize: js.UndefOr[PersonaSize] = js.undefined
    
    /**
      * Array of IPersonaProps that define each Persona.
      */
    var personas: js.Array[IFacepilePersona]
    
    /** Show add person button */
    var showAddButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the default tooltip (the persona name) is shown using the `title` prop.
      * Set this to false if you'd like to display a custom tooltip, for example using a custom renderer and TooltipHost
      * @defaultvalue true
      */
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles]] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IFacepileProps {
    
    inline def apply(personas: js.Array[IFacepilePersona]): IFacepileProps = {
      val __obj = js.Dynamic.literal(personas = personas.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFacepileProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFacepileProps] (val x: Self) extends AnyVal {
      
      inline def setAddButtonProps(value: IButtonProps): Self = StObject.set(x, "addButtonProps", value.asInstanceOf[js.Any])
      
      inline def setAddButtonPropsUndefined: Self = StObject.set(x, "addButtonProps", js.undefined)
      
      inline def setAriaDescription(value: String): Self = StObject.set(x, "ariaDescription", value.asInstanceOf[js.Any])
      
      inline def setAriaDescriptionUndefined: Self = StObject.set(x, "ariaDescription", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setChevronButtonProps(value: IButtonProps): Self = StObject.set(x, "chevronButtonProps", value.asInstanceOf[js.Any])
      
      inline def setChevronButtonPropsUndefined: Self = StObject.set(x, "chevronButtonProps", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IFacepile]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IFacepile | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setGetPersonaProps(value: /* persona */ IFacepilePersona => IPersonaSharedProps): Self = StObject.set(x, "getPersonaProps", js.Any.fromFunction1(value))
      
      inline def setGetPersonaPropsUndefined: Self = StObject.set(x, "getPersonaProps", js.undefined)
      
      inline def setMaxDisplayablePersonas(value: Double): Self = StObject.set(x, "maxDisplayablePersonas", value.asInstanceOf[js.Any])
      
      inline def setMaxDisplayablePersonasUndefined: Self = StObject.set(x, "maxDisplayablePersonas", js.undefined)
      
      inline def setOnRenderPersona(
        value: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderPersona", js.Any.fromFunction2(value))
      
      inline def setOnRenderPersonaCoin(
        value: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderPersonaCoin", js.Any.fromFunction2(value))
      
      inline def setOnRenderPersonaCoinUndefined: Self = StObject.set(x, "onRenderPersonaCoin", js.undefined)
      
      inline def setOnRenderPersonaUndefined: Self = StObject.set(x, "onRenderPersona", js.undefined)
      
      inline def setOverflowButtonProps(value: IButtonProps): Self = StObject.set(x, "overflowButtonProps", value.asInstanceOf[js.Any])
      
      inline def setOverflowButtonPropsUndefined: Self = StObject.set(x, "overflowButtonProps", js.undefined)
      
      inline def setOverflowButtonType(value: OverflowButtonType): Self = StObject.set(x, "overflowButtonType", value.asInstanceOf[js.Any])
      
      inline def setOverflowButtonTypeUndefined: Self = StObject.set(x, "overflowButtonType", js.undefined)
      
      inline def setOverflowPersonas(value: js.Array[IFacepilePersona]): Self = StObject.set(x, "overflowPersonas", value.asInstanceOf[js.Any])
      
      inline def setOverflowPersonasUndefined: Self = StObject.set(x, "overflowPersonas", js.undefined)
      
      inline def setOverflowPersonasVarargs(value: IFacepilePersona*): Self = StObject.set(x, "overflowPersonas", js.Array(value*))
      
      inline def setPersonaSize(value: PersonaSize): Self = StObject.set(x, "personaSize", value.asInstanceOf[js.Any])
      
      inline def setPersonaSizeUndefined: Self = StObject.set(x, "personaSize", js.undefined)
      
      inline def setPersonas(value: js.Array[IFacepilePersona]): Self = StObject.set(x, "personas", value.asInstanceOf[js.Any])
      
      inline def setPersonasVarargs(value: IFacepilePersona*): Self = StObject.set(x, "personas", js.Array(value*))
      
      inline def setShowAddButton(value: Boolean): Self = StObject.set(x, "showAddButton", value.asInstanceOf[js.Any])
      
      inline def setShowAddButtonUndefined: Self = StObject.set(x, "showAddButton", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IFacepileStyleProps => DeepPartial[IFacepileStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IFacepileStyleProps extends StObject {
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Pixel value for spacing around button. Number value set in pixels
      */
    var spacingAroundItemButton: js.UndefOr[Double] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: ITheme
  }
  object IFacepileStyleProps {
    
    inline def apply(theme: ITheme): IFacepileStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFacepileStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFacepileStyleProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setSpacingAroundItemButton(value: Double): Self = StObject.set(x, "spacingAroundItemButton", value.asInstanceOf[js.Any])
      
      inline def setSpacingAroundItemButtonUndefined: Self = StObject.set(x, "spacingAroundItemButton", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFacepileStyles extends StObject {
    
    var addButton: IStyle
    
    var descriptiveOverflowButton: IStyle
    
    var itemButton: IStyle
    
    var itemContainer: IStyle
    
    var member: IStyle
    
    var members: IStyle
    
    var overflowButton: IStyle
    
    var overflowInitialsIcon: IStyle
    
    /**
      * Style for the root element.
      */
    var root: IStyle
    
    var screenReaderOnly: IStyle
  }
  object IFacepileStyles {
    
    inline def apply(): IFacepileStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFacepileStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFacepileStyles] (val x: Self) extends AnyVal {
      
      inline def setAddButton(value: IStyle): Self = StObject.set(x, "addButton", value.asInstanceOf[js.Any])
      
      inline def setAddButtonNull: Self = StObject.set(x, "addButton", null)
      
      inline def setAddButtonUndefined: Self = StObject.set(x, "addButton", js.undefined)
      
      inline def setDescriptiveOverflowButton(value: IStyle): Self = StObject.set(x, "descriptiveOverflowButton", value.asInstanceOf[js.Any])
      
      inline def setDescriptiveOverflowButtonNull: Self = StObject.set(x, "descriptiveOverflowButton", null)
      
      inline def setDescriptiveOverflowButtonUndefined: Self = StObject.set(x, "descriptiveOverflowButton", js.undefined)
      
      inline def setItemButton(value: IStyle): Self = StObject.set(x, "itemButton", value.asInstanceOf[js.Any])
      
      inline def setItemButtonNull: Self = StObject.set(x, "itemButton", null)
      
      inline def setItemButtonUndefined: Self = StObject.set(x, "itemButton", js.undefined)
      
      inline def setItemContainer(value: IStyle): Self = StObject.set(x, "itemContainer", value.asInstanceOf[js.Any])
      
      inline def setItemContainerNull: Self = StObject.set(x, "itemContainer", null)
      
      inline def setItemContainerUndefined: Self = StObject.set(x, "itemContainer", js.undefined)
      
      inline def setMember(value: IStyle): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
      
      inline def setMemberNull: Self = StObject.set(x, "member", null)
      
      inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
      
      inline def setMembers(value: IStyle): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersNull: Self = StObject.set(x, "members", null)
      
      inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      inline def setOverflowButton(value: IStyle): Self = StObject.set(x, "overflowButton", value.asInstanceOf[js.Any])
      
      inline def setOverflowButtonNull: Self = StObject.set(x, "overflowButton", null)
      
      inline def setOverflowButtonUndefined: Self = StObject.set(x, "overflowButton", js.undefined)
      
      inline def setOverflowInitialsIcon(value: IStyle): Self = StObject.set(x, "overflowInitialsIcon", value.asInstanceOf[js.Any])
      
      inline def setOverflowInitialsIconNull: Self = StObject.set(x, "overflowInitialsIcon", null)
      
      inline def setOverflowInitialsIconUndefined: Self = StObject.set(x, "overflowInitialsIcon", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setScreenReaderOnly(value: IStyle): Self = StObject.set(x, "screenReaderOnly", value.asInstanceOf[js.Any])
      
      inline def setScreenReaderOnlyNull: Self = StObject.set(x, "screenReaderOnly", null)
      
      inline def setScreenReaderOnlyUndefined: Self = StObject.set(x, "screenReaderOnly", js.undefined)
    }
  }
}
