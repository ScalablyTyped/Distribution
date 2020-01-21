package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddOptions = typings.nodePgMigrate.mod.IfNotExistsOption
  type ColumnDefinitions = org.scalablytyped.runtime.StringDictionary[typings.nodePgMigrate.mod.ColumnDefinition | java.lang.String]
  type CreatePolicyOptions = typings.nodePgMigrate.mod.CreatePolicyOptionsEn with typings.nodePgMigrate.mod.PolicyOptions
  type DomainOptionsAlter = typings.nodePgMigrate.mod.DomainOptionsAlterEn with typings.nodePgMigrate.mod.DomainOptions
  type DomainOptionsCreate = typings.nodePgMigrate.mod.DomainOptionsCreateEn with typings.nodePgMigrate.mod.DomainOptions
  type DropIndexOptions = typings.nodePgMigrate.mod.DropIndexOptionsEn with typings.nodePgMigrate.mod.DropOptions
  type DropOptions = typings.nodePgMigrate.mod.IfExistsOption with typings.nodePgMigrate.mod.CascadeOption
  type FunctionParam = java.lang.String | typings.nodePgMigrate.mod.FunctionParamType
  type LiteralUnion[T /* <: U */, U] = T | (U with js.Object)
  type Name = java.lang.String | typings.nodePgMigrate.AnonName
  type RunnerOption = typings.nodePgMigrate.mod.RunnerOptionConfig with (typings.nodePgMigrate.mod.RunnerOptionClient | typings.nodePgMigrate.mod.RunnerOptionUrl)
  type SequenceOptionsAlter = typings.nodePgMigrate.mod.SequenceOptionsAlterEn with typings.nodePgMigrate.mod.SequenceOptions
  type SequenceOptionsCreate = typings.nodePgMigrate.mod.SequenceOptionsCreateEn with typings.nodePgMigrate.mod.SequenceOptions
  type Type = java.lang.String | typings.nodePgMigrate.AnonType
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Boolean
    - java.lang.String
    - scala.Double
    - typings.nodePgMigrate.mod.PgLiteral
    - typings.nodePgMigrate.mod.ValueArray
  */
  type Value = typings.nodePgMigrate.mod._Value | scala.Null | scala.Boolean | java.lang.String | scala.Double
}
