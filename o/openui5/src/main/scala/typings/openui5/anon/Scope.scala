package typings.openui5.anon

import typings.openui5.sapMLibraryMod.GenericTileScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scope extends StObject {
  
  /**
    * The action that was pressed on the tile. In the Actions scope, the available actions are Press and Remove.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * The Element's DOM Element. In Actions scope the domRef points to the DOM Element of the remove button
    * (if pressed) or the more icon.
    */
  var domRef: js.UndefOr[Any] = js.undefined
  
  /**
    * The current scope the SlideTile was in when the event occurred.
    */
  var scope: js.UndefOr[
    GenericTileScope | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTileScope * / any */ String)
  ] = js.undefined
}
object Scope {
  
  inline def apply(): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDomRef(value: Any): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
    
    inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
    
    inline def setScope(
      value: GenericTileScope | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTileScope * / any */ String)
    ): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
