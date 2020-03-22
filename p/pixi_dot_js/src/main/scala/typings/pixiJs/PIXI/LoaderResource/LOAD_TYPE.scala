package typings.pixiJs.PIXI.LoaderResource

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LOAD_TYPE with Double] = js.native
  /* 3 */ @js.native
  object AUDIO extends TopLevel[AUDIO with Double]
  
  /* 2 */ @js.native
  object IMAGE extends TopLevel[IMAGE with Double]
  
  /* 4 */ @js.native
  object VIDEO extends TopLevel[VIDEO with Double]
  
  /* 1 */ @js.native
  object XHR extends TopLevel[XHR with Double]
  
}

