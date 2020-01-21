package typings.officeJsPreview.Office

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectTaskFields with Double] = js.native
  /* 256 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /* 0 */ @js.native
  object ActualCost extends TopLevel[ActualCost with Double]
  
  /* 1 */ @js.native
  object ActualDuration extends TopLevel[ActualDuration with Double]
  
  /* 2 */ @js.native
  object ActualFinish extends TopLevel[ActualFinish with Double]
  
  /* 3 */ @js.native
  object ActualOvertimeCost extends TopLevel[ActualOvertimeCost with Double]
  
  /* 4 */ @js.native
  object ActualOvertimeWork extends TopLevel[ActualOvertimeWork with Double]
  
  /* 5 */ @js.native
  object ActualStart extends TopLevel[ActualStart with Double]
  
  /* 6 */ @js.native
  object ActualWork extends TopLevel[ActualWork with Double]
  
  /* 57 */ @js.native
  object Baseline10BudgetCost extends TopLevel[Baseline10BudgetCost with Double]
  
  /* 58 */ @js.native
  object Baseline10BudgetWork extends TopLevel[Baseline10BudgetWork with Double]
  
  /* 59 */ @js.native
  object Baseline10Cost extends TopLevel[Baseline10Cost with Double]
  
  /* 60 */ @js.native
  object Baseline10Duration extends TopLevel[Baseline10Duration with Double]
  
  /* 61 */ @js.native
  object Baseline10Finish extends TopLevel[Baseline10Finish with Double]
  
  /* 62 */ @js.native
  object Baseline10FixedCost extends TopLevel[Baseline10FixedCost with Double]
  
  /* 63 */ @js.native
  object Baseline10FixedCostAccrual extends TopLevel[Baseline10FixedCostAccrual with Double]
  
  /* 64 */ @js.native
  object Baseline10Start extends TopLevel[Baseline10Start with Double]
  
  /* 65 */ @js.native
  object Baseline10Work extends TopLevel[Baseline10Work with Double]
  
  /* 66 */ @js.native
  object Baseline1BudgetCost extends TopLevel[Baseline1BudgetCost with Double]
  
  /* 67 */ @js.native
  object Baseline1BudgetWork extends TopLevel[Baseline1BudgetWork with Double]
  
  /* 68 */ @js.native
  object Baseline1Cost extends TopLevel[Baseline1Cost with Double]
  
  /* 69 */ @js.native
  object Baseline1Duration extends TopLevel[Baseline1Duration with Double]
  
  /* 70 */ @js.native
  object Baseline1Finish extends TopLevel[Baseline1Finish with Double]
  
  /* 71 */ @js.native
  object Baseline1FixedCost extends TopLevel[Baseline1FixedCost with Double]
  
  /* 72 */ @js.native
  object Baseline1FixedCostAccrual extends TopLevel[Baseline1FixedCostAccrual with Double]
  
  /* 73 */ @js.native
  object Baseline1Start extends TopLevel[Baseline1Start with Double]
  
  /* 74 */ @js.native
  object Baseline1Work extends TopLevel[Baseline1Work with Double]
  
  /* 75 */ @js.native
  object Baseline2BudgetCost extends TopLevel[Baseline2BudgetCost with Double]
  
  /* 76 */ @js.native
  object Baseline2BudgetWork extends TopLevel[Baseline2BudgetWork with Double]
  
  /* 77 */ @js.native
  object Baseline2Cost extends TopLevel[Baseline2Cost with Double]
  
  /* 78 */ @js.native
  object Baseline2Duration extends TopLevel[Baseline2Duration with Double]
  
  /* 79 */ @js.native
  object Baseline2Finish extends TopLevel[Baseline2Finish with Double]
  
  /* 80 */ @js.native
  object Baseline2FixedCost extends TopLevel[Baseline2FixedCost with Double]
  
  /* 81 */ @js.native
  object Baseline2FixedCostAccrual extends TopLevel[Baseline2FixedCostAccrual with Double]
  
  /* 82 */ @js.native
  object Baseline2Start extends TopLevel[Baseline2Start with Double]
  
  /* 83 */ @js.native
  object Baseline2Work extends TopLevel[Baseline2Work with Double]
  
  /* 84 */ @js.native
  object Baseline3BudgetCost extends TopLevel[Baseline3BudgetCost with Double]
  
  /* 85 */ @js.native
  object Baseline3BudgetWork extends TopLevel[Baseline3BudgetWork with Double]
  
  /* 86 */ @js.native
  object Baseline3Cost extends TopLevel[Baseline3Cost with Double]
  
  /* 87 */ @js.native
  object Baseline3Duration extends TopLevel[Baseline3Duration with Double]
  
  /* 88 */ @js.native
  object Baseline3Finish extends TopLevel[Baseline3Finish with Double]
  
  /* 89 */ @js.native
  object Baseline3FixedCost extends TopLevel[Baseline3FixedCost with Double]
  
  /* 90 */ @js.native
  object Baseline3FixedCostAccrual extends TopLevel[Baseline3FixedCostAccrual with Double]
  
  /* 91 */ @js.native
  object Baseline3Start extends TopLevel[Baseline3Start with Double]
  
  /* 92 */ @js.native
  object Baseline3Work extends TopLevel[Baseline3Work with Double]
  
  /* 93 */ @js.native
  object Baseline4BudgetCost extends TopLevel[Baseline4BudgetCost with Double]
  
  /* 94 */ @js.native
  object Baseline4BudgetWork extends TopLevel[Baseline4BudgetWork with Double]
  
  /* 95 */ @js.native
  object Baseline4Cost extends TopLevel[Baseline4Cost with Double]
  
  /* 96 */ @js.native
  object Baseline4Duration extends TopLevel[Baseline4Duration with Double]
  
  /* 97 */ @js.native
  object Baseline4Finish extends TopLevel[Baseline4Finish with Double]
  
  /* 98 */ @js.native
  object Baseline4FixedCost extends TopLevel[Baseline4FixedCost with Double]
  
  /* 99 */ @js.native
  object Baseline4FixedCostAccrual extends TopLevel[Baseline4FixedCostAccrual with Double]
  
  /* 100 */ @js.native
  object Baseline4Start extends TopLevel[Baseline4Start with Double]
  
  /* 101 */ @js.native
  object Baseline4Work extends TopLevel[Baseline4Work with Double]
  
  /* 102 */ @js.native
  object Baseline5BudgetCost extends TopLevel[Baseline5BudgetCost with Double]
  
  /* 103 */ @js.native
  object Baseline5BudgetWork extends TopLevel[Baseline5BudgetWork with Double]
  
  /* 104 */ @js.native
  object Baseline5Cost extends TopLevel[Baseline5Cost with Double]
  
  /* 105 */ @js.native
  object Baseline5Duration extends TopLevel[Baseline5Duration with Double]
  
  /* 106 */ @js.native
  object Baseline5Finish extends TopLevel[Baseline5Finish with Double]
  
  /* 107 */ @js.native
  object Baseline5FixedCost extends TopLevel[Baseline5FixedCost with Double]
  
  /* 108 */ @js.native
  object Baseline5FixedCostAccrual extends TopLevel[Baseline5FixedCostAccrual with Double]
  
  /* 109 */ @js.native
  object Baseline5Start extends TopLevel[Baseline5Start with Double]
  
  /* 110 */ @js.native
  object Baseline5Work extends TopLevel[Baseline5Work with Double]
  
  /* 111 */ @js.native
  object Baseline6BudgetCost extends TopLevel[Baseline6BudgetCost with Double]
  
  /* 112 */ @js.native
  object Baseline6BudgetWork extends TopLevel[Baseline6BudgetWork with Double]
  
  /* 113 */ @js.native
  object Baseline6Cost extends TopLevel[Baseline6Cost with Double]
  
  /* 114 */ @js.native
  object Baseline6Duration extends TopLevel[Baseline6Duration with Double]
  
  /* 115 */ @js.native
  object Baseline6Finish extends TopLevel[Baseline6Finish with Double]
  
  /* 116 */ @js.native
  object Baseline6FixedCost extends TopLevel[Baseline6FixedCost with Double]
  
  /* 117 */ @js.native
  object Baseline6FixedCostAccrual extends TopLevel[Baseline6FixedCostAccrual with Double]
  
  /* 118 */ @js.native
  object Baseline6Start extends TopLevel[Baseline6Start with Double]
  
  /* 119 */ @js.native
  object Baseline6Work extends TopLevel[Baseline6Work with Double]
  
  /* 120 */ @js.native
  object Baseline7BudgetCost extends TopLevel[Baseline7BudgetCost with Double]
  
  /* 121 */ @js.native
  object Baseline7BudgetWork extends TopLevel[Baseline7BudgetWork with Double]
  
  /* 122 */ @js.native
  object Baseline7Cost extends TopLevel[Baseline7Cost with Double]
  
  /* 123 */ @js.native
  object Baseline7Duration extends TopLevel[Baseline7Duration with Double]
  
  /* 124 */ @js.native
  object Baseline7Finish extends TopLevel[Baseline7Finish with Double]
  
  /* 125 */ @js.native
  object Baseline7FixedCost extends TopLevel[Baseline7FixedCost with Double]
  
  /* 126 */ @js.native
  object Baseline7FixedCostAccrual extends TopLevel[Baseline7FixedCostAccrual with Double]
  
  /* 127 */ @js.native
  object Baseline7Start extends TopLevel[Baseline7Start with Double]
  
  /* 128 */ @js.native
  object Baseline7Work extends TopLevel[Baseline7Work with Double]
  
  /* 129 */ @js.native
  object Baseline8BudgetCost extends TopLevel[Baseline8BudgetCost with Double]
  
  /* 130 */ @js.native
  object Baseline8BudgetWork extends TopLevel[Baseline8BudgetWork with Double]
  
  /* 131 */ @js.native
  object Baseline8Cost extends TopLevel[Baseline8Cost with Double]
  
  /* 132 */ @js.native
  object Baseline8Duration extends TopLevel[Baseline8Duration with Double]
  
  /* 133 */ @js.native
  object Baseline8Finish extends TopLevel[Baseline8Finish with Double]
  
  /* 134 */ @js.native
  object Baseline8FixedCost extends TopLevel[Baseline8FixedCost with Double]
  
  /* 135 */ @js.native
  object Baseline8FixedCostAccrual extends TopLevel[Baseline8FixedCostAccrual with Double]
  
  /* 136 */ @js.native
  object Baseline8Start extends TopLevel[Baseline8Start with Double]
  
  /* 137 */ @js.native
  object Baseline8Work extends TopLevel[Baseline8Work with Double]
  
  /* 138 */ @js.native
  object Baseline9BudgetCost extends TopLevel[Baseline9BudgetCost with Double]
  
  /* 139 */ @js.native
  object Baseline9BudgetWork extends TopLevel[Baseline9BudgetWork with Double]
  
  /* 140 */ @js.native
  object Baseline9Cost extends TopLevel[Baseline9Cost with Double]
  
  /* 141 */ @js.native
  object Baseline9Duration extends TopLevel[Baseline9Duration with Double]
  
  /* 142 */ @js.native
  object Baseline9Finish extends TopLevel[Baseline9Finish with Double]
  
  /* 143 */ @js.native
  object Baseline9FixedCost extends TopLevel[Baseline9FixedCost with Double]
  
  /* 144 */ @js.native
  object Baseline9FixedCostAccrual extends TopLevel[Baseline9FixedCostAccrual with Double]
  
  /* 145 */ @js.native
  object Baseline9Start extends TopLevel[Baseline9Start with Double]
  
  /* 146 */ @js.native
  object Baseline9Work extends TopLevel[Baseline9Work with Double]
  
  /* 147 */ @js.native
  object BaselineBudgetCost extends TopLevel[BaselineBudgetCost with Double]
  
  /* 148 */ @js.native
  object BaselineBudgetWork extends TopLevel[BaselineBudgetWork with Double]
  
  /* 149 */ @js.native
  object BaselineCost extends TopLevel[BaselineCost with Double]
  
  /* 150 */ @js.native
  object BaselineDuration extends TopLevel[BaselineDuration with Double]
  
  /* 151 */ @js.native
  object BaselineFinish extends TopLevel[BaselineFinish with Double]
  
  /* 152 */ @js.native
  object BaselineFixedCost extends TopLevel[BaselineFixedCost with Double]
  
  /* 153 */ @js.native
  object BaselineFixedCostAccrual extends TopLevel[BaselineFixedCostAccrual with Double]
  
  /* 154 */ @js.native
  object BaselineStart extends TopLevel[BaselineStart with Double]
  
  /* 155 */ @js.native
  object BaselineWork extends TopLevel[BaselineWork with Double]
  
  /* 156 */ @js.native
  object BudgetCost extends TopLevel[BudgetCost with Double]
  
  /* 157 */ @js.native
  object BudgetFixedCost extends TopLevel[BudgetFixedCost with Double]
  
  /* 158 */ @js.native
  object BudgetFixedWork extends TopLevel[BudgetFixedWork with Double]
  
  /* 159 */ @js.native
  object BudgetWork extends TopLevel[BudgetWork with Double]
  
  /* 161 */ @js.native
  object ConstraintDate extends TopLevel[ConstraintDate with Double]
  
  /* 162 */ @js.native
  object ConstraintType extends TopLevel[ConstraintType with Double]
  
  /* 268 */ @js.native
  object Cost extends TopLevel[Cost with Double]
  
  /* 163 */ @js.native
  object Cost1 extends TopLevel[Cost1 with Double]
  
  /* 164 */ @js.native
  object Cost10 extends TopLevel[Cost10 with Double]
  
  /* 165 */ @js.native
  object Cost2 extends TopLevel[Cost2 with Double]
  
  /* 166 */ @js.native
  object Cost3 extends TopLevel[Cost3 with Double]
  
  /* 167 */ @js.native
  object Cost4 extends TopLevel[Cost4 with Double]
  
  /* 168 */ @js.native
  object Cost5 extends TopLevel[Cost5 with Double]
  
  /* 169 */ @js.native
  object Cost6 extends TopLevel[Cost6 with Double]
  
  /* 170 */ @js.native
  object Cost7 extends TopLevel[Cost7 with Double]
  
  /* 171 */ @js.native
  object Cost8 extends TopLevel[Cost8 with Double]
  
  /* 172 */ @js.native
  object Cost9 extends TopLevel[Cost9 with Double]
  
  /* 257 */ @js.native
  object Critical extends TopLevel[Critical with Double]
  
  /* 173 */ @js.native
  object Date1 extends TopLevel[Date1 with Double]
  
  /* 174 */ @js.native
  object Date10 extends TopLevel[Date10 with Double]
  
  /* 175 */ @js.native
  object Date2 extends TopLevel[Date2 with Double]
  
  /* 176 */ @js.native
  object Date3 extends TopLevel[Date3 with Double]
  
  /* 177 */ @js.native
  object Date4 extends TopLevel[Date4 with Double]
  
  /* 178 */ @js.native
  object Date5 extends TopLevel[Date5 with Double]
  
  /* 179 */ @js.native
  object Date6 extends TopLevel[Date6 with Double]
  
  /* 180 */ @js.native
  object Date7 extends TopLevel[Date7 with Double]
  
  /* 181 */ @js.native
  object Date8 extends TopLevel[Date8 with Double]
  
  /* 182 */ @js.native
  object Date9 extends TopLevel[Date9 with Double]
  
  /* 183 */ @js.native
  object Deadline extends TopLevel[Deadline with Double]
  
  /* 194 */ @js.native
  object Duration extends TopLevel[Duration with Double]
  
  /* 184 */ @js.native
  object Duration1 extends TopLevel[Duration1 with Double]
  
  /* 185 */ @js.native
  object Duration10 extends TopLevel[Duration10 with Double]
  
  /* 186 */ @js.native
  object Duration2 extends TopLevel[Duration2 with Double]
  
  /* 187 */ @js.native
  object Duration3 extends TopLevel[Duration3 with Double]
  
  /* 188 */ @js.native
  object Duration4 extends TopLevel[Duration4 with Double]
  
  /* 189 */ @js.native
  object Duration5 extends TopLevel[Duration5 with Double]
  
  /* 190 */ @js.native
  object Duration6 extends TopLevel[Duration6 with Double]
  
  /* 191 */ @js.native
  object Duration7 extends TopLevel[Duration7 with Double]
  
  /* 192 */ @js.native
  object Duration8 extends TopLevel[Duration8 with Double]
  
  /* 193 */ @js.native
  object Duration9 extends TopLevel[Duration9 with Double]
  
  /* 195 */ @js.native
  object EarnedValueMethod extends TopLevel[EarnedValueMethod with Double]
  
  /* 269 */ @js.native
  object Finish extends TopLevel[Finish with Double]
  
  /* 20 */ @js.native
  object Finish1 extends TopLevel[Finish1 with Double]
  
  /* 9 */ @js.native
  object Finish10 extends TopLevel[Finish10 with Double]
  
  /* 33 */ @js.native
  object Finish2 extends TopLevel[Finish2 with Double]
  
  /* 37 */ @js.native
  object Finish3 extends TopLevel[Finish3 with Double]
  
  /* 40 */ @js.native
  object Finish4 extends TopLevel[Finish4 with Double]
  
  /* 43 */ @js.native
  object Finish5 extends TopLevel[Finish5 with Double]
  
  /* 46 */ @js.native
  object Finish6 extends TopLevel[Finish6 with Double]
  
  /* 49 */ @js.native
  object Finish7 extends TopLevel[Finish7 with Double]
  
  /* 52 */ @js.native
  object Finish8 extends TopLevel[Finish8 with Double]
  
  /* 55 */ @js.native
  object Finish9 extends TopLevel[Finish9 with Double]
  
  /* 196 */ @js.native
  object FinishSlack extends TopLevel[FinishSlack with Double]
  
  /* 197 */ @js.native
  object FixedCost extends TopLevel[FixedCost with Double]
  
  /* 198 */ @js.native
  object FixedCostAccrual extends TopLevel[FixedCostAccrual with Double]
  
  /* 200 */ @js.native
  object Flag1 extends TopLevel[Flag1 with Double]
  
  /* 199 */ @js.native
  object Flag10 extends TopLevel[Flag10 with Double]
  
  /* 201 */ @js.native
  object Flag11 extends TopLevel[Flag11 with Double]
  
  /* 202 */ @js.native
  object Flag12 extends TopLevel[Flag12 with Double]
  
  /* 203 */ @js.native
  object Flag13 extends TopLevel[Flag13 with Double]
  
  /* 204 */ @js.native
  object Flag14 extends TopLevel[Flag14 with Double]
  
  /* 205 */ @js.native
  object Flag15 extends TopLevel[Flag15 with Double]
  
  /* 206 */ @js.native
  object Flag16 extends TopLevel[Flag16 with Double]
  
  /* 207 */ @js.native
  object Flag17 extends TopLevel[Flag17 with Double]
  
  /* 208 */ @js.native
  object Flag18 extends TopLevel[Flag18 with Double]
  
  /* 209 */ @js.native
  object Flag19 extends TopLevel[Flag19 with Double]
  
  /* 210 */ @js.native
  object Flag2 extends TopLevel[Flag2 with Double]
  
  /* 211 */ @js.native
  object Flag20 extends TopLevel[Flag20 with Double]
  
  /* 212 */ @js.native
  object Flag3 extends TopLevel[Flag3 with Double]
  
  /* 213 */ @js.native
  object Flag4 extends TopLevel[Flag4 with Double]
  
  /* 214 */ @js.native
  object Flag5 extends TopLevel[Flag5 with Double]
  
  /* 215 */ @js.native
  object Flag6 extends TopLevel[Flag6 with Double]
  
  /* 216 */ @js.native
  object Flag7 extends TopLevel[Flag7 with Double]
  
  /* 217 */ @js.native
  object Flag8 extends TopLevel[Flag8 with Double]
  
  /* 218 */ @js.native
  object Flag9 extends TopLevel[Flag9 with Double]
  
  /* 219 */ @js.native
  object FreeSlack extends TopLevel[FreeSlack with Double]
  
  /* 220 */ @js.native
  object HasRollupSubTasks extends TopLevel[HasRollupSubTasks with Double]
  
  /* 221 */ @js.native
  object ID extends TopLevel[ID with Double]
  
  /* 260 */ @js.native
  object IsRollup extends TopLevel[IsRollup with Double]
  
  /* 258 */ @js.native
  object Milestone extends TopLevel[Milestone with Double]
  
  /* 222 */ @js.native
  object Name extends TopLevel[Name with Double]
  
  /* 223 */ @js.native
  object Notes extends TopLevel[Notes with Double]
  
  /* 224 */ @js.native
  object Number1 extends TopLevel[Number1 with Double]
  
  /* 225 */ @js.native
  object Number10 extends TopLevel[Number10 with Double]
  
  /* 226 */ @js.native
  object Number11 extends TopLevel[Number11 with Double]
  
  /* 227 */ @js.native
  object Number12 extends TopLevel[Number12 with Double]
  
  /* 228 */ @js.native
  object Number13 extends TopLevel[Number13 with Double]
  
  /* 229 */ @js.native
  object Number14 extends TopLevel[Number14 with Double]
  
  /* 230 */ @js.native
  object Number15 extends TopLevel[Number15 with Double]
  
  /* 231 */ @js.native
  object Number16 extends TopLevel[Number16 with Double]
  
  /* 232 */ @js.native
  object Number17 extends TopLevel[Number17 with Double]
  
  /* 233 */ @js.native
  object Number18 extends TopLevel[Number18 with Double]
  
  /* 234 */ @js.native
  object Number19 extends TopLevel[Number19 with Double]
  
  /* 235 */ @js.native
  object Number2 extends TopLevel[Number2 with Double]
  
  /* 236 */ @js.native
  object Number20 extends TopLevel[Number20 with Double]
  
  /* 237 */ @js.native
  object Number3 extends TopLevel[Number3 with Double]
  
  /* 238 */ @js.native
  object Number4 extends TopLevel[Number4 with Double]
  
  /* 239 */ @js.native
  object Number5 extends TopLevel[Number5 with Double]
  
  /* 240 */ @js.native
  object Number6 extends TopLevel[Number6 with Double]
  
  /* 241 */ @js.native
  object Number7 extends TopLevel[Number7 with Double]
  
  /* 242 */ @js.native
  object Number8 extends TopLevel[Number8 with Double]
  
  /* 243 */ @js.native
  object Number9 extends TopLevel[Number9 with Double]
  
  /* 247 */ @js.native
  object OutlineLevel extends TopLevel[OutlineLevel with Double]
  
  /* 259 */ @js.native
  object Overallocated extends TopLevel[Overallocated with Double]
  
  /* 248 */ @js.native
  object OvertimeCost extends TopLevel[OvertimeCost with Double]
  
  /* 249 */ @js.native
  object OvertimeWork extends TopLevel[OvertimeWork with Double]
  
  /* 250 */ @js.native
  object PercentComplete extends TopLevel[PercentComplete with Double]
  
  /* 251 */ @js.native
  object PercentWorkComplete extends TopLevel[PercentWorkComplete with Double]
  
  /* 252 */ @js.native
  object Predecessors extends TopLevel[Predecessors with Double]
  
  /* 253 */ @js.native
  object PreleveledFinish extends TopLevel[PreleveledFinish with Double]
  
  /* 254 */ @js.native
  object PreleveledStart extends TopLevel[PreleveledStart with Double]
  
  /* 255 */ @js.native
  object Priority extends TopLevel[Priority with Double]
  
  /* 262 */ @js.native
  object RegularWork extends TopLevel[RegularWork with Double]
  
  /* 263 */ @js.native
  object RemainingCost extends TopLevel[RemainingCost with Double]
  
  /* 264 */ @js.native
  object RemainingDuration extends TopLevel[RemainingDuration with Double]
  
  /* 265 */ @js.native
  object RemainingOvertimeCost extends TopLevel[RemainingOvertimeCost with Double]
  
  /* 266 */ @js.native
  object RemainingWork extends TopLevel[RemainingWork with Double]
  
  /* 267 */ @js.native
  object ResourceNames extends TopLevel[ResourceNames with Double]
  
  /* 244 */ @js.native
  object ScheduledDuration extends TopLevel[ScheduledDuration with Double]
  
  /* 245 */ @js.native
  object ScheduledFinish extends TopLevel[ScheduledFinish with Double]
  
  /* 246 */ @js.native
  object ScheduledStart extends TopLevel[ScheduledStart with Double]
  
  /* 270 */ @js.native
  object Start extends TopLevel[Start with Double]
  
  /* 21 */ @js.native
  object Start1 extends TopLevel[Start1 with Double]
  
  /* 10 */ @js.native
  object Start10 extends TopLevel[Start10 with Double]
  
  /* 34 */ @js.native
  object Start2 extends TopLevel[Start2 with Double]
  
  /* 38 */ @js.native
  object Start3 extends TopLevel[Start3 with Double]
  
  /* 41 */ @js.native
  object Start4 extends TopLevel[Start4 with Double]
  
  /* 44 */ @js.native
  object Start5 extends TopLevel[Start5 with Double]
  
  /* 47 */ @js.native
  object Start6 extends TopLevel[Start6 with Double]
  
  /* 50 */ @js.native
  object Start7 extends TopLevel[Start7 with Double]
  
  /* 53 */ @js.native
  object Start8 extends TopLevel[Start8 with Double]
  
  /* 56 */ @js.native
  object Start9 extends TopLevel[Start9 with Double]
  
  /* 272 */ @js.native
  object StartSlack extends TopLevel[StartSlack with Double]
  
  /* 273 */ @js.native
  object Status extends TopLevel[Status with Double]
  
  /* 275 */ @js.native
  object StatusManager extends TopLevel[StatusManager with Double]
  
  /* 274 */ @js.native
  object Successors extends TopLevel[Successors with Double]
  
  /* 261 */ @js.native
  object Summary extends TopLevel[Summary with Double]
  
  /* 160 */ @js.native
  object TaskCalendarGUID extends TopLevel[TaskCalendarGUID with Double]
  
  /* 277 */ @js.native
  object TaskGUID extends TopLevel[TaskGUID with Double]
  
  /* 7 */ @js.native
  object Text1 extends TopLevel[Text1 with Double]
  
  /* 8 */ @js.native
  object Text10 extends TopLevel[Text10 with Double]
  
  /* 11 */ @js.native
  object Text11 extends TopLevel[Text11 with Double]
  
  /* 12 */ @js.native
  object Text12 extends TopLevel[Text12 with Double]
  
  /* 13 */ @js.native
  object Text13 extends TopLevel[Text13 with Double]
  
  /* 14 */ @js.native
  object Text14 extends TopLevel[Text14 with Double]
  
  /* 15 */ @js.native
  object Text15 extends TopLevel[Text15 with Double]
  
  /* 16 */ @js.native
  object Text16 extends TopLevel[Text16 with Double]
  
  /* 17 */ @js.native
  object Text17 extends TopLevel[Text17 with Double]
  
  /* 18 */ @js.native
  object Text18 extends TopLevel[Text18 with Double]
  
  /* 19 */ @js.native
  object Text19 extends TopLevel[Text19 with Double]
  
  /* 22 */ @js.native
  object Text2 extends TopLevel[Text2 with Double]
  
  /* 23 */ @js.native
  object Text20 extends TopLevel[Text20 with Double]
  
  /* 24 */ @js.native
  object Text21 extends TopLevel[Text21 with Double]
  
  /* 25 */ @js.native
  object Text22 extends TopLevel[Text22 with Double]
  
  /* 26 */ @js.native
  object Text23 extends TopLevel[Text23 with Double]
  
  /* 27 */ @js.native
  object Text24 extends TopLevel[Text24 with Double]
  
  /* 28 */ @js.native
  object Text25 extends TopLevel[Text25 with Double]
  
  /* 29 */ @js.native
  object Text26 extends TopLevel[Text26 with Double]
  
  /* 30 */ @js.native
  object Text27 extends TopLevel[Text27 with Double]
  
  /* 31 */ @js.native
  object Text28 extends TopLevel[Text28 with Double]
  
  /* 32 */ @js.native
  object Text29 extends TopLevel[Text29 with Double]
  
  /* 35 */ @js.native
  object Text3 extends TopLevel[Text3 with Double]
  
  /* 36 */ @js.native
  object Text30 extends TopLevel[Text30 with Double]
  
  /* 39 */ @js.native
  object Text4 extends TopLevel[Text4 with Double]
  
  /* 42 */ @js.native
  object Text5 extends TopLevel[Text5 with Double]
  
  /* 45 */ @js.native
  object Text6 extends TopLevel[Text6 with Double]
  
  /* 48 */ @js.native
  object Text7 extends TopLevel[Text7 with Double]
  
  /* 51 */ @js.native
  object Text8 extends TopLevel[Text8 with Double]
  
  /* 54 */ @js.native
  object Text9 extends TopLevel[Text9 with Double]
  
  /* 276 */ @js.native
  object TotalSlack extends TopLevel[TotalSlack with Double]
  
  /* 278 */ @js.native
  object Type extends TopLevel[Type with Double]
  
  /* 279 */ @js.native
  object WBS extends TopLevel[WBS with Double]
  
  /* 280 */ @js.native
  object WBSPREDECESSORS extends TopLevel[WBSPREDECESSORS with Double]
  
  /* 281 */ @js.native
  object WBSSUCCESSORS extends TopLevel[WBSSUCCESSORS with Double]
  
  /* 282 */ @js.native
  object WSSID extends TopLevel[WSSID with Double]
  
  /* 271 */ @js.native
  object Work extends TopLevel[Work with Double]
  
}

