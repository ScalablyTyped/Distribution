package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object schemasTypesMod {
  type CreateSchema = typings.nodePgMigrate.schemasTypesMod.CreateSchemaFn with typings.nodePgMigrate.AnonReverseCreateSchemaFn
  type CreateSchemaFn = js.Function2[
    /* schemaName */ java.lang.String, 
    /* schemaOptions */ js.UndefOr[
      typings.nodePgMigrate.schemasTypesMod.CreateSchemaOptions with typings.nodePgMigrate.generalTypesMod.DropOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropSchema = js.Function2[
    /* schemaName */ java.lang.String, 
    /* dropOptions */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type RenameSchema = typings.nodePgMigrate.schemasTypesMod.RenameSchemaFn with typings.nodePgMigrate.AnonReverseRenameSchemaFn
  type RenameSchemaFn = js.Function2[
    /* oldSchemaName */ java.lang.String, 
    /* newSchemaName */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
