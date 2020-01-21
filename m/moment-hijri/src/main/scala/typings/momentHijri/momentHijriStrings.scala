package typings.momentHijri

import typings.momentHijri.mod.momentAugmentingMod.IUnitOfTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object momentHijriStrings {
  @js.native
  sealed trait iMonth extends IUnitOfTime
  
  @js.native
  sealed trait iYear extends IUnitOfTime
  
  @scala.inline
  def iMonth: iMonth = "iMonth".asInstanceOf[iMonth]
  @scala.inline
  def iYear: iYear = "iYear".asInstanceOf[iYear]
}

