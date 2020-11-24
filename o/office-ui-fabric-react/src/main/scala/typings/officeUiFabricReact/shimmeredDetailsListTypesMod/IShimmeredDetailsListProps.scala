package typings.officeUiFabricReact.shimmeredDetailsListTypesMod

import typings.officeUiFabricReact.detailsListTypesMod.IDetailsListStyleProps
import typings.officeUiFabricReact.detailsListTypesMod.IDetailsListStyles
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps
import typings.react.mod.ReactNode
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleSet.Diff<keyof office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'styles'> ]: office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps[P]} */ @js.native
trait IShimmeredDetailsListProps extends js.Object {
  
  /**
    * Aria label for shimmer. Set on grid while shimmer is enabled.
    */
  var ariaLabelForShimmer: js.UndefOr[String] = js.native
  
  /**
    * DetailsList styles to pass through.
    */
  var detailsListStyles: js.UndefOr[IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]] = js.native
  
  /**
    * Boolean flag to control when to render placeholders vs real items.
    * It's up to the consumer app to know when fetching of the data is done to toggle this prop.
    */
  var enableShimmer: js.UndefOr[Boolean] = js.native
  
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
  ] = js.native
  
  /**
    * Determines whether to remove a fading out to bottom overlay over the shimmering items
    * used to further emphasize the unknown number of items that will be fetched.
    */
  var removeFadingOverlay: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of shimmer placeholder lines to render.
    * @defaultvalue 10
    */
  var shimmerLines: js.UndefOr[Double] = js.native
  
  /**
    * Custom styles to override the styles specific to the ShimmeredDetailsList root area.
    * @deprecated Use `styles` prop instead. Any value provided will be ignored.
    */
  var shimmerOverlayStyles: js.UndefOr[
    IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]
  ] = js.native
  
  /**
    * Custom styles to override the styles specific to the ShimmeredDetailsList root area.
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]
  ] = js.native
}
object IShimmeredDetailsListProps {
  
  @scala.inline
  def apply(): IShimmeredDetailsListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmeredDetailsListProps]
  }
  
  @scala.inline
  implicit class IShimmeredDetailsListPropsOps[Self <: IShimmeredDetailsListProps] (val x: Self) extends AnyVal {
    
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
    def setAriaLabelForShimmer(value: String): Self = this.set("ariaLabelForShimmer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelForShimmer: Self = this.set("ariaLabelForShimmer", js.undefined)
    
    @scala.inline
    def setDetailsListStylesFunction1(value: IDetailsListStyleProps => DeepPartial[IDetailsListStyles]): Self = this.set("detailsListStyles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDetailsListStyles(value: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]): Self = this.set("detailsListStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailsListStyles: Self = this.set("detailsListStyles", js.undefined)
    
    @scala.inline
    def setEnableShimmer(value: Boolean): Self = this.set("enableShimmer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableShimmer: Self = this.set("enableShimmer", js.undefined)
    
    @scala.inline
    def setOnRenderCustomPlaceholder(
      value: (/* rowProps */ IDetailsRowProps, /* index */ js.UndefOr[Double], /* defaultRender */ js.UndefOr[js.Function1[/* props */ IDetailsRowProps, ReactNode]]) => ReactNode
    ): Self = this.set("onRenderCustomPlaceholder", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnRenderCustomPlaceholder: Self = this.set("onRenderCustomPlaceholder", js.undefined)
    
    @scala.inline
    def setRemoveFadingOverlay(value: Boolean): Self = this.set("removeFadingOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveFadingOverlay: Self = this.set("removeFadingOverlay", js.undefined)
    
    @scala.inline
    def setShimmerLines(value: Double): Self = this.set("shimmerLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShimmerLines: Self = this.set("shimmerLines", js.undefined)
    
    @scala.inline
    def setShimmerOverlayStylesFunction1(value: IShimmeredDetailsListStyleProps => DeepPartial[IShimmeredDetailsListStyles]): Self = this.set("shimmerOverlayStyles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimmerOverlayStyles(value: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]): Self = this.set("shimmerOverlayStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShimmerOverlayStyles: Self = this.set("shimmerOverlayStyles", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IShimmeredDetailsListStyleProps => DeepPartial[IShimmeredDetailsListStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
