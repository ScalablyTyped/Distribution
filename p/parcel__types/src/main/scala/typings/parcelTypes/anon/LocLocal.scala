package typings.parcelTypes.anon

import typings.parcelTypes.mod.SourceLocation
import typings.parcelTypes.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocLocal extends StObject {
  
  var loc: js.UndefOr[SourceLocation | Null] = js.undefined
  
  var local: Symbol
}
object LocLocal {
  
  inline def apply(local: Symbol): LocLocal = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocLocal]
  }
  
  extension [Self <: LocLocal](x: Self) {
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setLocal(value: Symbol): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
  }
}
