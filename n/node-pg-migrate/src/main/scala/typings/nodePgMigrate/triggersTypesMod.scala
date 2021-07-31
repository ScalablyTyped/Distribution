package typings.nodePgMigrate

import typings.nodePgMigrate.anon.Reverse
import typings.nodePgMigrate.functionsTypesMod.FunctionOptions
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.nodePgMigrateStrings.AFTER
import typings.nodePgMigrate.nodePgMigrateStrings.BEFORE
import typings.nodePgMigrate.nodePgMigrateStrings.ROW
import typings.nodePgMigrate.nodePgMigrateStrings.STATEMENT
import typings.nodePgMigrate.nodePgMigrateStrings.`INSTEAD OF`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggersTypesMod {
  
  type CreateTrigger = CreateTriggerFn & Reverse
  
  type CreateTriggerFn = CreateTriggerFn1 | CreateTriggerFn2
  
  type CreateTriggerFn1 = js.Function3[
    /* tableName */ Name, 
    /* triggerName */ String, 
    /* triggerOptions */ TriggerOptions & DropOptions, 
    String | js.Array[String]
  ]
  
  type CreateTriggerFn2 = js.Function4[
    /* tableName */ Name, 
    /* triggerName */ String, 
    /* triggerOptions */ TriggerOptions & FunctionOptions & DropOptions, 
    /* definition */ Value, 
    String | js.Array[String]
  ]
  
  type DropTrigger = js.Function3[
    /* tableName */ Name, 
    /* triggerName */ String, 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  @js.native
  trait RenameTrigger extends RenameTriggerFn {
    
    def reverse(tableName: Name, oldTriggerName: String, newTriggerName: String): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameTriggerFn = js.native
  }
  
  type RenameTriggerFn = js.Function3[
    /* tableName */ Name, 
    /* oldTriggerName */ String, 
    /* newTriggerName */ String, 
    String | js.Array[String]
  ]
  
  trait TriggerOptions extends StObject {
    
    var condition: js.UndefOr[String] = js.undefined
    
    var constraint: js.UndefOr[Boolean] = js.undefined
    
    var deferrable: js.UndefOr[Boolean] = js.undefined
    
    var deferred: js.UndefOr[Boolean] = js.undefined
    
    var function: js.UndefOr[Name] = js.undefined
    
    var functionParams: js.UndefOr[js.Array[Value]] = js.undefined
    
    var level: js.UndefOr[STATEMENT | ROW] = js.undefined
    
    var operation: String | js.Array[String]
    
    var when: js.UndefOr[BEFORE | AFTER | (`INSTEAD OF`)] = js.undefined
  }
  object TriggerOptions {
    
    @scala.inline
    def apply(operation: String | js.Array[String]): TriggerOptions = {
      val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerOptions]
    }
    
    @scala.inline
    implicit class TriggerOptionsMutableBuilder[Self <: TriggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setConstraint(value: Boolean): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
      
      @scala.inline
      def setDeferrable(value: Boolean): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
      
      @scala.inline
      def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
      
      @scala.inline
      def setFunction(value: Name): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionParams(value: js.Array[Value]): Self = StObject.set(x, "functionParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionParamsUndefined: Self = StObject.set(x, "functionParams", js.undefined)
      
      @scala.inline
      def setFunctionParamsVarargs(value: Value*): Self = StObject.set(x, "functionParams", js.Array(value :_*))
      
      @scala.inline
      def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      @scala.inline
      def setLevel(value: STATEMENT | ROW): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setOperation(value: String | js.Array[String]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationVarargs(value: String*): Self = StObject.set(x, "operation", js.Array(value :_*))
      
      @scala.inline
      def setWhen(value: BEFORE | AFTER | (`INSTEAD OF`)): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
}
