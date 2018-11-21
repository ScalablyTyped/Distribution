package typings
package officeDashUiDashFabricDashReactLib.libComponentsBreadcrumbBreadcrumbDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBreadcrumbProps
  extends reactLib.reactMod.ReactNs.Props[
      officeDashUiDashFabricDashReactLib.libComponentsBreadcrumbBreadcrumbDotBaseMod.BreadcrumbBase
    ] {
  /**
       * Aria label to place on the navigation landmark for breadcrumb
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional root classname for the root breadcrumb element.
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional callback to access the IBreadcrumb interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IBreadcrumb]] = js.undefined
  /**
       * Render a custom divider in place of the default chevron '>'
       */
  var dividerAs: js.UndefOr[atUifabricUtilitiesLib.libIComponentAsMod.IComponentAs[IDividerAsProps]] = js.undefined
  /**
       * Collection of breadcrumbs to render
       */
  var items: js.Array[IBreadcrumbItem]
  /**
       * The maximum number of breadcrumbs to display before coalescing.
       * If not specified, all breadcrumbs will be rendered.
       */
  var maxDisplayedItems: js.UndefOr[scala.Double] = js.undefined
  /**
       * Method to call when reducing the length of the breadcrumb.
       * Return undefined to never reduce breadcrumb length
       */
  var onReduceData: js.UndefOr[
    js.Function1[
      /* data */ officeDashUiDashFabricDashReactLib.libComponentsBreadcrumbBreadcrumbDotBaseMod.IBreadCrumbData, 
      js.UndefOr[
        officeDashUiDashFabricDashReactLib.libComponentsBreadcrumbBreadcrumbDotBaseMod.IBreadCrumbData
      ]
    ]
  ] = js.undefined
  /** Method to call when trying to render an item. */
  var onRenderItem: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IBreadcrumbItem]] = js.undefined
  /**
       * Optional name to use for aria label on overflow button.
       */
  var overflowAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional index where overflow items will be collapsed. Defaults to 0.
       */
  var overflowIndex: js.UndefOr[scala.Double] = js.undefined
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IBreadcrumbStyleProps, IBreadcrumbStyles]
  ] = js.undefined
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

