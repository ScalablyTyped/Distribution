package typings.mobx

import typings.mobx.derivationMod.IDerivation
import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreActionMod {
  
  @JSImport("mobx/lib/core/action", "allowStateChanges")
  @js.native
  def allowStateChanges[T](allowStateChanges: Boolean, func: js.Function0[T]): T = js.native
  
  @JSImport("mobx/lib/core/action", "allowStateChangesEnd")
  @js.native
  def allowStateChangesEnd(prev: Boolean): Unit = js.native
  
  @JSImport("mobx/lib/core/action", "allowStateChangesInsideComputed")
  @js.native
  def allowStateChangesInsideComputed[T](func: js.Function0[T]): T = js.native
  
  @JSImport("mobx/lib/core/action", "allowStateChangesStart")
  @js.native
  def allowStateChangesStart(allowStateChanges: Boolean): Boolean = js.native
  
  @JSImport("mobx/lib/core/action", "createAction")
  @js.native
  def createAction(actionName: String, fn: js.Function): js.Function with IAction = js.native
  @JSImport("mobx/lib/core/action", "createAction")
  @js.native
  def createAction(actionName: String, fn: js.Function, ref: js.Object): js.Function with IAction = js.native
  
  @JSImport("mobx/lib/core/action", "_endAction")
  @js.native
  def endAction(runInfo: IActionRunInfo): Unit = js.native
  
  @JSImport("mobx/lib/core/action", "executeAction")
  @js.native
  def executeAction(actionName: String, fn: js.Function): js.Any = js.native
  @JSImport("mobx/lib/core/action", "executeAction")
  @js.native
  def executeAction(actionName: String, fn: js.Function, scope: js.UndefOr[scala.Nothing], args: IArguments): js.Any = js.native
  @JSImport("mobx/lib/core/action", "executeAction")
  @js.native
  def executeAction(actionName: String, fn: js.Function, scope: js.Any): js.Any = js.native
  @JSImport("mobx/lib/core/action", "executeAction")
  @js.native
  def executeAction(actionName: String, fn: js.Function, scope: js.Any, args: IArguments): js.Any = js.native
  
  @JSImport("mobx/lib/core/action", "_startAction")
  @js.native
  def startAction(actionName: String, scope: js.Any): IActionRunInfo = js.native
  @JSImport("mobx/lib/core/action", "_startAction")
  @js.native
  def startAction(actionName: String, scope: js.Any, args: IArguments): IActionRunInfo = js.native
  
  @js.native
  trait IAction extends StObject {
    
    var isMobxAction: Boolean = js.native
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
  
  @js.native
  trait IActionRunInfo extends StObject {
    
    var actionId: Double = js.native
    
    var error: js.UndefOr[js.Any] = js.native
    
    var notifySpy: Boolean = js.native
    
    var parentActionId: Double = js.native
    
    var prevAllowStateChanges: Boolean = js.native
    
    var prevAllowStateReads: Boolean = js.native
    
    var prevDerivation: IDerivation | Null = js.native
    
    var startTime: Double = js.native
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
      val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], notifySpy = notifySpy.asInstanceOf[js.Any], parentActionId = parentActionId.asInstanceOf[js.Any], prevAllowStateChanges = prevAllowStateChanges.asInstanceOf[js.Any], prevAllowStateReads = prevAllowStateReads.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
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
