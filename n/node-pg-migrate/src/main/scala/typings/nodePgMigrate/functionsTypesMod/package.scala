package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object functionsTypesMod {
  type CreateFunction = typings.nodePgMigrate.functionsTypesMod.CreateFunctionFn with typings.nodePgMigrate.AnonReverseCreateFunctionFn
  type CreateFunctionFn = js.Function4[
    /* functionName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* functionParams */ js.Array[typings.nodePgMigrate.functionsTypesMod.FunctionParam], 
    /* functionOptions */ typings.nodePgMigrate.functionsTypesMod.FunctionOptions with typings.nodePgMigrate.generalTypesMod.DropOptions, 
    /* definition */ typings.nodePgMigrate.generalTypesMod.Value, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropFunction = js.Function3[
    /* functionName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* functionParams */ js.Array[typings.nodePgMigrate.functionsTypesMod.FunctionParam], 
    /* dropOptions */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type FunctionParam = java.lang.String | typings.nodePgMigrate.functionsTypesMod.FunctionParamType
  type RenameFunction = typings.nodePgMigrate.functionsTypesMod.RenameFunctionFn with typings.nodePgMigrate.AnonReverseRenameFunctionFn
  type RenameFunctionFn = js.Function3[
    /* oldFunctionName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* functionParams */ js.Array[typings.nodePgMigrate.functionsTypesMod.FunctionParam], 
    /* newFunctionName */ typings.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
