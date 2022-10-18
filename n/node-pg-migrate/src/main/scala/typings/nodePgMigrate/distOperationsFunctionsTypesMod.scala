package typings.nodePgMigrate

import typings.nodePgMigrate.distOperationsGeneralTypesMod.DropOptions
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Name
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Value
import typings.nodePgMigrate.nodePgMigrateStrings.IMMUTABLE
import typings.nodePgMigrate.nodePgMigrateStrings.IN
import typings.nodePgMigrate.nodePgMigrateStrings.INOUT
import typings.nodePgMigrate.nodePgMigrateStrings.OUT
import typings.nodePgMigrate.nodePgMigrateStrings.RESTRICTED
import typings.nodePgMigrate.nodePgMigrateStrings.SAFE
import typings.nodePgMigrate.nodePgMigrateStrings.STABLE
import typings.nodePgMigrate.nodePgMigrateStrings.UNSAFE
import typings.nodePgMigrate.nodePgMigrateStrings.VARIADIC
import typings.nodePgMigrate.nodePgMigrateStrings.VOLATILE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsFunctionsTypesMod {
  
  @js.native
  trait CreateFunction
    extends StObject
       with CreateFunctionFn {
    
    def reverse(
      functionName: Name,
      functionParams: js.Array[FunctionParam],
      functionOptions: FunctionOptions & DropOptions,
      definition: Value
    ): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateFunctionFn = js.native
  }
  
  @js.native
  trait CreateFunctionFn extends StObject {
    
    def apply(
      functionName: Name,
      functionParams: js.Array[FunctionParam],
      functionOptions: FunctionOptions & DropOptions,
      definition: Value
    ): String | js.Array[String] = js.native
  }
  
  type DropFunction = js.Function3[
    /* functionName */ Name, 
    /* functionParams */ js.Array[FunctionParam], 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  trait FunctionOptions extends StObject {
    
    var behavior: js.UndefOr[IMMUTABLE | STABLE | VOLATILE] = js.undefined
    
    var language: String
    
    var onNull: js.UndefOr[Boolean] = js.undefined
    
    var parallel: js.UndefOr[UNSAFE | RESTRICTED | SAFE] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var returns: js.UndefOr[String] = js.undefined
    
    var window: js.UndefOr[Boolean] = js.undefined
  }
  object FunctionOptions {
    
    inline def apply(language: String): FunctionOptions = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionOptions]
    }
    
    extension [Self <: FunctionOptions](x: Self) {
      
      inline def setBehavior(value: IMMUTABLE | STABLE | VOLATILE): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setOnNull(value: Boolean): Self = StObject.set(x, "onNull", value.asInstanceOf[js.Any])
      
      inline def setOnNullUndefined: Self = StObject.set(x, "onNull", js.undefined)
      
      inline def setParallel(value: UNSAFE | RESTRICTED | SAFE): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setReturns(value: String): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
      
      inline def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
      
      inline def setWindow(value: Boolean): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  type FunctionParam = String | FunctionParamType
  
  trait FunctionParamType extends StObject {
    
    var default: js.UndefOr[Value] = js.undefined
    
    var mode: js.UndefOr[IN | OUT | INOUT | VARIADIC] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object FunctionParamType {
    
    inline def apply(`type`: String): FunctionParamType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionParamType]
    }
    
    extension [Self <: FunctionParamType](x: Self) {
      
      inline def setDefault(value: Value): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: Any*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setMode(value: IN | OUT | INOUT | VARIADIC): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RenameFunction extends RenameFunctionFn {
    
    def reverse(oldFunctionName: Name, functionParams: js.Array[FunctionParam], newFunctionName: Name): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameFunctionFn = js.native
  }
  
  type RenameFunctionFn = js.Function3[
    /* oldFunctionName */ Name, 
    /* functionParams */ js.Array[FunctionParam], 
    /* newFunctionName */ Name, 
    String | js.Array[String]
  ]
}
