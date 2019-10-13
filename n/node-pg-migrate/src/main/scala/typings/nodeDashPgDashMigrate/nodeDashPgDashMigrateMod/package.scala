package typings.nodeDashPgDashMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashPgDashMigrateMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.nodeDashPgDashMigrate.Anon_Name
  import typings.nodeDashPgDashMigrate.Anon_Type

  type AddOptions = IfNotExistsOption
  type ColumnDefinitions = StringDictionary[ColumnDefinition | String]
  type CreatePolicyOptions = CreatePolicyOptionsEn with PolicyOptions
  type DomainOptionsAlter = DomainOptionsAlterEn with DomainOptions
  type DomainOptionsCreate = DomainOptionsCreateEn with DomainOptions
  type DropIndexOptions = DropIndexOptionsEn with DropOptions
  type DropOptions = IfExistsOption with CascadeOption
  type FunctionParam = String | FunctionParamType
  type LiteralUnion[T /* <: U */, U] = T | (U with js.Object)
  type Name = String | Anon_Name
  type RunnerOption = RunnerOptionConfig with (RunnerOptionClient | RunnerOptionUrl)
  type SequenceOptionsAlter = SequenceOptionsAlterEn with SequenceOptions
  type SequenceOptionsCreate = SequenceOptionsCreateEn with SequenceOptions
  type Type = String | Anon_Type
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Boolean
    - java.lang.String
    - scala.Double
    - typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgLiteral
    - typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.ValueArray
  */
  type Value = _Value | Null | Boolean | String | Double
}
