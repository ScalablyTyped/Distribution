package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Value
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

object functionsTypesMod {
  
  @js.native
  trait CreateFunction extends CreateFunctionFn {
    
    def reverse(
      functionName: Name,
      functionParams: js.Array[FunctionParam],
      functionOptions: FunctionOptions & DropOptions,
      definition: Value
    ): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateFunctionFn = js.native
  }
  
  type CreateFunctionFn = js.Function4[
    /* functionName */ Name, 
    /* functionParams */ js.Array[FunctionParam], 
    /* functionOptions */ FunctionOptions & DropOptions, 
    /* definition */ Value, 
    String | js.Array[String]
  ]
  
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
    
    @scala.inline
    def apply(language: String): FunctionOptions = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionOptions]
    }
    
    @scala.inline
    implicit class FunctionOptionsMutableBuilder[Self <: FunctionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBehavior(value: IMMUTABLE | STABLE | VOLATILE): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnNull(value: Boolean): Self = StObject.set(x, "onNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnNullUndefined: Self = StObject.set(x, "onNull", js.undefined)
      
      @scala.inline
      def setParallel(value: UNSAFE | RESTRICTED | SAFE): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      @scala.inline
      def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setReturns(value: String): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
      
      @scala.inline
      def setWindow(value: Boolean): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
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
    
    @scala.inline
    def apply(`type`: String): FunctionParamType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionParamType]
    }
    
    @scala.inline
    implicit class FunctionParamTypeMutableBuilder[Self <: FunctionParamType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: Value): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNull: Self = StObject.set(x, "default", null)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object)*
      ): Self = StObject.set(x, "default", js.Array(value :_*))
      
      @scala.inline
      def setMode(value: IN | OUT | INOUT | VARIADIC): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
