package typings.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadcastOptions extends StObject {
  
  var layout: BroadcastLayoutOptions = js.native
  
  var maxDuration: js.UndefOr[Double] = js.native
  
  var outputs: BroadcastOutputOptions = js.native
  
  var resolution: js.UndefOr[String] = js.native
}
object BroadcastOptions {
  
  @scala.inline
  def apply(layout: BroadcastLayoutOptions, outputs: BroadcastOutputOptions): BroadcastOptions = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastOptions]
  }
  
  @scala.inline
  implicit class BroadcastOptionsMutableBuilder[Self <: BroadcastOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: BroadcastLayoutOptions): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    @scala.inline
    def setOutputs(value: BroadcastOutputOptions): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
  }
}
