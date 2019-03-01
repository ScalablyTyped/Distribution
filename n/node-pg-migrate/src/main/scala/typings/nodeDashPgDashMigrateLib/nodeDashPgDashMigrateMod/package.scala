package typings
package nodeDashPgDashMigrateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashPgDashMigrateMod {
  type CreatePolicyOptions = CreatePolicyOptionsEn with PolicyOptions
  type DomainOptionsAlter = DomainOptionsAlterEn with DomainOptions
  type DomainOptionsCreate = DomainOptionsCreateEn with DomainOptions
  type DropIndexOptions = DropIndexOptionsEn with DropOptions
  type DropOptions = IfExistsOption with CascadeOption
  type FunctionParam = java.lang.String | FunctionParamType
  type Name = java.lang.String | nodeDashPgDashMigrateLib.Anon_Name
  type SequenceOptionsAlter = SequenceOptionsAlterEn with SequenceOptions
  type SequenceOptionsCreate = SequenceOptionsCreateEn with SequenceOptions
  type TriggerOptions = TriggerOptionsEn with FunctionOptions
  type Type = java.lang.String | nodeDashPgDashMigrateLib.Anon_Type
  type Value = _Value | scala.Null | scala.Boolean | java.lang.String | scala.Double
}
