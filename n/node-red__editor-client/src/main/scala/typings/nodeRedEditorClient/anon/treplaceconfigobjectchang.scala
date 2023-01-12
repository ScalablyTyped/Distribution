package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.HistoryEvent
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  t :'replace',   config :object,   changed :object,   rev :string} & {  dirty :boolean | undefined,   callback :(ev : @node-red/editor-client.@node-red/editor-client.HistoryEvent): void | undefined} */
trait treplaceconfigobjectchang
  extends StObject
     with HistoryEvent {
  
  var callback: js.UndefOr[js.Function1[/* ev */ HistoryEvent, Unit]] = js.undefined
  
  var changed: js.Object
  
  var config: js.Object
  
  var dirty: js.UndefOr[Boolean] = js.undefined
  
  var rev: String
  
  var t: replace
}
object treplaceconfigobjectchang {
  
  inline def apply(changed: js.Object, config: js.Object, rev: String): treplaceconfigobjectchang = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], t = "replace")
    __obj.asInstanceOf[treplaceconfigobjectchang]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: treplaceconfigobjectchang] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: /* ev */ HistoryEvent => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setChanged(value: js.Object): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    inline def setT(value: replace): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
