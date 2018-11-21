package typings
package officeDashUiDashFabricDashReactLib.libComponentsMarqueeSelectionMarqueeSelectionDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMarqueeSelectionProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  /**
       * Optional callback to access the IMarqueeSelection interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IMarqueeSelection]] = js.undefined
  /**
       * Optional flag to restrict the drag rect to the root element, instead of allowing the drag
       * rect to start outside of the root element boundaries.
       * @default false
       */
  var isDraggingConstrainedToRoot: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional flag to control the enabled state of marquee selection. This allows you to render
       * it and have events all ready to go, but conditionally disable it. That way transitioning
       * between enabled/disabled generate no difference in the DOM.
       * @default true
       */
  var isEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional callback that is called, when the mouse down event occurs, in order to determine
       * if we should start a marquee selection. If true is returned, we will cancel the mousedown
       * event to prevent upstream mousedown handlers from executing.
       */
  var onShouldStartSelection: js.UndefOr[js.Function1[/* ev */ reactLib.MouseEvent, scala.Boolean]] = js.undefined
  /**
       * Optional props to mix into the root DIV element.
       */
  var rootProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement]] = js.undefined
  /**
       * The selection object to interact with when updating selection changes.
       */
  var selection: officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.ISelection
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunction[IMarqueeSelectionStyleProps, IMarqueeSelectionStyles]
  ] = js.undefined
  /**
       * Theme (provided through customization.)
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

