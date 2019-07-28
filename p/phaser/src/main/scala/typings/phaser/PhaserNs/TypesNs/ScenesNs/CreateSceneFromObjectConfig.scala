package typings.phaser.PhaserNs.TypesNs.ScenesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSceneFromObjectConfig extends js.Object {
  /**
    * See {@link Phaser.Scene#create}.
    */
  var create: js.UndefOr[js.Function] = js.undefined
  /**
    * Any additional properties, which will be copied to the Scene after it's created (except `data` or `sys`).
    */
  var extend: js.UndefOr[js.Any] = js.undefined
  /**
    * Any values, which will be merged into the Scene's Data Manager store.
    */
  var `extend.data`: js.UndefOr[js.Any] = js.undefined
  /**
    * See {@link Phaser.Scene#init}.
    */
  var init: js.UndefOr[js.Function] = js.undefined
  /**
    * See See {@link Phaser.Scene#preload}.
    */
  var preload: js.UndefOr[js.Function] = js.undefined
  /**
    * See {@link Phaser.Scene#update}.
    */
  var update: js.UndefOr[js.Function] = js.undefined
}

object CreateSceneFromObjectConfig {
  @scala.inline
  def apply(
    create: js.Function = null,
    extend: js.Any = null,
    `extend.data`: js.Any = null,
    init: js.Function = null,
    preload: js.Function = null,
    update: js.Function = null
  ): CreateSceneFromObjectConfig = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (`extend.data` != null) __obj.updateDynamic("extend.data")(`extend.data`)
    if (init != null) __obj.updateDynamic("init")(init)
    if (preload != null) __obj.updateDynamic("preload")(preload)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[CreateSceneFromObjectConfig]
  }
}

