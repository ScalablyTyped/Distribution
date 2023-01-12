package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.officeUiFabricReactStrings.bottom
import typings.officeUiFabricReact.officeUiFabricReactStrings.center
import typings.officeUiFabricReact.officeUiFabricReactStrings.top
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsShimmerShimmerDottypesMod {
  
  @js.native
  sealed trait ShimmerElementType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Shimmer/Shimmer.types", "ShimmerElementType")
  @js.native
  object ShimmerElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ShimmerElementType & Double] = js.native
    
    /**
      * Circle element type
      */
    @js.native
    sealed trait circle
      extends StObject
         with ShimmerElementType
    /* 2 */ val circle: typings.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.ShimmerElementType.circle & Double = js.native
    
    /**
      * Gap element type
      */
    @js.native
    sealed trait gap
      extends StObject
         with ShimmerElementType
    /* 3 */ val gap: typings.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.ShimmerElementType.gap & Double = js.native
    
    /**
      * Line element type
      */
    @js.native
    sealed trait line
      extends StObject
         with ShimmerElementType
    /* 1 */ val line: typings.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.ShimmerElementType.line & Double = js.native
  }
  
  @js.native
  sealed trait ShimmerElementsDefaultHeights extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Shimmer/Shimmer.types", "ShimmerElementsDefaultHeights")
  @js.native
  object ShimmerElementsDefaultHeights extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ShimmerElementsDefaultHeights & Double] = js.native
    
    /**
      * Default height of the circle element when not provided by user: 24px
      */
    @js.native
    sealed trait circle
      extends StObject
         with ShimmerElementsDefaultHeights
    /* 24 */ val circle: typings.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.ShimmerElementsDefaultHeights.circle & Double = js.native
    
    /**
      * Default height of the gap element when not provided by user: 16px
      */
    @js.native
    sealed trait gap
      extends StObject
         with ShimmerElementsDefaultHeights
    /* 16 */ val gap: typings.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.ShimmerElementsDefaultHeights.gap & Double = js.native
    
    /**
      * Default height of the line element when not provided by user: 16px
      */
    @js.native
    sealed trait line
      extends StObject
         with ShimmerElementsDefaultHeights
    /* 16 */ val line: typings.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.ShimmerElementsDefaultHeights.line & Double = js.native
  }
  
  trait ICircle
    extends StObject
       with IShimmerElement
  object ICircle {
    
    inline def apply(`type`: ShimmerElementType): ICircle = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICircle]
    }
  }
  
  trait IGap
    extends StObject
       with IShimmerElement
  object IGap {
    
    inline def apply(`type`: ShimmerElementType): IGap = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGap]
    }
  }
  
  trait ILine
    extends StObject
       with IShimmerElement
  object ILine {
    
    inline def apply(`type`: ShimmerElementType): ILine = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILine]
    }
  }
  
  trait IShimmer extends StObject
  
  trait IShimmerColors extends StObject {
    
    /**
      * Defines the background color of the space in between and around shimmer elements (borders, gaps and
      * rounded corners).
      * @defaultvalue theme.palette.white
      */
    var background: js.UndefOr[String] = js.undefined
    
    /**
      * Defines the main background color which is the color you see when the wave is not animating.
      * @defaultvalue theme.palette.neutralLight
      */
    var shimmer: js.UndefOr[String] = js.undefined
    
    /**
      * Defines the tip color of the shimmer wave which gradually gets from and to `shimmer` color.
      * @defaultvalue theme.palette.neutralLighter
      */
    var shimmerWave: js.UndefOr[String] = js.undefined
  }
  object IShimmerColors {
    
    inline def apply(): IShimmerColors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerColors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IShimmerColors] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setShimmer(value: String): Self = StObject.set(x, "shimmer", value.asInstanceOf[js.Any])
      
      inline def setShimmerUndefined: Self = StObject.set(x, "shimmer", js.undefined)
      
      inline def setShimmerWave(value: String): Self = StObject.set(x, "shimmerWave", value.asInstanceOf[js.Any])
      
      inline def setShimmerWaveUndefined: Self = StObject.set(x, "shimmerWave", js.undefined)
    }
  }
  
  trait IShimmerElement extends StObject {
    
    /**
      * Sets the height of the element (ICircle, ILine, IGap) in pixels.
      * Read more details for each specific element.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Represents the possible type of the shimmer elements: Gap, Circle, Line.
      * Required for every element you intend to use.
      */
    var `type`: ShimmerElementType
    
    /**
      * Sets vertical alignment of the element (ICircle, ILine).
      * @defaultvalue center
      */
    var verticalAlign: js.UndefOr[top | center | bottom] = js.undefined
    
    /**
      * Sets the width value of the element (ILine, IGap) in pixels.
      * Read more details for each specific element.
      */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object IShimmerElement {
    
    inline def apply(`type`: ShimmerElementType): IShimmerElement = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShimmerElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IShimmerElement] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setType(value: ShimmerElementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlign(value: top | center | bottom): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IShimmerProps
    extends StObject
       with AllHTMLAttributes[HTMLElement] {
    
    /**
      * Localized string of the status label for screen reader
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated No longer used.
      */
    var componentRef: js.UndefOr[IRefObject[IShimmer]] = js.undefined
    
    /**
      * Custom elements when necessary to build complex placeholder skeletons.
      */
    var customElementsGroup: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Controls when the shimmer is swapped with actual data through an animated transition.
      * @defaultvalue false
      */
    var isDataLoaded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines an object with possible colors to pass for Shimmer customization used on different backgrounds.
      */
    var shimmerColors: js.UndefOr[IShimmerColors] = js.undefined
    
    /**
      * Elements to render in one line of the Shimmer.
      */
    var shimmerElements: js.UndefOr[js.Array[IShimmerElement]] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IShimmerStyleProps, IShimmerStyles]] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IShimmerProps {
    
    inline def apply(): IShimmerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IShimmerProps] (val x: Self) extends AnyVal {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IShimmer]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IShimmer | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setCustomElementsGroup(value: ReactNode): Self = StObject.set(x, "customElementsGroup", value.asInstanceOf[js.Any])
      
      inline def setCustomElementsGroupUndefined: Self = StObject.set(x, "customElementsGroup", js.undefined)
      
      inline def setIsDataLoaded(value: Boolean): Self = StObject.set(x, "isDataLoaded", value.asInstanceOf[js.Any])
      
      inline def setIsDataLoadedUndefined: Self = StObject.set(x, "isDataLoaded", js.undefined)
      
      inline def setShimmerColors(value: IShimmerColors): Self = StObject.set(x, "shimmerColors", value.asInstanceOf[js.Any])
      
      inline def setShimmerColorsUndefined: Self = StObject.set(x, "shimmerColors", js.undefined)
      
      inline def setShimmerElements(value: js.Array[IShimmerElement]): Self = StObject.set(x, "shimmerElements", value.asInstanceOf[js.Any])
      
      inline def setShimmerElementsUndefined: Self = StObject.set(x, "shimmerElements", js.undefined)
      
      inline def setShimmerElementsVarargs(value: IShimmerElement*): Self = StObject.set(x, "shimmerElements", js.Array(value*))
      
      inline def setStyles(value: IStyleFunctionOrObject[IShimmerStyleProps, IShimmerStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IShimmerStyleProps => DeepPartial[IShimmerStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IShimmerStyleProps extends StObject {
    
    /** Optional CSS class name for the component attached to the root stylable area. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Boolean flag to trigger fadeIn/fadeOut transition animation when content is loaded. */
    var isDataLoaded: js.UndefOr[Boolean] = js.undefined
    
    /** Color to be used as the main background color of Shimmer when not animating. */
    var shimmerColor: js.UndefOr[String] = js.undefined
    
    /** Tip color of the shimmer wave which gradually gets from and to `shimmerColor`. */
    var shimmerWaveColor: js.UndefOr[String] = js.undefined
    
    /** Theme provided by High-Order Component. */
    var theme: ITheme
    
    /** Interval in milliseconds for the adeIn/fadeOut transition animation. */
    var transitionAnimationInterval: js.UndefOr[Double] = js.undefined
  }
  object IShimmerStyleProps {
    
    inline def apply(theme: ITheme): IShimmerStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShimmerStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IShimmerStyleProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsDataLoaded(value: Boolean): Self = StObject.set(x, "isDataLoaded", value.asInstanceOf[js.Any])
      
      inline def setIsDataLoadedUndefined: Self = StObject.set(x, "isDataLoaded", js.undefined)
      
      inline def setShimmerColor(value: String): Self = StObject.set(x, "shimmerColor", value.asInstanceOf[js.Any])
      
      inline def setShimmerColorUndefined: Self = StObject.set(x, "shimmerColor", js.undefined)
      
      inline def setShimmerWaveColor(value: String): Self = StObject.set(x, "shimmerWaveColor", value.asInstanceOf[js.Any])
      
      inline def setShimmerWaveColorUndefined: Self = StObject.set(x, "shimmerWaveColor", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTransitionAnimationInterval(value: Double): Self = StObject.set(x, "transitionAnimationInterval", value.asInstanceOf[js.Any])
      
      inline def setTransitionAnimationIntervalUndefined: Self = StObject.set(x, "transitionAnimationInterval", js.undefined)
    }
  }
  
  trait IShimmerStyles extends StObject {
    
    /** Refers to wrapper element of the children only. */
    var dataWrapper: js.UndefOr[IStyle] = js.undefined
    
    /** Refers to the root wrapper element. */
    var root: js.UndefOr[IStyle] = js.undefined
    
    /** Styles for the hidden helper element to aid with screen readers. */
    var screenReaderText: js.UndefOr[IStyle] = js.undefined
    
    /** Refers to gradient element of the shimmer animation only. */
    var shimmerGradient: js.UndefOr[IStyle] = js.undefined
    
    /** Refers to wrapper element of the shimmer only. */
    var shimmerWrapper: js.UndefOr[IStyle] = js.undefined
  }
  object IShimmerStyles {
    
    inline def apply(): IShimmerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IShimmerStyles] (val x: Self) extends AnyVal {
      
      inline def setDataWrapper(value: IStyle): Self = StObject.set(x, "dataWrapper", value.asInstanceOf[js.Any])
      
      inline def setDataWrapperNull: Self = StObject.set(x, "dataWrapper", null)
      
      inline def setDataWrapperUndefined: Self = StObject.set(x, "dataWrapper", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setScreenReaderText(value: IStyle): Self = StObject.set(x, "screenReaderText", value.asInstanceOf[js.Any])
      
      inline def setScreenReaderTextNull: Self = StObject.set(x, "screenReaderText", null)
      
      inline def setScreenReaderTextUndefined: Self = StObject.set(x, "screenReaderText", js.undefined)
      
      inline def setShimmerGradient(value: IStyle): Self = StObject.set(x, "shimmerGradient", value.asInstanceOf[js.Any])
      
      inline def setShimmerGradientNull: Self = StObject.set(x, "shimmerGradient", null)
      
      inline def setShimmerGradientUndefined: Self = StObject.set(x, "shimmerGradient", js.undefined)
      
      inline def setShimmerWrapper(value: IStyle): Self = StObject.set(x, "shimmerWrapper", value.asInstanceOf[js.Any])
      
      inline def setShimmerWrapperNull: Self = StObject.set(x, "shimmerWrapper", null)
      
      inline def setShimmerWrapperUndefined: Self = StObject.set(x, "shimmerWrapper", js.undefined)
    }
  }
}
