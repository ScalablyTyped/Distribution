package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intentsMod {
  
  @js.native
  sealed trait Intents extends StObject
  @JSImport("openfin/_v2/fdc3/intents", "Intents")
  @js.native
  object Intents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Intents & String] = js.native
    
    @js.native
    sealed trait DIAL_CALL
      extends StObject
         with Intents
    /* "DialCall" */ val DIAL_CALL: typings.openfin.intentsMod.Intents.DIAL_CALL & String = js.native
    
    @js.native
    sealed trait SAVE_CONTACT
      extends StObject
         with Intents
    /* "SaveContact" */ val SAVE_CONTACT: typings.openfin.intentsMod.Intents.SAVE_CONTACT & String = js.native
    
    @js.native
    sealed trait SAVE_INSTRUMENT
      extends StObject
         with Intents
    /* "SaveInstrument" */ val SAVE_INSTRUMENT: typings.openfin.intentsMod.Intents.SAVE_INSTRUMENT & String = js.native
    
    @js.native
    sealed trait SHARE_CONTEXT
      extends StObject
         with Intents
    /* "ShareContext" */ val SHARE_CONTEXT: typings.openfin.intentsMod.Intents.SHARE_CONTEXT & String = js.native
    
    @js.native
    sealed trait START_CALL
      extends StObject
         with Intents
    /* "StartCall" */ val START_CALL: typings.openfin.intentsMod.Intents.START_CALL & String = js.native
    
    @js.native
    sealed trait START_CHAT
      extends StObject
         with Intents
    /* "StartChat" */ val START_CHAT: typings.openfin.intentsMod.Intents.START_CHAT & String = js.native
    
    @js.native
    sealed trait VIEW_CHART
      extends StObject
         with Intents
    /* "ViewChart" */ val VIEW_CHART: typings.openfin.intentsMod.Intents.VIEW_CHART & String = js.native
    
    @js.native
    sealed trait VIEW_CONTACT
      extends StObject
         with Intents
    /* "ViewContact" */ val VIEW_CONTACT: typings.openfin.intentsMod.Intents.VIEW_CONTACT & String = js.native
    
    @js.native
    sealed trait VIEW_NEWS
      extends StObject
         with Intents
    /* "ViewNews" */ val VIEW_NEWS: typings.openfin.intentsMod.Intents.VIEW_NEWS & String = js.native
    
    @js.native
    sealed trait VIEW_QUOTE
      extends StObject
         with Intents
    /* "ViewQuote" */ val VIEW_QUOTE: typings.openfin.intentsMod.Intents.VIEW_QUOTE & String = js.native
  }
}
