package typings.officeDashJsDashPreview.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a section in a Word document.
  *
  * [Api set: WordApi 1.1]
  */
trait SectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the body object of the section. This does not include the header/footer and other section metadata.
    *
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyLoadOptions] = js.undefined
}

object SectionLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[Boolean] = js.undefined, body: BodyLoadOptions = null): SectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[SectionLoadOptions]
  }
}

