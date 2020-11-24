package typings.parseMockdb

import typings.parseMockdb.ParseMockDB.HookType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMockdbStrings {
  
  @scala.inline
  def beforeDelete: beforeDelete = "beforeDelete".asInstanceOf[beforeDelete]
  
  @scala.inline
  def beforeSave: beforeSave = "beforeSave".asInstanceOf[beforeSave]
  
  @js.native
  sealed trait beforeDelete extends HookType
  
  @js.native
  sealed trait beforeSave extends HookType
}
