package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the update priorities used by internal PIXI classes when registered with
  * the {@link PIXI.ticker.Ticker} object. Higher priority items are updated first and lower
  * priority items, such as render, should go later.
  */
@JSGlobal("PIXI.UPDATE_PRIORITY")
@js.native
object UPDATE_PRIORITY extends js.Object {
  /** HIGH=25 High priority updating, {@link PIXI.VideoBaseTexture} and {@link PIXI.extras.AnimatedSprite} */
  var HIGH: Double = js.native
  /** INTERACTION=50 Highest priority, used for {@link PIXI.interaction.InteractionManager} */
  var INTERACTION: Double = js.native
  /** LOW=-25 Low priority used for {@link PIXI.Application} rendering. */
  var LOW: Double = js.native
  /** NORMAL=0 Default priority for ticker events, see {@link PIXI.ticker.Ticker#add}. */
  var NORMAL: Double = js.native
  /** UTILITY=-50 Lowest priority used for {@link PIXI.prepare.BasePrepare} utility. */
  var UTILITY: Double = js.native
}

