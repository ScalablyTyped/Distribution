package typings.officeUiFabricReact.facepileTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.facepileBaseMod.FacepileBase
import typings.officeUiFabricReact.personaTypesMod.IPersonaSharedProps
import typings.officeUiFabricReact.personaTypesMod.PersonaSize
import typings.react.mod.ClassAttributes
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFacepileProps extends ClassAttributes[FacepileBase] {
  
  /** Button properties for the add face button */
  var addButtonProps: js.UndefOr[IButtonProps] = js.native
  
  /** ARIA label for persona list */
  var ariaDescription: js.UndefOr[String] = js.native
  
  /**
    * Defines the aria label that the screen readers use when focus goes on a list of personas.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * Deprecated at v0.70, use `overflowButtonProps` instead.
    * @deprecated Use `overflowButtonProps` instead.
    */
  var chevronButtonProps: js.UndefOr[IButtonProps] = js.native
  
  /**
    * Additional css class to apply to the Facepile
    * @defaultvalue undefined
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Optional callback to access the IFacepile interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IFacepile]] = js.native
  
  /** Method to access properties on the underlying Persona control */
  var getPersonaProps: js.UndefOr[js.Function1[/* persona */ IFacepilePersona, IPersonaSharedProps]] = js.native
  
  /** Maximum number of personas to show */
  var maxDisplayablePersonas: js.UndefOr[Double] = js.native
  
  /** Optional custom renderer for the persona, gets called when there is one persona in personas array*/
  var onRenderPersona: js.UndefOr[IRenderFunction[IFacepilePersona]] = js.native
  
  /** Optional custom renderer for the persona coins, gets called when there are multiple persona in personas array*/
  var onRenderPersonaCoin: js.UndefOr[IRenderFunction[IFacepilePersona]] = js.native
  
  /** Properties for the overflow icon */
  var overflowButtonProps: js.UndefOr[IButtonProps] = js.native
  
  /** Type of overflow icon to use */
  var overflowButtonType: js.UndefOr[OverflowButtonType] = js.native
  
  /**
    * Personas to place in the overflow
    */
  var overflowPersonas: js.UndefOr[js.Array[IFacepilePersona]] = js.native
  
  /** Size to display the personas */
  var personaSize: js.UndefOr[PersonaSize] = js.native
  
  /**
    * Array of IPersonaProps that define each Persona.
    */
  var personas: js.Array[IFacepilePersona] = js.native
  
  /** Show add person button */
  var showAddButton: js.UndefOr[Boolean] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles]] = js.native
  
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}
object IFacepileProps {
  
  @scala.inline
  def apply(personas: js.Array[IFacepilePersona]): IFacepileProps = {
    val __obj = js.Dynamic.literal(personas = personas.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFacepileProps]
  }
  
  @scala.inline
  implicit class IFacepilePropsOps[Self <: IFacepileProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPersonasVarargs(value: IFacepilePersona*): Self = this.set("personas", js.Array(value :_*))
    
    @scala.inline
    def setPersonas(value: js.Array[IFacepilePersona]): Self = this.set("personas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddButtonProps(value: IButtonProps): Self = this.set("addButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddButtonProps: Self = this.set("addButtonProps", js.undefined)
    
    @scala.inline
    def setAriaDescription(value: String): Self = this.set("ariaDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaDescription: Self = this.set("ariaDescription", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setChevronButtonProps(value: IButtonProps): Self = this.set("chevronButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChevronButtonProps: Self = this.set("chevronButtonProps", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IFacepile | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IFacepile]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setGetPersonaProps(value: /* persona */ IFacepilePersona => IPersonaSharedProps): Self = this.set("getPersonaProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetPersonaProps: Self = this.set("getPersonaProps", js.undefined)
    
    @scala.inline
    def setMaxDisplayablePersonas(value: Double): Self = this.set("maxDisplayablePersonas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDisplayablePersonas: Self = this.set("maxDisplayablePersonas", js.undefined)
    
    @scala.inline
    def setOnRenderPersona(
      value: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderPersona", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderPersona: Self = this.set("onRenderPersona", js.undefined)
    
    @scala.inline
    def setOnRenderPersonaCoin(
      value: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderPersonaCoin", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderPersonaCoin: Self = this.set("onRenderPersonaCoin", js.undefined)
    
    @scala.inline
    def setOverflowButtonProps(value: IButtonProps): Self = this.set("overflowButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowButtonProps: Self = this.set("overflowButtonProps", js.undefined)
    
    @scala.inline
    def setOverflowButtonType(value: OverflowButtonType): Self = this.set("overflowButtonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowButtonType: Self = this.set("overflowButtonType", js.undefined)
    
    @scala.inline
    def setOverflowPersonasVarargs(value: IFacepilePersona*): Self = this.set("overflowPersonas", js.Array(value :_*))
    
    @scala.inline
    def setOverflowPersonas(value: js.Array[IFacepilePersona]): Self = this.set("overflowPersonas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowPersonas: Self = this.set("overflowPersonas", js.undefined)
    
    @scala.inline
    def setPersonaSize(value: PersonaSize): Self = this.set("personaSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonaSize: Self = this.set("personaSize", js.undefined)
    
    @scala.inline
    def setShowAddButton(value: Boolean): Self = this.set("showAddButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAddButton: Self = this.set("showAddButton", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IFacepileStyleProps => DeepPartial[IFacepileStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
