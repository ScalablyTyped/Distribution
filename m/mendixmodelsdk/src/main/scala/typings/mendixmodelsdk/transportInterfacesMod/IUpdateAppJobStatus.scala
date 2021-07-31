package typings.mendixmodelsdk.transportInterfacesMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.failed_
import typings.mendixmodelsdk.mendixmodelsdkStrings.started_
import typings.mendixmodelsdk.mendixmodelsdkStrings.updating_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mendixmodelsdk.mendixmodelsdkStrings.updating_
  - typings.mendixmodelsdk.mendixmodelsdkStrings.resuming
  - typings.mendixmodelsdk.mendixmodelsdkStrings.provisioning
  - typings.mendixmodelsdk.mendixmodelsdkStrings.started_
  - typings.mendixmodelsdk.mendixmodelsdkStrings.consistencyerrors
  - typings.mendixmodelsdk.mendixmodelsdkStrings.failed_
*/
trait IUpdateAppJobStatus extends StObject
object IUpdateAppJobStatus {
  
  @scala.inline
  def consistencyerrors: typings.mendixmodelsdk.mendixmodelsdkStrings.consistencyerrors = "consistencyerrors".asInstanceOf[typings.mendixmodelsdk.mendixmodelsdkStrings.consistencyerrors]
  
  @scala.inline
  def failed: failed_ = "failed".asInstanceOf[failed_]
  
  @scala.inline
  def provisioning: typings.mendixmodelsdk.mendixmodelsdkStrings.provisioning = "provisioning".asInstanceOf[typings.mendixmodelsdk.mendixmodelsdkStrings.provisioning]
  
  @scala.inline
  def resuming: typings.mendixmodelsdk.mendixmodelsdkStrings.resuming = "resuming".asInstanceOf[typings.mendixmodelsdk.mendixmodelsdkStrings.resuming]
  
  @scala.inline
  def started: started_ = "started".asInstanceOf[started_]
  
  @scala.inline
  def updating: updating_ = "updating".asInstanceOf[updating_]
}
