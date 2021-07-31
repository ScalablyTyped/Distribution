package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UPDATE_PRIORITY extends StObject
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
object UPDATE_PRIORITY extends StObject {
  
  @js.native
  sealed trait HIGH
    extends StObject
       with UPDATE_PRIORITY
  
  @js.native
  sealed trait INTERACTION
    extends StObject
       with UPDATE_PRIORITY
  
  @js.native
  sealed trait LOW
    extends StObject
       with UPDATE_PRIORITY
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with UPDATE_PRIORITY
  
  @js.native
  sealed trait UTILITY
    extends StObject
       with UPDATE_PRIORITY
}
