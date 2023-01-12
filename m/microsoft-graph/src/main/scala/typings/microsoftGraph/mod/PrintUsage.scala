package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintUsage
  extends StObject
     with Entity {
  
  var completedBlackAndWhiteJobCount: js.UndefOr[Double] = js.undefined
  
  var completedColorJobCount: js.UndefOr[Double] = js.undefined
  
  var incompleteJobCount: js.UndefOr[Double] = js.undefined
  
  var usageDate: js.UndefOr[String] = js.undefined
}
object PrintUsage {
  
  inline def apply(): PrintUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintUsage] (val x: Self) extends AnyVal {
    
    inline def setCompletedBlackAndWhiteJobCount(value: Double): Self = StObject.set(x, "completedBlackAndWhiteJobCount", value.asInstanceOf[js.Any])
    
    inline def setCompletedBlackAndWhiteJobCountUndefined: Self = StObject.set(x, "completedBlackAndWhiteJobCount", js.undefined)
    
    inline def setCompletedColorJobCount(value: Double): Self = StObject.set(x, "completedColorJobCount", value.asInstanceOf[js.Any])
    
    inline def setCompletedColorJobCountUndefined: Self = StObject.set(x, "completedColorJobCount", js.undefined)
    
    inline def setIncompleteJobCount(value: Double): Self = StObject.set(x, "incompleteJobCount", value.asInstanceOf[js.Any])
    
    inline def setIncompleteJobCountUndefined: Self = StObject.set(x, "incompleteJobCount", js.undefined)
    
    inline def setUsageDate(value: String): Self = StObject.set(x, "usageDate", value.asInstanceOf[js.Any])
    
    inline def setUsageDateUndefined: Self = StObject.set(x, "usageDate", js.undefined)
  }
}
