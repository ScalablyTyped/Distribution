package typings.momentDashHijri

import typings.momentDashHijri.momentDashHijriMod.momentMod.IUnitOfTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object momentDashHijriStrings {
  @js.native
  sealed trait iMonth extends IUnitOfTime
  
  @js.native
  sealed trait iYear extends IUnitOfTime
  
  @scala.inline
  def iMonth: iMonth = "iMonth".asInstanceOf[iMonth]
  @scala.inline
  def iYear: iYear = "iYear".asInstanceOf[iYear]
}

