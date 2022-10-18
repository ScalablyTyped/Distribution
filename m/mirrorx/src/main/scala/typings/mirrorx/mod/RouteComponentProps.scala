package typings.mirrorx.mod

import typings.history.mod.History
import typings.history.mod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteComponentProps[Params /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Params ]:? string} */ js.Any */] extends StObject {
  
  var history: History
  
  var location: Location
  
  var `match`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify match<Params> */ Any
  
  var staticContext: js.UndefOr[Any] = js.undefined
}
object RouteComponentProps {
  
  inline def apply[Params /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Params ]:? string} */ js.Any */](
    history: History,
    location: Location,
    `match`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify match<Params> */ Any
  ): RouteComponentProps[Params] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteComponentProps[Params]]
  }
  
  extension [Self <: RouteComponentProps[?], Params /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Params ]:? string} */ js.Any */](x: Self & RouteComponentProps[Params]) {
    
    inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMatch(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify match<Params> */ Any
    ): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setStaticContext(value: Any): Self = StObject.set(x, "staticContext", value.asInstanceOf[js.Any])
    
    inline def setStaticContextUndefined: Self = StObject.set(x, "staticContext", js.undefined)
  }
}
