package typings.nodePgMigrate

import typings.nodePgMigrate.anon.Reverse
import typings.nodePgMigrate.distOperationsFunctionsTypesMod.FunctionOptions
import typings.nodePgMigrate.distOperationsGeneralTypesMod.DropOptions
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Name
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Value
import typings.nodePgMigrate.nodePgMigrateStrings.AFTER
import typings.nodePgMigrate.nodePgMigrateStrings.BEFORE
import typings.nodePgMigrate.nodePgMigrateStrings.ROW
import typings.nodePgMigrate.nodePgMigrateStrings.STATEMENT
import typings.nodePgMigrate.nodePgMigrateStrings.`INSTEAD OF`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsTriggersTypesMod {
  
  type CreateTrigger = CreateTriggerFn & Reverse
  
  type CreateTriggerFn = CreateTriggerFn1 | CreateTriggerFn2
  
  type CreateTriggerFn1 = js.Function3[
    /* tableName */ Name, 
    /* triggerName */ String, 
    /* triggerOptions */ TriggerOptions & DropOptions, 
    String | js.Array[String]
  ]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type CreateTriggerFn2 = (tableName : node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Name, triggerName : string, triggerOptions : node-pg-migrate.node-pg-migrate/dist/operations/triggersTypes.TriggerOptions & node-pg-migrate.node-pg-migrate/dist/operations/functionsTypes.FunctionOptions & node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.DropOptions, definition : node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value): string | std.Array<string>
  }}}
  to avoid circular code involving: 
  - node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value
  - node-pg-migrate.node-pg-migrate/dist/operations/triggersTypes.CreateTrigger
  - node-pg-migrate.node-pg-migrate/dist/operations/triggersTypes.CreateTriggerFn
  - node-pg-migrate.node-pg-migrate/dist/operations/triggersTypes.CreateTriggerFn2
  */
  @js.native
  trait CreateTriggerFn2 extends StObject {
    
    def apply(
      tableName: Name,
      triggerName: String,
      triggerOptions: TriggerOptions & FunctionOptions & DropOptions,
      definition: Value
    ): String | js.Array[String] = js.native
  }
  
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
    
    inline def apply(operation: String | js.Array[String]): TriggerOptions = {
      val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TriggerOptions] (val x: Self) extends AnyVal {
      
      inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setConstraint(value: Boolean): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
      
      inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
      
      inline def setDeferrable(value: Boolean): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
      
      inline def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
      
      inline def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
      
      inline def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
      
      inline def setFunction(value: Name): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      inline def setFunctionParams(value: js.Array[Value]): Self = StObject.set(x, "functionParams", value.asInstanceOf[js.Any])
      
      inline def setFunctionParamsUndefined: Self = StObject.set(x, "functionParams", js.undefined)
      
      inline def setFunctionParamsVarargs(value: Value*): Self = StObject.set(x, "functionParams", js.Array(value*))
      
      inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      inline def setLevel(value: STATEMENT | ROW): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setOperation(value: String | js.Array[String]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setOperationVarargs(value: String*): Self = StObject.set(x, "operation", js.Array(value*))
      
      inline def setWhen(value: BEFORE | AFTER | (`INSTEAD OF`)): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
}
