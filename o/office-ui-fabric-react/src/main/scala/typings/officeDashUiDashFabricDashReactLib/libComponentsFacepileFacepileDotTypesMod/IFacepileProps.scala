package typings
package officeDashUiDashFabricDashReactLib.libComponentsFacepileFacepileDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IFacepileProps
  extends reactLib.reactMod.ReactNs.Props[
      officeDashUiDashFabricDashReactLib.libComponentsFacepileFacepileDotBaseMod.FacepileBase
    ] {
  /** Button properties for the add face button */
  var addButtonProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonProps
  ] = js.undefined
  /** ARIA label for persona list */
  var ariaDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Deprecated at v0.70, use 'overflowButtonProps' instead;
       * @deprecated
       */
  var chevronButtonProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonProps
  ] = js.undefined
  /**
       * Additional css class to apply to the Facepile
       * @defaultvalue undefined
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional callback to access the IFacepile interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IFacepile]] = js.undefined
  /** Method to access properties on the underlying Persona control */
  var getPersonaProps: js.UndefOr[
    js.Function1[
      /* persona */ IFacepilePersona, 
      officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaSharedProps
    ]
  ] = js.undefined
  /** Maximum number of personas to show */
  var maxDisplayablePersonas: js.UndefOr[scala.Double] = js.undefined
  /** Properties for the overflow icon */
  var overflowButtonProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonProps
  ] = js.undefined
  /** Type of overflow icon to use */
  var overflowButtonType: js.UndefOr[OverflowButtonType] = js.undefined
  /**
       * Personas to place in the overflow
       */
  var overflowPersonas: js.UndefOr[js.Array[IFacepilePersona]] = js.undefined
  /** Size to display the personas */
  var personaSize: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.PersonaSize
  ] = js.undefined
  /**
       * Array of IPersonaProps that define each Persona.
       */
  var personas: js.Array[IFacepilePersona]
  /** Show add person button */
  var showAddButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles]
  ] = js.undefined
  /**
       * Theme provided by High-Order Component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

