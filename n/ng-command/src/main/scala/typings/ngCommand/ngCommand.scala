package typings.ngCommand

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngCommand {
  
  trait Command
    extends StObject
       with ICommand
  object Command {
    
    inline def apply(canExecute: Boolean, execute: () => js.Any, isExecuting: Boolean): Command = {
      val __obj = js.Dynamic.literal(canExecute = canExecute.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute), isExecuting = isExecuting.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
  }
  
  /**
    * Command proxy object.
    */
  trait ICommand extends StObject {
    
    /**
      * Determines whether the command can execute or not.
      */
    var canExecute: Boolean
    
    /**
      * Executes the command function.
      */
    def execute(): js.Any
    
    /**
      * Determines whether the command is currently executing.
      */
    var isExecuting: Boolean
  }
  object ICommand {
    
    inline def apply(canExecute: Boolean, execute: () => js.Any, isExecuting: Boolean): ICommand = {
      val __obj = js.Dynamic.literal(canExecute = canExecute.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute), isExecuting = isExecuting.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommand]
    }
    
    extension [Self <: ICommand](x: Self) {
      
      inline def setCanExecute(value: Boolean): Self = StObject.set(x, "canExecute", value.asInstanceOf[js.Any])
      
      inline def setExecute(value: () => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      inline def setIsExecuting(value: Boolean): Self = StObject.set(x, "isExecuting", value.asInstanceOf[js.Any])
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
