package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object generalTypesMod {
  
  type DropOptions = typings.nodePgMigrate.generalTypesMod.IfExistsOption with typings.nodePgMigrate.generalTypesMod.CascadeOption
  
  type LiteralUnion[T /* <: java.lang.String */] = T | (java.lang.String with typings.nodePgMigrate.anon.ZzIGNOREME)
  
  type Name = java.lang.String | typings.nodePgMigrate.anon.Name
  
  type Nullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | null}
    */ typings.nodePgMigrate.nodePgMigrateStrings.Nullable with org.scalablytyped.runtime.TopLevel[T]
  
  type PublicPart[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typings.nodePgMigrate.nodePgMigrateStrings.PublicPart with org.scalablytyped.runtime.TopLevel[T]
  
  type Type = java.lang.String | typings.nodePgMigrate.anon.Type
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Boolean
    - java.lang.String
    - scala.Double
    - typings.nodePgMigrate.pgLiteralMod.default
    - typings.nodePgMigrate.generalTypesMod.PgLiteralValue
    - js.Array[
  / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value * / js.Object]
  */
  type Value = typings.nodePgMigrate.generalTypesMod._Value | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object
  ]) | scala.Null | scala.Boolean | java.lang.String | scala.Double
}
