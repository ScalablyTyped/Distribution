package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the collection of the document's {@link Word.Section} objects.
  *
  * [Api set: WordApi 1.1]
  */
trait SectionCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the body object of the section. This does not include the header/footer and other section metadata.
    *
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyLoadOptions] = js.undefined
}

object SectionCollectionLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[scala.Boolean] = js.undefined, body: BodyLoadOptions = null): SectionCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[SectionCollectionLoadOptions]
  }
}

