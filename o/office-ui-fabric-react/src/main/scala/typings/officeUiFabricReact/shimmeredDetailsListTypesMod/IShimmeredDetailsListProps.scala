package typings.officeUiFabricReact.shimmeredDetailsListTypesMod

import typings.officeUiFabricReact.detailsListTypesMod.IDetailsListStyleProps
import typings.officeUiFabricReact.detailsListTypesMod.IDetailsListStyles
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps
import typings.react.mod.ReactNode
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleSet.Diff<keyof office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'styles'> ]: office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps[P]} */ trait IShimmeredDetailsListProps extends js.Object {
  /**
    * Aria label for shimmer. Set on grid while shimmer is enabled.
    */
  var ariaLabelForShimmer: js.UndefOr[String] = js.undefined
  /**
    * DetailsList styles to pass through.
    */
  var detailsListStyles: js.UndefOr[IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]] = js.undefined
  /**
    * Boolean flag to control when to render placeholders vs real items.
    * It's up to the consumer app to know when fetching of the data is done to toggle this prop.
    */
  var enableShimmer: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom placeholder renderer to be used when in need to override the default placeholder of a DetailsRow.
    * `rowProps` argument is passed to leverage the calculated column measurements done by DetailsList
    * or you can use the optional arguments of item `index` and `defaultRender` to execute additional
    * logic before rendering the default placeholder.
    */
  var onRenderCustomPlaceholder: js.UndefOr[
    js.Function3[
      /* rowProps */ IDetailsRowProps, 
      /* index */ js.UndefOr[Double], 
      /* defaultRender */ js.UndefOr[js.Function1[/* props */ IDetailsRowProps, ReactNode]], 
      ReactNode
    ]
  ] = js.undefined
  /**
    * Determines whether to remove a fading out to bottom overlay over the shimmering items
    * used to further emphasize the unknown number of items that will be fetched.
    */
  var removeFadingOverlay: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of shimmer placeholder lines to render.
    * @defaultvalue 10
    */
  var shimmerLines: js.UndefOr[Double] = js.undefined
  /**
    * Custom styles to override the styles specific to the ShimmeredDetailsList root area.
    * @deprecated Use `styles` prop instead. Any value provided will be ignored.
    */
  var shimmerOverlayStyles: js.UndefOr[
    IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]
  ] = js.undefined
  /**
    * Custom styles to override the styles specific to the ShimmeredDetailsList root area.
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]
  ] = js.undefined
}

object IShimmeredDetailsListProps {
  @scala.inline
  def apply(
    ariaLabelForShimmer: String = null,
    detailsListStyles: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles] = null,
    enableShimmer: js.UndefOr[Boolean] = js.undefined,
    onRenderCustomPlaceholder: (/* rowProps */ IDetailsRowProps, /* index */ js.UndefOr[Double], /* defaultRender */ js.UndefOr[js.Function1[/* props */ IDetailsRowProps, ReactNode]]) => ReactNode = null,
    removeFadingOverlay: js.UndefOr[Boolean] = js.undefined,
    shimmerLines: Int | Double = null,
    shimmerOverlayStyles: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles] = null,
    styles: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles] = null
  ): IShimmeredDetailsListProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabelForShimmer != null) __obj.updateDynamic("ariaLabelForShimmer")(ariaLabelForShimmer.asInstanceOf[js.Any])
    if (detailsListStyles != null) __obj.updateDynamic("detailsListStyles")(detailsListStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(enableShimmer)) __obj.updateDynamic("enableShimmer")(enableShimmer.asInstanceOf[js.Any])
    if (onRenderCustomPlaceholder != null) __obj.updateDynamic("onRenderCustomPlaceholder")(js.Any.fromFunction3(onRenderCustomPlaceholder))
    if (!js.isUndefined(removeFadingOverlay)) __obj.updateDynamic("removeFadingOverlay")(removeFadingOverlay.asInstanceOf[js.Any])
    if (shimmerLines != null) __obj.updateDynamic("shimmerLines")(shimmerLines.asInstanceOf[js.Any])
    if (shimmerOverlayStyles != null) __obj.updateDynamic("shimmerOverlayStyles")(shimmerOverlayStyles.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmeredDetailsListProps]
  }
}

