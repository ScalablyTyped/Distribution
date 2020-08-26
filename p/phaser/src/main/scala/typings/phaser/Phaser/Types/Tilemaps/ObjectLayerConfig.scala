package typings.phaser.Phaser.Types.Tilemaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectLayerConfig extends js.Object {
  /**
    * The name of the Object Layer.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An array of all objects on this Object Layer.
    */
  var objects: js.UndefOr[js.Array[_]] = js.native
  /**
    * The opacity of the layer, between 0 and 1.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * The custom properties defined on the Object Layer, keyed by their name.
    */
  var properties: js.UndefOr[js.Any] = js.native
  /**
    * The type of each custom property defined on the Object Layer, keyed by its name.
    */
  var propertytypes: js.UndefOr[js.Any] = js.native
  /**
    * The type of the layer, which should be `objectgroup`.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Whether the layer is shown (`true`) or hidden (`false`).
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object ObjectLayerConfig {
  @scala.inline
  def apply(): ObjectLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLayerConfig]
  }
  @scala.inline
  implicit class ObjectLayerConfigOps[Self <: ObjectLayerConfig] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setObjectsVarargs(value: js.Any*): Self = this.set("objects", js.Array(value :_*))
    @scala.inline
    def setObjects(value: js.Array[_]): Self = this.set("objects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setPropertytypes(value: js.Any): Self = this.set("propertytypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertytypes: Self = this.set("propertytypes", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

