package typings.multiselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiselectStrings {
  
  @scala.inline
  def addOption: addOption = "addOption".asInstanceOf[addOption]
  
  @scala.inline
  def deselect: deselect = "deselect".asInstanceOf[deselect]
  
  @scala.inline
  def deselect_all: deselect_all = "deselect_all".asInstanceOf[deselect_all]
  
  @scala.inline
  def refresh: refresh = "refresh".asInstanceOf[refresh]
  
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  
  @scala.inline
  def select_all: select_all = "select_all".asInstanceOf[select_all]
  
  @js.native
  sealed trait addOption extends js.Object
  
  @js.native
  sealed trait deselect extends js.Object
  
  @js.native
  sealed trait deselect_all extends Method
  
  @js.native
  sealed trait refresh extends Method
  
  @js.native
  sealed trait select extends js.Object
  
  @js.native
  sealed trait select_all extends Method
}
