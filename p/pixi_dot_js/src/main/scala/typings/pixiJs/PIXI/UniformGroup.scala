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
trait UniformGroup extends js.Object {
  /**
    * dirty version
    * @protected
    * @member {number} PIXI.UniformGroup#dirtyId
    */
  var dirtyId: Double
  /**
    * Its a group and not a single uniforms
    * @member {boolean} PIXI.UniformGroup#group
    * @readonly
    * @default true
    */
  val group: Boolean
  /**
    * unique id
    * @protected
    * @member {number} PIXI.UniformGroup#id
    */
  var id: Double
  /**
    * Uniforms wont be changed after creation
    * @member {boolean} PIXI.UniformGroup#static
    */
  var static: Boolean
  /**
    * uniform values
    * @member {object} PIXI.UniformGroup#uniforms
    * @readonly
    */
  val uniforms: js.Any
}

object UniformGroup {
  @scala.inline
  def apply(dirtyId: Double, group: Boolean, id: Double, static: Boolean, uniforms: js.Any): UniformGroup = {
    val __obj = js.Dynamic.literal(dirtyId = dirtyId.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniformGroup]
  }
}

