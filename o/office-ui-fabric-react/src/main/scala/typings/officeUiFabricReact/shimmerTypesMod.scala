package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.officeUiFabricReactStrings.bottom
import typings.officeUiFabricReact.officeUiFabricReactStrings.center
import typings.officeUiFabricReact.officeUiFabricReactStrings.top
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimmerTypesMod {
  
  @js.native
  sealed trait ShimmerElementType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Shimmer/Shimmer.types", "ShimmerElementType")
  @js.native
  object ShimmerElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ShimmerElementType with Double] = js.native
    
    /**
      * Circle element type
      */
    @js.native
    sealed trait circle extends ShimmerElementType
    /* 2 */ val circle: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.circle with Double = js.native
    
    /**
      * Gap element type
      */
    @js.native
    sealed trait gap extends ShimmerElementType
    /* 3 */ val gap: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.gap with Double = js.native
    
    /**
      * Line element type
      */
    @js.native
    sealed trait line extends ShimmerElementType
    /* 1 */ val line: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.line with Double = js.native
  }
  
  @js.native
  sealed trait ShimmerElementsDefaultHeights extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Shimmer/Shimmer.types", "ShimmerElementsDefaultHeights")
  @js.native
  object ShimmerElementsDefaultHeights extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ShimmerElementsDefaultHeights with Double] = js.native
    
    /**
      * Default height of the circle element when not provided by user: 24px
      */
    @js.native
    sealed trait circle extends ShimmerElementsDefaultHeights
    /* 24 */ val circle: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.circle with Double = js.native
    
    /**
      * Default height of the gap element when not provided by user: 16px
      */
    @js.native
    sealed trait gap extends ShimmerElementsDefaultHeights
    /* 16 */ val gap: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.gap with Double = js.native
    
    /**
      * Default height of the line element when not provided by user: 16px
      */
    @js.native
    sealed trait line extends ShimmerElementsDefaultHeights
    /* 16 */ val line: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.line with Double = js.native
  }
  
  @js.native
  trait ICircle extends IShimmerElement
  object ICircle {
    
    @scala.inline
    def apply(`type`: ShimmerElementType): ICircle = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICircle]
    }
  }
  
  @js.native
  trait IGap extends IShimmerElement
  object IGap {
    
    @scala.inline
    def apply(`type`: ShimmerElementType): IGap = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGap]
    }
  }
  
  @js.native
  trait ILine extends IShimmerElement
  object ILine {
    
    @scala.inline
    def apply(`type`: ShimmerElementType): ILine = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILine]
    }
  }
  
  @js.native
  trait IShimmer extends StObject
  
  @js.native
  trait IShimmerColors extends StObject {
    
    /**
      * Defines the background color of the space in between and around shimmer elements (borders, gaps and
      * rounded corners).
      * @defaultvalue theme.palette.white
      */
    var background: js.UndefOr[String] = js.native
    
    /**
      * Defines the main background color which is the color you see when the wave is not animating.
      * @defaultvalue theme.palette.neutralLight
      */
    var shimmer: js.UndefOr[String] = js.native
    
    /**
      * Defines the tip color of the shimmer wave which gradually gets from and to `shimmer` color.
      * @defaultvalue theme.palette.neutralLighter
      */
    var shimmerWave: js.UndefOr[String] = js.native
  }
  object IShimmerColors {
    
    @scala.inline
    def apply(): IShimmerColors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerColors]
    }
    
    @scala.inline
    implicit class IShimmerColorsMutableBuilder[Self <: IShimmerColors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setShimmer(value: String): Self = StObject.set(x, "shimmer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShimmerUndefined: Self = StObject.set(x, "shimmer", js.undefined)
      
      @scala.inline
      def setShimmerWave(value: String): Self = StObject.set(x, "shimmerWave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShimmerWaveUndefined: Self = StObject.set(x, "shimmerWave", js.undefined)
    }
  }
  
  @js.native
  trait IShimmerElement extends StObject {
    
    /**
      * Sets the height of the element (ICircle, ILine, IGap) in pixels.
      * Read more details for each specific element.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Represents the possible type of the shimmer elements: Gap, Circle, Line.
      * Required for every element you intend to use.
      */
    var `type`: ShimmerElementType = js.native
    
    /**
      * Sets vertical alignment of the element (ICircle, ILine).
      * @defaultvalue center
      */
    var verticalAlign: js.UndefOr[top | center | bottom] = js.native
    
    /**
      * Sets the width value of the element (ILine, IGap) in pixels.
      * Read more details for each specific element.
      */
    var width: js.UndefOr[Double | String] = js.native
  }
  object IShimmerElement {
    
    @scala.inline
    def apply(`type`: ShimmerElementType): IShimmerElement = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShimmerElement]
    }
    
    @scala.inline
    implicit class IShimmerElementMutableBuilder[Self <: IShimmerElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setType(value: ShimmerElementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlign(value: top | center | bottom): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IShimmerProps extends AllHTMLAttributes[HTMLElement] {
    
    /**
      * Localized string of the status label for screen reader
      */
    var ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * @deprecated No longer used.
      */
    var componentRef: js.UndefOr[IRefObject[IShimmer]] = js.native
    
    /**
      * Custom elements when necessary to build complex placeholder skeletons.
      */
    var customElementsGroup: js.UndefOr[ReactNode] = js.native
    
    /**
      * Controls when the shimmer is swapped with actual data through an animated transition.
      * @defaultvalue false
      */
    var isDataLoaded: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines an object with possible colors to pass for Shimmer customization used on different backgrounds.
      */
    var shimmerColors: js.UndefOr[IShimmerColors] = js.native
    
    /**
      * Elements to render in one line of the Shimmer.
      */
    var shimmerElements: js.UndefOr[js.Array[IShimmerElement]] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IShimmerStyleProps, IShimmerStyles]] = js.native
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IShimmerProps {
    
    @scala.inline
    def apply(): IShimmerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerProps]
    }
    
    @scala.inline
    implicit class IShimmerPropsMutableBuilder[Self <: IShimmerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IShimmer]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IShimmer | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setCustomElementsGroup(value: ReactNode): Self = StObject.set(x, "customElementsGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomElementsGroupUndefined: Self = StObject.set(x, "customElementsGroup", js.undefined)
      
      @scala.inline
      def setIsDataLoaded(value: Boolean): Self = StObject.set(x, "isDataLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDataLoadedUndefined: Self = StObject.set(x, "isDataLoaded", js.undefined)
      
      @scala.inline
      def setShimmerColors(value: IShimmerColors): Self = StObject.set(x, "shimmerColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShimmerColorsUndefined: Self = StObject.set(x, "shimmerColors", js.undefined)
      
      @scala.inline
      def setShimmerElements(value: js.Array[IShimmerElement]): Self = StObject.set(x, "shimmerElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShimmerElementsUndefined: Self = StObject.set(x, "shimmerElements", js.undefined)
      
      @scala.inline
      def setShimmerElementsVarargs(value: IShimmerElement*): Self = StObject.set(x, "shimmerElements", js.Array(value :_*))
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IShimmerStyleProps, IShimmerStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IShimmerStyleProps => DeepPartial[IShimmerStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IShimmerStyleProps extends StObject {
    
    /** Optional CSS class name for the component attached to the root stylable area. */
    var className: js.UndefOr[String] = js.native
    
    /** Boolean flag to trigger fadeIn/fadeOut transition animation when content is loaded. */
    var isDataLoaded: js.UndefOr[Boolean] = js.native
    
    /** Color to be used as the main background color of Shimmer when not animating. */
    var shimmerColor: js.UndefOr[String] = js.native
    
    /** Tip color of the shimmer wave which gradually gets from and to `shimmerColor`. */
    var shimmerWaveColor: js.UndefOr[String] = js.native
    
    /** Theme provided by High-Order Component. */
    var theme: ITheme = js.native
    
    /** Interval in milliseconds for the adeIn/fadeOut transition animation. */
    var transitionAnimationInterval: js.UndefOr[Double] = js.native
  }
  object IShimmerStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IShimmerStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShimmerStyleProps]
    }
    
    @scala.inline
    implicit class IShimmerStylePropsMutableBuilder[Self <: IShimmerStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIsDataLoaded(value: Boolean): Self = StObject.set(x, "isDataLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDataLoadedUndefined: Self = StObject.set(x, "isDataLoaded", js.undefined)
      
      @scala.inline
      def setShimmerColor(value: String): Self = StObject.set(x, "shimmerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShimmerColorUndefined: Self = StObject.set(x, "shimmerColor", js.undefined)
      
      @scala.inline
      def setShimmerWaveColor(value: String): Self = StObject.set(x, "shimmerWaveColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShimmerWaveColorUndefined: Self = StObject.set(x, "shimmerWaveColor", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionAnimationInterval(value: Double): Self = StObject.set(x, "transitionAnimationInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionAnimationIntervalUndefined: Self = StObject.set(x, "transitionAnimationInterval", js.undefined)
    }
  }
  
  @js.native
  trait IShimmerStyles extends StObject {
    
    /** Refers to wrapper element of the children only. */
    var dataWrapper: js.UndefOr[IStyle] = js.native
    
    /** Refers to the root wrapper element. */
    var root: js.UndefOr[IStyle] = js.native
    
    /** Styles for the hidden helper element to aid with screen readers. */
    var screenReaderText: js.UndefOr[IStyle] = js.native
    
    /** Refers to gradient element of the shimmer animation only. */
    var shimmerGradient: js.UndefOr[IStyle] = js.native
    
    /** Refers to wrapper element of the shimmer only. */
    var shimmerWrapper: js.UndefOr[IStyle] = js.native
  }
  object IShimmerStyles {
    
    @scala.inline
    def apply(): IShimmerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerStyles]
    }
    
    @scala.inline
    implicit class IShimmerStylesMutableBuilder[Self <: IShimmerStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataWrapper(value: IStyle): Self = StObject.set(x, "dataWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataWrapperNull: Self = StObject.set(x, "dataWrapper", null)
      
      @scala.inline
      def setDataWrapperUndefined: Self = StObject.set(x, "dataWrapper", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setScreenReaderText(value: IStyle): Self = StObject.set(x, "screenReaderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenReaderTextNull: Self = StObject.set(x, "screenReaderText", null)
      
      @scala.inline
      def setScreenReaderTextUndefined: Self = StObject.set(x, "screenReaderText", js.undefined)
      
      @scala.inline
      def setShimmerGradient(value: IStyle): Self = StObject.set(x, "shimmerGradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShimmerGradientNull: Self = StObject.set(x, "shimmerGradient", null)
      
      @scala.inline
      def setShimmerGradientUndefined: Self = StObject.set(x, "shimmerGradient", js.undefined)
      
      @scala.inline
      def setShimmerWrapper(value: IStyle): Self = StObject.set(x, "shimmerWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShimmerWrapperNull: Self = StObject.set(x, "shimmerWrapper", null)
      
      @scala.inline
      def setShimmerWrapperUndefined: Self = StObject.set(x, "shimmerWrapper", js.undefined)
    }
  }
}
