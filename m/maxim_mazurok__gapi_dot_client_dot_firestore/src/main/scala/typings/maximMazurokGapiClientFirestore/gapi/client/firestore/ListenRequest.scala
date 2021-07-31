package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenRequest extends StObject {
  
  /** A target to add to this stream. */
  var addTarget: js.UndefOr[Target] = js.undefined
  
  /** Labels associated with this target change. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.ListenRequest & TopLevel[js.Any]
  ] = js.undefined
  
  /** The ID of a target to remove from this stream. */
  var removeTarget: js.UndefOr[Double] = js.undefined
}
object ListenRequest {
  
  @scala.inline
  def apply(): ListenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenRequest]
  }
  
  @scala.inline
  implicit class ListenRequestMutableBuilder[Self <: ListenRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTarget(value: Target): Self = StObject.set(x, "addTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddTargetUndefined: Self = StObject.set(x, "addTarget", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.ListenRequest & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setRemoveTarget(value: Double): Self = StObject.set(x, "removeTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveTargetUndefined: Self = StObject.set(x, "removeTarget", js.undefined)
  }
}
