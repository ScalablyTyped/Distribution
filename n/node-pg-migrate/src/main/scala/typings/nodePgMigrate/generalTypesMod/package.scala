package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object generalTypesMod {
  type DropOptions = typings.nodePgMigrate.generalTypesMod.IfExistsOption with typings.nodePgMigrate.generalTypesMod.CascadeOption
  type LiteralUnion[T /* <: U */, U] = T | (U with typings.nodePgMigrate.anon.ZzIGNOREME)
  type Name = java.lang.String | typings.nodePgMigrate.anon.Name
  type Nullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | null}
    */ typings.nodePgMigrate.nodePgMigrateStrings.Nullable with org.scalablytyped.runtime.TopLevel[T]
  type Type = java.lang.String | typings.nodePgMigrate.anon.Type
  type Value = scala.Null | scala.Boolean | java.lang.String | scala.Double | typings.nodePgMigrate.pgLiteralMod.default | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object
  ])
}
