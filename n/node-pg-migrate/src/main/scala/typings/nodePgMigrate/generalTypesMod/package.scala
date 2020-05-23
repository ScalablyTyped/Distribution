package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object generalTypesMod {
  type DropOptions = typings.nodePgMigrate.generalTypesMod.IfExistsOption with typings.nodePgMigrate.generalTypesMod.CascadeOption
  type LiteralUnion[T /* <: U */, U] = T | (U with js.Object)
  type Name = java.lang.String | typings.nodePgMigrate.anon.Name
  type Type = java.lang.String | typings.nodePgMigrate.anon.Type
  type Value = scala.Null | scala.Boolean | java.lang.String | scala.Double | typings.nodePgMigrate.pgLiteralMod.default | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object
  ])
}
