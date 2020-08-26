package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Uniform group holds uniform map and some ID's for work
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait UniformGroup extends js.Object {
  /**
    * dirty version
    * @protected
    * @member {number} PIXI.UniformGroup#dirtyId
    */
  var dirtyId: Double = js.native
  /**
    * Its a group and not a single uniforms
    * @member {boolean} PIXI.UniformGroup#group
    * @readonly
    * @default true
    */
  val group: Boolean = js.native
  /**
    * unique id
    * @protected
    * @member {number} PIXI.UniformGroup#id
    */
  var id: Double = js.native
  /**
    * Uniforms wont be changed after creation
    * @member {boolean} PIXI.UniformGroup#static
    */
  var static: Boolean = js.native
  /**
    * uniform values
    * @member {object} PIXI.UniformGroup#uniforms
    * @readonly
    */
  val uniforms: js.Any = js.native
}

object UniformGroup {
  @scala.inline
  def apply(dirtyId: Double, group: Boolean, id: Double, static: Boolean, uniforms: js.Any): UniformGroup = {
    val __obj = js.Dynamic.literal(dirtyId = dirtyId.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniformGroup]
  }
  @scala.inline
  implicit class UniformGroupOps[Self <: UniformGroup] (val x: Self) extends AnyVal {
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
    def setDirtyId(value: Double): Self = this.set("dirtyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup(value: Boolean): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniforms(value: js.Any): Self = this.set("uniforms", value.asInstanceOf[js.Any])
  }
  
}

