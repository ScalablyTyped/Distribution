package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeRange extends StObject {
  
  // The maximum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.
  var maximumSize: js.UndefOr[NullableOption[Double]] = js.native
  
  // The minimum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.
  var minimumSize: js.UndefOr[NullableOption[Double]] = js.native
}
object SizeRange {
  
  @scala.inline
  def apply(): SizeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeRange]
  }
  
  @scala.inline
  implicit class SizeRangeMutableBuilder[Self <: SizeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumSize(value: NullableOption[Double]): Self = StObject.set(x, "maximumSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumSizeNull: Self = StObject.set(x, "maximumSize", null)
    
    @scala.inline
    def setMaximumSizeUndefined: Self = StObject.set(x, "maximumSize", js.undefined)
    
    @scala.inline
    def setMinimumSize(value: NullableOption[Double]): Self = StObject.set(x, "minimumSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSizeNull: Self = StObject.set(x, "minimumSize", null)
    
    @scala.inline
    def setMinimumSizeUndefined: Self = StObject.set(x, "minimumSize", js.undefined)
  }
}
