package typings.officeDashJs.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectTaskFields extends js.Object

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
object ProjectTaskFields extends js.Object {
  /**
    * Indicates whether the task is active.
    */
  @js.native
  sealed trait Active extends ProjectTaskFields
  
  /**
    * The current actual cost for the task.
    */
  @js.native
  sealed trait ActualCost extends ProjectTaskFields
  
  /**
    * The actual duration of the task, in minutes.
    */
  @js.native
  sealed trait ActualDuration extends ProjectTaskFields
  
  /**
    * The actual finish date of the task.
    */
  @js.native
  sealed trait ActualFinish extends ProjectTaskFields
  
  /**
    * The actual overtime cost for the task.
    */
  @js.native
  sealed trait ActualOvertimeCost extends ProjectTaskFields
  
  /**
    * The actual overtime work for the task, in minutes.
    */
  @js.native
  sealed trait ActualOvertimeWork extends ProjectTaskFields
  
  /**
    * The actual start date of the task.
    */
  @js.native
  sealed trait ActualStart extends ProjectTaskFields
  
  /**
    * The actual work for the task, in minutes.
    */
  @js.native
  sealed trait ActualWork extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline10BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline10BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline10Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline10Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline10Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline10FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline10FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline10Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline10Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline1BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline1BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline1Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline1Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline1Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline1FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline1FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline1Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline1Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline2BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline2BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline2Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline2Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline2Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline2FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline2FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline2Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline2Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline3BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline3BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline3Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline3Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline3Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline3FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline3FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline3Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline3Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline4BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline4BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline4Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline4Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline4Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline4FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline4FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline4Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline4Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline5BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline5BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline5Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline5Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline5Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline5FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline5FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline5Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline5Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline6BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline6BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline6Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline6Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline6Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline6FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline6FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline6Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline6Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline7BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline7BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline7Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline7Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline7Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline7FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline7FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline7Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline7Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline8BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline8BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline8Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline8Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline8Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline8FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline8FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline8Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline8Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline9BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline9BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline9Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline9Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline9Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline9FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline9FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline9Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline9Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait BaselineBudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait BaselineBudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait BaselineCost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait BaselineDuration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait BaselineFinish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait BaselineFixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait BaselineFixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait BaselineStart extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait BaselineWork extends ProjectTaskFields
  
  /**
    * The budget cost for the task.
    */
  @js.native
  sealed trait BudgetCost extends ProjectTaskFields
  
  @js.native
  sealed trait BudgetFixedCost extends ProjectTaskFields
  
  @js.native
  sealed trait BudgetFixedWork extends ProjectTaskFields
  
  /**
    * The budget work for the task, in hours.
    */
  @js.native
  sealed trait BudgetWork extends ProjectTaskFields
  
  /**
    * A constraint date for the task.
    */
  @js.native
  sealed trait ConstraintDate extends ProjectTaskFields
  
  /**
    * A constraint type for the task: As Soon As Possible = 0, As Late As Possible = 1, Must Start On = 2, Must Finish On = 3, 
    * Start No Earlier Than = 4, Start No Later Than = 5, Finish No Earlier Than = 6, Finish No Later Than = 7.
    */
  @js.native
  sealed trait ConstraintType extends ProjectTaskFields
  
  /**
    * The total cost of the task.
    */
  @js.native
  sealed trait Cost extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost1 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost10 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost2 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost3 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost4 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost5 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost6 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost7 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost8 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost9 extends ProjectTaskFields
  
  /**
    * Indicates whether the task is on the critical path.
    */
  @js.native
  sealed trait Critical extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date1 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date10 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date2 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date3 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date4 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date5 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date6 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date7 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date8 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date9 extends ProjectTaskFields
  
  /**
    * The deadline for a task.
    */
  @js.native
  sealed trait Deadline extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration1 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration10 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration2 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration3 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration4 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration5 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration6 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration7 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration8 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration9 extends ProjectTaskFields
  
  /**
    * The method for calculating earned value for the task.
    */
  @js.native
  sealed trait EarnedValueMethod extends ProjectTaskFields
  
  /**
    * The finish date of the task.
    */
  @js.native
  sealed trait Finish extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish1 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish10 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish2 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish3 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish4 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish5 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish6 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish7 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish8 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish9 extends ProjectTaskFields
  
  /**
    * The duration between the Early Finish and Late Finish dates for the task, in minutes.
    */
  @js.native
  sealed trait FinishSlack extends ProjectTaskFields
  
  /**
    * The fixed cost for the task.
    */
  @js.native
  sealed trait FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait FixedCostAccrual extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag1 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag10 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag11 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag12 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag13 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag14 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag15 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag16 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag17 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag18 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag19 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag2 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag20 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag3 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag4 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag5 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag6 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag7 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag8 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag9 extends ProjectTaskFields
  
  /**
    * The amount of time that the task can be delayed without delaying its successor tasks.
    */
  @js.native
  sealed trait FreeSlack extends ProjectTaskFields
  
  /**
    * Indicates whether the task has rollup subtasks.
    */
  @js.native
  sealed trait HasRollupSubTasks extends ProjectTaskFields
  
  /**
    * The index of the selected task. After the project summary task, the index of the first task in a project is 1.
    */
  @js.native
  sealed trait ID extends ProjectTaskFields
  
  /**
    * Indicates whether subtask information is rolled up to the summary task bar.
    */
  @js.native
  sealed trait IsRollup extends ProjectTaskFields
  
  /**
    * Indicates whether the task is a milestone.
    */
  @js.native
  sealed trait Milestone extends ProjectTaskFields
  
  /**
    * The name of the task.
    */
  @js.native
  sealed trait Name extends ProjectTaskFields
  
  /**
    * The text value of the notes regarding the task.
    */
  @js.native
  sealed trait Notes extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number1 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number10 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number11 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number12 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number13 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number14 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number15 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number16 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number17 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number18 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number19 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number2 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number20 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number3 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number4 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number5 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number6 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number7 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number8 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number9 extends ProjectTaskFields
  
  /**
    * The level of the task in the outline hierarchy.
    */
  @js.native
  sealed trait OutlineLevel extends ProjectTaskFields
  
  /**
    * Indicates whether any assignments for a task are overallocated.
    */
  @js.native
  sealed trait Overallocated extends ProjectTaskFields
  
  /**
    * The overtime cost for the task.
    */
  @js.native
  sealed trait OvertimeCost extends ProjectTaskFields
  
  /**
    * The overtime work for the task.
    */
  @js.native
  sealed trait OvertimeWork extends ProjectTaskFields
  
  /**
    * The percent complete status of the task.
    */
  @js.native
  sealed trait PercentComplete extends ProjectTaskFields
  
  /**
    * The percentage of work completed for the task.
    */
  @js.native
  sealed trait PercentWorkComplete extends ProjectTaskFields
  
  /**
    * The IDs of the task's predecessors.
    */
  @js.native
  sealed trait Predecessors extends ProjectTaskFields
  
  /**
    * The finish date of a task before leveling occurred.
    */
  @js.native
  sealed trait PreleveledFinish extends ProjectTaskFields
  
  /**
    * The start date of a task before leveling occurred.
    */
  @js.native
  sealed trait PreleveledStart extends ProjectTaskFields
  
  /**
    * The priority of the task, with values from 0 (low) to 1000 (high). The default priority value is 500.
    */
  @js.native
  sealed trait Priority extends ProjectTaskFields
  
  /**
    * The amount of regular work for the task.
    */
  @js.native
  sealed trait RegularWork extends ProjectTaskFields
  
  /**
    * The remaining cost for the task.
    */
  @js.native
  sealed trait RemainingCost extends ProjectTaskFields
  
  /**
    * The remaining duration for the task, in minutes.
    */
  @js.native
  sealed trait RemainingDuration extends ProjectTaskFields
  
  /**
    * The remaining overtime cost for the task.
    */
  @js.native
  sealed trait RemainingOvertimeCost extends ProjectTaskFields
  
  /**
    * The remaining work for the task, in minutes.
    */
  @js.native
  sealed trait RemainingWork extends ProjectTaskFields
  
  /**
    * The names of the resources assigned to a task.
    */
  @js.native
  sealed trait ResourceNames extends ProjectTaskFields
  
  /**
    * The scheduled (as opposed to actual) duration of the task.
    */
  @js.native
  sealed trait ScheduledDuration extends ProjectTaskFields
  
  /**
    * The scheduled (as opposed to actual) finish date of the task.
    */
  @js.native
  sealed trait ScheduledFinish extends ProjectTaskFields
  
  /**
    * The scheduled (as opposed to actual) start date of the task.
    */
  @js.native
  sealed trait ScheduledStart extends ProjectTaskFields
  
  /**
    * The start date of the task.
    */
  @js.native
  sealed trait Start extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start1 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start10 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start2 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start3 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start4 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start5 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start6 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start7 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start8 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start9 extends ProjectTaskFields
  
  /**
    * The duration between the Early Start and Late Start dates for the task.
    */
  @js.native
  sealed trait StartSlack extends ProjectTaskFields
  
  /**
    * The status of the task: Complete = 0, on schedule = 1, late = 2, future task = 3, status not available = 4.
    */
  @js.native
  sealed trait Status extends ProjectTaskFields
  
  /**
    * The enterprise resource responsible for accepting or rejecting assignment progress updates for the task.
    */
  @js.native
  sealed trait StatusManager extends ProjectTaskFields
  
  /**
    * The IDs of the task's successors.
    */
  @js.native
  sealed trait Successors extends ProjectTaskFields
  
  /**
    * Indicates whether the task is a summary task.
    */
  @js.native
  sealed trait Summary extends ProjectTaskFields
  
  /**
    * The GUID of the task calendar.
    */
  @js.native
  sealed trait TaskCalendarGUID extends ProjectTaskFields
  
  /**
    * The GUID of the task.
    */
  @js.native
  sealed trait TaskGUID extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text1 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text10 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text11 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text12 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text13 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text14 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text15 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text16 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text17 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text18 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text19 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text2 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text20 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text21 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text22 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text23 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text24 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text25 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text26 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text27 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text28 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text29 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text3 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text30 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text4 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text5 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text6 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text7 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text8 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text9 extends ProjectTaskFields
  
  /**
    * The total slack time for the task, in minutes.
    */
  @js.native
  sealed trait TotalSlack extends ProjectTaskFields
  
  /**
    * The way the task is calculated: Fixed units = 0, fixed duration = 1, fixed work = 2.
    */
  @js.native
  sealed trait Type extends ProjectTaskFields
  
  /**
    * The work breakdown structure code of the task.
    */
  @js.native
  sealed trait WBS extends ProjectTaskFields
  
  /**
    * The work breakdown structure codes of the task predecessors, separated by the list separator.
    */
  @js.native
  sealed trait WBSPREDECESSORS extends ProjectTaskFields
  
  /**
    * The work breakdown structure codes of the task successors, separated by the list separator.
    */
  @js.native
  sealed trait WBSSUCCESSORS extends ProjectTaskFields
  
  /**
    * The ID of the task in a SharePoint list, for a project that is synchronized with a SharePoint tasks list.
    */
  @js.native
  sealed trait WSSID extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the task, in minutes.
    */
  @js.native
  sealed trait Work extends ProjectTaskFields
  
  /* 256 */ val Active: typings.officeDashJs.OfficeNs.ProjectTaskFields.Active with Double = js.native
  /* 0 */ val ActualCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.ActualCost with Double = js.native
  /* 1 */ val ActualDuration: typings.officeDashJs.OfficeNs.ProjectTaskFields.ActualDuration with Double = js.native
  /* 2 */ val ActualFinish: typings.officeDashJs.OfficeNs.ProjectTaskFields.ActualFinish with Double = js.native
  /* 3 */ val ActualOvertimeCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.ActualOvertimeCost with Double = js.native
  /* 4 */ val ActualOvertimeWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.ActualOvertimeWork with Double = js.native
  /* 5 */ val ActualStart: typings.officeDashJs.OfficeNs.ProjectTaskFields.ActualStart with Double = js.native
  /* 6 */ val ActualWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.ActualWork with Double = js.native
  /* 57 */ val Baseline10BudgetCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline10BudgetCost with Double = js.native
  /* 58 */ val Baseline10BudgetWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline10BudgetWork with Double = js.native
  /* 59 */ val Baseline10Cost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline10Cost with Double = js.native
  /* 60 */ val Baseline10Duration: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline10Duration with Double = js.native
  /* 61 */ val Baseline10Finish: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline10Finish with Double = js.native
  /* 62 */ val Baseline10FixedCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline10FixedCost with Double = js.native
  /* 63 */ val Baseline10FixedCostAccrual: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline10FixedCostAccrual with Double = js.native
  /* 64 */ val Baseline10Start: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline10Start with Double = js.native
  /* 65 */ val Baseline10Work: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline10Work with Double = js.native
  /* 66 */ val Baseline1BudgetCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline1BudgetCost with Double = js.native
  /* 67 */ val Baseline1BudgetWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline1BudgetWork with Double = js.native
  /* 68 */ val Baseline1Cost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline1Cost with Double = js.native
  /* 69 */ val Baseline1Duration: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline1Duration with Double = js.native
  /* 70 */ val Baseline1Finish: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline1Finish with Double = js.native
  /* 71 */ val Baseline1FixedCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline1FixedCost with Double = js.native
  /* 72 */ val Baseline1FixedCostAccrual: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline1FixedCostAccrual with Double = js.native
  /* 73 */ val Baseline1Start: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline1Start with Double = js.native
  /* 74 */ val Baseline1Work: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline1Work with Double = js.native
  /* 75 */ val Baseline2BudgetCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline2BudgetCost with Double = js.native
  /* 76 */ val Baseline2BudgetWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline2BudgetWork with Double = js.native
  /* 77 */ val Baseline2Cost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline2Cost with Double = js.native
  /* 78 */ val Baseline2Duration: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline2Duration with Double = js.native
  /* 79 */ val Baseline2Finish: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline2Finish with Double = js.native
  /* 80 */ val Baseline2FixedCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline2FixedCost with Double = js.native
  /* 81 */ val Baseline2FixedCostAccrual: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline2FixedCostAccrual with Double = js.native
  /* 82 */ val Baseline2Start: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline2Start with Double = js.native
  /* 83 */ val Baseline2Work: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline2Work with Double = js.native
  /* 84 */ val Baseline3BudgetCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline3BudgetCost with Double = js.native
  /* 85 */ val Baseline3BudgetWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline3BudgetWork with Double = js.native
  /* 86 */ val Baseline3Cost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline3Cost with Double = js.native
  /* 87 */ val Baseline3Duration: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline3Duration with Double = js.native
  /* 88 */ val Baseline3Finish: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline3Finish with Double = js.native
  /* 89 */ val Baseline3FixedCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline3FixedCost with Double = js.native
  /* 90 */ val Baseline3FixedCostAccrual: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline3FixedCostAccrual with Double = js.native
  /* 91 */ val Baseline3Start: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline3Start with Double = js.native
  /* 92 */ val Baseline3Work: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline3Work with Double = js.native
  /* 93 */ val Baseline4BudgetCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline4BudgetCost with Double = js.native
  /* 94 */ val Baseline4BudgetWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline4BudgetWork with Double = js.native
  /* 95 */ val Baseline4Cost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline4Cost with Double = js.native
  /* 96 */ val Baseline4Duration: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline4Duration with Double = js.native
  /* 97 */ val Baseline4Finish: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline4Finish with Double = js.native
  /* 98 */ val Baseline4FixedCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline4FixedCost with Double = js.native
  /* 99 */ val Baseline4FixedCostAccrual: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline4FixedCostAccrual with Double = js.native
  /* 100 */ val Baseline4Start: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline4Start with Double = js.native
  /* 101 */ val Baseline4Work: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline4Work with Double = js.native
  /* 102 */ val Baseline5BudgetCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline5BudgetCost with Double = js.native
  /* 103 */ val Baseline5BudgetWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline5BudgetWork with Double = js.native
  /* 104 */ val Baseline5Cost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline5Cost with Double = js.native
  /* 105 */ val Baseline5Duration: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline5Duration with Double = js.native
  /* 106 */ val Baseline5Finish: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline5Finish with Double = js.native
  /* 107 */ val Baseline5FixedCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline5FixedCost with Double = js.native
  /* 108 */ val Baseline5FixedCostAccrual: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline5FixedCostAccrual with Double = js.native
  /* 109 */ val Baseline5Start: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline5Start with Double = js.native
  /* 110 */ val Baseline5Work: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline5Work with Double = js.native
  /* 111 */ val Baseline6BudgetCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline6BudgetCost with Double = js.native
  /* 112 */ val Baseline6BudgetWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline6BudgetWork with Double = js.native
  /* 113 */ val Baseline6Cost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline6Cost with Double = js.native
  /* 114 */ val Baseline6Duration: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline6Duration with Double = js.native
  /* 115 */ val Baseline6Finish: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline6Finish with Double = js.native
  /* 116 */ val Baseline6FixedCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline6FixedCost with Double = js.native
  /* 117 */ val Baseline6FixedCostAccrual: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline6FixedCostAccrual with Double = js.native
  /* 118 */ val Baseline6Start: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline6Start with Double = js.native
  /* 119 */ val Baseline6Work: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline6Work with Double = js.native
  /* 120 */ val Baseline7BudgetCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline7BudgetCost with Double = js.native
  /* 121 */ val Baseline7BudgetWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline7BudgetWork with Double = js.native
  /* 122 */ val Baseline7Cost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline7Cost with Double = js.native
  /* 123 */ val Baseline7Duration: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline7Duration with Double = js.native
  /* 124 */ val Baseline7Finish: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline7Finish with Double = js.native
  /* 125 */ val Baseline7FixedCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline7FixedCost with Double = js.native
  /* 126 */ val Baseline7FixedCostAccrual: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline7FixedCostAccrual with Double = js.native
  /* 127 */ val Baseline7Start: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline7Start with Double = js.native
  /* 128 */ val Baseline7Work: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline7Work with Double = js.native
  /* 129 */ val Baseline8BudgetCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline8BudgetCost with Double = js.native
  /* 130 */ val Baseline8BudgetWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline8BudgetWork with Double = js.native
  /* 131 */ val Baseline8Cost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline8Cost with Double = js.native
  /* 132 */ val Baseline8Duration: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline8Duration with Double = js.native
  /* 133 */ val Baseline8Finish: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline8Finish with Double = js.native
  /* 134 */ val Baseline8FixedCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline8FixedCost with Double = js.native
  /* 135 */ val Baseline8FixedCostAccrual: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline8FixedCostAccrual with Double = js.native
  /* 136 */ val Baseline8Start: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline8Start with Double = js.native
  /* 137 */ val Baseline8Work: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline8Work with Double = js.native
  /* 138 */ val Baseline9BudgetCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline9BudgetCost with Double = js.native
  /* 139 */ val Baseline9BudgetWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline9BudgetWork with Double = js.native
  /* 140 */ val Baseline9Cost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline9Cost with Double = js.native
  /* 141 */ val Baseline9Duration: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline9Duration with Double = js.native
  /* 142 */ val Baseline9Finish: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline9Finish with Double = js.native
  /* 143 */ val Baseline9FixedCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline9FixedCost with Double = js.native
  /* 144 */ val Baseline9FixedCostAccrual: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline9FixedCostAccrual with Double = js.native
  /* 145 */ val Baseline9Start: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline9Start with Double = js.native
  /* 146 */ val Baseline9Work: typings.officeDashJs.OfficeNs.ProjectTaskFields.Baseline9Work with Double = js.native
  /* 147 */ val BaselineBudgetCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.BaselineBudgetCost with Double = js.native
  /* 148 */ val BaselineBudgetWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.BaselineBudgetWork with Double = js.native
  /* 149 */ val BaselineCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.BaselineCost with Double = js.native
  /* 150 */ val BaselineDuration: typings.officeDashJs.OfficeNs.ProjectTaskFields.BaselineDuration with Double = js.native
  /* 151 */ val BaselineFinish: typings.officeDashJs.OfficeNs.ProjectTaskFields.BaselineFinish with Double = js.native
  /* 152 */ val BaselineFixedCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.BaselineFixedCost with Double = js.native
  /* 153 */ val BaselineFixedCostAccrual: typings.officeDashJs.OfficeNs.ProjectTaskFields.BaselineFixedCostAccrual with Double = js.native
  /* 154 */ val BaselineStart: typings.officeDashJs.OfficeNs.ProjectTaskFields.BaselineStart with Double = js.native
  /* 155 */ val BaselineWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.BaselineWork with Double = js.native
  /* 156 */ val BudgetCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.BudgetCost with Double = js.native
  /* 157 */ val BudgetFixedCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.BudgetFixedCost with Double = js.native
  /* 158 */ val BudgetFixedWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.BudgetFixedWork with Double = js.native
  /* 159 */ val BudgetWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.BudgetWork with Double = js.native
  /* 161 */ val ConstraintDate: typings.officeDashJs.OfficeNs.ProjectTaskFields.ConstraintDate with Double = js.native
  /* 162 */ val ConstraintType: typings.officeDashJs.OfficeNs.ProjectTaskFields.ConstraintType with Double = js.native
  /* 268 */ val Cost: typings.officeDashJs.OfficeNs.ProjectTaskFields.Cost with Double = js.native
  /* 163 */ val Cost1: typings.officeDashJs.OfficeNs.ProjectTaskFields.Cost1 with Double = js.native
  /* 164 */ val Cost10: typings.officeDashJs.OfficeNs.ProjectTaskFields.Cost10 with Double = js.native
  /* 165 */ val Cost2: typings.officeDashJs.OfficeNs.ProjectTaskFields.Cost2 with Double = js.native
  /* 166 */ val Cost3: typings.officeDashJs.OfficeNs.ProjectTaskFields.Cost3 with Double = js.native
  /* 167 */ val Cost4: typings.officeDashJs.OfficeNs.ProjectTaskFields.Cost4 with Double = js.native
  /* 168 */ val Cost5: typings.officeDashJs.OfficeNs.ProjectTaskFields.Cost5 with Double = js.native
  /* 169 */ val Cost6: typings.officeDashJs.OfficeNs.ProjectTaskFields.Cost6 with Double = js.native
  /* 170 */ val Cost7: typings.officeDashJs.OfficeNs.ProjectTaskFields.Cost7 with Double = js.native
  /* 171 */ val Cost8: typings.officeDashJs.OfficeNs.ProjectTaskFields.Cost8 with Double = js.native
  /* 172 */ val Cost9: typings.officeDashJs.OfficeNs.ProjectTaskFields.Cost9 with Double = js.native
  /* 257 */ val Critical: typings.officeDashJs.OfficeNs.ProjectTaskFields.Critical with Double = js.native
  /* 173 */ val Date1: typings.officeDashJs.OfficeNs.ProjectTaskFields.Date1 with Double = js.native
  /* 174 */ val Date10: typings.officeDashJs.OfficeNs.ProjectTaskFields.Date10 with Double = js.native
  /* 175 */ val Date2: typings.officeDashJs.OfficeNs.ProjectTaskFields.Date2 with Double = js.native
  /* 176 */ val Date3: typings.officeDashJs.OfficeNs.ProjectTaskFields.Date3 with Double = js.native
  /* 177 */ val Date4: typings.officeDashJs.OfficeNs.ProjectTaskFields.Date4 with Double = js.native
  /* 178 */ val Date5: typings.officeDashJs.OfficeNs.ProjectTaskFields.Date5 with Double = js.native
  /* 179 */ val Date6: typings.officeDashJs.OfficeNs.ProjectTaskFields.Date6 with Double = js.native
  /* 180 */ val Date7: typings.officeDashJs.OfficeNs.ProjectTaskFields.Date7 with Double = js.native
  /* 181 */ val Date8: typings.officeDashJs.OfficeNs.ProjectTaskFields.Date8 with Double = js.native
  /* 182 */ val Date9: typings.officeDashJs.OfficeNs.ProjectTaskFields.Date9 with Double = js.native
  /* 183 */ val Deadline: typings.officeDashJs.OfficeNs.ProjectTaskFields.Deadline with Double = js.native
  /* 194 */ val Duration: typings.officeDashJs.OfficeNs.ProjectTaskFields.Duration with Double = js.native
  /* 184 */ val Duration1: typings.officeDashJs.OfficeNs.ProjectTaskFields.Duration1 with Double = js.native
  /* 185 */ val Duration10: typings.officeDashJs.OfficeNs.ProjectTaskFields.Duration10 with Double = js.native
  /* 186 */ val Duration2: typings.officeDashJs.OfficeNs.ProjectTaskFields.Duration2 with Double = js.native
  /* 187 */ val Duration3: typings.officeDashJs.OfficeNs.ProjectTaskFields.Duration3 with Double = js.native
  /* 188 */ val Duration4: typings.officeDashJs.OfficeNs.ProjectTaskFields.Duration4 with Double = js.native
  /* 189 */ val Duration5: typings.officeDashJs.OfficeNs.ProjectTaskFields.Duration5 with Double = js.native
  /* 190 */ val Duration6: typings.officeDashJs.OfficeNs.ProjectTaskFields.Duration6 with Double = js.native
  /* 191 */ val Duration7: typings.officeDashJs.OfficeNs.ProjectTaskFields.Duration7 with Double = js.native
  /* 192 */ val Duration8: typings.officeDashJs.OfficeNs.ProjectTaskFields.Duration8 with Double = js.native
  /* 193 */ val Duration9: typings.officeDashJs.OfficeNs.ProjectTaskFields.Duration9 with Double = js.native
  /* 195 */ val EarnedValueMethod: typings.officeDashJs.OfficeNs.ProjectTaskFields.EarnedValueMethod with Double = js.native
  /* 269 */ val Finish: typings.officeDashJs.OfficeNs.ProjectTaskFields.Finish with Double = js.native
  /* 20 */ val Finish1: typings.officeDashJs.OfficeNs.ProjectTaskFields.Finish1 with Double = js.native
  /* 9 */ val Finish10: typings.officeDashJs.OfficeNs.ProjectTaskFields.Finish10 with Double = js.native
  /* 33 */ val Finish2: typings.officeDashJs.OfficeNs.ProjectTaskFields.Finish2 with Double = js.native
  /* 37 */ val Finish3: typings.officeDashJs.OfficeNs.ProjectTaskFields.Finish3 with Double = js.native
  /* 40 */ val Finish4: typings.officeDashJs.OfficeNs.ProjectTaskFields.Finish4 with Double = js.native
  /* 43 */ val Finish5: typings.officeDashJs.OfficeNs.ProjectTaskFields.Finish5 with Double = js.native
  /* 46 */ val Finish6: typings.officeDashJs.OfficeNs.ProjectTaskFields.Finish6 with Double = js.native
  /* 49 */ val Finish7: typings.officeDashJs.OfficeNs.ProjectTaskFields.Finish7 with Double = js.native
  /* 52 */ val Finish8: typings.officeDashJs.OfficeNs.ProjectTaskFields.Finish8 with Double = js.native
  /* 55 */ val Finish9: typings.officeDashJs.OfficeNs.ProjectTaskFields.Finish9 with Double = js.native
  /* 196 */ val FinishSlack: typings.officeDashJs.OfficeNs.ProjectTaskFields.FinishSlack with Double = js.native
  /* 197 */ val FixedCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.FixedCost with Double = js.native
  /* 198 */ val FixedCostAccrual: typings.officeDashJs.OfficeNs.ProjectTaskFields.FixedCostAccrual with Double = js.native
  /* 200 */ val Flag1: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag1 with Double = js.native
  /* 199 */ val Flag10: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag10 with Double = js.native
  /* 201 */ val Flag11: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag11 with Double = js.native
  /* 202 */ val Flag12: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag12 with Double = js.native
  /* 203 */ val Flag13: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag13 with Double = js.native
  /* 204 */ val Flag14: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag14 with Double = js.native
  /* 205 */ val Flag15: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag15 with Double = js.native
  /* 206 */ val Flag16: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag16 with Double = js.native
  /* 207 */ val Flag17: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag17 with Double = js.native
  /* 208 */ val Flag18: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag18 with Double = js.native
  /* 209 */ val Flag19: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag19 with Double = js.native
  /* 210 */ val Flag2: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag2 with Double = js.native
  /* 211 */ val Flag20: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag20 with Double = js.native
  /* 212 */ val Flag3: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag3 with Double = js.native
  /* 213 */ val Flag4: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag4 with Double = js.native
  /* 214 */ val Flag5: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag5 with Double = js.native
  /* 215 */ val Flag6: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag6 with Double = js.native
  /* 216 */ val Flag7: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag7 with Double = js.native
  /* 217 */ val Flag8: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag8 with Double = js.native
  /* 218 */ val Flag9: typings.officeDashJs.OfficeNs.ProjectTaskFields.Flag9 with Double = js.native
  /* 219 */ val FreeSlack: typings.officeDashJs.OfficeNs.ProjectTaskFields.FreeSlack with Double = js.native
  /* 220 */ val HasRollupSubTasks: typings.officeDashJs.OfficeNs.ProjectTaskFields.HasRollupSubTasks with Double = js.native
  /* 221 */ val ID: typings.officeDashJs.OfficeNs.ProjectTaskFields.ID with Double = js.native
  /* 260 */ val IsRollup: typings.officeDashJs.OfficeNs.ProjectTaskFields.IsRollup with Double = js.native
  /* 258 */ val Milestone: typings.officeDashJs.OfficeNs.ProjectTaskFields.Milestone with Double = js.native
  /* 222 */ val Name: typings.officeDashJs.OfficeNs.ProjectTaskFields.Name with Double = js.native
  /* 223 */ val Notes: typings.officeDashJs.OfficeNs.ProjectTaskFields.Notes with Double = js.native
  /* 224 */ val Number1: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number1 with Double = js.native
  /* 225 */ val Number10: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number10 with Double = js.native
  /* 226 */ val Number11: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number11 with Double = js.native
  /* 227 */ val Number12: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number12 with Double = js.native
  /* 228 */ val Number13: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number13 with Double = js.native
  /* 229 */ val Number14: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number14 with Double = js.native
  /* 230 */ val Number15: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number15 with Double = js.native
  /* 231 */ val Number16: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number16 with Double = js.native
  /* 232 */ val Number17: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number17 with Double = js.native
  /* 233 */ val Number18: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number18 with Double = js.native
  /* 234 */ val Number19: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number19 with Double = js.native
  /* 235 */ val Number2: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number2 with Double = js.native
  /* 236 */ val Number20: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number20 with Double = js.native
  /* 237 */ val Number3: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number3 with Double = js.native
  /* 238 */ val Number4: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number4 with Double = js.native
  /* 239 */ val Number5: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number5 with Double = js.native
  /* 240 */ val Number6: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number6 with Double = js.native
  /* 241 */ val Number7: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number7 with Double = js.native
  /* 242 */ val Number8: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number8 with Double = js.native
  /* 243 */ val Number9: typings.officeDashJs.OfficeNs.ProjectTaskFields.Number9 with Double = js.native
  /* 247 */ val OutlineLevel: typings.officeDashJs.OfficeNs.ProjectTaskFields.OutlineLevel with Double = js.native
  /* 259 */ val Overallocated: typings.officeDashJs.OfficeNs.ProjectTaskFields.Overallocated with Double = js.native
  /* 248 */ val OvertimeCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.OvertimeCost with Double = js.native
  /* 249 */ val OvertimeWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.OvertimeWork with Double = js.native
  /* 250 */ val PercentComplete: typings.officeDashJs.OfficeNs.ProjectTaskFields.PercentComplete with Double = js.native
  /* 251 */ val PercentWorkComplete: typings.officeDashJs.OfficeNs.ProjectTaskFields.PercentWorkComplete with Double = js.native
  /* 252 */ val Predecessors: typings.officeDashJs.OfficeNs.ProjectTaskFields.Predecessors with Double = js.native
  /* 253 */ val PreleveledFinish: typings.officeDashJs.OfficeNs.ProjectTaskFields.PreleveledFinish with Double = js.native
  /* 254 */ val PreleveledStart: typings.officeDashJs.OfficeNs.ProjectTaskFields.PreleveledStart with Double = js.native
  /* 255 */ val Priority: typings.officeDashJs.OfficeNs.ProjectTaskFields.Priority with Double = js.native
  /* 262 */ val RegularWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.RegularWork with Double = js.native
  /* 263 */ val RemainingCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.RemainingCost with Double = js.native
  /* 264 */ val RemainingDuration: typings.officeDashJs.OfficeNs.ProjectTaskFields.RemainingDuration with Double = js.native
  /* 265 */ val RemainingOvertimeCost: typings.officeDashJs.OfficeNs.ProjectTaskFields.RemainingOvertimeCost with Double = js.native
  /* 266 */ val RemainingWork: typings.officeDashJs.OfficeNs.ProjectTaskFields.RemainingWork with Double = js.native
  /* 267 */ val ResourceNames: typings.officeDashJs.OfficeNs.ProjectTaskFields.ResourceNames with Double = js.native
  /* 244 */ val ScheduledDuration: typings.officeDashJs.OfficeNs.ProjectTaskFields.ScheduledDuration with Double = js.native
  /* 245 */ val ScheduledFinish: typings.officeDashJs.OfficeNs.ProjectTaskFields.ScheduledFinish with Double = js.native
  /* 246 */ val ScheduledStart: typings.officeDashJs.OfficeNs.ProjectTaskFields.ScheduledStart with Double = js.native
  /* 270 */ val Start: typings.officeDashJs.OfficeNs.ProjectTaskFields.Start with Double = js.native
  /* 21 */ val Start1: typings.officeDashJs.OfficeNs.ProjectTaskFields.Start1 with Double = js.native
  /* 10 */ val Start10: typings.officeDashJs.OfficeNs.ProjectTaskFields.Start10 with Double = js.native
  /* 34 */ val Start2: typings.officeDashJs.OfficeNs.ProjectTaskFields.Start2 with Double = js.native
  /* 38 */ val Start3: typings.officeDashJs.OfficeNs.ProjectTaskFields.Start3 with Double = js.native
  /* 41 */ val Start4: typings.officeDashJs.OfficeNs.ProjectTaskFields.Start4 with Double = js.native
  /* 44 */ val Start5: typings.officeDashJs.OfficeNs.ProjectTaskFields.Start5 with Double = js.native
  /* 47 */ val Start6: typings.officeDashJs.OfficeNs.ProjectTaskFields.Start6 with Double = js.native
  /* 50 */ val Start7: typings.officeDashJs.OfficeNs.ProjectTaskFields.Start7 with Double = js.native
  /* 53 */ val Start8: typings.officeDashJs.OfficeNs.ProjectTaskFields.Start8 with Double = js.native
  /* 56 */ val Start9: typings.officeDashJs.OfficeNs.ProjectTaskFields.Start9 with Double = js.native
  /* 272 */ val StartSlack: typings.officeDashJs.OfficeNs.ProjectTaskFields.StartSlack with Double = js.native
  /* 273 */ val Status: typings.officeDashJs.OfficeNs.ProjectTaskFields.Status with Double = js.native
  /* 275 */ val StatusManager: typings.officeDashJs.OfficeNs.ProjectTaskFields.StatusManager with Double = js.native
  /* 274 */ val Successors: typings.officeDashJs.OfficeNs.ProjectTaskFields.Successors with Double = js.native
  /* 261 */ val Summary: typings.officeDashJs.OfficeNs.ProjectTaskFields.Summary with Double = js.native
  /* 160 */ val TaskCalendarGUID: typings.officeDashJs.OfficeNs.ProjectTaskFields.TaskCalendarGUID with Double = js.native
  /* 277 */ val TaskGUID: typings.officeDashJs.OfficeNs.ProjectTaskFields.TaskGUID with Double = js.native
  /* 7 */ val Text1: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text1 with Double = js.native
  /* 8 */ val Text10: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text10 with Double = js.native
  /* 11 */ val Text11: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text11 with Double = js.native
  /* 12 */ val Text12: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text12 with Double = js.native
  /* 13 */ val Text13: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text13 with Double = js.native
  /* 14 */ val Text14: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text14 with Double = js.native
  /* 15 */ val Text15: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text15 with Double = js.native
  /* 16 */ val Text16: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text16 with Double = js.native
  /* 17 */ val Text17: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text17 with Double = js.native
  /* 18 */ val Text18: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text18 with Double = js.native
  /* 19 */ val Text19: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text19 with Double = js.native
  /* 22 */ val Text2: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text2 with Double = js.native
  /* 23 */ val Text20: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text20 with Double = js.native
  /* 24 */ val Text21: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text21 with Double = js.native
  /* 25 */ val Text22: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text22 with Double = js.native
  /* 26 */ val Text23: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text23 with Double = js.native
  /* 27 */ val Text24: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text24 with Double = js.native
  /* 28 */ val Text25: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text25 with Double = js.native
  /* 29 */ val Text26: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text26 with Double = js.native
  /* 30 */ val Text27: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text27 with Double = js.native
  /* 31 */ val Text28: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text28 with Double = js.native
  /* 32 */ val Text29: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text29 with Double = js.native
  /* 35 */ val Text3: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text3 with Double = js.native
  /* 36 */ val Text30: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text30 with Double = js.native
  /* 39 */ val Text4: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text4 with Double = js.native
  /* 42 */ val Text5: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text5 with Double = js.native
  /* 45 */ val Text6: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text6 with Double = js.native
  /* 48 */ val Text7: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text7 with Double = js.native
  /* 51 */ val Text8: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text8 with Double = js.native
  /* 54 */ val Text9: typings.officeDashJs.OfficeNs.ProjectTaskFields.Text9 with Double = js.native
  /* 276 */ val TotalSlack: typings.officeDashJs.OfficeNs.ProjectTaskFields.TotalSlack with Double = js.native
  /* 278 */ val Type: typings.officeDashJs.OfficeNs.ProjectTaskFields.Type with Double = js.native
  /* 279 */ val WBS: typings.officeDashJs.OfficeNs.ProjectTaskFields.WBS with Double = js.native
  /* 280 */ val WBSPREDECESSORS: typings.officeDashJs.OfficeNs.ProjectTaskFields.WBSPREDECESSORS with Double = js.native
  /* 281 */ val WBSSUCCESSORS: typings.officeDashJs.OfficeNs.ProjectTaskFields.WBSSUCCESSORS with Double = js.native
  /* 282 */ val WSSID: typings.officeDashJs.OfficeNs.ProjectTaskFields.WSSID with Double = js.native
  /* 271 */ val Work: typings.officeDashJs.OfficeNs.ProjectTaskFields.Work with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectTaskFields with Double] = js.native
}

