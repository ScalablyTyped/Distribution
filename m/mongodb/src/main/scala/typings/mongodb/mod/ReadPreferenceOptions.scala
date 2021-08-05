package typings.mongodb.mod

import typings.mongodb.anon.Enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadPreferenceOptions extends StObject {
  
  var hedge: js.UndefOr[Enabled] = js.undefined
  
  /**
    * Max Secondary Read Staleness in Seconds
    */
  var maxStalenessSeconds: js.UndefOr[scala.Double] = js.undefined
}
object ReadPreferenceOptions {
  
  inline def apply(): ReadPreferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadPreferenceOptions]
  }
  
  extension [Self <: ReadPreferenceOptions](x: Self) {
    
    inline def setHedge(value: Enabled): Self = StObject.set(x, "hedge", value.asInstanceOf[js.Any])
    
    inline def setHedgeUndefined: Self = StObject.set(x, "hedge", js.undefined)
    
    inline def setMaxStalenessSeconds(value: scala.Double): Self = StObject.set(x, "maxStalenessSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxStalenessSecondsUndefined: Self = StObject.set(x, "maxStalenessSeconds", js.undefined)
  }
}
