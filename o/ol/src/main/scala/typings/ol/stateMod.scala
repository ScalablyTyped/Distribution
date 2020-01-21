package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/State", JSImport.Namespace)
@js.native
object stateMod extends js.Object {
  @js.native
  sealed trait State extends js.Object
  
  @js.native
  object State extends js.Object {
    @js.native
    sealed trait ERROR extends State
    
    @js.native
    sealed trait LOADING extends State
    
    @js.native
    sealed trait READY extends State
    
    @js.native
    sealed trait UNDEFINED extends State
    
  }
  
  @js.native
  object default extends js.Object {
    /* "error" */ val ERROR: typings.ol.stateMod.State.ERROR with String = js.native
    /* "loading" */ val LOADING: typings.ol.stateMod.State.LOADING with String = js.native
    /* "ready" */ val READY: typings.ol.stateMod.State.READY with String = js.native
    /* "undefined" */ val UNDEFINED: typings.ol.stateMod.State.UNDEFINED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[State with String] = js.native
  }
  
}

