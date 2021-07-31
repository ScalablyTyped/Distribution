package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProjectTaskFields extends StObject
/**
  * Specifies the task fields that are available as a parameter for the {@link Office.Document | Document}.getTaskFieldAsync method.
  *
  * @remarks
  *
  * A ProjectTaskFields constant can be used as a parameter of the {@link Office.Document | Document}.getTaskFieldAsync method.
  *
  * For more information about working with fields in Project, see the
  * {@link https://support.office.com/article/Available-fields-reference-615a4563-1cc3-40f4-b66f-1b17e793a460 | Available fields} reference.
  * In Project Help, search for Available fields.
  */
@JSGlobal("Office.ProjectTaskFields")
@js.native
object ProjectTaskFields extends StObject {
  
  /**
    * Indicates whether the task is active.
    */
  @js.native
  sealed trait Active
    extends StObject
       with ProjectTaskFields
  
  /**
    * The current actual cost for the task.
    */
  @js.native
  sealed trait ActualCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The actual duration of the task, in minutes.
    */
  @js.native
  sealed trait ActualDuration
    extends StObject
       with ProjectTaskFields
  
  /**
    * The actual finish date of the task.
    */
  @js.native
  sealed trait ActualFinish
    extends StObject
       with ProjectTaskFields
  
  /**
    * The actual overtime cost for the task.
    */
  @js.native
  sealed trait ActualOvertimeCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The actual overtime work for the task, in minutes.
    */
  @js.native
  sealed trait ActualOvertimeWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The actual start date of the task.
    */
  @js.native
  sealed trait ActualStart
    extends StObject
       with ProjectTaskFields
  
  /**
    * The actual work for the task, in minutes.
    */
  @js.native
  sealed trait ActualWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline10BudgetCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline10BudgetWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline10Cost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline10Duration
    extends StObject
       with ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline10Finish
    extends StObject
       with ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline10FixedCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1,
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline10FixedCostAccrual
    extends StObject
       with ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline10Start
    extends StObject
       with ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline10Work
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline1BudgetCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline1BudgetWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline1Cost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline1Duration
    extends StObject
       with ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline1Finish
    extends StObject
       with ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline1FixedCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1,
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline1FixedCostAccrual
    extends StObject
       with ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline1Start
    extends StObject
       with ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline1Work
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline2BudgetCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline2BudgetWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline2Cost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline2Duration
    extends StObject
       with ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline2Finish
    extends StObject
       with ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline2FixedCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1,
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline2FixedCostAccrual
    extends StObject
       with ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline2Start
    extends StObject
       with ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline2Work
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline3BudgetCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline3BudgetWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline3Cost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline3Duration
    extends StObject
       with ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline3Finish
    extends StObject
       with ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline3FixedCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1,
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline3FixedCostAccrual
    extends StObject
       with ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline3Start
    extends StObject
       with ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline3Work
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline4BudgetCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline4BudgetWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline4Cost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline4Duration
    extends StObject
       with ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline4Finish
    extends StObject
       with ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline4FixedCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1,
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline4FixedCostAccrual
    extends StObject
       with ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline4Start
    extends StObject
       with ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline4Work
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline5BudgetCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline5BudgetWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline5Cost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline5Duration
    extends StObject
       with ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline5Finish
    extends StObject
       with ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline5FixedCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1,
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline5FixedCostAccrual
    extends StObject
       with ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline5Start
    extends StObject
       with ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline5Work
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline6BudgetCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline6BudgetWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline6Cost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline6Duration
    extends StObject
       with ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline6Finish
    extends StObject
       with ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline6FixedCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1,
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline6FixedCostAccrual
    extends StObject
       with ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline6Start
    extends StObject
       with ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline6Work
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline7BudgetCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline7BudgetWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline7Cost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline7Duration
    extends StObject
       with ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline7Finish
    extends StObject
       with ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline7FixedCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1,
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline7FixedCostAccrual
    extends StObject
       with ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline7Start
    extends StObject
       with ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline7Work
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline8BudgetCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline8BudgetWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline8Cost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline8Duration
    extends StObject
       with ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline8Finish
    extends StObject
       with ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline8FixedCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1,
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline8FixedCostAccrual
    extends StObject
       with ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline8Start
    extends StObject
       with ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline8Work
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline9BudgetCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline9BudgetWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline9Cost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline9Duration
    extends StObject
       with ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline9Finish
    extends StObject
       with ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline9FixedCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1,
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline9FixedCostAccrual
    extends StObject
       with ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline9Start
    extends StObject
       with ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline9Work
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait BaselineBudgetCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait BaselineBudgetWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait BaselineCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait BaselineDuration
    extends StObject
       with ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait BaselineFinish
    extends StObject
       with ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait BaselineFixedCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1,
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait BaselineFixedCostAccrual
    extends StObject
       with ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait BaselineStart
    extends StObject
       with ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait BaselineWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget cost for the task.
    */
  @js.native
  sealed trait BudgetCost
    extends StObject
       with ProjectTaskFields
  
  @js.native
  sealed trait BudgetFixedCost
    extends StObject
       with ProjectTaskFields
  
  @js.native
  sealed trait BudgetFixedWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The budget work for the task, in hours.
    */
  @js.native
  sealed trait BudgetWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * A constraint date for the task.
    */
  @js.native
  sealed trait ConstraintDate
    extends StObject
       with ProjectTaskFields
  
  /**
    * A constraint type for the task: As Soon As Possible = 0, As Late As Possible = 1, Must Start On = 2, Must Finish On = 3,
    * Start No Earlier Than = 4, Start No Later Than = 5, Finish No Earlier Than = 6, Finish No Later Than = 7.
    */
  @js.native
  sealed trait ConstraintType
    extends StObject
       with ProjectTaskFields
  
  /**
    * The total cost of the task.
    */
  @js.native
  sealed trait Cost
    extends StObject
       with ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost1
    extends StObject
       with ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost10
    extends StObject
       with ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost2
    extends StObject
       with ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost3
    extends StObject
       with ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost4
    extends StObject
       with ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost5
    extends StObject
       with ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost6
    extends StObject
       with ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost7
    extends StObject
       with ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost8
    extends StObject
       with ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost9
    extends StObject
       with ProjectTaskFields
  
  /**
    * Indicates whether the task is on the critical path.
    */
  @js.native
  sealed trait Critical
    extends StObject
       with ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date1
    extends StObject
       with ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date10
    extends StObject
       with ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date2
    extends StObject
       with ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date3
    extends StObject
       with ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date4
    extends StObject
       with ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date5
    extends StObject
       with ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date6
    extends StObject
       with ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date7
    extends StObject
       with ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date8
    extends StObject
       with ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date9
    extends StObject
       with ProjectTaskFields
  
  /**
    * The deadline for a task.
    */
  @js.native
  sealed trait Deadline
    extends StObject
       with ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration
    extends StObject
       with ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration1
    extends StObject
       with ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration10
    extends StObject
       with ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration2
    extends StObject
       with ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration3
    extends StObject
       with ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration4
    extends StObject
       with ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration5
    extends StObject
       with ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration6
    extends StObject
       with ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration7
    extends StObject
       with ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration8
    extends StObject
       with ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration9
    extends StObject
       with ProjectTaskFields
  
  /**
    * The method for calculating earned value for the task.
    */
  @js.native
  sealed trait EarnedValueMethod
    extends StObject
       with ProjectTaskFields
  
  /**
    * The finish date of the task.
    */
  @js.native
  sealed trait Finish
    extends StObject
       with ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish1
    extends StObject
       with ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish10
    extends StObject
       with ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish2
    extends StObject
       with ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish3
    extends StObject
       with ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish4
    extends StObject
       with ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish5
    extends StObject
       with ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish6
    extends StObject
       with ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish7
    extends StObject
       with ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish8
    extends StObject
       with ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish9
    extends StObject
       with ProjectTaskFields
  
  /**
    * The duration between the Early Finish and Late Finish dates for the task, in minutes.
    */
  @js.native
  sealed trait FinishSlack
    extends StObject
       with ProjectTaskFields
  
  /**
    * The fixed cost for the task.
    */
  @js.native
  sealed trait FixedCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1,
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait FixedCostAccrual
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag1
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag10
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag11
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag12
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag13
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag14
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag15
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag16
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag17
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag18
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag19
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag2
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag20
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag3
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag4
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag5
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag6
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag7
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag8
    extends StObject
       with ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag9
    extends StObject
       with ProjectTaskFields
  
  /**
    * The amount of time that the task can be delayed without delaying its successor tasks.
    */
  @js.native
  sealed trait FreeSlack
    extends StObject
       with ProjectTaskFields
  
  /**
    * Indicates whether the task has rollup subtasks.
    */
  @js.native
  sealed trait HasRollupSubTasks
    extends StObject
       with ProjectTaskFields
  
  /**
    * The index of the selected task. After the project summary task, the index of the first task in a project is 1.
    */
  @js.native
  sealed trait ID
    extends StObject
       with ProjectTaskFields
  
  /**
    * Indicates whether subtask information is rolled up to the summary task bar.
    */
  @js.native
  sealed trait IsRollup
    extends StObject
       with ProjectTaskFields
  
  /**
    * Indicates whether the task is a milestone.
    */
  @js.native
  sealed trait Milestone
    extends StObject
       with ProjectTaskFields
  
  /**
    * The name of the task.
    */
  @js.native
  sealed trait Name
    extends StObject
       with ProjectTaskFields
  
  /**
    * The text value of the notes regarding the task.
    */
  @js.native
  sealed trait Notes
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number1
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number10
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number11
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number12
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number13
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number14
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number15
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number16
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number17
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number18
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number19
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number2
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number20
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number3
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number4
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number5
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number6
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number7
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number8
    extends StObject
       with ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number9
    extends StObject
       with ProjectTaskFields
  
  /**
    * The level of the task in the outline hierarchy.
    */
  @js.native
  sealed trait OutlineLevel
    extends StObject
       with ProjectTaskFields
  
  /**
    * Indicates whether any assignments for a task are overallocated.
    */
  @js.native
  sealed trait Overallocated
    extends StObject
       with ProjectTaskFields
  
  /**
    * The overtime cost for the task.
    */
  @js.native
  sealed trait OvertimeCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The overtime work for the task.
    */
  @js.native
  sealed trait OvertimeWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The percent complete status of the task.
    */
  @js.native
  sealed trait PercentComplete
    extends StObject
       with ProjectTaskFields
  
  /**
    * The percentage of work completed for the task.
    */
  @js.native
  sealed trait PercentWorkComplete
    extends StObject
       with ProjectTaskFields
  
  /**
    * The IDs of the task's predecessors.
    */
  @js.native
  sealed trait Predecessors
    extends StObject
       with ProjectTaskFields
  
  /**
    * The finish date of a task before leveling occurred.
    */
  @js.native
  sealed trait PreleveledFinish
    extends StObject
       with ProjectTaskFields
  
  /**
    * The start date of a task before leveling occurred.
    */
  @js.native
  sealed trait PreleveledStart
    extends StObject
       with ProjectTaskFields
  
  /**
    * The priority of the task, with values from 0 (low) to 1000 (high). The default priority value is 500.
    */
  @js.native
  sealed trait Priority
    extends StObject
       with ProjectTaskFields
  
  /**
    * The amount of regular work for the task.
    */
  @js.native
  sealed trait RegularWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The remaining cost for the task.
    */
  @js.native
  sealed trait RemainingCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The remaining duration for the task, in minutes.
    */
  @js.native
  sealed trait RemainingDuration
    extends StObject
       with ProjectTaskFields
  
  /**
    * The remaining overtime cost for the task.
    */
  @js.native
  sealed trait RemainingOvertimeCost
    extends StObject
       with ProjectTaskFields
  
  /**
    * The remaining work for the task, in minutes.
    */
  @js.native
  sealed trait RemainingWork
    extends StObject
       with ProjectTaskFields
  
  /**
    * The names of the resources assigned to a task.
    */
  @js.native
  sealed trait ResourceNames
    extends StObject
       with ProjectTaskFields
  
  /**
    * The scheduled (as opposed to actual) duration of the task.
    */
  @js.native
  sealed trait ScheduledDuration
    extends StObject
       with ProjectTaskFields
  
  /**
    * The scheduled (as opposed to actual) finish date of the task.
    */
  @js.native
  sealed trait ScheduledFinish
    extends StObject
       with ProjectTaskFields
  
  /**
    * The scheduled (as opposed to actual) start date of the task.
    */
  @js.native
  sealed trait ScheduledStart
    extends StObject
       with ProjectTaskFields
  
  /**
    * The start date of the task.
    */
  @js.native
  sealed trait Start
    extends StObject
       with ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start1
    extends StObject
       with ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start10
    extends StObject
       with ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start2
    extends StObject
       with ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start3
    extends StObject
       with ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start4
    extends StObject
       with ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start5
    extends StObject
       with ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start6
    extends StObject
       with ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start7
    extends StObject
       with ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start8
    extends StObject
       with ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start9
    extends StObject
       with ProjectTaskFields
  
  /**
    * The duration between the Early Start and Late Start dates for the task.
    */
  @js.native
  sealed trait StartSlack
    extends StObject
       with ProjectTaskFields
  
  /**
    * The status of the task: Complete = 0, on schedule = 1, late = 2, future task = 3, status not available = 4.
    */
  @js.native
  sealed trait Status
    extends StObject
       with ProjectTaskFields
  
  /**
    * The enterprise resource responsible for accepting or rejecting assignment progress updates for the task.
    */
  @js.native
  sealed trait StatusManager
    extends StObject
       with ProjectTaskFields
  
  /**
    * The IDs of the task's successors.
    */
  @js.native
  sealed trait Successors
    extends StObject
       with ProjectTaskFields
  
  /**
    * Indicates whether the task is a summary task.
    */
  @js.native
  sealed trait Summary
    extends StObject
       with ProjectTaskFields
  
  /**
    * The GUID of the task calendar.
    */
  @js.native
  sealed trait TaskCalendarGUID
    extends StObject
       with ProjectTaskFields
  
  /**
    * The GUID of the task.
    */
  @js.native
  sealed trait TaskGUID
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text1
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text10
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text11
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text12
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text13
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text14
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text15
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text16
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text17
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text18
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text19
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text2
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text20
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text21
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text22
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text23
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text24
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text25
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text26
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text27
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text28
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text29
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text3
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text30
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text4
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text5
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text6
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text7
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text8
    extends StObject
       with ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text9
    extends StObject
       with ProjectTaskFields
  
  /**
    * The total slack time for the task, in minutes.
    */
  @js.native
  sealed trait TotalSlack
    extends StObject
       with ProjectTaskFields
  
  /**
    * The way the task is calculated: Fixed units = 0, fixed duration = 1, fixed work = 2.
    */
  @js.native
  sealed trait Type
    extends StObject
       with ProjectTaskFields
  
  /**
    * The work breakdown structure code of the task.
    */
  @js.native
  sealed trait WBS
    extends StObject
       with ProjectTaskFields
  
  /**
    * The work breakdown structure codes of the task predecessors, separated by the list separator.
    */
  @js.native
  sealed trait WBSPREDECESSORS
    extends StObject
       with ProjectTaskFields
  
  /**
    * The work breakdown structure codes of the task successors, separated by the list separator.
    */
  @js.native
  sealed trait WBSSUCCESSORS
    extends StObject
       with ProjectTaskFields
  
  /**
    * The ID of the task in a SharePoint list, for a project that is synchronized with a SharePoint tasks list.
    */
  @js.native
  sealed trait WSSID
    extends StObject
       with ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the task, in minutes.
    */
  @js.native
  sealed trait Work
    extends StObject
       with ProjectTaskFields
}
