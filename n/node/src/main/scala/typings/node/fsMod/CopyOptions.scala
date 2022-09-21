package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyOptions
  extends StObject
     with CopyOptionsBase {
  
  /**
    * Function to filter copied files/directories. Return
    * `true` to copy the item, `false` to ignore it.
    */
  var filter: js.UndefOr[
    js.Function2[/* source */ String, /* destination */ String, Boolean | js.Promise[Boolean]]
  ] = js.undefined
}
object CopyOptions {
  
  inline def apply(): CopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptions]
  }
  
  extension [Self <: CopyOptions](x: Self) {
    
    inline def setFilter(value: (/* source */ String, /* destination */ String) => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
