package typings.officeUiFabricReact.ratingTypesMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.FocusEvent
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IRatingPropsOps[Self <: IRatingProps] (val x: Self) extends AnyVal {
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
    def setAllowZeroStars(value: Boolean): Self = this.set("allowZeroStars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowZeroStars: Self = this.set("allowZeroStars", js.undefined)
    @scala.inline
    def setAriaLabelFormat(value: String): Self = this.set("ariaLabelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelFormat: Self = this.set("ariaLabelFormat", js.undefined)
    @scala.inline
    def setAriaLabelId(value: String): Self = this.set("ariaLabelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelId: Self = this.set("ariaLabelId", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IRating | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IRating]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setGetAriaLabel(value: (/* rating */ Double, /* max */ Double) => String): Self = this.set("getAriaLabel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetAriaLabel: Self = this.set("getAriaLabel", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOnChange(value: (/* event */ FocusEvent[HTMLElement], /* rating */ js.UndefOr[Double]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChanged(value: /* rating */ Double => Unit): Self = this.set("onChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChanged: Self = this.set("onChanged", js.undefined)
    @scala.inline
    def setRating(value: Double): Self = this.set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRating: Self = this.set("rating", js.undefined)
    @scala.inline
    def setSize(value: RatingSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IRatingStyleProps => DeepPartial[IRatingStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IRatingStyleProps, IRatingStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setUnselectedIcon(value: String): Self = this.set("unselectedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectedIcon: Self = this.set("unselectedIcon", js.undefined)
  }
  
}

