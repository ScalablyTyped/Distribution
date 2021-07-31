package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizeRestoredDatabaseMetadata extends StObject {
  
  /** Name of the restored database being optimized. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The progress of the post-restore optimizations. */
  var progress: js.UndefOr[OperationProgress] = js.undefined
}
object OptimizeRestoredDatabaseMetadata {
  
  @scala.inline
  def apply(): OptimizeRestoredDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizeRestoredDatabaseMetadata]
  }
  
  @scala.inline
  implicit class OptimizeRestoredDatabaseMetadataMutableBuilder[Self <: OptimizeRestoredDatabaseMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProgress(value: OperationProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
