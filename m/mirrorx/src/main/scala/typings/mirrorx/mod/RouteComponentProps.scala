package typings.mirrorx.mod

import org.scalablytyped.runtime.TopLevel
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.reactRouter.mod.`match`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteComponentProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.mirrorx.mirrorxStrings.RouteComponentProps & TopLevel[js.Any] */] extends StObject {
  
  var history: History[LocationState]
  
  var location: Location[LocationState]
  
  var `match`: typings.reactRouter.mod.`match`[Params]
  
  var staticContext: js.UndefOr[js.Any] = js.undefined
}
object RouteComponentProps {
  
  inline def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.mirrorx.mirrorxStrings.RouteComponentProps & TopLevel[js.Any] */](history: History[LocationState], location: Location[LocationState], `match`: `match`[Params]): RouteComponentProps[Params] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteComponentProps[Params]]
  }
  
  extension [Self <: RouteComponentProps[?], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.mirrorx.mirrorxStrings.RouteComponentProps & TopLevel[js.Any] */](x: Self & RouteComponentProps[Params]) {
    
    inline def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: `match`[Params]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setStaticContext(value: js.Any): Self = StObject.set(x, "staticContext", value.asInstanceOf[js.Any])
    
    inline def setStaticContextUndefined: Self = StObject.set(x, "staticContext", js.undefined)
  }
}
