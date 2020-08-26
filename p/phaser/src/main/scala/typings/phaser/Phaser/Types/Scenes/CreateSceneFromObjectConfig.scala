package typings.phaser.Phaser.Types.Scenes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSceneFromObjectConfig extends js.Object {
  /**
    * The scene's create callback.
    */
  var create: js.UndefOr[SceneCreateCallback] = js.native
  /**
    * Any additional properties, which will be copied to the Scene after it's created (except `data` or `sys`).
    */
  var extend: js.UndefOr[js.Any] = js.native
  /**
    * Any values, which will be merged into the Scene's Data Manager store.
    */
  @JSName("extend.data")
  var extendDotdata: js.UndefOr[js.Any] = js.native
  /**
    * The scene's init callback.
    */
  var init: js.UndefOr[SceneInitCallback] = js.native
  /**
    * The scene's preload callback.
    */
  var preload: js.UndefOr[ScenePreloadCallback] = js.native
  /**
    * The scene's update callback. See {@link Phaser.Scene#update}.
    */
  var update: js.UndefOr[js.Function] = js.native
}

object CreateSceneFromObjectConfig {
  @scala.inline
  def apply(): CreateSceneFromObjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSceneFromObjectConfig]
  }
  @scala.inline
  implicit class CreateSceneFromObjectConfigOps[Self <: CreateSceneFromObjectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: /* data */ js.Object => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setExtend(value: js.Any): Self = this.set("extend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    @scala.inline
    def setExtendDotdata(value: js.Any): Self = this.set("extend.data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendDotdata: Self = this.set("extend.data", js.undefined)
    @scala.inline
    def setInit(value: /* data */ js.Object => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setPreload(value: () => Unit): Self = this.set("preload", js.Any.fromFunction0(value))
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setUpdate(value: js.Function): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

