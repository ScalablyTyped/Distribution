package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectTaskFields extends js.Object

/**
  * Specifies the task fields that are available as a parameter for the {@link Office.Document | Document}.getTaskFieldAsync method.
  *
  * @remarks
  * A ProjectTaskFields constant can be used as a parameter of the {@link Office.Document | Document}.getTaskFieldAsync method.
  *
  * For more information about working with fields in Project, see the 
  * {@link https://support.office.com/article/Available-fields-reference-615a4563-1cc3-40f4-b66f-1b17e793a460 | Available fields} reference. 
  * In Project Help, search for Available fields.
  */
@JSGlobal("Office.ProjectTaskFields")
@js.native
object ProjectTaskFields extends js.Object {
  /**
    * Indicates whether the task is active.
    */
  @js.native
  sealed trait Active
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The current actual cost for the task.
    */
  @js.native
  sealed trait ActualCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The actual duration of the task, in minutes.
    */
  @js.native
  sealed trait ActualDuration
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The actual finish date of the task.
    */
  @js.native
  sealed trait ActualFinish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The actual overtime cost for the task.
    */
  @js.native
  sealed trait ActualOvertimeCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The actual overtime work for the task, in minutes.
    */
  @js.native
  sealed trait ActualOvertimeWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The actual start date of the task.
    */
  @js.native
  sealed trait ActualStart
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The actual work for the task, in minutes.
    */
  @js.native
  sealed trait ActualWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline10BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline10BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline10Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline10Duration
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline10Finish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline10FixedCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline10FixedCostAccrual
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline10Start
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline10Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline1BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline1BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline1Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline1Duration
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline1Finish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline1FixedCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline1FixedCostAccrual
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline1Start
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline1Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline2BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline2BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline2Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline2Duration
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline2Finish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline2FixedCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline2FixedCostAccrual
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline2Start
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline2Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline3BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline3BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline3Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline3Duration
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline3Finish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline3FixedCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline3FixedCostAccrual
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline3Start
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline3Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline4BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline4BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline4Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline4Duration
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline4Finish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline4FixedCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline4FixedCostAccrual
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline4Start
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline4Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline5BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline5BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline5Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline5Duration
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline5Finish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline5FixedCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline5FixedCostAccrual
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline5Start
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline5Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline6BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline6BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline6Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline6Duration
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline6Finish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline6FixedCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline6FixedCostAccrual
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline6Start
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline6Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline7BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline7BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline7Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline7Duration
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline7Finish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline7FixedCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline7FixedCostAccrual
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline7Start
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline7Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline8BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline8BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline8Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline8Duration
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline8Finish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline8FixedCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline8FixedCostAccrual
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline8Start
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline8Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline9BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline9BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline9Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline9Duration
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline9Finish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline9FixedCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline9FixedCostAccrual
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline9Start
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline9Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait BaselineBudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait BaselineBudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait BaselineCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait BaselineDuration
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait BaselineFinish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait BaselineFixedCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait BaselineFixedCostAccrual
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait BaselineStart
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait BaselineWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget cost for the task.
    */
  @js.native
  sealed trait BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  @js.native
  sealed trait BudgetFixedCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  @js.native
  sealed trait BudgetFixedWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The budget work for the task, in hours.
    */
  @js.native
  sealed trait BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A constraint date for the task.
    */
  @js.native
  sealed trait ConstraintDate
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A constraint type for the task: As Soon As Possible = 0, As Late As Possible = 1, Must Start On = 2, Must Finish On = 3, 
    * Start No Earlier Than = 4, Start No Later Than = 5, Finish No Earlier Than = 6, Finish No Later Than = 7.
    */
  @js.native
  sealed trait ConstraintType
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The total cost of the task.
    */
  @js.native
  sealed trait Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * Indicates whether the task is on the critical path.
    */
  @js.native
  sealed trait Critical
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The deadline for a task.
    */
  @js.native
  sealed trait Deadline
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The method for calculating earned value for the task.
    */
  @js.native
  sealed trait EarnedValueMethod
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The finish date of the task.
    */
  @js.native
  sealed trait Finish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The duration between the Early Finish and Late Finish dates for the task, in minutes.
    */
  @js.native
  sealed trait FinishSlack
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The fixed cost for the task.
    */
  @js.native
  sealed trait FixedCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait FixedCostAccrual
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag11
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag12
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag13
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag14
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag15
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag16
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag17
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag18
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag19
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag20
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The amount of time that the task can be delayed without delaying its successor tasks.
    */
  @js.native
  sealed trait FreeSlack
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * Indicates whether the task has rollup subtasks.
    */
  @js.native
  sealed trait HasRollupSubTasks
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The index of the selected task. After the project summary task, the index of the first task in a project is 1.
    */
  @js.native
  sealed trait ID
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * Indicates whether subtask information is rolled up to the summary task bar.
    */
  @js.native
  sealed trait IsRollup
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * Indicates whether the task is a milestone.
    */
  @js.native
  sealed trait Milestone
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The name of the task.
    */
  @js.native
  sealed trait Name
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The text value of the notes regarding the task.
    */
  @js.native
  sealed trait Notes
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number11
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number12
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number13
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number14
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number15
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number16
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number17
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number18
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number19
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number20
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The level of the task in the outline hierarchy.
    */
  @js.native
  sealed trait OutlineLevel
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * Indicates whether any assignments for a task are overallocated.
    */
  @js.native
  sealed trait Overallocated
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The overtime cost for the task.
    */
  @js.native
  sealed trait OvertimeCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The overtime work for the task.
    */
  @js.native
  sealed trait OvertimeWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The percent complete status of the task.
    */
  @js.native
  sealed trait PercentComplete
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The percentage of work completed for the task.
    */
  @js.native
  sealed trait PercentWorkComplete
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The IDs of the task's predecessors.
    */
  @js.native
  sealed trait Predecessors
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The finish date of a task before leveling occurred.
    */
  @js.native
  sealed trait PreleveledFinish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The start date of a task before leveling occurred.
    */
  @js.native
  sealed trait PreleveledStart
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The priority of the task, with values from 0 (low) to 1000 (high). The default priority value is 500.
    */
  @js.native
  sealed trait Priority
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The amount of regular work for the task.
    */
  @js.native
  sealed trait RegularWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The remaining cost for the task.
    */
  @js.native
  sealed trait RemainingCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The remaining duration for the task, in minutes.
    */
  @js.native
  sealed trait RemainingDuration
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The remaining overtime cost for the task.
    */
  @js.native
  sealed trait RemainingOvertimeCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The remaining work for the task, in minutes.
    */
  @js.native
  sealed trait RemainingWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The names of the resources assigned to a task.
    */
  @js.native
  sealed trait ResourceNames
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The scheduled (as opposed to actual) duration of the task.
    */
  @js.native
  sealed trait ScheduledDuration
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The scheduled (as opposed to actual) finish date of the task.
    */
  @js.native
  sealed trait ScheduledFinish
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The scheduled (as opposed to actual) start date of the task.
    */
  @js.native
  sealed trait ScheduledStart
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The start date of the task.
    */
  @js.native
  sealed trait Start
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The duration between the Early Start and Late Start dates for the task.
    */
  @js.native
  sealed trait StartSlack
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The status of the task: Complete = 0, on schedule = 1, late = 2, future task = 3, status not available = 4.
    */
  @js.native
  sealed trait Status
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The enterprise resource responsible for accepting or rejecting assignment progress updates for the task.
    */
  @js.native
  sealed trait StatusManager
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The IDs of the task's successors.
    */
  @js.native
  sealed trait Successors
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * Indicates whether the task is a summary task.
    */
  @js.native
  sealed trait Summary
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The GUID of the task calendar.
    */
  @js.native
  sealed trait TaskCalendarGUID
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The GUID of the task.
    */
  @js.native
  sealed trait TaskGUID
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text11
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text12
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text13
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text14
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text15
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text16
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text17
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text18
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text19
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text20
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text21
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text22
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text23
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text24
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text25
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text26
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text27
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text28
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text29
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text30
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The total slack time for the task, in minutes.
    */
  @js.native
  sealed trait TotalSlack
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The way the task is calculated: Fixed units = 0, fixed duration = 1, fixed work = 2.
    */
  @js.native
  sealed trait Type
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The work breakdown structure code of the task.
    */
  @js.native
  sealed trait WBS
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The work breakdown structure codes of the task predecessors, separated by the list separator.
    */
  @js.native
  sealed trait WBSPREDECESSORS
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The work breakdown structure codes of the task successors, separated by the list separator.
    */
  @js.native
  sealed trait WBSSUCCESSORS
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The ID of the task in a SharePoint list, for a project that is synchronized with a SharePoint tasks list.
    */
  @js.native
  sealed trait WSSID
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the task, in minutes.
    */
  @js.native
  sealed trait Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields
  
  /* 256 */ val Active: Active with scala.Double = js.native
  /* 0 */ val ActualCost: ActualCost with scala.Double = js.native
  /* 1 */ val ActualDuration: ActualDuration with scala.Double = js.native
  /* 2 */ val ActualFinish: ActualFinish with scala.Double = js.native
  /* 3 */ val ActualOvertimeCost: ActualOvertimeCost with scala.Double = js.native
  /* 4 */ val ActualOvertimeWork: ActualOvertimeWork with scala.Double = js.native
  /* 5 */ val ActualStart: ActualStart with scala.Double = js.native
  /* 6 */ val ActualWork: ActualWork with scala.Double = js.native
  /* 57 */ val Baseline10BudgetCost: Baseline10BudgetCost with scala.Double = js.native
  /* 58 */ val Baseline10BudgetWork: Baseline10BudgetWork with scala.Double = js.native
  /* 59 */ val Baseline10Cost: Baseline10Cost with scala.Double = js.native
  /* 60 */ val Baseline10Duration: Baseline10Duration with scala.Double = js.native
  /* 61 */ val Baseline10Finish: Baseline10Finish with scala.Double = js.native
  /* 62 */ val Baseline10FixedCost: Baseline10FixedCost with scala.Double = js.native
  /* 63 */ val Baseline10FixedCostAccrual: Baseline10FixedCostAccrual with scala.Double = js.native
  /* 64 */ val Baseline10Start: Baseline10Start with scala.Double = js.native
  /* 65 */ val Baseline10Work: Baseline10Work with scala.Double = js.native
  /* 66 */ val Baseline1BudgetCost: Baseline1BudgetCost with scala.Double = js.native
  /* 67 */ val Baseline1BudgetWork: Baseline1BudgetWork with scala.Double = js.native
  /* 68 */ val Baseline1Cost: Baseline1Cost with scala.Double = js.native
  /* 69 */ val Baseline1Duration: Baseline1Duration with scala.Double = js.native
  /* 70 */ val Baseline1Finish: Baseline1Finish with scala.Double = js.native
  /* 71 */ val Baseline1FixedCost: Baseline1FixedCost with scala.Double = js.native
  /* 72 */ val Baseline1FixedCostAccrual: Baseline1FixedCostAccrual with scala.Double = js.native
  /* 73 */ val Baseline1Start: Baseline1Start with scala.Double = js.native
  /* 74 */ val Baseline1Work: Baseline1Work with scala.Double = js.native
  /* 75 */ val Baseline2BudgetCost: Baseline2BudgetCost with scala.Double = js.native
  /* 76 */ val Baseline2BudgetWork: Baseline2BudgetWork with scala.Double = js.native
  /* 77 */ val Baseline2Cost: Baseline2Cost with scala.Double = js.native
  /* 78 */ val Baseline2Duration: Baseline2Duration with scala.Double = js.native
  /* 79 */ val Baseline2Finish: Baseline2Finish with scala.Double = js.native
  /* 80 */ val Baseline2FixedCost: Baseline2FixedCost with scala.Double = js.native
  /* 81 */ val Baseline2FixedCostAccrual: Baseline2FixedCostAccrual with scala.Double = js.native
  /* 82 */ val Baseline2Start: Baseline2Start with scala.Double = js.native
  /* 83 */ val Baseline2Work: Baseline2Work with scala.Double = js.native
  /* 84 */ val Baseline3BudgetCost: Baseline3BudgetCost with scala.Double = js.native
  /* 85 */ val Baseline3BudgetWork: Baseline3BudgetWork with scala.Double = js.native
  /* 86 */ val Baseline3Cost: Baseline3Cost with scala.Double = js.native
  /* 87 */ val Baseline3Duration: Baseline3Duration with scala.Double = js.native
  /* 88 */ val Baseline3Finish: Baseline3Finish with scala.Double = js.native
  /* 89 */ val Baseline3FixedCost: Baseline3FixedCost with scala.Double = js.native
  /* 90 */ val Baseline3FixedCostAccrual: Baseline3FixedCostAccrual with scala.Double = js.native
  /* 91 */ val Baseline3Start: Baseline3Start with scala.Double = js.native
  /* 92 */ val Baseline3Work: Baseline3Work with scala.Double = js.native
  /* 93 */ val Baseline4BudgetCost: Baseline4BudgetCost with scala.Double = js.native
  /* 94 */ val Baseline4BudgetWork: Baseline4BudgetWork with scala.Double = js.native
  /* 95 */ val Baseline4Cost: Baseline4Cost with scala.Double = js.native
  /* 96 */ val Baseline4Duration: Baseline4Duration with scala.Double = js.native
  /* 97 */ val Baseline4Finish: Baseline4Finish with scala.Double = js.native
  /* 98 */ val Baseline4FixedCost: Baseline4FixedCost with scala.Double = js.native
  /* 99 */ val Baseline4FixedCostAccrual: Baseline4FixedCostAccrual with scala.Double = js.native
  /* 100 */ val Baseline4Start: Baseline4Start with scala.Double = js.native
  /* 101 */ val Baseline4Work: Baseline4Work with scala.Double = js.native
  /* 102 */ val Baseline5BudgetCost: Baseline5BudgetCost with scala.Double = js.native
  /* 103 */ val Baseline5BudgetWork: Baseline5BudgetWork with scala.Double = js.native
  /* 104 */ val Baseline5Cost: Baseline5Cost with scala.Double = js.native
  /* 105 */ val Baseline5Duration: Baseline5Duration with scala.Double = js.native
  /* 106 */ val Baseline5Finish: Baseline5Finish with scala.Double = js.native
  /* 107 */ val Baseline5FixedCost: Baseline5FixedCost with scala.Double = js.native
  /* 108 */ val Baseline5FixedCostAccrual: Baseline5FixedCostAccrual with scala.Double = js.native
  /* 109 */ val Baseline5Start: Baseline5Start with scala.Double = js.native
  /* 110 */ val Baseline5Work: Baseline5Work with scala.Double = js.native
  /* 111 */ val Baseline6BudgetCost: Baseline6BudgetCost with scala.Double = js.native
  /* 112 */ val Baseline6BudgetWork: Baseline6BudgetWork with scala.Double = js.native
  /* 113 */ val Baseline6Cost: Baseline6Cost with scala.Double = js.native
  /* 114 */ val Baseline6Duration: Baseline6Duration with scala.Double = js.native
  /* 115 */ val Baseline6Finish: Baseline6Finish with scala.Double = js.native
  /* 116 */ val Baseline6FixedCost: Baseline6FixedCost with scala.Double = js.native
  /* 117 */ val Baseline6FixedCostAccrual: Baseline6FixedCostAccrual with scala.Double = js.native
  /* 118 */ val Baseline6Start: Baseline6Start with scala.Double = js.native
  /* 119 */ val Baseline6Work: Baseline6Work with scala.Double = js.native
  /* 120 */ val Baseline7BudgetCost: Baseline7BudgetCost with scala.Double = js.native
  /* 121 */ val Baseline7BudgetWork: Baseline7BudgetWork with scala.Double = js.native
  /* 122 */ val Baseline7Cost: Baseline7Cost with scala.Double = js.native
  /* 123 */ val Baseline7Duration: Baseline7Duration with scala.Double = js.native
  /* 124 */ val Baseline7Finish: Baseline7Finish with scala.Double = js.native
  /* 125 */ val Baseline7FixedCost: Baseline7FixedCost with scala.Double = js.native
  /* 126 */ val Baseline7FixedCostAccrual: Baseline7FixedCostAccrual with scala.Double = js.native
  /* 127 */ val Baseline7Start: Baseline7Start with scala.Double = js.native
  /* 128 */ val Baseline7Work: Baseline7Work with scala.Double = js.native
  /* 129 */ val Baseline8BudgetCost: Baseline8BudgetCost with scala.Double = js.native
  /* 130 */ val Baseline8BudgetWork: Baseline8BudgetWork with scala.Double = js.native
  /* 131 */ val Baseline8Cost: Baseline8Cost with scala.Double = js.native
  /* 132 */ val Baseline8Duration: Baseline8Duration with scala.Double = js.native
  /* 133 */ val Baseline8Finish: Baseline8Finish with scala.Double = js.native
  /* 134 */ val Baseline8FixedCost: Baseline8FixedCost with scala.Double = js.native
  /* 135 */ val Baseline8FixedCostAccrual: Baseline8FixedCostAccrual with scala.Double = js.native
  /* 136 */ val Baseline8Start: Baseline8Start with scala.Double = js.native
  /* 137 */ val Baseline8Work: Baseline8Work with scala.Double = js.native
  /* 138 */ val Baseline9BudgetCost: Baseline9BudgetCost with scala.Double = js.native
  /* 139 */ val Baseline9BudgetWork: Baseline9BudgetWork with scala.Double = js.native
  /* 140 */ val Baseline9Cost: Baseline9Cost with scala.Double = js.native
  /* 141 */ val Baseline9Duration: Baseline9Duration with scala.Double = js.native
  /* 142 */ val Baseline9Finish: Baseline9Finish with scala.Double = js.native
  /* 143 */ val Baseline9FixedCost: Baseline9FixedCost with scala.Double = js.native
  /* 144 */ val Baseline9FixedCostAccrual: Baseline9FixedCostAccrual with scala.Double = js.native
  /* 145 */ val Baseline9Start: Baseline9Start with scala.Double = js.native
  /* 146 */ val Baseline9Work: Baseline9Work with scala.Double = js.native
  /* 147 */ val BaselineBudgetCost: BaselineBudgetCost with scala.Double = js.native
  /* 148 */ val BaselineBudgetWork: BaselineBudgetWork with scala.Double = js.native
  /* 149 */ val BaselineCost: BaselineCost with scala.Double = js.native
  /* 150 */ val BaselineDuration: BaselineDuration with scala.Double = js.native
  /* 151 */ val BaselineFinish: BaselineFinish with scala.Double = js.native
  /* 152 */ val BaselineFixedCost: BaselineFixedCost with scala.Double = js.native
  /* 153 */ val BaselineFixedCostAccrual: BaselineFixedCostAccrual with scala.Double = js.native
  /* 154 */ val BaselineStart: BaselineStart with scala.Double = js.native
  /* 155 */ val BaselineWork: BaselineWork with scala.Double = js.native
  /* 156 */ val BudgetCost: BudgetCost with scala.Double = js.native
  /* 157 */ val BudgetFixedCost: BudgetFixedCost with scala.Double = js.native
  /* 158 */ val BudgetFixedWork: BudgetFixedWork with scala.Double = js.native
  /* 159 */ val BudgetWork: BudgetWork with scala.Double = js.native
  /* 161 */ val ConstraintDate: ConstraintDate with scala.Double = js.native
  /* 162 */ val ConstraintType: ConstraintType with scala.Double = js.native
  /* 268 */ val Cost: Cost with scala.Double = js.native
  /* 163 */ val Cost1: Cost1 with scala.Double = js.native
  /* 164 */ val Cost10: Cost10 with scala.Double = js.native
  /* 165 */ val Cost2: Cost2 with scala.Double = js.native
  /* 166 */ val Cost3: Cost3 with scala.Double = js.native
  /* 167 */ val Cost4: Cost4 with scala.Double = js.native
  /* 168 */ val Cost5: Cost5 with scala.Double = js.native
  /* 169 */ val Cost6: Cost6 with scala.Double = js.native
  /* 170 */ val Cost7: Cost7 with scala.Double = js.native
  /* 171 */ val Cost8: Cost8 with scala.Double = js.native
  /* 172 */ val Cost9: Cost9 with scala.Double = js.native
  /* 257 */ val Critical: Critical with scala.Double = js.native
  /* 173 */ val Date1: Date1 with scala.Double = js.native
  /* 174 */ val Date10: Date10 with scala.Double = js.native
  /* 175 */ val Date2: Date2 with scala.Double = js.native
  /* 176 */ val Date3: Date3 with scala.Double = js.native
  /* 177 */ val Date4: Date4 with scala.Double = js.native
  /* 178 */ val Date5: Date5 with scala.Double = js.native
  /* 179 */ val Date6: Date6 with scala.Double = js.native
  /* 180 */ val Date7: Date7 with scala.Double = js.native
  /* 181 */ val Date8: Date8 with scala.Double = js.native
  /* 182 */ val Date9: Date9 with scala.Double = js.native
  /* 183 */ val Deadline: Deadline with scala.Double = js.native
  /* 194 */ val Duration: Duration with scala.Double = js.native
  /* 184 */ val Duration1: Duration1 with scala.Double = js.native
  /* 185 */ val Duration10: Duration10 with scala.Double = js.native
  /* 186 */ val Duration2: Duration2 with scala.Double = js.native
  /* 187 */ val Duration3: Duration3 with scala.Double = js.native
  /* 188 */ val Duration4: Duration4 with scala.Double = js.native
  /* 189 */ val Duration5: Duration5 with scala.Double = js.native
  /* 190 */ val Duration6: Duration6 with scala.Double = js.native
  /* 191 */ val Duration7: Duration7 with scala.Double = js.native
  /* 192 */ val Duration8: Duration8 with scala.Double = js.native
  /* 193 */ val Duration9: Duration9 with scala.Double = js.native
  /* 195 */ val EarnedValueMethod: EarnedValueMethod with scala.Double = js.native
  /* 269 */ val Finish: Finish with scala.Double = js.native
  /* 20 */ val Finish1: Finish1 with scala.Double = js.native
  /* 9 */ val Finish10: Finish10 with scala.Double = js.native
  /* 33 */ val Finish2: Finish2 with scala.Double = js.native
  /* 37 */ val Finish3: Finish3 with scala.Double = js.native
  /* 40 */ val Finish4: Finish4 with scala.Double = js.native
  /* 43 */ val Finish5: Finish5 with scala.Double = js.native
  /* 46 */ val Finish6: Finish6 with scala.Double = js.native
  /* 49 */ val Finish7: Finish7 with scala.Double = js.native
  /* 52 */ val Finish8: Finish8 with scala.Double = js.native
  /* 55 */ val Finish9: Finish9 with scala.Double = js.native
  /* 196 */ val FinishSlack: FinishSlack with scala.Double = js.native
  /* 197 */ val FixedCost: FixedCost with scala.Double = js.native
  /* 198 */ val FixedCostAccrual: FixedCostAccrual with scala.Double = js.native
  /* 200 */ val Flag1: Flag1 with scala.Double = js.native
  /* 199 */ val Flag10: Flag10 with scala.Double = js.native
  /* 201 */ val Flag11: Flag11 with scala.Double = js.native
  /* 202 */ val Flag12: Flag12 with scala.Double = js.native
  /* 203 */ val Flag13: Flag13 with scala.Double = js.native
  /* 204 */ val Flag14: Flag14 with scala.Double = js.native
  /* 205 */ val Flag15: Flag15 with scala.Double = js.native
  /* 206 */ val Flag16: Flag16 with scala.Double = js.native
  /* 207 */ val Flag17: Flag17 with scala.Double = js.native
  /* 208 */ val Flag18: Flag18 with scala.Double = js.native
  /* 209 */ val Flag19: Flag19 with scala.Double = js.native
  /* 210 */ val Flag2: Flag2 with scala.Double = js.native
  /* 211 */ val Flag20: Flag20 with scala.Double = js.native
  /* 212 */ val Flag3: Flag3 with scala.Double = js.native
  /* 213 */ val Flag4: Flag4 with scala.Double = js.native
  /* 214 */ val Flag5: Flag5 with scala.Double = js.native
  /* 215 */ val Flag6: Flag6 with scala.Double = js.native
  /* 216 */ val Flag7: Flag7 with scala.Double = js.native
  /* 217 */ val Flag8: Flag8 with scala.Double = js.native
  /* 218 */ val Flag9: Flag9 with scala.Double = js.native
  /* 219 */ val FreeSlack: FreeSlack with scala.Double = js.native
  /* 220 */ val HasRollupSubTasks: HasRollupSubTasks with scala.Double = js.native
  /* 221 */ val ID: ID with scala.Double = js.native
  /* 260 */ val IsRollup: IsRollup with scala.Double = js.native
  /* 258 */ val Milestone: Milestone with scala.Double = js.native
  /* 222 */ val Name: Name with scala.Double = js.native
  /* 223 */ val Notes: Notes with scala.Double = js.native
  /* 224 */ val Number1: Number1 with scala.Double = js.native
  /* 225 */ val Number10: Number10 with scala.Double = js.native
  /* 226 */ val Number11: Number11 with scala.Double = js.native
  /* 227 */ val Number12: Number12 with scala.Double = js.native
  /* 228 */ val Number13: Number13 with scala.Double = js.native
  /* 229 */ val Number14: Number14 with scala.Double = js.native
  /* 230 */ val Number15: Number15 with scala.Double = js.native
  /* 231 */ val Number16: Number16 with scala.Double = js.native
  /* 232 */ val Number17: Number17 with scala.Double = js.native
  /* 233 */ val Number18: Number18 with scala.Double = js.native
  /* 234 */ val Number19: Number19 with scala.Double = js.native
  /* 235 */ val Number2: Number2 with scala.Double = js.native
  /* 236 */ val Number20: Number20 with scala.Double = js.native
  /* 237 */ val Number3: Number3 with scala.Double = js.native
  /* 238 */ val Number4: Number4 with scala.Double = js.native
  /* 239 */ val Number5: Number5 with scala.Double = js.native
  /* 240 */ val Number6: Number6 with scala.Double = js.native
  /* 241 */ val Number7: Number7 with scala.Double = js.native
  /* 242 */ val Number8: Number8 with scala.Double = js.native
  /* 243 */ val Number9: Number9 with scala.Double = js.native
  /* 247 */ val OutlineLevel: OutlineLevel with scala.Double = js.native
  /* 259 */ val Overallocated: Overallocated with scala.Double = js.native
  /* 248 */ val OvertimeCost: OvertimeCost with scala.Double = js.native
  /* 249 */ val OvertimeWork: OvertimeWork with scala.Double = js.native
  /* 250 */ val PercentComplete: PercentComplete with scala.Double = js.native
  /* 251 */ val PercentWorkComplete: PercentWorkComplete with scala.Double = js.native
  /* 252 */ val Predecessors: Predecessors with scala.Double = js.native
  /* 253 */ val PreleveledFinish: PreleveledFinish with scala.Double = js.native
  /* 254 */ val PreleveledStart: PreleveledStart with scala.Double = js.native
  /* 255 */ val Priority: Priority with scala.Double = js.native
  /* 262 */ val RegularWork: RegularWork with scala.Double = js.native
  /* 263 */ val RemainingCost: RemainingCost with scala.Double = js.native
  /* 264 */ val RemainingDuration: RemainingDuration with scala.Double = js.native
  /* 265 */ val RemainingOvertimeCost: RemainingOvertimeCost with scala.Double = js.native
  /* 266 */ val RemainingWork: RemainingWork with scala.Double = js.native
  /* 267 */ val ResourceNames: ResourceNames with scala.Double = js.native
  /* 244 */ val ScheduledDuration: ScheduledDuration with scala.Double = js.native
  /* 245 */ val ScheduledFinish: ScheduledFinish with scala.Double = js.native
  /* 246 */ val ScheduledStart: ScheduledStart with scala.Double = js.native
  /* 270 */ val Start: Start with scala.Double = js.native
  /* 21 */ val Start1: Start1 with scala.Double = js.native
  /* 10 */ val Start10: Start10 with scala.Double = js.native
  /* 34 */ val Start2: Start2 with scala.Double = js.native
  /* 38 */ val Start3: Start3 with scala.Double = js.native
  /* 41 */ val Start4: Start4 with scala.Double = js.native
  /* 44 */ val Start5: Start5 with scala.Double = js.native
  /* 47 */ val Start6: Start6 with scala.Double = js.native
  /* 50 */ val Start7: Start7 with scala.Double = js.native
  /* 53 */ val Start8: Start8 with scala.Double = js.native
  /* 56 */ val Start9: Start9 with scala.Double = js.native
  /* 272 */ val StartSlack: StartSlack with scala.Double = js.native
  /* 273 */ val Status: Status with scala.Double = js.native
  /* 275 */ val StatusManager: StatusManager with scala.Double = js.native
  /* 274 */ val Successors: Successors with scala.Double = js.native
  /* 261 */ val Summary: Summary with scala.Double = js.native
  /* 160 */ val TaskCalendarGUID: TaskCalendarGUID with scala.Double = js.native
  /* 277 */ val TaskGUID: TaskGUID with scala.Double = js.native
  /* 7 */ val Text1: Text1 with scala.Double = js.native
  /* 8 */ val Text10: Text10 with scala.Double = js.native
  /* 11 */ val Text11: Text11 with scala.Double = js.native
  /* 12 */ val Text12: Text12 with scala.Double = js.native
  /* 13 */ val Text13: Text13 with scala.Double = js.native
  /* 14 */ val Text14: Text14 with scala.Double = js.native
  /* 15 */ val Text15: Text15 with scala.Double = js.native
  /* 16 */ val Text16: Text16 with scala.Double = js.native
  /* 17 */ val Text17: Text17 with scala.Double = js.native
  /* 18 */ val Text18: Text18 with scala.Double = js.native
  /* 19 */ val Text19: Text19 with scala.Double = js.native
  /* 22 */ val Text2: Text2 with scala.Double = js.native
  /* 23 */ val Text20: Text20 with scala.Double = js.native
  /* 24 */ val Text21: Text21 with scala.Double = js.native
  /* 25 */ val Text22: Text22 with scala.Double = js.native
  /* 26 */ val Text23: Text23 with scala.Double = js.native
  /* 27 */ val Text24: Text24 with scala.Double = js.native
  /* 28 */ val Text25: Text25 with scala.Double = js.native
  /* 29 */ val Text26: Text26 with scala.Double = js.native
  /* 30 */ val Text27: Text27 with scala.Double = js.native
  /* 31 */ val Text28: Text28 with scala.Double = js.native
  /* 32 */ val Text29: Text29 with scala.Double = js.native
  /* 35 */ val Text3: Text3 with scala.Double = js.native
  /* 36 */ val Text30: Text30 with scala.Double = js.native
  /* 39 */ val Text4: Text4 with scala.Double = js.native
  /* 42 */ val Text5: Text5 with scala.Double = js.native
  /* 45 */ val Text6: Text6 with scala.Double = js.native
  /* 48 */ val Text7: Text7 with scala.Double = js.native
  /* 51 */ val Text8: Text8 with scala.Double = js.native
  /* 54 */ val Text9: Text9 with scala.Double = js.native
  /* 276 */ val TotalSlack: TotalSlack with scala.Double = js.native
  /* 278 */ val Type: Type with scala.Double = js.native
  /* 279 */ val WBS: WBS with scala.Double = js.native
  /* 280 */ val WBSPREDECESSORS: WBSPREDECESSORS with scala.Double = js.native
  /* 281 */ val WBSSUCCESSORS: WBSSUCCESSORS with scala.Double = js.native
  /* 282 */ val WSSID: WSSID with scala.Double = js.native
  /* 271 */ val Work: Work with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields with scala.Double] = js.native
}

