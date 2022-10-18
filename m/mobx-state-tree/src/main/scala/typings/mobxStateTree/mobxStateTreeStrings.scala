package typings.mobxStateTree

import typings.mobxStateTree.distCoreActionMod.IMiddlewareEventType
import typings.mobxStateTree.distCoreNodeLivelinessCheckingMod.LivelinessMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobxStateTreeStrings {
  
  @js.native
  sealed trait Map extends StObject
  inline def Map: Map = "Map".asInstanceOf[Map]
  
  @js.native
  sealed trait action
    extends StObject
       with IMiddlewareEventType
  inline def action: action = "action".asInstanceOf[action]
  
  @js.native
  sealed trait add extends StObject
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait destroy extends StObject
  inline def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @js.native
  sealed trait detach extends StObject
  inline def detach: detach = "detach".asInstanceOf[detach]
  
  @js.native
  sealed trait error
    extends StObject
       with LivelinessMode
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait flow_resume
    extends StObject
       with IMiddlewareEventType
  inline def flow_resume: flow_resume = "flow_resume".asInstanceOf[flow_resume]
  
  @js.native
  sealed trait flow_resume_error
    extends StObject
       with IMiddlewareEventType
  inline def flow_resume_error: flow_resume_error = "flow_resume_error".asInstanceOf[flow_resume_error]
  
  @js.native
  sealed trait flow_return
    extends StObject
       with IMiddlewareEventType
  inline def flow_return: flow_return = "flow_return".asInstanceOf[flow_return]
  
  @js.native
  sealed trait flow_spawn
    extends StObject
       with IMiddlewareEventType
  inline def flow_spawn: flow_spawn = "flow_spawn".asInstanceOf[flow_spawn]
  
  @js.native
  sealed trait flow_throw
    extends StObject
       with IMiddlewareEventType
  inline def flow_throw: flow_throw = "flow_throw".asInstanceOf[flow_throw]
  
  @js.native
  sealed trait ignore
    extends StObject
       with LivelinessMode
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait invalidSnapshotReference extends StObject
  inline def invalidSnapshotReference: invalidSnapshotReference = "invalidSnapshotReference".asInstanceOf[invalidSnapshotReference]
  
  @js.native
  sealed trait remove extends StObject
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait replace extends StObject
  inline def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait warn
    extends StObject
       with LivelinessMode
  inline def warn: warn = "warn".asInstanceOf[warn]
}
