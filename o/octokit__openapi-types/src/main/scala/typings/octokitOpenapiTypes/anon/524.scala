package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `524` extends StObject {
  
  /** A repository ID. Only return repositories with an ID greater than this ID. */
  var since: js.UndefOr[Double] = js.undefined
}
object `524` {
  
  inline def apply(): `524` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`524`]
  }
  
  extension [Self <: `524`](x: Self) {
    
    inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}
