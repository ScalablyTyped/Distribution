package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `543` extends StObject {
  
  /** A repository ID. Only return repositories with an ID greater than this ID. */
  var since: js.UndefOr[Double] = js.undefined
}
object `543` {
  
  inline def apply(): `543` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`543`]
  }
  
  extension [Self <: `543`](x: Self) {
    
    inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}
