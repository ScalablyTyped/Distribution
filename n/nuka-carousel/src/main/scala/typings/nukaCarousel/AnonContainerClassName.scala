package typings.nukaCarousel

import typings.nukaCarousel.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerClassName extends js.Object {
  var containerClassName: js.UndefOr[String] = js.undefined
  var nextButtonClassName: js.UndefOr[String] = js.undefined
  var nextButtonStyle: js.UndefOr[CSSProperties] = js.undefined
  var nextButtonText: js.UndefOr[String] = js.undefined
  var pagingDotsClassName: js.UndefOr[String] = js.undefined
  var pagingDotsContainerClassName: js.UndefOr[String] = js.undefined
  var pagingDotsStyle: js.UndefOr[CSSProperties] = js.undefined
  var prevButtonClassName: js.UndefOr[String] = js.undefined
  var prevButtonStyle: js.UndefOr[CSSProperties] = js.undefined
  var prevButtonText: js.UndefOr[String] = js.undefined
}

object AnonContainerClassName {
  @scala.inline
  def apply(
    containerClassName: String = null,
    nextButtonClassName: String = null,
    nextButtonStyle: CSSProperties = null,
    nextButtonText: String = null,
    pagingDotsClassName: String = null,
    pagingDotsContainerClassName: String = null,
    pagingDotsStyle: CSSProperties = null,
    prevButtonClassName: String = null,
    prevButtonStyle: CSSProperties = null,
    prevButtonText: String = null
  ): AnonContainerClassName = {
    val __obj = js.Dynamic.literal()
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (nextButtonClassName != null) __obj.updateDynamic("nextButtonClassName")(nextButtonClassName.asInstanceOf[js.Any])
    if (nextButtonStyle != null) __obj.updateDynamic("nextButtonStyle")(nextButtonStyle.asInstanceOf[js.Any])
    if (nextButtonText != null) __obj.updateDynamic("nextButtonText")(nextButtonText.asInstanceOf[js.Any])
    if (pagingDotsClassName != null) __obj.updateDynamic("pagingDotsClassName")(pagingDotsClassName.asInstanceOf[js.Any])
    if (pagingDotsContainerClassName != null) __obj.updateDynamic("pagingDotsContainerClassName")(pagingDotsContainerClassName.asInstanceOf[js.Any])
    if (pagingDotsStyle != null) __obj.updateDynamic("pagingDotsStyle")(pagingDotsStyle.asInstanceOf[js.Any])
    if (prevButtonClassName != null) __obj.updateDynamic("prevButtonClassName")(prevButtonClassName.asInstanceOf[js.Any])
    if (prevButtonStyle != null) __obj.updateDynamic("prevButtonStyle")(prevButtonStyle.asInstanceOf[js.Any])
    if (prevButtonText != null) __obj.updateDynamic("prevButtonText")(prevButtonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainerClassName]
  }
}

