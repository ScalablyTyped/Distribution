package typings.mongodb.mod

import typings.mongodb.anon.Enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadPreferenceOptions extends StObject {
  
  var hedge: js.UndefOr[Enabled] = js.native
  
  /**
    * Max Secondary Read Staleness in Seconds
    */
  var maxStalenessSeconds: js.UndefOr[scala.Double] = js.native
}
object ReadPreferenceOptions {
  
  @scala.inline
  def apply(): ReadPreferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadPreferenceOptions]
  }
  
  @scala.inline
  implicit class ReadPreferenceOptionsMutableBuilder[Self <: ReadPreferenceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHedge(value: Enabled): Self = StObject.set(x, "hedge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHedgeUndefined: Self = StObject.set(x, "hedge", js.undefined)
    
    @scala.inline
    def setMaxStalenessSeconds(value: scala.Double): Self = StObject.set(x, "maxStalenessSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxStalenessSecondsUndefined: Self = StObject.set(x, "maxStalenessSeconds", js.undefined)
  }
}
