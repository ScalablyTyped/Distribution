package typings.mobx

import typings.mobx.derivationMod.IDerivation
import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreActionMod {
  
  @JSImport("mobx/lib/core/action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def allowStateChanges[T](allowStateChanges: Boolean, func: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("allowStateChanges")(allowStateChanges.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def allowStateChangesEnd(prev: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStateChangesEnd")(prev.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def allowStateChangesInsideComputed[T](func: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStateChangesInsideComputed")(func.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def allowStateChangesStart(allowStateChanges: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStateChangesStart")(allowStateChanges.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def createAction(actionName: String, fn: js.Function): js.Function & IAction = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function & IAction]
  @scala.inline
  def createAction(actionName: String, fn: js.Function, ref: js.Object): js.Function & IAction = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[js.Function & IAction]
  
  @scala.inline
  def endAction(runInfo: IActionRunInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endAction")(runInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def executeAction(actionName: String, fn: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def executeAction(actionName: String, fn: js.Function, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def executeAction(actionName: String, fn: js.Function, scope: js.Any, args: IArguments): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def executeAction(actionName: String, fn: js.Function, scope: Unit, args: IArguments): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def startAction(actionName: String, scope: js.Any): IActionRunInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("_startAction")(actionName.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IActionRunInfo]
  @scala.inline
  def startAction(actionName: String, scope: js.Any, args: IArguments): IActionRunInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("_startAction")(actionName.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[IActionRunInfo]
  
  trait IAction extends StObject {
    
    var isMobxAction: Boolean
  }
  object IAction {
    
    @scala.inline
    def apply(isMobxAction: Boolean): IAction = {
      val __obj = js.Dynamic.literal(isMobxAction = isMobxAction.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAction]
    }
    
    @scala.inline
    implicit class IActionMutableBuilder[Self <: IAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsMobxAction(value: Boolean): Self = StObject.set(x, "isMobxAction", value.asInstanceOf[js.Any])
    }
  }
  
  trait IActionRunInfo extends StObject {
    
    var actionId: Double
    
    var error: js.UndefOr[js.Any] = js.undefined
    
    var notifySpy: Boolean
    
    var parentActionId: Double
    
    var prevAllowStateChanges: Boolean
    
    var prevAllowStateReads: Boolean
    
    var prevDerivation: IDerivation | Null
    
    var startTime: Double
  }
  object IActionRunInfo {
    
    @scala.inline
    def apply(
      actionId: Double,
      notifySpy: Boolean,
      parentActionId: Double,
      prevAllowStateChanges: Boolean,
      prevAllowStateReads: Boolean,
      startTime: Double
    ): IActionRunInfo = {
      val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], notifySpy = notifySpy.asInstanceOf[js.Any], parentActionId = parentActionId.asInstanceOf[js.Any], prevAllowStateChanges = prevAllowStateChanges.asInstanceOf[js.Any], prevAllowStateReads = prevAllowStateReads.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], prevDerivation = null)
      __obj.asInstanceOf[IActionRunInfo]
    }
    
    @scala.inline
    implicit class IActionRunInfoMutableBuilder[Self <: IActionRunInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionId(value: Double): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNotifySpy(value: Boolean): Self = StObject.set(x, "notifySpy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentActionId(value: Double): Self = StObject.set(x, "parentActionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevAllowStateChanges(value: Boolean): Self = StObject.set(x, "prevAllowStateChanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevAllowStateReads(value: Boolean): Self = StObject.set(x, "prevAllowStateReads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevDerivation(value: IDerivation): Self = StObject.set(x, "prevDerivation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevDerivationNull: Self = StObject.set(x, "prevDerivation", null)
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
}
