package typings.mobx

import typings.mobx.distCoreDerivationMod.IDerivation
import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreActionMod {
  
  @JSImport("mobx/dist/core/action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allowStateChanges[T](allowStateChanges: Boolean, func: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("allowStateChanges")(allowStateChanges.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def allowStateChangesEnd(prev: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStateChangesEnd")(prev.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def allowStateChangesStart(allowStateChanges: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStateChangesStart")(allowStateChanges.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def createAction(actionName: String, fn: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  inline def createAction(actionName: String, fn: js.Function, autoAction: Boolean): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], autoAction.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  inline def createAction(actionName: String, fn: js.Function, autoAction: Boolean, ref: js.Object): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], autoAction.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  inline def createAction(actionName: String, fn: js.Function, autoAction: Unit, ref: js.Object): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], autoAction.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def endAction(runInfo: IActionRunInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endAction")(runInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def executeAction(actionName: String, canRunAsDerivation: Boolean, fn: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAction")(actionName.asInstanceOf[js.Any], canRunAsDerivation.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def executeAction(actionName: String, canRunAsDerivation: Boolean, fn: js.Function, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAction")(actionName.asInstanceOf[js.Any], canRunAsDerivation.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def executeAction(actionName: String, canRunAsDerivation: Boolean, fn: js.Function, scope: Any, args: IArguments): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAction")(actionName.asInstanceOf[js.Any], canRunAsDerivation.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def executeAction(actionName: String, canRunAsDerivation: Boolean, fn: js.Function, scope: Unit, args: IArguments): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAction")(actionName.asInstanceOf[js.Any], canRunAsDerivation.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def startAction(actionName: String, canRunAsDerivation: Boolean, // true for autoAction
  scope: Any): IActionRunInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("_startAction")(actionName.asInstanceOf[js.Any], canRunAsDerivation.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IActionRunInfo]
  inline def startAction(
    actionName: String,
    canRunAsDerivation: Boolean,
    // true for autoAction
  scope: Any,
    args: IArguments
  ): IActionRunInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("_startAction")(actionName.asInstanceOf[js.Any], canRunAsDerivation.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[IActionRunInfo]
  
  trait IActionRunInfo extends StObject {
    
    var actionId_ : Double
    
    var error_ : js.UndefOr[Any] = js.undefined
    
    var notifySpy_ : Boolean
    
    var parentActionId_ : Double
    
    var prevAllowStateChanges_ : Boolean
    
    var prevAllowStateReads_ : Boolean
    
    var prevDerivation_ : IDerivation | Null
    
    var runAsAction_ : js.UndefOr[Boolean] = js.undefined
    
    var startTime_ : Double
  }
  object IActionRunInfo {
    
    inline def apply(
      actionId_ : Double,
      notifySpy_ : Boolean,
      parentActionId_ : Double,
      prevAllowStateChanges_ : Boolean,
      prevAllowStateReads_ : Boolean,
      startTime_ : Double
    ): IActionRunInfo = {
      val __obj = js.Dynamic.literal(actionId_ = actionId_.asInstanceOf[js.Any], notifySpy_ = notifySpy_.asInstanceOf[js.Any], parentActionId_ = parentActionId_.asInstanceOf[js.Any], prevAllowStateChanges_ = prevAllowStateChanges_.asInstanceOf[js.Any], prevAllowStateReads_ = prevAllowStateReads_.asInstanceOf[js.Any], startTime_ = startTime_.asInstanceOf[js.Any], prevDerivation_ = null)
      __obj.asInstanceOf[IActionRunInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IActionRunInfo] (val x: Self) extends AnyVal {
      
      inline def setActionId_(value: Double): Self = StObject.set(x, "actionId_", value.asInstanceOf[js.Any])
      
      inline def setError_(value: Any): Self = StObject.set(x, "error_", value.asInstanceOf[js.Any])
      
      inline def setError_Undefined: Self = StObject.set(x, "error_", js.undefined)
      
      inline def setNotifySpy_(value: Boolean): Self = StObject.set(x, "notifySpy_", value.asInstanceOf[js.Any])
      
      inline def setParentActionId_(value: Double): Self = StObject.set(x, "parentActionId_", value.asInstanceOf[js.Any])
      
      inline def setPrevAllowStateChanges_(value: Boolean): Self = StObject.set(x, "prevAllowStateChanges_", value.asInstanceOf[js.Any])
      
      inline def setPrevAllowStateReads_(value: Boolean): Self = StObject.set(x, "prevAllowStateReads_", value.asInstanceOf[js.Any])
      
      inline def setPrevDerivation_(value: IDerivation): Self = StObject.set(x, "prevDerivation_", value.asInstanceOf[js.Any])
      
      inline def setPrevDerivation_Null: Self = StObject.set(x, "prevDerivation_", null)
      
      inline def setRunAsAction_(value: Boolean): Self = StObject.set(x, "runAsAction_", value.asInstanceOf[js.Any])
      
      inline def setRunAsAction_Undefined: Self = StObject.set(x, "runAsAction_", js.undefined)
      
      inline def setStartTime_(value: Double): Self = StObject.set(x, "startTime_", value.asInstanceOf[js.Any])
    }
  }
}
