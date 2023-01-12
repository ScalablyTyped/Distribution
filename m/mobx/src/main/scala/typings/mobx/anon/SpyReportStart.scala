package typings.mobx.anon

import typings.mobx.mobxBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpyReportStart extends StObject {
  
  var spyReportStart: js.UndefOr[`true`] = js.undefined
}
object SpyReportStart {
  
  inline def apply(): SpyReportStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpyReportStart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpyReportStart] (val x: Self) extends AnyVal {
    
    inline def setSpyReportStart(value: `true`): Self = StObject.set(x, "spyReportStart", value.asInstanceOf[js.Any])
    
    inline def setSpyReportStartUndefined: Self = StObject.set(x, "spyReportStart", js.undefined)
  }
}
