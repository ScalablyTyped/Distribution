package typings.openfin.GoldenLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemConfig extends ItemConfigType {
  /**
    * An array of configurations for items that will be created as children of this item.
    */
  var content: js.UndefOr[js.Array[ItemConfigType]] = js.undefined
  /**
    * The height of this item, relative to the other children of its parent in percent
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * A String or an Array of Strings. Used to retrieve the item using item.getItemsById()
    */
  var id: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Determines if the item is closable. If false, the x on the items tab will be hidden and container.close()
    * will return false
    * Default: true
    */
  var isClosable: js.UndefOr[Boolean] = js.undefined
  /**
    * The title of the item as displayed on its tab and on popout windows
    * Default: componentName or ''
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The type of the item. Possible values are 'row', 'column', 'stack', 'component' and 'react-component'.
    */
  var `type`: String
  /**
    * The width of this item, relative to the other children of its parent in percent
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ItemConfig {
  @scala.inline
  def apply(
    `type`: String,
    content: js.Array[ItemConfigType] = null,
    height: js.UndefOr[Double] = js.undefined,
    id: String | js.Array[String] = null,
    isClosable: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ItemConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isClosable)) __obj.updateDynamic("isClosable")(isClosable.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemConfig]
  }
}

