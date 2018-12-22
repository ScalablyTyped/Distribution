package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

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

