package typings.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonProps
import typings.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotBaseMod.FacepileBase
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaSharedProps
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.PersonaSize
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFacepileProps extends ClassAttributes[FacepileBase] {
  /** Button properties for the add face button */
  var addButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /** ARIA label for persona list */
  var ariaDescription: js.UndefOr[String] = js.undefined
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
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles]] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IFacepileProps {
  @scala.inline
  def apply(
    personas: js.Array[IFacepilePersona],
    addButtonProps: IButtonProps = null,
    ariaDescription: String = null,
    chevronButtonProps: IButtonProps = null,
    className: String = null,
    componentRef: IRefObject[IFacepile] = null,
    getPersonaProps: /* persona */ IFacepilePersona => IPersonaSharedProps = null,
    key: Key = null,
    maxDisplayablePersonas: Int | Double = null,
    onRenderPersona: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], Element | Null]]) => Element | Null = null,
    onRenderPersonaCoin: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], Element | Null]]) => Element | Null = null,
    overflowButtonProps: IButtonProps = null,
    overflowButtonType: OverflowButtonType = null,
    overflowPersonas: js.Array[IFacepilePersona] = null,
    personaSize: PersonaSize = null,
    ref: LegacyRef[FacepileBase] = null,
    showAddButton: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles] = null,
    theme: ITheme = null
  ): IFacepileProps = {
    val __obj = js.Dynamic.literal(personas = personas)
    if (addButtonProps != null) __obj.updateDynamic("addButtonProps")(addButtonProps)
    if (ariaDescription != null) __obj.updateDynamic("ariaDescription")(ariaDescription)
    if (chevronButtonProps != null) __obj.updateDynamic("chevronButtonProps")(chevronButtonProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (getPersonaProps != null) __obj.updateDynamic("getPersonaProps")(js.Any.fromFunction1(getPersonaProps))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxDisplayablePersonas != null) __obj.updateDynamic("maxDisplayablePersonas")(maxDisplayablePersonas.asInstanceOf[js.Any])
    if (onRenderPersona != null) __obj.updateDynamic("onRenderPersona")(js.Any.fromFunction2(onRenderPersona))
    if (onRenderPersonaCoin != null) __obj.updateDynamic("onRenderPersonaCoin")(js.Any.fromFunction2(onRenderPersonaCoin))
    if (overflowButtonProps != null) __obj.updateDynamic("overflowButtonProps")(overflowButtonProps)
    if (overflowButtonType != null) __obj.updateDynamic("overflowButtonType")(overflowButtonType)
    if (overflowPersonas != null) __obj.updateDynamic("overflowPersonas")(overflowPersonas)
    if (personaSize != null) __obj.updateDynamic("personaSize")(personaSize)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(showAddButton)) __obj.updateDynamic("showAddButton")(showAddButton)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IFacepileProps]
  }
}

