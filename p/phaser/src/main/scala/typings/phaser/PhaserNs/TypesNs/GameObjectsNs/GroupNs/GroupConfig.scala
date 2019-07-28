package typings.phaser.PhaserNs.TypesNs.GameObjectsNs.GroupNs

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupConfig extends js.Object {
  /**
    * Sets {@link Phaser.GameObjects.Group#active}.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#classType}.
    */
  var classType: js.UndefOr[js.Function] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#createCallback}.
    */
  var createCallback: js.UndefOr[GroupCallback] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#createMultipleCallback}.
    */
  var createMultipleCallback: js.UndefOr[GroupMultipleCreateCallback] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#defaultFrame}.
    */
  var defaultFrame: js.UndefOr[String | integer] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#defaultKey}.
    */
  var defaultKey: js.UndefOr[String] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#maxSize}.
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#name}.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#removeCallback}.
    */
  var removeCallback: js.UndefOr[GroupCallback] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#runChildUpdate}.
    */
  var runChildUpdate: js.UndefOr[Boolean] = js.undefined
}

object GroupConfig {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    classType: js.Function = null,
    createCallback: GroupCallback = null,
    createMultipleCallback: GroupMultipleCreateCallback = null,
    defaultFrame: String | integer = null,
    defaultKey: String = null,
    maxSize: Int | Double = null,
    name: String = null,
    removeCallback: GroupCallback = null,
    runChildUpdate: js.UndefOr[Boolean] = js.undefined
  ): GroupConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (classType != null) __obj.updateDynamic("classType")(classType)
    if (createCallback != null) __obj.updateDynamic("createCallback")(createCallback)
    if (createMultipleCallback != null) __obj.updateDynamic("createMultipleCallback")(createMultipleCallback)
    if (defaultFrame != null) __obj.updateDynamic("defaultFrame")(defaultFrame.asInstanceOf[js.Any])
    if (defaultKey != null) __obj.updateDynamic("defaultKey")(defaultKey)
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (removeCallback != null) __obj.updateDynamic("removeCallback")(removeCallback)
    if (!js.isUndefined(runChildUpdate)) __obj.updateDynamic("runChildUpdate")(runChildUpdate)
    __obj.asInstanceOf[GroupConfig]
  }
}

