package typings.mongodb.anon

import typings.mongodb.mod.ReadPreferenceOrMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxTimeMS extends StObject {
  
  var maxTimeMS: js.UndefOr[Double] = js.native
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
}
object MaxTimeMS {
  
  @scala.inline
  def apply(): MaxTimeMS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxTimeMS]
  }
  
  @scala.inline
  implicit class MaxTimeMSMutableBuilder[Self <: MaxTimeMS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxTimeMS(value: Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
