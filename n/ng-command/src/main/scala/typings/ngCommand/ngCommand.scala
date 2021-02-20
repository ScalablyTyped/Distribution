package typings.ngCommand

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngCommand {
  
  @js.native
  trait Command extends ICommand
  object Command {
    
    @scala.inline
    def apply(canExecute: Boolean, execute: () => js.Any, isExecuting: Boolean): Command = {
      val __obj = js.Dynamic.literal(canExecute = canExecute.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute), isExecuting = isExecuting.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
  }
  
  /**
    * Command proxy object.
    */
  @js.native
  trait ICommand extends StObject {
    
    /**
      * Determines whether the command can execute or not.
      */
    var canExecute: Boolean = js.native
    
    /**
      * Executes the command function.
      */
    def execute(): js.Any = js.native
    
    /**
      * Determines whether the command is currently executing.
      */
    var isExecuting: Boolean = js.native
  }
  object ICommand {
    
    @scala.inline
    def apply(canExecute: Boolean, execute: () => js.Any, isExecuting: Boolean): ICommand = {
      val __obj = js.Dynamic.literal(canExecute = canExecute.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute), isExecuting = isExecuting.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommand]
    }
    
    @scala.inline
    implicit class ICommandMutableBuilder[Self <: ICommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanExecute(value: Boolean): Self = StObject.set(x, "canExecute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecute(value: () => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsExecuting(value: Boolean): Self = StObject.set(x, "isExecuting", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Command factory which creates instances of @see ICommand.
    */
  type ICommandFactory = js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope */ /* $scope */ js.Any, 
    /* execute */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<any> */ js.Any
    ], 
    /* canExecute */ js.UndefOr[js.Function0[Boolean]], 
    ICommand
  ]
}
