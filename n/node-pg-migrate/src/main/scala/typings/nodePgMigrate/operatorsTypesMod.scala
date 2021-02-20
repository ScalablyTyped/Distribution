package typings.nodePgMigrate

import typings.nodePgMigrate.anon.ReverseAddToOperatorFamilyFn
import typings.nodePgMigrate.anon.ReverseCreateOperatorClassFn
import typings.nodePgMigrate.anon.ReverseCreateOperatorFamilyFn
import typings.nodePgMigrate.anon.ReverseCreateOperatorFn
import typings.nodePgMigrate.anon.ReverseRenameOperatorClassFn
import typings.nodePgMigrate.anon.ReverseRenameOperatorFamilyFn
import typings.nodePgMigrate.functionsTypesMod.FunctionParam
import typings.nodePgMigrate.generalTypesMod.CascadeOption
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Type
import typings.nodePgMigrate.nodePgMigrateStrings.function
import typings.nodePgMigrate.nodePgMigrateStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsTypesMod {
  
  type AddToOperatorFamily = AddToOperatorFamilyFn with ReverseAddToOperatorFamilyFn
  
  type AddToOperatorFamilyFn = js.Function3[
    /* operatorFamilyName */ Name, 
    /* indexMethod */ Name, 
    /* operatorList */ js.Array[OperatorListDefinition], 
    String | js.Array[String]
  ]
  
  type CreateOperator = CreateOperatorFn with ReverseCreateOperatorFn
  
  type CreateOperatorClass = CreateOperatorClassFn with ReverseCreateOperatorClassFn
  
  type CreateOperatorClassFn = js.Function5[
    /* operatorClassName */ Name, 
    /* type */ Type, 
    /* indexMethod */ Name, 
    /* operatorList */ js.Array[OperatorListDefinition], 
    /* options */ CreateOperatorClassOptions with DropOptions, 
    String | js.Array[String]
  ]
  
  @js.native
  trait CreateOperatorClassOptions extends StObject {
    
    var default: js.UndefOr[Boolean] = js.native
    
    var family: js.UndefOr[String] = js.native
  }
  object CreateOperatorClassOptions {
    
    @scala.inline
    def apply(): CreateOperatorClassOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOperatorClassOptions]
    }
    
    @scala.inline
    implicit class CreateOperatorClassOptionsMutableBuilder[Self <: CreateOperatorClassOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    }
  }
  
  type CreateOperatorFamily = CreateOperatorFamilyFn with ReverseCreateOperatorFamilyFn
  
  type CreateOperatorFamilyFn = js.Function3[
    /* operatorFamilyName */ Name, 
    /* indexMethod */ Name, 
    /* options */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  type CreateOperatorFn = js.Function2[
    /* operatorName */ Name, 
    /* options */ CreateOperatorOptions with DropOperatorOptions, 
    String | js.Array[String]
  ]
  
  @js.native
  trait CreateOperatorOptions extends StObject {
    
    var commutator: js.UndefOr[Name] = js.native
    
    var hashes: js.UndefOr[Boolean] = js.native
    
    var join: js.UndefOr[Name] = js.native
    
    var left: js.UndefOr[Name] = js.native
    
    var merges: js.UndefOr[Boolean] = js.native
    
    var negator: js.UndefOr[Name] = js.native
    
    var procedure: Name = js.native
    
    var restrict: js.UndefOr[Name] = js.native
    
    var right: js.UndefOr[Name] = js.native
  }
  object CreateOperatorOptions {
    
    @scala.inline
    def apply(procedure: Name): CreateOperatorOptions = {
      val __obj = js.Dynamic.literal(procedure = procedure.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOperatorOptions]
    }
    
    @scala.inline
    implicit class CreateOperatorOptionsMutableBuilder[Self <: CreateOperatorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommutator(value: Name): Self = StObject.set(x, "commutator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommutatorUndefined: Self = StObject.set(x, "commutator", js.undefined)
      
      @scala.inline
      def setHashes(value: Boolean): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
      
      @scala.inline
      def setJoin(value: Name): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      @scala.inline
      def setLeft(value: Name): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setMerges(value: Boolean): Self = StObject.set(x, "merges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergesUndefined: Self = StObject.set(x, "merges", js.undefined)
      
      @scala.inline
      def setNegator(value: Name): Self = StObject.set(x, "negator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegatorUndefined: Self = StObject.set(x, "negator", js.undefined)
      
      @scala.inline
      def setProcedure(value: Name): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrict(value: Name): Self = StObject.set(x, "restrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictUndefined: Self = StObject.set(x, "restrict", js.undefined)
      
      @scala.inline
      def setRight(value: Name): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
  
  type DropOperator = js.Function2[
    /* operatorName */ Name, 
    /* dropOptions */ js.UndefOr[DropOperatorOptions], 
    String | js.Array[String]
  ]
  
  type DropOperatorClass = js.Function3[
    /* operatorClassName */ Name, 
    /* indexMethod */ Name, 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  type DropOperatorFamily = js.Function3[
    /* operatorFamilyName */ Name, 
    /* newSchemaName */ Name, 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  @js.native
  trait DropOperatorOptions
    extends IfExistsOption
       with CascadeOption {
    
    var left: js.UndefOr[Name] = js.native
    
    var right: js.UndefOr[Name] = js.native
  }
  object DropOperatorOptions {
    
    @scala.inline
    def apply(): DropOperatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropOperatorOptions]
    }
    
    @scala.inline
    implicit class DropOperatorOptionsMutableBuilder[Self <: DropOperatorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Name): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Name): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
  
  @js.native
  trait OperatorListDefinition extends StObject {
    
    var name: Name = js.native
    
    var number: Double = js.native
    
    var params: js.UndefOr[js.Array[FunctionParam]] = js.native
    
    var `type`: function | operator = js.native
  }
  object OperatorListDefinition {
    
    @scala.inline
    def apply(name: Name, number: Double, `type`: function | operator): OperatorListDefinition = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperatorListDefinition]
    }
    
    @scala.inline
    implicit class OperatorListDefinitionMutableBuilder[Self <: OperatorListDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Array[FunctionParam]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setParamsVarargs(value: FunctionParam*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      @scala.inline
      def setType(value: function | operator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RemoveFromOperatorFamily = js.Function3[
    /* operatorFamilyName */ Name, 
    /* indexMethod */ Name, 
    /* operatorList */ js.Array[OperatorListDefinition], 
    String | js.Array[String]
  ]
  
  type RenameOperatorClass = RenameOperatorClassFn with ReverseRenameOperatorClassFn
  
  type RenameOperatorClassFn = js.Function3[
    /* oldOperatorClassName */ Name, 
    /* indexMethod */ Name, 
    /* newOperatorClassName */ Name, 
    String | js.Array[String]
  ]
  
  type RenameOperatorFamily = RenameOperatorFamilyFn with ReverseRenameOperatorFamilyFn
  
  type RenameOperatorFamilyFn = js.Function3[
    /* oldOperatorFamilyName */ Name, 
    /* indexMethod */ Name, 
    /* newOperatorFamilyName */ Name, 
    String | js.Array[String]
  ]
}
