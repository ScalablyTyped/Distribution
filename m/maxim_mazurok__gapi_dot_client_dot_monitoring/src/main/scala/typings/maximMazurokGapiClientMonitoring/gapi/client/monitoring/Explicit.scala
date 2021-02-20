package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Explicit extends StObject {
  
  /** The values must be monotonically increasing. */
  var bounds: js.UndefOr[js.Array[Double]] = js.native
}
object Explicit {
  
  @scala.inline
  def apply(): Explicit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Explicit]
  }
  
  @scala.inline
  implicit class ExplicitMutableBuilder[Self <: Explicit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value :_*))
  }
}
