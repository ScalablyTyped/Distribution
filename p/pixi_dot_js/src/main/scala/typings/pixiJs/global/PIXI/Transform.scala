package typings.pixiJs.global.PIXI

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
@JSGlobal("PIXI.Transform")
@js.native
class Transform ()
  extends typings.pixiJs.PIXI.Transform
object Transform {
  
  @JSGlobal("PIXI.Transform")
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
  @JSGlobal("PIXI.Transform.IDENTITY")
  @js.native
  def IDENTITY: typings.pixiJs.PIXI.Transform = js.native
  @scala.inline
  def IDENTITY_=(x: typings.pixiJs.PIXI.Transform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY")(x.asInstanceOf[js.Any])
}
