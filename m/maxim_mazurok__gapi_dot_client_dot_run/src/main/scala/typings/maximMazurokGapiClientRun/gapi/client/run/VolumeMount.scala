package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeMount extends StObject {
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported Path within the container at which the volume should be mounted. Must not contain ':'. */
  var mountPath: js.UndefOr[String] = js.undefined
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported This must match the Name of a Volume. */
  var name: js.UndefOr[String] = js.undefined
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Only true is accepted. Defaults to true. */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Path within the volume from which the container's volume should be mounted. Defaults to ""
    * (volume's root).
    */
  var subPath: js.UndefOr[String] = js.undefined
}
object VolumeMount {
  
  @scala.inline
  def apply(): VolumeMount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeMount]
  }
  
  @scala.inline
  implicit class VolumeMountMutableBuilder[Self <: VolumeMount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMountPath(value: String): Self = StObject.set(x, "mountPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountPathUndefined: Self = StObject.set(x, "mountPath", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setSubPath(value: String): Self = StObject.set(x, "subPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubPathUndefined: Self = StObject.set(x, "subPath", js.undefined)
  }
}
