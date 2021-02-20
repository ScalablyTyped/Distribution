package typings.officeUiFabricReact

import typings.officeUiFabricReact.detailsListTypesMod.IDetailsListStyleProps
import typings.officeUiFabricReact.detailsListTypesMod.IDetailsListStyles
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps
import typings.react.mod.ReactNode
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimmeredDetailsListTypesMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleSet.Diff<keyof office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'styles'> ]: office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps[P]} */ @js.native
  trait IShimmeredDetailsListProps extends StObject {
    
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
    implicit class IShimmeredDetailsListPropsMutableBuilder[Self <: IShimmeredDetailsListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabelForShimmer(value: String): Self = StObject.set(x, "ariaLabelForShimmer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelForShimmerUndefined: Self = StObject.set(x, "ariaLabelForShimmer", js.undefined)
      
      @scala.inline
      def setDetailsListStyles(value: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]): Self = StObject.set(x, "detailsListStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsListStylesFunction1(value: IDetailsListStyleProps => DeepPartial[IDetailsListStyles]): Self = StObject.set(x, "detailsListStyles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDetailsListStylesUndefined: Self = StObject.set(x, "detailsListStyles", js.undefined)
      
      @scala.inline
      def setEnableShimmer(value: Boolean): Self = StObject.set(x, "enableShimmer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableShimmerUndefined: Self = StObject.set(x, "enableShimmer", js.undefined)
      
      @scala.inline
      def setOnRenderCustomPlaceholder(
        value: (/* rowProps */ IDetailsRowProps, /* index */ js.UndefOr[Double], /* defaultRender */ js.UndefOr[js.Function1[/* props */ IDetailsRowProps, ReactNode]]) => ReactNode
      ): Self = StObject.set(x, "onRenderCustomPlaceholder", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnRenderCustomPlaceholderUndefined: Self = StObject.set(x, "onRenderCustomPlaceholder", js.undefined)
      
      @scala.inline
      def setRemoveFadingOverlay(value: Boolean): Self = StObject.set(x, "removeFadingOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveFadingOverlayUndefined: Self = StObject.set(x, "removeFadingOverlay", js.undefined)
      
      @scala.inline
      def setShimmerLines(value: Double): Self = StObject.set(x, "shimmerLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShimmerLinesUndefined: Self = StObject.set(x, "shimmerLines", js.undefined)
      
      @scala.inline
      def setShimmerOverlayStyles(value: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]): Self = StObject.set(x, "shimmerOverlayStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShimmerOverlayStylesFunction1(value: IShimmeredDetailsListStyleProps => DeepPartial[IShimmeredDetailsListStyles]): Self = StObject.set(x, "shimmerOverlayStyles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShimmerOverlayStylesUndefined: Self = StObject.set(x, "shimmerOverlayStyles", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IShimmeredDetailsListStyleProps => DeepPartial[IShimmeredDetailsListStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/ShimmeredDetailsList.types.IShimmeredDetailsListProps, 'theme'>> */
  @js.native
  trait IShimmeredDetailsListStyleProps extends StObject {
    
    var theme: js.Any = js.native
  }
  object IShimmeredDetailsListStyleProps {
    
    @scala.inline
    def apply(theme: js.Any): IShimmeredDetailsListStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShimmeredDetailsListStyleProps]
    }
    
    @scala.inline
    implicit class IShimmeredDetailsListStylePropsMutableBuilder[Self <: IShimmeredDetailsListStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: js.Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IShimmeredDetailsListStyles extends StObject {
    
    /**
      * Represents styles passed to the `List` component for creating a fade-out to the bottom overlay.
      */
    var root: IStyle = js.native
  }
  object IShimmeredDetailsListStyles {
    
    @scala.inline
    def apply(): IShimmeredDetailsListStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmeredDetailsListStyles]
    }
    
    @scala.inline
    implicit class IShimmeredDetailsListStylesMutableBuilder[Self <: IShimmeredDetailsListStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
