package typings.mirrorx.mod

import org.scalablytyped.runtime.TopLevel
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.reactRouter.mod.`match`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteComponentProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.mirrorx.mirrorxStrings.RouteComponentProps with TopLevel[js.Any] */] extends StObject {
  
  var history: History[LocationState] = js.native
  
  var location: Location[LocationState] = js.native
  
  var `match`: typings.reactRouter.mod.`match`[Params] = js.native
  
  var staticContext: js.UndefOr[js.Any] = js.native
}
object RouteComponentProps {
  
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.mirrorx.mirrorxStrings.RouteComponentProps with TopLevel[js.Any] */](history: History[LocationState], location: Location[LocationState], `match`: `match`[Params]): RouteComponentProps[Params] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteComponentProps[Params]]
  }
  
  @scala.inline
  implicit class RouteComponentPropsMutableBuilder[Self <: RouteComponentProps[_], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.mirrorx.mirrorxStrings.RouteComponentProps with TopLevel[js.Any] */] (val x: Self with RouteComponentProps[Params]) extends AnyVal {
    
    @scala.inline
    def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: `match`[Params]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticContext(value: js.Any): Self = StObject.set(x, "staticContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticContextUndefined: Self = StObject.set(x, "staticContext", js.undefined)
  }
}
