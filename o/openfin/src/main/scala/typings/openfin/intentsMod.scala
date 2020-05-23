package typings.openfin

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/fdc3/intents", JSImport.Namespace)
@js.native
object intentsMod extends js.Object {
  @js.native
  sealed trait Intents extends js.Object
  
  @js.native
  object Intents extends js.Object {
    @js.native
    sealed trait DIAL_CALL extends Intents
    
    @js.native
    sealed trait SAVE_CONTACT extends Intents
    
    @js.native
    sealed trait SAVE_INSTRUMENT extends Intents
    
    @js.native
    sealed trait SHARE_CONTEXT extends Intents
    
    @js.native
    sealed trait START_CALL extends Intents
    
    @js.native
    sealed trait START_CHAT extends Intents
    
    @js.native
    sealed trait VIEW_CHART extends Intents
    
    @js.native
    sealed trait VIEW_CONTACT extends Intents
    
    @js.native
    sealed trait VIEW_NEWS extends Intents
    
    @js.native
    sealed trait VIEW_QUOTE extends Intents
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Intents with String] = js.native
    /* "DialCall" */ @js.native
    object DIAL_CALL extends TopLevel[DIAL_CALL with String]
    
    /* "SaveContact" */ @js.native
    object SAVE_CONTACT extends TopLevel[SAVE_CONTACT with String]
    
    /* "SaveInstrument" */ @js.native
    object SAVE_INSTRUMENT extends TopLevel[SAVE_INSTRUMENT with String]
    
    /* "ShareContext" */ @js.native
    object SHARE_CONTEXT extends TopLevel[SHARE_CONTEXT with String]
    
    /* "StartCall" */ @js.native
    object START_CALL extends TopLevel[START_CALL with String]
    
    /* "StartChat" */ @js.native
    object START_CHAT extends TopLevel[START_CHAT with String]
    
    /* "ViewChart" */ @js.native
    object VIEW_CHART extends TopLevel[VIEW_CHART with String]
    
    /* "ViewContact" */ @js.native
    object VIEW_CONTACT extends TopLevel[VIEW_CONTACT with String]
    
    /* "ViewNews" */ @js.native
    object VIEW_NEWS extends TopLevel[VIEW_NEWS with String]
    
    /* "ViewQuote" */ @js.native
    object VIEW_QUOTE extends TopLevel[VIEW_QUOTE with String]
    
  }
  
}

