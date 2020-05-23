package typings.openfin.GoldenLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.openfin.GoldenLayout.ItemConfigType because Already inherited */ trait ReactComponentConfig extends ItemConfig {
  /**
    * The name of the component as specified in layout.registerComponent. Mandatory if type is 'react-component'
    */
  var component: String
  /**
    * Properties that will be passed to the component and accessible using this.props.
    */
  var props: js.UndefOr[js.Any] = js.undefined
}

object ReactComponentConfig {
  @scala.inline
  def apply(
    component: String,
    `type`: String,
    content: js.Array[ItemConfigType] = null,
    height: js.UndefOr[Double] = js.undefined,
    id: String | js.Array[String] = null,
    isClosable: js.UndefOr[Boolean] = js.undefined,
    props: js.Any = null,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ReactComponentConfig = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isClosable)) __obj.updateDynamic("isClosable")(isClosable.get.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactComponentConfig]
  }
}

