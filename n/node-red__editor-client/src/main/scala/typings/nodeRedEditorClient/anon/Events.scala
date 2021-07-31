package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.multi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  var events: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @node-red/editor-client.@node-red/editor-client.HistoryEvent */ js.Object
  ]
  
  var t: multi
}
object Events {
  
  @scala.inline
  def apply(
    events: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @node-red/editor-client.@node-red/editor-client.HistoryEvent */ js.Object
    ]
  ): Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], t = "multi")
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @node-red/editor-client.@node-red/editor-client.HistoryEvent */ js.Object
        ]
    ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @node-red/editor-client.@node-red/editor-client.HistoryEvent */ js.Object)*
    ): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setT(value: multi): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
