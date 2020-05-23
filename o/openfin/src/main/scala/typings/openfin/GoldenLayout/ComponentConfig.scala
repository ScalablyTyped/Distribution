package typings.openfin.GoldenLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.openfin.GoldenLayout.ItemConfigType because Already inherited */ trait ComponentConfig extends ItemConfig {
  /**
    * The name of the component as specified in layout.registerComponent. Mandatory if type is 'component'.
    */
  var componentName: String
  /**
    * A serialisable object. Will be passed to the component constructor function and will be the value returned by
    * container.getState().
    */
  var componentState: js.UndefOr[js.Any] = js.undefined
}

object ComponentConfig {
  @scala.inline
  def apply(
    componentName: String,
    `type`: String,
    componentState: js.Any = null,
    content: js.Array[ItemConfigType] = null,
    height: js.UndefOr[Double] = js.undefined,
    id: String | js.Array[String] = null,
    isClosable: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ComponentConfig = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (componentState != null) __obj.updateDynamic("componentState")(componentState.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isClosable)) __obj.updateDynamic("isClosable")(isClosable.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfig]
  }
}

