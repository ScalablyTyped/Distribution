package typings.parseDashMockdb

import typings.parseDashMockdb.ParseMockDB.HookType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object parseDashMockdbStrings {
  @js.native
  sealed trait beforeDelete extends HookType
  
  @js.native
  sealed trait beforeSave extends HookType
  
  @scala.inline
  def beforeDelete: beforeDelete = "beforeDelete".asInstanceOf[beforeDelete]
  @scala.inline
  def beforeSave: beforeSave = "beforeSave".asInstanceOf[beforeSave]
}

