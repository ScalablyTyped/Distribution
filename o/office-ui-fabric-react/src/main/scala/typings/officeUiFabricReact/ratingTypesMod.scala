package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.FocusEvent
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratingTypesMod {
  
  @js.native
  sealed trait RatingSize extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Rating/Rating.types", "RatingSize")
  @js.native
  object RatingSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RatingSize with Double] = js.native
    
    @js.native
    sealed trait Large extends RatingSize
    /* 1 */ val Large: typings.officeUiFabricReact.ratingTypesMod.RatingSize.Large with Double = js.native
    
    @js.native
    sealed trait Small extends RatingSize
    /* 0 */ val Small: typings.officeUiFabricReact.ratingTypesMod.RatingSize.Small with Double = js.native
  }
  
  @js.native
  trait IRating extends StObject
  
  @js.native
  trait IRatingProps extends AllHTMLAttributes[HTMLElement] {
    
    /**
      * Allow the rating value to be set to 0 instead of a minimum of 1.
      */
    var allowZeroStars: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional label format for a rating star that will be read by screen readers.
      * Can be used like "\{0\} of \{1\} stars selected",
      * where \{0\} will be substituted by the current rating and \{1\} will be substituted by the max rating.
      * @defaultvalue empty string.
      */
    var ariaLabelFormat: js.UndefOr[String] = js.native
    
    /**
      * Deprecated: Optional id of label describing this instance of Rating.
      * @deprecated Use `getAriaLabel` instead.
      */
    var ariaLabelId: js.UndefOr[String] = js.native
    
    /**
      * Optional callback to access the IRating interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IRating]] = js.native
    
    var getAriaLabel: js.UndefOr[js.Function2[/* rating */ Double, /* max */ Double, String]] = js.native
    
    /**
      * Custom icon
      * @defaultvalue FavoriteStarFill
      */
    var icon: js.UndefOr[String] = js.native
    
    /**
      * Maximum rating, defaults to 5, has to be \>= min
      */
    @JSName("max")
    var max_IRatingProps: js.UndefOr[Double] = js.native
    
    /**
      * Minimum rating, defaults to 1, has to be \>= 0
      * @deprecated No longer used.
      */
    @JSName("min")
    var min_IRatingProps: js.UndefOr[Double] = js.native
    
    /**
      * Callback issued when the rating changes.
      */
    @JSName("onChange")
    var onChange_IRatingProps: js.UndefOr[
        js.Function2[/* event */ FocusEvent[HTMLElement], /* rating */ js.UndefOr[Double], Unit]
      ] = js.native
    
    /**
      * @deprecated Use `onChange` instead.
      */
    var onChanged: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.native
    
    /**
      * Selected rating, has to be an integer between min and max
      */
    var rating: js.UndefOr[Double] = js.native
    
    /**
      * Size of rating, defaults to small
      */
    @JSName("size")
    var size_IRatingProps: js.UndefOr[RatingSize] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IRatingStyleProps, IRatingStyles]] = js.native
    
    /**
      * Theme (provided through customization.)
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * Custom icon for unselected rating elements.
      * @defaultvalue FavoriteStar
      */
    var unselectedIcon: js.UndefOr[String] = js.native
  }
  object IRatingProps {
    
    @scala.inline
    def apply(): IRatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRatingProps]
    }
    
    @scala.inline
    implicit class IRatingPropsMutableBuilder[Self <: IRatingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowZeroStars(value: Boolean): Self = StObject.set(x, "allowZeroStars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowZeroStarsUndefined: Self = StObject.set(x, "allowZeroStars", js.undefined)
      
      @scala.inline
      def setAriaLabelFormat(value: String): Self = StObject.set(x, "ariaLabelFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelFormatUndefined: Self = StObject.set(x, "ariaLabelFormat", js.undefined)
      
      @scala.inline
      def setAriaLabelId(value: String): Self = StObject.set(x, "ariaLabelId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelIdUndefined: Self = StObject.set(x, "ariaLabelId", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IRating]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IRating | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setGetAriaLabel(value: (/* rating */ Double, /* max */ Double) => String): Self = StObject.set(x, "getAriaLabel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetAriaLabelUndefined: Self = StObject.set(x, "getAriaLabel", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* event */ FocusEvent[HTMLElement], /* rating */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnChanged(value: /* rating */ Double => Unit): Self = StObject.set(x, "onChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
      
      @scala.inline
      def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      @scala.inline
      def setSize(value: RatingSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IRatingStyleProps, IRatingStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IRatingStyleProps => DeepPartial[IRatingStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setUnselectedIcon(value: String): Self = StObject.set(x, "unselectedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectedIconUndefined: Self = StObject.set(x, "unselectedIcon", js.undefined)
    }
  }
  
  @js.native
  trait IRatingStyleProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var theme: ITheme = js.native
  }
  object IRatingStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IRatingStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRatingStyleProps]
    }
    
    @scala.inline
    implicit class IRatingStylePropsMutableBuilder[Self <: IRatingStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRatingStyles extends StObject {
    
    var labelText: IStyle = js.native
    
    var ratingButton: IStyle = js.native
    
    var ratingFocusZone: IStyle = js.native
    
    var ratingStar: IStyle = js.native
    
    var ratingStarBack: IStyle = js.native
    
    var ratingStarFront: IStyle = js.native
    
    var ratingStarIsLarge: IStyle = js.native
    
    var ratingStarIsSmall: IStyle = js.native
    
    var root: IStyle = js.native
    
    var rootIsLarge: IStyle = js.native
    
    var rootIsSmall: IStyle = js.native
  }
  object IRatingStyles {
    
    @scala.inline
    def apply(): IRatingStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRatingStyles]
    }
    
    @scala.inline
    implicit class IRatingStylesMutableBuilder[Self <: IRatingStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabelText(value: IStyle): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelTextNull: Self = StObject.set(x, "labelText", null)
      
      @scala.inline
      def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
      
      @scala.inline
      def setRatingButton(value: IStyle): Self = StObject.set(x, "ratingButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingButtonNull: Self = StObject.set(x, "ratingButton", null)
      
      @scala.inline
      def setRatingButtonUndefined: Self = StObject.set(x, "ratingButton", js.undefined)
      
      @scala.inline
      def setRatingFocusZone(value: IStyle): Self = StObject.set(x, "ratingFocusZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingFocusZoneNull: Self = StObject.set(x, "ratingFocusZone", null)
      
      @scala.inline
      def setRatingFocusZoneUndefined: Self = StObject.set(x, "ratingFocusZone", js.undefined)
      
      @scala.inline
      def setRatingStar(value: IStyle): Self = StObject.set(x, "ratingStar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingStarBack(value: IStyle): Self = StObject.set(x, "ratingStarBack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingStarBackNull: Self = StObject.set(x, "ratingStarBack", null)
      
      @scala.inline
      def setRatingStarBackUndefined: Self = StObject.set(x, "ratingStarBack", js.undefined)
      
      @scala.inline
      def setRatingStarFront(value: IStyle): Self = StObject.set(x, "ratingStarFront", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingStarFrontNull: Self = StObject.set(x, "ratingStarFront", null)
      
      @scala.inline
      def setRatingStarFrontUndefined: Self = StObject.set(x, "ratingStarFront", js.undefined)
      
      @scala.inline
      def setRatingStarIsLarge(value: IStyle): Self = StObject.set(x, "ratingStarIsLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingStarIsLargeNull: Self = StObject.set(x, "ratingStarIsLarge", null)
      
      @scala.inline
      def setRatingStarIsLargeUndefined: Self = StObject.set(x, "ratingStarIsLarge", js.undefined)
      
      @scala.inline
      def setRatingStarIsSmall(value: IStyle): Self = StObject.set(x, "ratingStarIsSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingStarIsSmallNull: Self = StObject.set(x, "ratingStarIsSmall", null)
      
      @scala.inline
      def setRatingStarIsSmallUndefined: Self = StObject.set(x, "ratingStarIsSmall", js.undefined)
      
      @scala.inline
      def setRatingStarNull: Self = StObject.set(x, "ratingStar", null)
      
      @scala.inline
      def setRatingStarUndefined: Self = StObject.set(x, "ratingStar", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootIsLarge(value: IStyle): Self = StObject.set(x, "rootIsLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootIsLargeNull: Self = StObject.set(x, "rootIsLarge", null)
      
      @scala.inline
      def setRootIsLargeUndefined: Self = StObject.set(x, "rootIsLarge", js.undefined)
      
      @scala.inline
      def setRootIsSmall(value: IStyle): Self = StObject.set(x, "rootIsSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootIsSmallNull: Self = StObject.set(x, "rootIsSmall", null)
      
      @scala.inline
      def setRootIsSmallUndefined: Self = StObject.set(x, "rootIsSmall", js.undefined)
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
