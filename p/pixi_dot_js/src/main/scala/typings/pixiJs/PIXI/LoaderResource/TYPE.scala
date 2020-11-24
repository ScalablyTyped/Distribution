package typings.pixiJs.PIXI.LoaderResource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TYPE extends js.Object
@JSGlobal("PIXI.LoaderResource.TYPE")
@js.native
object TYPE extends js.Object {
  
  @js.native
  sealed trait AUDIO extends TYPE
  
  @js.native
  sealed trait IMAGE extends TYPE
  
  @js.native
  sealed trait JSON extends TYPE
  
  @js.native
  sealed trait TEXT extends TYPE
  
  @js.native
  sealed trait UNKNOWN extends TYPE
  
  @js.native
  sealed trait VIDEO extends TYPE
  
  @js.native
  sealed trait XML extends TYPE
}
