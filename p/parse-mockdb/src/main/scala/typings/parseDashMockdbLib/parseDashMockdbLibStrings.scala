package typings
package parseDashMockdbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object parseDashMockdbLibStrings {
  @js.native
  sealed trait beforeDelete
    extends parseDashMockdbLib.ParseMockDBNs.HookType
  
  @js.native
  sealed trait beforeSave
    extends parseDashMockdbLib.ParseMockDBNs.HookType
  
  @scala.inline
  def beforeDelete: beforeDelete = "beforeDelete".asInstanceOf[beforeDelete]
  @scala.inline
  def beforeSave: beforeSave = "beforeSave".asInstanceOf[beforeSave]
}

