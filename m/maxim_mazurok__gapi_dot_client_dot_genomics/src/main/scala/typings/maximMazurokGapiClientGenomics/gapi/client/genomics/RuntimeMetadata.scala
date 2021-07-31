package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeMetadata extends StObject {
  
  /** Execution information specific to Google Compute Engine. */
  var computeEngine: js.UndefOr[ComputeEngine] = js.undefined
}
object RuntimeMetadata {
  
  @scala.inline
  def apply(): RuntimeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeMetadata]
  }
  
  @scala.inline
  implicit class RuntimeMetadataMutableBuilder[Self <: RuntimeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeEngine(value: ComputeEngine): Self = StObject.set(x, "computeEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeEngineUndefined: Self = StObject.set(x, "computeEngine", js.undefined)
  }
}
