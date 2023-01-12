package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadPreferenceOptions extends StObject {
  
  /** Server mode in which the same query is dispatched in parallel to multiple replica set members. */
  var hedge: js.UndefOr[HedgeOptions] = js.undefined
  
  /** Max secondary read staleness in seconds, Minimum value is 90 seconds.*/
  var maxStalenessSeconds: js.UndefOr[scala.Double] = js.undefined
}
object ReadPreferenceOptions {
  
  inline def apply(): ReadPreferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadPreferenceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadPreferenceOptions] (val x: Self) extends AnyVal {
    
    inline def setHedge(value: HedgeOptions): Self = StObject.set(x, "hedge", value.asInstanceOf[js.Any])
    
    inline def setHedgeUndefined: Self = StObject.set(x, "hedge", js.undefined)
    
    inline def setMaxStalenessSeconds(value: scala.Double): Self = StObject.set(x, "maxStalenessSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxStalenessSecondsUndefined: Self = StObject.set(x, "maxStalenessSeconds", js.undefined)
  }
}
