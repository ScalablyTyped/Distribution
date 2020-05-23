package typings.openfin.GoldenLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openfin.GoldenLayout.ItemConfig
  - typings.openfin.GoldenLayout.ComponentConfig
  - typings.openfin.GoldenLayout.ReactComponentConfig
*/
trait ItemConfigType extends js.Object

object ItemConfigType {
  @scala.inline
  def ItemConfig(
    `type`: String,
    content: js.Array[ItemConfigType] = null,
    height: js.UndefOr[Double] = js.undefined,
    id: String | js.Array[String] = null,
    isClosable: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ItemConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isClosable)) __obj.updateDynamic("isClosable")(isClosable.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemConfigType]
  }
  @scala.inline
  def ComponentConfig(
    componentName: String,
    `type`: String,
    componentState: js.Any = null,
    content: js.Array[ItemConfigType] = null,
    height: js.UndefOr[Double] = js.undefined,
    id: String | js.Array[String] = null,
    isClosable: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ItemConfigType = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (componentState != null) __obj.updateDynamic("componentState")(componentState.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isClosable)) __obj.updateDynamic("isClosable")(isClosable.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemConfigType]
  }
  @scala.inline
  def ReactComponentConfig(
    component: String,
    `type`: String,
    content: js.Array[ItemConfigType] = null,
    height: js.UndefOr[Double] = js.undefined,
    id: String | js.Array[String] = null,
    isClosable: js.UndefOr[Boolean] = js.undefined,
    props: js.Any = null,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ItemConfigType = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isClosable)) __obj.updateDynamic("isClosable")(isClosable.get.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemConfigType]
  }
}

