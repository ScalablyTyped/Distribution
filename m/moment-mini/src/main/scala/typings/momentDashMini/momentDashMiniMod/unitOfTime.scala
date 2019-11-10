package typings.momentDashMini.momentDashMiniMod

import typings.momentDashMini.momentDashMiniMod.unitOfTime.All
import typings.momentDashMini.momentDashMiniMod.unitOfTime.Base
import typings.momentDashMini.momentDashMiniMod.unitOfTime.Diff
import typings.momentDashMini.momentDashMiniMod.unitOfTime.DurationConstructor
import typings.momentDashMini.momentDashMiniMod.unitOfTime.MomentConstructor
import typings.momentDashMini.momentDashMiniMod.unitOfTime.StartOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-mini", "unitOfTime")
@js.native
object unitOfTime extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.momentDashMini.momentDashMiniMod.unitOfTime.Base
    - typings.momentDashMini.momentDashMiniMod.unitOfTime._quarter
    - typings.momentDashMini.momentDashMiniMod.unitOfTime._isoWeek
    - typings.momentDashMini.momentDashMiniMod.unitOfTime._date
    - typings.momentDashMini.momentDashMiniStrings.weekYear
    - typings.momentDashMini.momentDashMiniStrings.weekYears
    - typings.momentDashMini.momentDashMiniStrings.gg
    - typings.momentDashMini.momentDashMiniStrings.isoWeekYear
    - typings.momentDashMini.momentDashMiniStrings.isoWeekYears
    - typings.momentDashMini.momentDashMiniStrings.GG
    - typings.momentDashMini.momentDashMiniStrings.dayOfYear
    - typings.momentDashMini.momentDashMiniStrings.dayOfYears
    - typings.momentDashMini.momentDashMiniStrings.DDD
    - typings.momentDashMini.momentDashMiniStrings.weekday
    - typings.momentDashMini.momentDashMiniStrings.weekdays
    - typings.momentDashMini.momentDashMiniStrings.e
    - typings.momentDashMini.momentDashMiniStrings.isoWeekday
    - typings.momentDashMini.momentDashMiniStrings.isoWeekdays
    - typings.momentDashMini.momentDashMiniStrings.E
  */
  trait All extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.momentDashMini.momentDashMiniStrings.year
    - typings.momentDashMini.momentDashMiniStrings.years
    - typings.momentDashMini.momentDashMiniStrings.y
    - typings.momentDashMini.momentDashMiniStrings.month
    - typings.momentDashMini.momentDashMiniStrings.months
    - typings.momentDashMini.momentDashMiniStrings.M
    - typings.momentDashMini.momentDashMiniStrings.week
    - typings.momentDashMini.momentDashMiniStrings.weeks
    - typings.momentDashMini.momentDashMiniStrings.w
    - typings.momentDashMini.momentDashMiniStrings.day
    - typings.momentDashMini.momentDashMiniStrings.days
    - typings.momentDashMini.momentDashMiniStrings.d
    - typings.momentDashMini.momentDashMiniStrings.hour
    - typings.momentDashMini.momentDashMiniStrings.hours
    - typings.momentDashMini.momentDashMiniStrings.h
    - typings.momentDashMini.momentDashMiniStrings.minute
    - typings.momentDashMini.momentDashMiniStrings.minutes
    - typings.momentDashMini.momentDashMiniStrings.m
    - typings.momentDashMini.momentDashMiniStrings.second
    - typings.momentDashMini.momentDashMiniStrings.seconds
    - typings.momentDashMini.momentDashMiniStrings.s
    - typings.momentDashMini.momentDashMiniStrings.millisecond
    - typings.momentDashMini.momentDashMiniStrings.milliseconds
    - typings.momentDashMini.momentDashMiniStrings.ms
  */
  trait Base
    extends All
       with Diff
       with DurationConstructor
       with MomentConstructor
       with StartOf
  
  /* Rewritten from type alias, can be one of: 
    - typings.momentDashMini.momentDashMiniMod.unitOfTime.Base
    - typings.momentDashMini.momentDashMiniMod.unitOfTime._quarter
  */
  trait Diff extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.momentDashMini.momentDashMiniMod.unitOfTime.Base
    - typings.momentDashMini.momentDashMiniMod.unitOfTime._quarter
  */
  trait DurationConstructor extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.momentDashMini.momentDashMiniMod.unitOfTime.Base
    - typings.momentDashMini.momentDashMiniMod.unitOfTime._date
  */
  trait MomentConstructor extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.momentDashMini.momentDashMiniMod.unitOfTime.Base
    - typings.momentDashMini.momentDashMiniMod.unitOfTime._quarter
    - typings.momentDashMini.momentDashMiniMod.unitOfTime._isoWeek
    - typings.momentDashMini.momentDashMiniMod.unitOfTime._date
  */
  trait StartOf extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.momentDashMini.momentDashMiniStrings.date
    - typings.momentDashMini.momentDashMiniStrings.dates
    - typings.momentDashMini.momentDashMiniStrings.D
  */
  trait _date
    extends All
       with MomentConstructor
       with StartOf
  
  /* Rewritten from type alias, can be one of: 
    - typings.momentDashMini.momentDashMiniStrings.isoWeek
    - typings.momentDashMini.momentDashMiniStrings.isoWeeks
    - typings.momentDashMini.momentDashMiniStrings.W
  */
  trait _isoWeek
    extends All
       with StartOf
  
  /* Rewritten from type alias, can be one of: 
    - typings.momentDashMini.momentDashMiniStrings.quarter
    - typings.momentDashMini.momentDashMiniStrings.quarters
    - typings.momentDashMini.momentDashMiniStrings.Q
  */
  trait _quarter
    extends All
       with Diff
       with DurationConstructor
       with StartOf
  
  type DurationAs = Base
}

