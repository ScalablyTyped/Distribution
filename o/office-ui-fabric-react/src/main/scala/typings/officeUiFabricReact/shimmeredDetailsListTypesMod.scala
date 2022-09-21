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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimmeredDetailsListTypesMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleSet.Diff<keyof office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'styles'> ]: office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps[P]} */ trait IShimmeredDetailsListProps extends StObject {
    
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
    
    inline def apply(): IShimmeredDetailsListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmeredDetailsListProps]
    }
    
    extension [Self <: IShimmeredDetailsListProps](x: Self) {
      
      inline def setAriaLabelForShimmer(value: String): Self = StObject.set(x, "ariaLabelForShimmer", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelForShimmerUndefined: Self = StObject.set(x, "ariaLabelForShimmer", js.undefined)
      
      inline def setDetailsListStyles(value: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]): Self = StObject.set(x, "detailsListStyles", value.asInstanceOf[js.Any])
      
      inline def setDetailsListStylesFunction1(value: IDetailsListStyleProps => DeepPartial[IDetailsListStyles]): Self = StObject.set(x, "detailsListStyles", js.Any.fromFunction1(value))
      
      inline def setDetailsListStylesUndefined: Self = StObject.set(x, "detailsListStyles", js.undefined)
      
      inline def setEnableShimmer(value: Boolean): Self = StObject.set(x, "enableShimmer", value.asInstanceOf[js.Any])
      
      inline def setEnableShimmerUndefined: Self = StObject.set(x, "enableShimmer", js.undefined)
      
      inline def setOnRenderCustomPlaceholder(
        value: (/* rowProps */ IDetailsRowProps, /* index */ js.UndefOr[Double], /* defaultRender */ js.UndefOr[js.Function1[/* props */ IDetailsRowProps, ReactNode]]) => ReactNode
      ): Self = StObject.set(x, "onRenderCustomPlaceholder", js.Any.fromFunction3(value))
      
      inline def setOnRenderCustomPlaceholderUndefined: Self = StObject.set(x, "onRenderCustomPlaceholder", js.undefined)
      
      inline def setRemoveFadingOverlay(value: Boolean): Self = StObject.set(x, "removeFadingOverlay", value.asInstanceOf[js.Any])
      
      inline def setRemoveFadingOverlayUndefined: Self = StObject.set(x, "removeFadingOverlay", js.undefined)
      
      inline def setShimmerLines(value: Double): Self = StObject.set(x, "shimmerLines", value.asInstanceOf[js.Any])
      
      inline def setShimmerLinesUndefined: Self = StObject.set(x, "shimmerLines", js.undefined)
      
      inline def setShimmerOverlayStyles(value: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]): Self = StObject.set(x, "shimmerOverlayStyles", value.asInstanceOf[js.Any])
      
      inline def setShimmerOverlayStylesFunction1(value: IShimmeredDetailsListStyleProps => DeepPartial[IShimmeredDetailsListStyles]): Self = StObject.set(x, "shimmerOverlayStyles", js.Any.fromFunction1(value))
      
      inline def setShimmerOverlayStylesUndefined: Self = StObject.set(x, "shimmerOverlayStyles", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IShimmeredDetailsListStyleProps => DeepPartial[IShimmeredDetailsListStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/ShimmeredDetailsList.types.IShimmeredDetailsListProps, 'theme'>> */
  trait IShimmeredDetailsListStyleProps extends StObject {
    
    var theme: Any
  }
  object IShimmeredDetailsListStyleProps {
    
    inline def apply(theme: Any): IShimmeredDetailsListStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShimmeredDetailsListStyleProps]
    }
    
    extension [Self <: IShimmeredDetailsListStyleProps](x: Self) {
      
      inline def setTheme(value: Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IShimmeredDetailsListStyles extends StObject {
    
    /**
      * Represents styles passed to the `List` component for creating a fade-out to the bottom overlay.
      */
    var root: IStyle
  }
  object IShimmeredDetailsListStyles {
    
    inline def apply(): IShimmeredDetailsListStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmeredDetailsListStyles]
    }
    
    extension [Self <: IShimmeredDetailsListStyles](x: Self) {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
