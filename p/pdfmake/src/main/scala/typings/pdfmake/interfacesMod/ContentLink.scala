package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentLink extends js.Object {
  var link: js.UndefOr[String] = js.undefined
  var linkToDestination: js.UndefOr[String] = js.undefined
  var linkToPage: js.UndefOr[Double] = js.undefined
}

object ContentLink {
  @scala.inline
  def apply(link: String = null, linkToDestination: String = null, linkToPage: Int | Double = null): ContentLink = {
    val __obj = js.Dynamic.literal()
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (linkToDestination != null) __obj.updateDynamic("linkToDestination")(linkToDestination.asInstanceOf[js.Any])
    if (linkToPage != null) __obj.updateDynamic("linkToPage")(linkToPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentLink]
  }
}

