package typings.pixiJs.PIXI.LoaderResource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LOAD_TYPE extends js.Object

@JSGlobal("PIXI.LoaderResource.LOAD_TYPE")
@js.native
object LOAD_TYPE extends js.Object {
  /** Uses an `Audio` object to load the resource. */
  @js.native
  sealed trait AUDIO extends LOAD_TYPE
  
  /** Uses an `Image` object to load the resource. */
  @js.native
  sealed trait IMAGE extends LOAD_TYPE
  
  /** Uses a `Video` object to load the resource. */
  @js.native
  sealed trait VIDEO extends LOAD_TYPE
  
  /** Uses XMLHttpRequest to load the resource. */
  @js.native
  sealed trait XHR extends LOAD_TYPE
  
}

