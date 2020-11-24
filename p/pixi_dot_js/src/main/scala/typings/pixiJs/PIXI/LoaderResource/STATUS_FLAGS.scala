package typings.pixiJs.PIXI.LoaderResource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait STATUS_FLAGS extends js.Object
@JSGlobal("PIXI.LoaderResource.STATUS_FLAGS")
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
}
