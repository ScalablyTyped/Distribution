package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.FocusEvent
import typings.std.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricMergeStyles.libIstylesetMod.IProcessedStyleSet
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import typings.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsRatingRatingDottypesMod {
  
  @js.native
  sealed trait RatingSize extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Rating/Rating.types", "RatingSize")
  @js.native
  object RatingSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RatingSize & Double] = js.native
    
    @js.native
    sealed trait Large
      extends StObject
         with RatingSize
    /* 1 */ val Large: typings.officeUiFabricReact.libComponentsRatingRatingDottypesMod.RatingSize.Large & Double = js.native
    
    @js.native
    sealed trait Small
      extends StObject
         with RatingSize
    /* 0 */ val Small: typings.officeUiFabricReact.libComponentsRatingRatingDottypesMod.RatingSize.Small & Double = js.native
  }
  
  trait IRating extends StObject
  
  trait IRatingProps
    extends StObject
       with AllHTMLAttributes[HTMLElement] {
    
    /**
      * Allow the rating value to be set to 0 instead of a minimum of 1.
      */
    var allowZeroStars: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional aria-label for rating control.
      * If rating control is readOnly, it is recommended to provide a getAriaLabel prop instead
      * since otherwise the current rating value will not be read.
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Optional label format for a rating star that will be read by screen readers.
      * Can be used like "\{0\} of \{1\} stars selected",
      * where \{0\} will be substituted by the current rating and \{1\} will be substituted by the max rating.
      * @defaultvalue empty string.
      */
    var ariaLabelFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Deprecated: Optional id of label describing this instance of Rating.
      * @deprecated Use `getAriaLabel` instead.
      */
    var ariaLabelId: js.UndefOr[String] = js.undefined
    
    /**
      * Optional callback to access the IRating interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IRating]] = js.undefined
    
    var getAriaLabel: js.UndefOr[js.Function2[/* rating */ Double, /* max */ Double, String]] = js.undefined
    
    /**
      * Custom icon
      * @defaultvalue FavoriteStarFill
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * Maximum rating, defaults to 5, has to be \>= min
      */
    @JSName("max")
    var max_IRatingProps: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum rating, defaults to 1, has to be \>= 0
      * @deprecated No longer used.
      */
    @JSName("min")
    var min_IRatingProps: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback issued when the rating changes.
      */
    @JSName("onChange")
    var onChange_IRatingProps: js.UndefOr[
        js.Function2[/* event */ FocusEvent[HTMLElement, Element], /* rating */ js.UndefOr[Double], Unit]
      ] = js.undefined
    
    /**
      * @deprecated Use `onChange` instead.
      */
    var onChanged: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.undefined
    
    /**
      * Optional custom renderer for the star component.
      */
    var onRenderStar: js.UndefOr[IRenderFunction[IRatingStarProps]] = js.undefined
    
    /**
      * Selected rating, has to be an integer between min and max
      */
    var rating: js.UndefOr[Double] = js.undefined
    
    /**
      * Size of rating, defaults to small
      */
    @JSName("size")
    var size_IRatingProps: js.UndefOr[RatingSize] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IRatingStyleProps, IRatingStyles]] = js.undefined
    
    /**
      * Theme (provided through customization.)
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Custom icon for unselected rating elements.
      * @defaultvalue FavoriteStar
      */
    var unselectedIcon: js.UndefOr[String] = js.undefined
  }
  object IRatingProps {
    
    inline def apply(): IRatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRatingProps]
    }
    
    extension [Self <: IRatingProps](x: Self) {
      
      inline def setAllowZeroStars(value: Boolean): Self = StObject.set(x, "allowZeroStars", value.asInstanceOf[js.Any])
      
      inline def setAllowZeroStarsUndefined: Self = StObject.set(x, "allowZeroStars", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelFormat(value: String): Self = StObject.set(x, "ariaLabelFormat", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelFormatUndefined: Self = StObject.set(x, "ariaLabelFormat", js.undefined)
      
      inline def setAriaLabelId(value: String): Self = StObject.set(x, "ariaLabelId", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelIdUndefined: Self = StObject.set(x, "ariaLabelId", js.undefined)
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IRating]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IRating | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setGetAriaLabel(value: (/* rating */ Double, /* max */ Double) => String): Self = StObject.set(x, "getAriaLabel", js.Any.fromFunction2(value))
      
      inline def setGetAriaLabelUndefined: Self = StObject.set(x, "getAriaLabel", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnChange(value: (/* event */ FocusEvent[HTMLElement, Element], /* rating */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnChanged(value: /* rating */ Double => Unit): Self = StObject.set(x, "onChanged", js.Any.fromFunction1(value))
      
      inline def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
      
      inline def setOnRenderStar(
        value: (/* props */ js.UndefOr[IRatingStarProps], /* defaultRender */ js.UndefOr[
              js.Function1[
                /* props */ js.UndefOr[IRatingStarProps], 
                typings.react.mod.global.JSX.Element | Null
              ]
            ]) => typings.react.mod.global.JSX.Element | Null
      ): Self = StObject.set(x, "onRenderStar", js.Any.fromFunction2(value))
      
      inline def setOnRenderStarUndefined: Self = StObject.set(x, "onRenderStar", js.undefined)
      
      inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      inline def setSize(value: RatingSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IRatingStyleProps, IRatingStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IRatingStyleProps => DeepPartial[IRatingStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUnselectedIcon(value: String): Self = StObject.set(x, "unselectedIcon", value.asInstanceOf[js.Any])
      
      inline def setUnselectedIconUndefined: Self = StObject.set(x, "unselectedIcon", js.undefined)
    }
  }
  
  trait IRatingStarProps
    extends StObject
       with AllHTMLAttributes[HTMLElement] {
    
    var classNames: IProcessedStyleSet[IRatingStyles]
    
    var fillPercentage: Double
    
    var icon: js.UndefOr[String] = js.undefined
    
    var starNum: js.UndefOr[Double] = js.undefined
  }
  object IRatingStarProps {
    
    inline def apply(classNames: IProcessedStyleSet[IRatingStyles], fillPercentage: Double): IRatingStarProps = {
      val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], fillPercentage = fillPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRatingStarProps]
    }
    
    extension [Self <: IRatingStarProps](x: Self) {
      
      inline def setClassNames(value: IProcessedStyleSet[IRatingStyles]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setFillPercentage(value: Double): Self = StObject.set(x, "fillPercentage", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setStarNum(value: Double): Self = StObject.set(x, "starNum", value.asInstanceOf[js.Any])
      
      inline def setStarNumUndefined: Self = StObject.set(x, "starNum", js.undefined)
    }
  }
  
  trait IRatingStyleProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var theme: ITheme
  }
  object IRatingStyleProps {
    
    inline def apply(theme: ITheme): IRatingStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRatingStyleProps]
    }
    
    extension [Self <: IRatingStyleProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRatingStyles extends StObject {
    
    var labelText: IStyle
    
    var ratingButton: IStyle
    
    var ratingFocusZone: IStyle
    
    var ratingStar: IStyle
    
    var ratingStarBack: IStyle
    
    var ratingStarFront: IStyle
    
    var ratingStarIsLarge: IStyle
    
    var ratingStarIsSmall: IStyle
    
    var root: IStyle
    
    var rootIsLarge: IStyle
    
    var rootIsSmall: IStyle
  }
  object IRatingStyles {
    
    inline def apply(): IRatingStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRatingStyles]
    }
    
    extension [Self <: IRatingStyles](x: Self) {
      
      inline def setLabelText(value: IStyle): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      inline def setLabelTextNull: Self = StObject.set(x, "labelText", null)
      
      inline def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
      
      inline def setRatingButton(value: IStyle): Self = StObject.set(x, "ratingButton", value.asInstanceOf[js.Any])
      
      inline def setRatingButtonNull: Self = StObject.set(x, "ratingButton", null)
      
      inline def setRatingButtonUndefined: Self = StObject.set(x, "ratingButton", js.undefined)
      
      inline def setRatingFocusZone(value: IStyle): Self = StObject.set(x, "ratingFocusZone", value.asInstanceOf[js.Any])
      
      inline def setRatingFocusZoneNull: Self = StObject.set(x, "ratingFocusZone", null)
      
      inline def setRatingFocusZoneUndefined: Self = StObject.set(x, "ratingFocusZone", js.undefined)
      
      inline def setRatingStar(value: IStyle): Self = StObject.set(x, "ratingStar", value.asInstanceOf[js.Any])
      
      inline def setRatingStarBack(value: IStyle): Self = StObject.set(x, "ratingStarBack", value.asInstanceOf[js.Any])
      
      inline def setRatingStarBackNull: Self = StObject.set(x, "ratingStarBack", null)
      
      inline def setRatingStarBackUndefined: Self = StObject.set(x, "ratingStarBack", js.undefined)
      
      inline def setRatingStarFront(value: IStyle): Self = StObject.set(x, "ratingStarFront", value.asInstanceOf[js.Any])
      
      inline def setRatingStarFrontNull: Self = StObject.set(x, "ratingStarFront", null)
      
      inline def setRatingStarFrontUndefined: Self = StObject.set(x, "ratingStarFront", js.undefined)
      
      inline def setRatingStarIsLarge(value: IStyle): Self = StObject.set(x, "ratingStarIsLarge", value.asInstanceOf[js.Any])
      
      inline def setRatingStarIsLargeNull: Self = StObject.set(x, "ratingStarIsLarge", null)
      
      inline def setRatingStarIsLargeUndefined: Self = StObject.set(x, "ratingStarIsLarge", js.undefined)
      
      inline def setRatingStarIsSmall(value: IStyle): Self = StObject.set(x, "ratingStarIsSmall", value.asInstanceOf[js.Any])
      
      inline def setRatingStarIsSmallNull: Self = StObject.set(x, "ratingStarIsSmall", null)
      
      inline def setRatingStarIsSmallUndefined: Self = StObject.set(x, "ratingStarIsSmall", js.undefined)
      
      inline def setRatingStarNull: Self = StObject.set(x, "ratingStar", null)
      
      inline def setRatingStarUndefined: Self = StObject.set(x, "ratingStar", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootIsLarge(value: IStyle): Self = StObject.set(x, "rootIsLarge", value.asInstanceOf[js.Any])
      
      inline def setRootIsLargeNull: Self = StObject.set(x, "rootIsLarge", null)
      
      inline def setRootIsLargeUndefined: Self = StObject.set(x, "rootIsLarge", js.undefined)
      
      inline def setRootIsSmall(value: IStyle): Self = StObject.set(x, "rootIsSmall", value.asInstanceOf[js.Any])
      
      inline def setRootIsSmallNull: Self = StObject.set(x, "rootIsSmall", null)
      
      inline def setRootIsSmallUndefined: Self = StObject.set(x, "rootIsSmall", js.undefined)
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
