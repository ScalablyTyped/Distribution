package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transform that takes care about its versions
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Transform")
@js.native
class Transform ()
  extends typings.pixiJs.PIXI.Transform
object Transform {
  
  @JSImport("pixi.js", "Transform")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A default (identity) transform
    *
    * @static
    * @constant
    * @member {PIXI.Transform}
    */
  /* static member */
  @JSImport("pixi.js", "Transform.IDENTITY")
  @js.native
  def IDENTITY: typings.pixiJs.PIXI.Transform = js.native
  @scala.inline
  def IDENTITY_=(x: typings.pixiJs.PIXI.Transform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY")(x.asInstanceOf[js.Any])
}
