package typings.openfin

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/fdc3/intents", JSImport.Namespace)
@js.native
object intentsMod extends js.Object {
  
  @js.native
  sealed trait Intents extends js.Object
  @js.native
  object Intents extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Intents with String] = js.native
    
    @js.native
    sealed trait DIAL_CALL extends Intents
    /* "DialCall" */ @js.native
    object DIAL_CALL extends TopLevel[DIAL_CALL with String]
    
    @js.native
    sealed trait SAVE_CONTACT extends Intents
    /* "SaveContact" */ @js.native
    object SAVE_CONTACT extends TopLevel[SAVE_CONTACT with String]
    
    @js.native
    sealed trait SAVE_INSTRUMENT extends Intents
    /* "SaveInstrument" */ @js.native
    object SAVE_INSTRUMENT extends TopLevel[SAVE_INSTRUMENT with String]
    
    @js.native
    sealed trait SHARE_CONTEXT extends Intents
    /* "ShareContext" */ @js.native
    object SHARE_CONTEXT extends TopLevel[SHARE_CONTEXT with String]
    
    @js.native
    sealed trait START_CALL extends Intents
    /* "StartCall" */ @js.native
    object START_CALL extends TopLevel[START_CALL with String]
    
    @js.native
    sealed trait START_CHAT extends Intents
    /* "StartChat" */ @js.native
    object START_CHAT extends TopLevel[START_CHAT with String]
    
    @js.native
    sealed trait VIEW_CHART extends Intents
    /* "ViewChart" */ @js.native
    object VIEW_CHART extends TopLevel[VIEW_CHART with String]
    
    @js.native
    sealed trait VIEW_CONTACT extends Intents
    /* "ViewContact" */ @js.native
    object VIEW_CONTACT extends TopLevel[VIEW_CONTACT with String]
    
    @js.native
    sealed trait VIEW_NEWS extends Intents
    /* "ViewNews" */ @js.native
    object VIEW_NEWS extends TopLevel[VIEW_NEWS with String]
    
    @js.native
    sealed trait VIEW_QUOTE extends Intents
    /* "ViewQuote" */ @js.native
    object VIEW_QUOTE extends TopLevel[VIEW_QUOTE with String]
  }
}
