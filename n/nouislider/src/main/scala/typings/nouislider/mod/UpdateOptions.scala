package typings.nouislider.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nouislider.nouisliderStrings.horizontal
import typings.nouislider.nouisliderStrings.lower
import typings.nouislider.nouisliderStrings.ltr
import typings.nouislider.nouisliderStrings.rtl
import typings.nouislider.nouisliderStrings.upper
import typings.nouislider.nouisliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update options that can not be updated will be ignored without errors.
  * The value null can be used to unset a previously set value.
  */
/* Inlined std.Partial<nouislider.nouislider.Options> */
@js.native
trait UpdateOptions extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var animationDuration: js.UndefOr[Double] = js.native
  var behaviour: js.UndefOr[String] = js.native
  var connect: js.UndefOr[lower | upper | Boolean | js.Array[Boolean]] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var format: js.UndefOr[js.Object | (js.Function1[/* repeated */ js.Any, _])] = js.native
  var limit: js.UndefOr[Double] = js.native
  var margin: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[vertical | horizontal] = js.native
  var padding: js.UndefOr[Double] = js.native
  var pips: js.UndefOr[PipsOptions] = js.native
  var range: js.UndefOr[StringDictionary[Double | js.Array[Double]]] = js.native
  var snap: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[Double | (js.Array[js.Array[Double] | Double])] = js.native
  var step: js.UndefOr[Double] = js.native
  var tooltips: js.UndefOr[Boolean | js.Object | (js.Function1[/* repeated */ js.Any, _])] = js.native
}

object UpdateOptions {
  @scala.inline
  def apply(): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOptions]
  }
  @scala.inline
  implicit class UpdateOptionsOps[Self <: UpdateOptions] (val x: Self) extends AnyVal {
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setBehaviour(value: String): Self = this.set("behaviour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehaviour: Self = this.set("behaviour", js.undefined)
    @scala.inline
    def setConnectVarargs(value: Boolean*): Self = this.set("connect", js.Array(value :_*))
    @scala.inline
    def setConnect(value: lower | upper | Boolean | js.Array[Boolean]): Self = this.set("connect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setFormatFunction1(value: /* repeated */ js.Any => _): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setFormat(value: js.Object | (js.Function1[/* repeated */ js.Any, _])): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOrientation(value: vertical | horizontal): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPips(value: PipsOptions): Self = this.set("pips", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePips: Self = this.set("pips", js.undefined)
    @scala.inline
    def setRange(value: StringDictionary[Double | js.Array[Double]]): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setSnap(value: Boolean): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    @scala.inline
    def setStartVarargs(value: (js.Array[Double] | Double)*): Self = this.set("start", js.Array(value :_*))
    @scala.inline
    def setStart(value: Double | (js.Array[js.Array[Double] | Double])): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setTooltipsFunction1(value: /* repeated */ js.Any => _): Self = this.set("tooltips", js.Any.fromFunction1(value))
    @scala.inline
    def setTooltips(value: Boolean | js.Object | (js.Function1[/* repeated */ js.Any, _])): Self = this.set("tooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltips: Self = this.set("tooltips", js.undefined)
  }
  
}

