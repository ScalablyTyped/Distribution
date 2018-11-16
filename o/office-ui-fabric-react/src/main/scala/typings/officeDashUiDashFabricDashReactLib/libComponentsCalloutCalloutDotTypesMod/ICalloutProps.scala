package typings
package officeDashUiDashFabricDashReactLib.libComponentsCalloutCalloutDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICalloutProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  /**
       * If true the positioning logic will prefer to flip edges rather than to nudge the rectangle to fit within bounds,
       * thus making sure the element aligns perfectly with target's alignment edge
       */
  var alignTargetEdge: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Defines the element id referencing the element containing the description for the callout.
       */
  var ariaDescribedBy: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Accessible label text for callout.
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       *  Defines the element id referencing the element containing label text for callout.
       */
  var ariaLabelledBy: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The background color of the Callout in hex format ie. #ffffff.
       * @defaultvalue $ms-color-white
       */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The width of the beak.
       * @defaultvalue 16
       */
  var beakWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * The bounding rectangle for which  the contextual menu can appear in.
       */
  var bounds: js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.undefined
  /**
       * Set max height of callout
       * When not set the callout will expand with contents up to the bottom of the screen
       */
  var calloutMaxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * Custom width for callout including borders. If value is 0, no width is applied.
       * @defaultvalue 0
       */
  var calloutMaxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * Custom width for callout including borders. If value is 0, no width is applied.
       * @defaultvalue 0
       */
  var calloutWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * Optional callback to access the ICallout interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ICallout]] = js.undefined
  /**
       * If true the position returned will have the menu element cover the target.
       * If false then it will position next to the target;
       * @defaultvalue false
       */
  var coverTarget: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * How the element should be positioned
       * @defaultvalue DirectionalHint.BottomAutoEdge
       */
  var directionalHint: js.UndefOr[officeDashUiDashFabricDashReactLib.libCommonDirectionalHintMod.DirectionalHint] = js.undefined
  /**
       * If true the position will not change sides in an attempt to fit the callout within bounds.
       * It will still attempt to align it to whatever bounds are given.
       * @defaultvalue false
       */
  var directionalHintFixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * How the element should be positioned in RTL layouts.
       * If not specified, a mirror of `directionalHint` will be used instead
       */
  var directionalHintForRTL: js.UndefOr[officeDashUiDashFabricDashReactLib.libCommonDirectionalHintMod.DirectionalHint] = js.undefined
  /**
       * If true do not render on a new layer. If false render on a new layer.
       */
  var doNotLayer: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Specify the final height of the content.
       * To be used when expanding the content dynamically so that callout can adjust its position.
       */
  var finalHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * The gap between the Callout and the target
       * @defaultvalue 0
       */
  var gapSpace: js.UndefOr[scala.Double] = js.undefined
  /**
       * Manually set OverflowYHidden style prop to true on calloutMain element
       * A variety of callout load animations will need this to hide the scollbar that can appear
       */
  var hideOverflow: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true then the beak is visible. If false it will not be shown.
       * @defaultvalue true
       */
  var isBeakVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional props to pass to the Layer component hosting the panel.
       */
  var layerProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsLayerLayerDotTypesMod.ILayerProps
  ] = js.undefined
  /**
       * The minimum distance the callout will be away from the edge of the screen.
       *  @defaultvalue 8
       */
  var minPagePadding: js.UndefOr[scala.Double] = js.undefined
  /**
       * Callback when the Callout tries to close.
       */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /**
       * Optional callback when the layer content has mounted.
       */
  var onLayerMounted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Optional callback that is called once the callout has been correctly positioned.
       * @param positions - Gives the user information about how the callout is positioned such as the
       * final edge of the target that it positioned against, the beak position, and the beaks relationship to the
       * edges of the callout.
       */
  var onPositioned: js.UndefOr[
    js.Function1[
      /* positions */ js.UndefOr[
        officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.ICalloutPositionedInfo
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Callback when the Callout body is scrolled.
       */
  @JSName("onScroll")
  var onScroll_ICalloutProps: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * If true then the callout will not dismiss when it loses focus
       * @defaultvalue false
       */
  var preventDismissOnLostFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true then the callout will not dismiss on scroll
       * @defaultvalue false
       */
  var preventDismissOnScroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true then the callout will attempt to focus the first focusable element that it contains.
       * If it doesn't find an element, no focus will be set and the method will return false.
       * This means that it's the contents responsibility to either set focus or have
       * focusable items.
       * @returns True if focus was set, false if it was not.
       */
  var setInitialFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional styles for the component.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ICalloutContentStyleProps, ICalloutContentStyles]
  ] = js.undefined
  /**
       * The target that the Callout should try to position itself based on.
       * It can be either an Element a querySelector string of a valid Element
       * or a MouseEvent. If MouseEvent is given then the origin point of the event will be used.
       */
  var target: js.UndefOr[
    reactLib.Element | java.lang.String | reactLib.MouseEvent | atUifabricUtilitiesLib.libIPointMod.IPoint | scala.Null
  ] = js.undefined
  /**
       * Optional theme for component
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

