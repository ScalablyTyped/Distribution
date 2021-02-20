package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumericTargetingDimension extends StObject {
  
  /** The IDs excluded in a configuration. */
  var excludedIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The IDs included in a configuration. */
  var includedIds: js.UndefOr[js.Array[String]] = js.native
}
object NumericTargetingDimension {
  
  @scala.inline
  def apply(): NumericTargetingDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericTargetingDimension]
  }
  
  @scala.inline
  implicit class NumericTargetingDimensionMutableBuilder[Self <: NumericTargetingDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedIds(value: js.Array[String]): Self = StObject.set(x, "excludedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedIdsUndefined: Self = StObject.set(x, "excludedIds", js.undefined)
    
    @scala.inline
    def setExcludedIdsVarargs(value: String*): Self = StObject.set(x, "excludedIds", js.Array(value :_*))
    
    @scala.inline
    def setIncludedIds(value: js.Array[String]): Self = StObject.set(x, "includedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedIdsUndefined: Self = StObject.set(x, "includedIds", js.undefined)
    
    @scala.inline
    def setIncludedIdsVarargs(value: String*): Self = StObject.set(x, "includedIds", js.Array(value :_*))
  }
}
