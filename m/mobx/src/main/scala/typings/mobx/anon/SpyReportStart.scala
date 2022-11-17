package typings.mobx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpyReportStart extends StObject {
  
  var spyReportStart: js.UndefOr[true] = js.undefined
}
object SpyReportStart {
  
  inline def apply(): SpyReportStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpyReportStart]
  }
  
  extension [Self <: SpyReportStart](x: Self) {
    
    inline def setSpyReportStart(value: true): Self = StObject.set(x, "spyReportStart", value.asInstanceOf[js.Any])
    
    inline def setSpyReportStartUndefined: Self = StObject.set(x, "spyReportStart", js.undefined)
  }
}
