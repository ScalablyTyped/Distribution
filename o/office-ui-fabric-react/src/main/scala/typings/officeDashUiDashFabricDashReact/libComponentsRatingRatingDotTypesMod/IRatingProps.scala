package typings.officeDashUiDashFabricDashReact.libComponentsRatingRatingDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.FocusEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRatingProps extends AllHTMLAttributes[HTMLElement] {
  /**
    * Allow the rating value to be set to 0 instead of a minimum of 1.
    */
  var allowZeroStars: js.UndefOr[Boolean] = js.undefined
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
    js.Function2[/* event */ FocusEvent[HTMLElement], /* rating */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /**
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.undefined
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
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    allowZeroStars: js.UndefOr[Boolean] = js.undefined,
    ariaLabelFormat: String = null,
    ariaLabelId: String = null,
    componentRef: IRefObject[IRating] = null,
    getAriaLabel: (/* rating */ Double, /* max */ Double) => String = null,
    icon: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: (/* event */ FocusEvent[HTMLElement], /* rating */ js.UndefOr[Double]) => Unit = null,
    onChanged: /* rating */ Double => Unit = null,
    rating: Int | Double = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    size: RatingSize = null,
    styles: IStyleFunctionOrObject[IRatingStyleProps, IRatingStyles] = null,
    theme: ITheme = null,
    unselectedIcon: String = null
  ): IRatingProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (!js.isUndefined(allowZeroStars)) __obj.updateDynamic("allowZeroStars")(allowZeroStars)
    if (ariaLabelFormat != null) __obj.updateDynamic("ariaLabelFormat")(ariaLabelFormat)
    if (ariaLabelId != null) __obj.updateDynamic("ariaLabelId")(ariaLabelId)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (getAriaLabel != null) __obj.updateDynamic("getAriaLabel")(js.Any.fromFunction2(getAriaLabel))
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onChanged != null) __obj.updateDynamic("onChanged")(js.Any.fromFunction1(onChanged))
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (size != null) __obj.updateDynamic("size")(size)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (unselectedIcon != null) __obj.updateDynamic("unselectedIcon")(unselectedIcon)
    __obj.asInstanceOf[IRatingProps]
  }
}

