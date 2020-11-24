package typings.momentJalaali

import typings.momentJalaali.mod.momentAugmentingMod.JUnitOfTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object momentJalaaliStrings {
  
  @scala.inline
  def jMonth: jMonth = "jMonth".asInstanceOf[jMonth]
  
  @scala.inline
  def jYear: jYear = "jYear".asInstanceOf[jYear]
  
  @scala.inline
  def persian: persian = "persian".asInstanceOf[persian]
  
  @scala.inline
  def `persian-modern`: `persian-modern` = "persian-modern".asInstanceOf[`persian-modern`]
  
  @js.native
  sealed trait jMonth extends JUnitOfTime
  
  @js.native
  sealed trait jYear extends JUnitOfTime
  
  @js.native
  sealed trait persian extends js.Object
  
  @js.native
  sealed trait `persian-modern` extends js.Object
}
