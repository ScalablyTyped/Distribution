package typings.phaser.Phaser.Types.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginObject extends js.Object {
  /**
    * The default set of scene plugins (names).
    */
  var default: js.UndefOr[js.Array[String]] = js.native
  /**
    * Plugins to *add* to the default set of scene plugins.
    */
  var defaultMerge: js.UndefOr[js.Array[String]] = js.native
  /**
    * Global plugins to install.
    */
  var global: js.UndefOr[js.Array[PluginObjectItem]] = js.native
  /**
    * Scene plugins to install.
    */
  var scene: js.UndefOr[js.Array[PluginObjectItem]] = js.native
}

object PluginObject {
  @scala.inline
  def apply(): PluginObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginObject]
  }
  @scala.inline
  implicit class PluginObjectOps[Self <: PluginObject] (val x: Self) extends AnyVal {
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
    def setDefaultVarargs(value: String*): Self = this.set("default", js.Array(value :_*))
    @scala.inline
    def setDefault(value: js.Array[String]): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDefaultMergeVarargs(value: String*): Self = this.set("defaultMerge", js.Array(value :_*))
    @scala.inline
    def setDefaultMerge(value: js.Array[String]): Self = this.set("defaultMerge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMerge: Self = this.set("defaultMerge", js.undefined)
    @scala.inline
    def setGlobalVarargs(value: PluginObjectItem*): Self = this.set("global", js.Array(value :_*))
    @scala.inline
    def setGlobal(value: js.Array[PluginObjectItem]): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setSceneVarargs(value: PluginObjectItem*): Self = this.set("scene", js.Array(value :_*))
    @scala.inline
    def setScene(value: js.Array[PluginObjectItem]): Self = this.set("scene", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScene: Self = this.set("scene", js.undefined)
  }
  
}

