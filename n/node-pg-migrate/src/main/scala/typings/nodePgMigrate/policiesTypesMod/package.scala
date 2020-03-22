package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object policiesTypesMod {
  type AlterPolicy = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* policyName */ java.lang.String, 
    /* options */ typings.nodePgMigrate.policiesTypesMod.PolicyOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type CreatePolicy = typings.nodePgMigrate.policiesTypesMod.CreatePolicyFn with typings.nodePgMigrate.AnonReverseCreatePolicyFn
  type CreatePolicyFn = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* policyName */ java.lang.String, 
    /* options */ js.UndefOr[
      typings.nodePgMigrate.policiesTypesMod.CreatePolicyOptions with typings.nodePgMigrate.generalTypesMod.IfExistsOption
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type CreatePolicyOptions = typings.nodePgMigrate.policiesTypesMod.CreatePolicyOptionsEn with typings.nodePgMigrate.policiesTypesMod.PolicyOptions
  type DropPolicy = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* policyName */ java.lang.String, 
    /* options */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.IfExistsOption], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type RenamePolicy = typings.nodePgMigrate.policiesTypesMod.RenamePolicyFn with typings.nodePgMigrate.AnonReverseRenamePolicyFn
  type RenamePolicyFn = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* policyName */ java.lang.String, 
    /* newPolicyName */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
