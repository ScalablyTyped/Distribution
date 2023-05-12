package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeHistorySuspensionOptions
  extends StObject
     with HistorySuspension {
  
  /**
    * The desired name of the resulting history state when successfully resumed and committed.
    * @minVersion 23.0
    */
  var finalName: js.UndefOr[String] = js.undefined
}
object ResumeHistorySuspensionOptions {
  
  inline def apply(historySuspensionID: Double): ResumeHistorySuspensionOptions = {
    val __obj = js.Dynamic.literal(historySuspensionID = historySuspensionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeHistorySuspensionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResumeHistorySuspensionOptions] (val x: Self) extends AnyVal {
    
    inline def setFinalName(value: String): Self = StObject.set(x, "finalName", value.asInstanceOf[js.Any])
    
    inline def setFinalNameUndefined: Self = StObject.set(x, "finalName", js.undefined)
  }
}
