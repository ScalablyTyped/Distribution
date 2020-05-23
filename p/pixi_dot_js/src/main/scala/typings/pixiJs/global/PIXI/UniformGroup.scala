package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Uniform group holds uniform map and some ID's for work
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.UniformGroup")
@js.native
class UniformGroup ()
  extends typings.pixiJs.PIXI.UniformGroup {
  def this(uniforms: js.Any) = this()
  def this(uniforms: js.Any, _static: Boolean) = this()
  /**
    * dirty version
    * @protected
    * @member {number} PIXI.UniformGroup#dirtyId
    */
  /* CompleteClass */
  override var dirtyId: Double = js.native
  /**
    * Its a group and not a single uniforms
    * @member {boolean} PIXI.UniformGroup#group
    * @readonly
    * @default true
    */
  /* CompleteClass */
  override val group: Boolean = js.native
  /**
    * unique id
    * @protected
    * @member {number} PIXI.UniformGroup#id
    */
  /* CompleteClass */
  override var id: Double = js.native
  /**
    * Uniforms wont be changed after creation
    * @member {boolean} PIXI.UniformGroup#static
    */
  /* CompleteClass */
  override var static: Boolean = js.native
  /**
    * uniform values
    * @member {object} PIXI.UniformGroup#uniforms
    * @readonly
    */
  /* CompleteClass */
  override val uniforms: js.Any = js.native
}

