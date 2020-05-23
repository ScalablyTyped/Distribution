package typings.officeJs.Office

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
  
}

