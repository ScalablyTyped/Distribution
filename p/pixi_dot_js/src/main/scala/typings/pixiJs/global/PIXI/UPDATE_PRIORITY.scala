package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the update priorities used by internal PIXI classes when registered with
  * the {@link PIXI.Ticker} object. Higher priority items are updated first and lower
  * priority items, such as render, should go later.
  *
  * @static
  * @constant
  * @name UPDATE_PRIORITY
  * @memberof PIXI
  * @enum {number}
  * @property {number} INTERACTION=50 Highest priority, used for {@link PIXI.InteractionManager}
  * @property {number} HIGH=25 High priority updating, {@link PIXI.VideoBaseTexture} and {@link PIXI.AnimatedSprite}
  * @property {number} NORMAL=0 Default priority for ticker events, see {@link PIXI.Ticker#add}.
  * @property {number} LOW=-25 Low priority used for {@link PIXI.Application} rendering.
  * @property {number} UTILITY=-50 Lowest priority used for {@link PIXI.BasePrepare} utility.
  */
@JSGlobal("PIXI.UPDATE_PRIORITY")
@js.native
object UPDATE_PRIORITY extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.UPDATE_PRIORITY with Double] = js.native
  
  /* 1 */ val HIGH: typings.pixiJs.PIXI.UPDATE_PRIORITY.HIGH with Double = js.native
  
  /* 0 */ val INTERACTION: typings.pixiJs.PIXI.UPDATE_PRIORITY.INTERACTION with Double = js.native
  
  /* 3 */ val LOW: typings.pixiJs.PIXI.UPDATE_PRIORITY.LOW with Double = js.native
  
  /* 2 */ val NORMAL: typings.pixiJs.PIXI.UPDATE_PRIORITY.NORMAL with Double = js.native
  
  /* 4 */ val UTILITY: typings.pixiJs.PIXI.UPDATE_PRIORITY.UTILITY with Double = js.native
}
