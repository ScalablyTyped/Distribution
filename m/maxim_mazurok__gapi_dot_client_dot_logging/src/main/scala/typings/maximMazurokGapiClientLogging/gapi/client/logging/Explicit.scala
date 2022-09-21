package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explicit extends StObject {
  
  /** The values must be monotonically increasing. */
  var bounds: js.UndefOr[js.Array[Double]] = js.undefined
}
object Explicit {
  
  inline def apply(): Explicit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Explicit]
  }
  
  extension [Self <: Explicit](x: Self) {
    
    inline def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value*))
  }
}
