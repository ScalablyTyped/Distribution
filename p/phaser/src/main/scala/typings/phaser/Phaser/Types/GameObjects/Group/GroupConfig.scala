package typings.phaser.Phaser.Types.GameObjects.Group

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupConfig extends js.Object {
  /**
    * Sets {@link Phaser.GameObjects.Group#active}.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#classType}.
    */
  var classType: js.UndefOr[js.Function] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#createCallback}.
    */
  var createCallback: js.UndefOr[GroupCallback] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#createMultipleCallback}.
    */
  var createMultipleCallback: js.UndefOr[GroupMultipleCreateCallback] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#defaultFrame}.
    */
  var defaultFrame: js.UndefOr[String | integer] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#defaultKey}.
    */
  var defaultKey: js.UndefOr[String] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#maxSize}.
    */
  var maxSize: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#name}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#removeCallback}.
    */
  var removeCallback: js.UndefOr[GroupCallback] = js.native
  /**
    * Sets {@link Phaser.GameObjects.Group#runChildUpdate}.
    */
  var runChildUpdate: js.UndefOr[Boolean] = js.native
}

object GroupConfig {
  @scala.inline
  def apply(): GroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupConfig]
  }
  @scala.inline
  implicit class GroupConfigOps[Self <: GroupConfig] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setClassType(value: js.Function): Self = this.set("classType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassType: Self = this.set("classType", js.undefined)
    @scala.inline
    def setCreateCallback(value: /* item */ GameObject => Unit): Self = this.set("createCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateCallback: Self = this.set("createCallback", js.undefined)
    @scala.inline
    def setCreateMultipleCallback(value: /* items */ js.Array[GameObject] => Unit): Self = this.set("createMultipleCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateMultipleCallback: Self = this.set("createMultipleCallback", js.undefined)
    @scala.inline
    def setDefaultFrame(value: String | integer): Self = this.set("defaultFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFrame: Self = this.set("defaultFrame", js.undefined)
    @scala.inline
    def setDefaultKey(value: String): Self = this.set("defaultKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultKey: Self = this.set("defaultKey", js.undefined)
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRemoveCallback(value: /* item */ GameObject => Unit): Self = this.set("removeCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveCallback: Self = this.set("removeCallback", js.undefined)
    @scala.inline
    def setRunChildUpdate(value: Boolean): Self = this.set("runChildUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunChildUpdate: Self = this.set("runChildUpdate", js.undefined)
  }
  
}

