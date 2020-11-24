package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object rolesTypesMod {
  
  type AlterRole = js.Function2[
    /* roleName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* roleOptions */ typings.nodePgMigrate.rolesTypesMod.RoleOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateRole = typings.nodePgMigrate.rolesTypesMod.CreateRoleFn with typings.nodePgMigrate.anon.ReverseCreateRoleFn
  
  type CreateRoleFn = js.Function2[
    /* roleName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* roleOptions */ js.UndefOr[
      typings.nodePgMigrate.rolesTypesMod.RoleOptions with typings.nodePgMigrate.generalTypesMod.IfExistsOption
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropRole = js.Function2[
    /* roleName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* options */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.IfExistsOption], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameRole = typings.nodePgMigrate.rolesTypesMod.RenameRoleFn with typings.nodePgMigrate.anon.ReverseRenameRoleFn
  
  type RenameRoleFn = js.Function2[
    /* oldRoleName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* newRoleName */ typings.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
