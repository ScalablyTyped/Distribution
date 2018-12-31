package typings
package officeDashUiDashFabricDashReactLib.libComponentsRatingRatingDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRatingProps
  extends reactLib.reactMod.ReactNs.AllHTMLAttributes[reactLib.HTMLElement] {
  /**
    * Allow the rating value to be set to 0 instead of a minimum of 1.
    */
  var allowZeroStars: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional label format for star ratings, will be read by screen readers, defaults to ''.
    * Can be used like "\{0\} of \{1\} stars selected".
    * Where \{0\} will be subsituted by the current rating and \{1\} will be subsituted by the max rating.
    */
  var ariaLabelFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Deprecated: Optional id of label describing this instance of Rating. Use `getAriaLabel` instead.
    * @deprecated Use `getAriaLabel` instead.
    */
  var ariaLabelId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional callback to access the IRating interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IRating]] = js.undefined
  var getAriaLabel: js.UndefOr[
    js.Function2[/* rating */ scala.Double, /* max */ scala.Double, java.lang.String]
  ] = js.undefined
  /**
    * Custom icon
    * @defaultvalue FavoriteStarFill
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Maximum rating, defaults to 5, has to be \>= min
    */
  @JSName("max")
  var max_IRatingProps: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum rating, defaults to 1, has to be \>= 0
    * @deprecated No longer used.
    */
  @JSName("min")
  var min_IRatingProps: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback issued when the rating changes.
    */
  @JSName("onChange")
  var onChange_IRatingProps: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], 
      /* rating */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[js.Function1[/* rating */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Selected rating, has to be an integer between min and max
    */
  var rating: js.UndefOr[scala.Double] = js.undefined
  /**
    * Size of rating, defaults to small
    */
  @JSName("size")
  var size_IRatingProps: js.UndefOr[RatingSize] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IRatingStyleProps, IRatingStyles]
  ] = js.undefined
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
    * Custom icon for unselected rating elements.
    * If an `icon` property is provided, defaults to the value of the `icon` property.
    * @defaultvalue FavoriteStarFill
    */
  var unselectedIcon: js.UndefOr[java.lang.String] = js.undefined
}

