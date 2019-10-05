package typings.moment.momentMod

import typings.moment.momentMod.unitOfTime.All
import typings.moment.momentMod.unitOfTime.Base
import typings.moment.momentMod.unitOfTime.Diff
import typings.moment.momentMod.unitOfTime.DurationConstructor
import typings.moment.momentMod.unitOfTime.MomentConstructor
import typings.moment.momentMod.unitOfTime._StartOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment", "unitOfTime")
@js.native
object unitOfTime extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentMod.unitOfTime.Base
    - typings.moment.momentMod.unitOfTime._quarter
    - typings.moment.momentMod.unitOfTime._isoWeek
    - typings.moment.momentMod.unitOfTime._date
    - typings.moment.momentStrings.weekYear
    - typings.moment.momentStrings.weekYears
    - typings.moment.momentStrings.gg
    - typings.moment.momentStrings.isoWeekYear
    - typings.moment.momentStrings.isoWeekYears
    - typings.moment.momentStrings.GG
    - typings.moment.momentStrings.dayOfYear
    - typings.moment.momentStrings.dayOfYears
    - typings.moment.momentStrings.DDD
    - typings.moment.momentStrings.weekday
    - typings.moment.momentStrings.weekdays
    - typings.moment.momentStrings.e
    - typings.moment.momentStrings.isoWeekday
    - typings.moment.momentStrings.isoWeekdays
    - typings.moment.momentStrings.E
  */
  trait All extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentStrings.year
    - typings.moment.momentStrings.years
    - typings.moment.momentStrings.y
    - typings.moment.momentStrings.month
    - typings.moment.momentStrings.months
    - typings.moment.momentStrings.M
    - typings.moment.momentStrings.week
    - typings.moment.momentStrings.weeks
    - typings.moment.momentStrings.w
    - typings.moment.momentStrings.day
    - typings.moment.momentStrings.days
    - typings.moment.momentStrings.d
    - typings.moment.momentStrings.hour
    - typings.moment.momentStrings.hours
    - typings.moment.momentStrings.h
    - typings.moment.momentStrings.minute
    - typings.moment.momentStrings.minutes
    - typings.moment.momentStrings.m
    - typings.moment.momentStrings.second
    - typings.moment.momentStrings.seconds
    - typings.moment.momentStrings.s
    - typings.moment.momentStrings.millisecond
    - typings.moment.momentStrings.milliseconds
    - typings.moment.momentStrings.ms
  */
  trait Base
    extends All
       with Diff
       with DurationConstructor
       with MomentConstructor
       with _StartOf
  
  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentMod.unitOfTime.Base
    - typings.moment.momentMod.unitOfTime._quarter
  */
  trait Diff extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentMod.unitOfTime.Base
    - typings.moment.momentMod.unitOfTime._quarter
  */
  trait DurationConstructor extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentMod.unitOfTime.Base
    - typings.moment.momentMod.unitOfTime._date
  */
  trait MomentConstructor extends js.Object
  
  trait _StartOf extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentStrings.date
    - typings.moment.momentStrings.dates
    - typings.moment.momentStrings.D
  */
  trait _date
    extends All
       with MomentConstructor
       with _StartOf
  
  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentStrings.isoWeek
    - typings.moment.momentStrings.isoWeeks
    - typings.moment.momentStrings.W
  */
  trait _isoWeek
    extends All
       with _StartOf
  
  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentStrings.quarter
    - typings.moment.momentStrings.quarters
    - typings.moment.momentStrings.Q
  */
  trait _quarter
    extends All
       with Diff
       with DurationConstructor
       with _StartOf
  
  type DurationAs = Base
  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentMod.unitOfTime.Base
    - typings.moment.momentMod.unitOfTime._quarter
    - typings.moment.momentMod.unitOfTime._isoWeek
    - typings.moment.momentMod.unitOfTime._date
    - scala.Unit
  */
  type StartOf = _StartOf | Unit
}

