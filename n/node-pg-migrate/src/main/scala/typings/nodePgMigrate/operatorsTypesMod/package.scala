package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object operatorsTypesMod {
  
  type AddToOperatorFamily = typings.nodePgMigrate.operatorsTypesMod.AddToOperatorFamilyFn with typings.nodePgMigrate.anon.ReverseAddToOperatorFamilyFn
  
  type AddToOperatorFamilyFn = js.Function3[
    /* operatorFamilyName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* indexMethod */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* operatorList */ js.Array[typings.nodePgMigrate.operatorsTypesMod.OperatorListDefinition], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateOperator = typings.nodePgMigrate.operatorsTypesMod.CreateOperatorFn with typings.nodePgMigrate.anon.ReverseCreateOperatorFn
  
  type CreateOperatorClass = typings.nodePgMigrate.operatorsTypesMod.CreateOperatorClassFn with typings.nodePgMigrate.anon.ReverseCreateOperatorClassFn
  
  type CreateOperatorClassFn = js.Function5[
    /* operatorClassName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* type */ typings.nodePgMigrate.generalTypesMod.Type, 
    /* indexMethod */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* operatorList */ js.Array[typings.nodePgMigrate.operatorsTypesMod.OperatorListDefinition], 
    /* options */ typings.nodePgMigrate.operatorsTypesMod.CreateOperatorClassOptions with typings.nodePgMigrate.generalTypesMod.DropOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateOperatorFamily = typings.nodePgMigrate.operatorsTypesMod.CreateOperatorFamilyFn with typings.nodePgMigrate.anon.ReverseCreateOperatorFamilyFn
  
  type CreateOperatorFamilyFn = js.Function3[
    /* operatorFamilyName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* indexMethod */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* options */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateOperatorFn = js.Function2[
    /* operatorName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* options */ typings.nodePgMigrate.operatorsTypesMod.CreateOperatorOptions with typings.nodePgMigrate.operatorsTypesMod.DropOperatorOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropOperator = js.Function2[
    /* operatorName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* dropOptions */ js.UndefOr[typings.nodePgMigrate.operatorsTypesMod.DropOperatorOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropOperatorClass = js.Function3[
    /* operatorClassName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* indexMethod */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* dropOptions */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropOperatorFamily = js.Function3[
    /* operatorFamilyName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* newSchemaName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* dropOptions */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RemoveFromOperatorFamily = js.Function3[
    /* operatorFamilyName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* indexMethod */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* operatorList */ js.Array[typings.nodePgMigrate.operatorsTypesMod.OperatorListDefinition], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameOperatorClass = typings.nodePgMigrate.operatorsTypesMod.RenameOperatorClassFn with typings.nodePgMigrate.anon.ReverseRenameOperatorClassFn
  
  type RenameOperatorClassFn = js.Function3[
    /* oldOperatorClassName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* indexMethod */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* newOperatorClassName */ typings.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameOperatorFamily = typings.nodePgMigrate.operatorsTypesMod.RenameOperatorFamilyFn with typings.nodePgMigrate.anon.ReverseRenameOperatorFamilyFn
  
  type RenameOperatorFamilyFn = js.Function3[
    /* oldOperatorFamilyName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* indexMethod */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* newOperatorFamilyName */ typings.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
