package typings.mobxStateTree

import typings.mobxStateTree.actionMod.IMiddlewareEventType
import typings.mobxStateTree.livelinessCheckingMod.LivelinessMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobxStateTreeStrings {
  
  @scala.inline
  def ExtractCFromProps: ExtractCFromProps = "ExtractCFromProps".asInstanceOf[ExtractCFromProps]
  
  @scala.inline
  def Map: Map = "Map".asInstanceOf[Map]
  
  @scala.inline
  def ModelCreationType: ModelCreationType = "ModelCreationType".asInstanceOf[ModelCreationType]
  
  @scala.inline
  def ModelInstanceTypeProps: ModelInstanceTypeProps = "ModelInstanceTypeProps".asInstanceOf[ModelInstanceTypeProps]
  
  @scala.inline
  def ModelPropertiesDeclarationToProperties: ModelPropertiesDeclarationToProperties = "ModelPropertiesDeclarationToProperties".asInstanceOf[ModelPropertiesDeclarationToProperties]
  
  @scala.inline
  def ModelSnapshotType: ModelSnapshotType = "ModelSnapshotType".asInstanceOf[ModelSnapshotType]
  
  @scala.inline
  def action: action = "action".asInstanceOf[action]
  
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @scala.inline
  def detach: detach = "detach".asInstanceOf[detach]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def flow_resume: flow_resume = "flow_resume".asInstanceOf[flow_resume]
  
  @scala.inline
  def flow_resume_error: flow_resume_error = "flow_resume_error".asInstanceOf[flow_resume_error]
  
  @scala.inline
  def flow_return: flow_return = "flow_return".asInstanceOf[flow_return]
  
  @scala.inline
  def flow_spawn: flow_spawn = "flow_spawn".asInstanceOf[flow_spawn]
  
  @scala.inline
  def flow_throw: flow_throw = "flow_throw".asInstanceOf[flow_throw]
  
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @scala.inline
  def invalidSnapshotReference: invalidSnapshotReference = "invalidSnapshotReference".asInstanceOf[invalidSnapshotReference]
  
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait ExtractCFromProps extends js.Object
  
  @js.native
  sealed trait Map extends js.Object
  
  @js.native
  sealed trait ModelCreationType extends js.Object
  
  @js.native
  sealed trait ModelInstanceTypeProps extends js.Object
  
  @js.native
  sealed trait ModelPropertiesDeclarationToProperties extends js.Object
  
  @js.native
  sealed trait ModelSnapshotType extends js.Object
  
  @js.native
  sealed trait action extends IMiddlewareEventType
  
  @js.native
  sealed trait add extends js.Object
  
  @js.native
  sealed trait destroy extends js.Object
  
  @js.native
  sealed trait detach extends js.Object
  
  @js.native
  sealed trait error extends LivelinessMode
  
  @js.native
  sealed trait flow_resume extends IMiddlewareEventType
  
  @js.native
  sealed trait flow_resume_error extends IMiddlewareEventType
  
  @js.native
  sealed trait flow_return extends IMiddlewareEventType
  
  @js.native
  sealed trait flow_spawn extends IMiddlewareEventType
  
  @js.native
  sealed trait flow_throw extends IMiddlewareEventType
  
  @js.native
  sealed trait ignore extends LivelinessMode
  
  @js.native
  sealed trait invalidSnapshotReference extends js.Object
  
  @js.native
  sealed trait remove extends js.Object
  
  @js.native
  sealed trait replace extends js.Object
  
  @js.native
  sealed trait warn extends LivelinessMode
}
