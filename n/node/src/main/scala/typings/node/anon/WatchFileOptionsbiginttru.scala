package typings.node.anon

import typings.node.nodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.WatchFileOptions & {  bigint :true} */
trait WatchFileOptionsbiginttru extends StObject {
  
  var bigint: js.UndefOr[Boolean] & `true`
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var persistent: js.UndefOr[Boolean] = js.undefined
}
object WatchFileOptionsbiginttru {
  
  inline def apply(bigint: js.UndefOr[Boolean] & `true`): WatchFileOptionsbiginttru = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchFileOptionsbiginttru]
  }
  
  extension [Self <: WatchFileOptionsbiginttru](x: Self) {
    
    inline def setBigint(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
  }
}
