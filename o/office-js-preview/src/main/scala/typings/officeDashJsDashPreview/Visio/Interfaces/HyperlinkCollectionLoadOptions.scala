package typings.officeDashJsDashPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Hyperlink Collection.
  *
  * [Api set:  1.1]
  */
@js.native
trait HyperlinkCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var address: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the description of a hyperlink. Read-only.
    *
    * [Api set:  1.1]
    */
  var description: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the extra URL request information used to resolve the hyperlink's URL. Read-only.
    *
    * [Api set:  1.1]
    */
  var extraInfo: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the sub-address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var subAddress: js.UndefOr[Boolean] = js.native
}

