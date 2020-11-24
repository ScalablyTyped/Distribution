package typings.momentJalaali.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Moment extends js.Object {
  
  def add(amount: String, jUnitOfTime: JUnitOfTime): Moment = js.native
  def add(amount: Double, jUnitOfTime: JUnitOfTime): Moment = js.native
  
  def endOf(jUnitOfTime: JUnitOfTime): Moment = js.native
  
  def jDate(): Double = js.native
  def jDate(d: Double): Moment = js.native
  
  def jDayOfYear(): Double = js.native
  def jDayOfYear(d: Double): Moment = js.native
  
  def jMonth(): Double = js.native
  def jMonth(M: String): Moment = js.native
  def jMonth(M: Double): Moment = js.native
  
  def jWeek(): Double = js.native
  def jWeek(d: Double): Moment = js.native
  
  def jWeekYear(): Double = js.native
  def jWeekYear(d: Double): Moment = js.native
  
  def jYear(): Double = js.native
  def jYear(y: Double): Moment = js.native
  
  def startOf(jUnitOfTime: JUnitOfTime): Moment = js.native
  
  def subtract(amount: String, jUnitOfTime: JUnitOfTime): Moment = js.native
  def subtract(amount: Double, jUnitOfTime: JUnitOfTime): Moment = js.native
}
