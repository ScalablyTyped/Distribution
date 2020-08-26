package typings.nivoSlider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var afterChange: js.UndefOr[js.Function0[Unit]] = js.native
  var afterLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var animSpeed: js.UndefOr[Double] = js.native
  var beforeChange: js.UndefOr[js.Function0[Unit]] = js.native
  var boxCols: js.UndefOr[Double] = js.native
  var boxRows: js.UndefOr[Double] = js.native
  var controlNav: js.UndefOr[Boolean] = js.native
  var controlNavThumbs: js.UndefOr[Boolean] = js.native
  var directionNav: js.UndefOr[Boolean] = js.native
  var effect: js.UndefOr[EffectType] = js.native
  var lastSlide: js.UndefOr[js.Function0[Unit]] = js.native
  var manualAdvance: js.UndefOr[Boolean] = js.native
  var nextText: js.UndefOr[String] = js.native
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  var pauseTime: js.UndefOr[Double] = js.native
  var prevText: js.UndefOr[String] = js.native
  var randomStart: js.UndefOr[Boolean] = js.native
  var slices: js.UndefOr[Double] = js.native
  var slideshowEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var startSlide: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAfterChange(value: () => Unit): Self = this.set("afterChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterChange: Self = this.set("afterChange", js.undefined)
    @scala.inline
    def setAfterLoad(value: () => Unit): Self = this.set("afterLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterLoad: Self = this.set("afterLoad", js.undefined)
    @scala.inline
    def setAnimSpeed(value: Double): Self = this.set("animSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimSpeed: Self = this.set("animSpeed", js.undefined)
    @scala.inline
    def setBeforeChange(value: () => Unit): Self = this.set("beforeChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeChange: Self = this.set("beforeChange", js.undefined)
    @scala.inline
    def setBoxCols(value: Double): Self = this.set("boxCols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxCols: Self = this.set("boxCols", js.undefined)
    @scala.inline
    def setBoxRows(value: Double): Self = this.set("boxRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxRows: Self = this.set("boxRows", js.undefined)
    @scala.inline
    def setControlNav(value: Boolean): Self = this.set("controlNav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlNav: Self = this.set("controlNav", js.undefined)
    @scala.inline
    def setControlNavThumbs(value: Boolean): Self = this.set("controlNavThumbs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlNavThumbs: Self = this.set("controlNavThumbs", js.undefined)
    @scala.inline
    def setDirectionNav(value: Boolean): Self = this.set("directionNav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectionNav: Self = this.set("directionNav", js.undefined)
    @scala.inline
    def setEffect(value: EffectType): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    @scala.inline
    def setLastSlide(value: () => Unit): Self = this.set("lastSlide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLastSlide: Self = this.set("lastSlide", js.undefined)
    @scala.inline
    def setManualAdvance(value: Boolean): Self = this.set("manualAdvance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualAdvance: Self = this.set("manualAdvance", js.undefined)
    @scala.inline
    def setNextText(value: String): Self = this.set("nextText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextText: Self = this.set("nextText", js.undefined)
    @scala.inline
    def setPauseOnHover(value: Boolean): Self = this.set("pauseOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseOnHover: Self = this.set("pauseOnHover", js.undefined)
    @scala.inline
    def setPauseTime(value: Double): Self = this.set("pauseTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseTime: Self = this.set("pauseTime", js.undefined)
    @scala.inline
    def setPrevText(value: String): Self = this.set("prevText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevText: Self = this.set("prevText", js.undefined)
    @scala.inline
    def setRandomStart(value: Boolean): Self = this.set("randomStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomStart: Self = this.set("randomStart", js.undefined)
    @scala.inline
    def setSlices(value: Double): Self = this.set("slices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlices: Self = this.set("slices", js.undefined)
    @scala.inline
    def setSlideshowEnd(value: () => Unit): Self = this.set("slideshowEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSlideshowEnd: Self = this.set("slideshowEnd", js.undefined)
    @scala.inline
    def setStartSlide(value: Double): Self = this.set("startSlide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartSlide: Self = this.set("startSlide", js.undefined)
  }
  
}

