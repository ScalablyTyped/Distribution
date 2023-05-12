package typings.openui5.anon

import typings.openui5.sapMLibraryMod.ObjectMarkerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  /**
    * Type of the `ObjectMarker`.
    */
  var `type`: js.UndefOr[
    ObjectMarkerType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectMarkerType * / any */ String)
  ] = js.undefined
}
object `22` {
  
  inline def apply(): `22` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`22`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `22`] (val x: Self) extends AnyVal {
    
    inline def setType(
      value: ObjectMarkerType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectMarkerType * / any */ String)
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
