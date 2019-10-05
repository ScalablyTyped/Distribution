package typings.phaser.Phaser.Types.Scenes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSceneFromObjectConfig extends js.Object {
  /**
    * The scene's create callback.
    */
  var create: js.UndefOr[SceneCreateCallback] = js.undefined
  /**
    * Any additional properties, which will be copied to the Scene after it's created (except `data` or `sys`).
    */
  var extend: js.UndefOr[js.Any] = js.undefined
  /**
    * Any values, which will be merged into the Scene's Data Manager store.
    */
  var `extend.data`: js.UndefOr[js.Any] = js.undefined
  /**
    * The scene's init callback.
    */
  var init: js.UndefOr[SceneInitCallback] = js.undefined
  /**
    * The scene's preload callback.
    */
  var preload: js.UndefOr[ScenePreloadCallback] = js.undefined
  /**
    * The scene's update callback. See {@link Phaser.Scene#update}.
    */
  var update: js.UndefOr[js.Function] = js.undefined
}

object CreateSceneFromObjectConfig {
  @scala.inline
  def apply(
    create: /* data */ js.Object => Unit = null,
    extend: js.Any = null,
    `extend.data`: js.Any = null,
    init: /* data */ js.Object => Unit = null,
    preload: () => Unit = null,
    update: js.Function = null
  ): CreateSceneFromObjectConfig = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (`extend.data` != null) __obj.updateDynamic("extend.data")(`extend.data`)
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (preload != null) __obj.updateDynamic("preload")(js.Any.fromFunction0(preload))
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[CreateSceneFromObjectConfig]
  }
}

