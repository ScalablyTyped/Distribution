package typings.pixiDotJs.PIXI.loaders.Resource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STATUS_FLAGS extends js.Object

@JSGlobal("PIXI.loaders.Resource.STATUS_FLAGS")
@js.native
object STATUS_FLAGS extends js.Object {
  @js.native
  sealed trait COMPLETE extends STATUS_FLAGS
  
  @js.native
  sealed trait DATA_URL extends STATUS_FLAGS
  
  @js.native
  sealed trait LOADING extends STATUS_FLAGS
  
  @js.native
  sealed trait NONE extends STATUS_FLAGS
  
  /* 2 */ val COMPLETE: typings.pixiDotJs.PIXI.loaders.Resource.STATUS_FLAGS.COMPLETE with Double = js.native
  /* 1 */ val DATA_URL: typings.pixiDotJs.PIXI.loaders.Resource.STATUS_FLAGS.DATA_URL with Double = js.native
  /* 3 */ val LOADING: typings.pixiDotJs.PIXI.loaders.Resource.STATUS_FLAGS.LOADING with Double = js.native
  /* 0 */ val NONE: typings.pixiDotJs.PIXI.loaders.Resource.STATUS_FLAGS.NONE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[STATUS_FLAGS with Double] = js.native
}

