package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UPDATE_PRIORITY extends js.Object

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
  @js.native
  sealed trait HIGH extends UPDATE_PRIORITY
  
  @js.native
  sealed trait INTERACTION extends UPDATE_PRIORITY
  
  @js.native
  sealed trait LOW extends UPDATE_PRIORITY
  
  @js.native
  sealed trait NORMAL extends UPDATE_PRIORITY
  
  @js.native
  sealed trait UTILITY extends UPDATE_PRIORITY
  
}

