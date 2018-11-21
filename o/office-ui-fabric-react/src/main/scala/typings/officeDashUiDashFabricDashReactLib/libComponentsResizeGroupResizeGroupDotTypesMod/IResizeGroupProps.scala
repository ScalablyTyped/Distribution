package typings
package officeDashUiDashFabricDashReactLib.libComponentsResizeGroupResizeGroupDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IResizeGroupProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[
      officeDashUiDashFabricDashReactLib.libComponentsResizeGroupResizeGroupDotBaseMod.ResizeGroupBase | reactLib.HTMLElement
    ] {
  /**
       * Optional callback to access the IResizeGroup interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IResizeGroup]] = js.undefined
  /**
       * Initial data to be passed to the onRenderData function. When there is no onGrowData provided, this data should represent what should
       * be passed to the render function when the parent container of the ResizeGroup is at it's maximum supported width. A cacheKey property
       * may optionally be included as part of the data. Two data objects with the same cacheKey will be assumed to take up the
       * same width and will prevent measurements. The type of cacheKey is a string.
       */
  var data: js.Any
  /**
       * Function to be called every time data is rendered. It provides the data that was actually rendered.
       * A use case would be adding telemetry when a particular control is shown in an overflow well or
       * dropped as a result of onReduceData or to count the number of renders that an implementation of
       * onReduceData triggers.
       */
  var dataDidRender: js.UndefOr[js.Function1[/* renderedData */ js.Any, scala.Unit]] = js.undefined
  /**
       * Function to be performed on the data in order to increase its width. It is called in scenarios where the
       * container has more room than the previous render and we may be able to fit more content. If there are no more
       * scaling operations to perform on teh data, it should return undefined to prevent an infinite render loop.
       */
  var onGrowData: js.UndefOr[js.Function1[/* prevData */ js.Any, _]] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules
       * @deprecated Removed to reduce bundle size.  Please use className and add css rules to className instead.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IResizeGroupStyleProps, IResizeGroupStyles]
  ] = js.undefined
  /**
       * Theme provided by HOC.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * Function to be performed on the data in order to reduce its width and make it fit into the given space.
       * If there are no more scaling steps to apply, it should return undefined to prevent
       * an infinite render loop.
       */
  def onReduceData(prevData: js.Any): js.Any
  /**
       * Function to render the data. Called when rendering the contents to the screen and when
       * rendering in a hidden div to measure the size of the contents.
       */
  def onRenderData(data: js.Any): reactLib.reactMod.Global.JSXNs.Element
}

