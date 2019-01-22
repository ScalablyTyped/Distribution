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
  * 
  * **Support details**
  * 
  * A capital Y in the following matrix indicates that this enumeration is supported in the corresponding Office host application. 
  * An empty cell indicates that the Office host application doesn't support this enumeration.
  * 
  * For more information about Office host application and server requirements, see 
  * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
  * 
  * *Supported hosts, by platform*
  *  <table>
  *   <tr><th>                          </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th></tr>
  *   <tr><td><strong> Project </strong></td><td> Y                          </td><td>                            </td></tr>
  *  </table>
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
  
  val Active: Active with java.lang.String = js.native
  val ActualCost: ActualCost with java.lang.String = js.native
  val ActualDuration: ActualDuration with java.lang.String = js.native
  val ActualFinish: ActualFinish with java.lang.String = js.native
  val ActualOvertimeCost: ActualOvertimeCost with java.lang.String = js.native
  val ActualOvertimeWork: ActualOvertimeWork with java.lang.String = js.native
  val ActualStart: ActualStart with java.lang.String = js.native
  val ActualWork: ActualWork with java.lang.String = js.native
  val Baseline10BudgetCost: Baseline10BudgetCost with java.lang.String = js.native
  val Baseline10BudgetWork: Baseline10BudgetWork with java.lang.String = js.native
  val Baseline10Cost: Baseline10Cost with java.lang.String = js.native
  val Baseline10Duration: Baseline10Duration with java.lang.String = js.native
  val Baseline10Finish: Baseline10Finish with java.lang.String = js.native
  val Baseline10FixedCost: Baseline10FixedCost with java.lang.String = js.native
  val Baseline10FixedCostAccrual: Baseline10FixedCostAccrual with java.lang.String = js.native
  val Baseline10Start: Baseline10Start with java.lang.String = js.native
  val Baseline10Work: Baseline10Work with java.lang.String = js.native
  val Baseline1BudgetCost: Baseline1BudgetCost with java.lang.String = js.native
  val Baseline1BudgetWork: Baseline1BudgetWork with java.lang.String = js.native
  val Baseline1Cost: Baseline1Cost with java.lang.String = js.native
  val Baseline1Duration: Baseline1Duration with java.lang.String = js.native
  val Baseline1Finish: Baseline1Finish with java.lang.String = js.native
  val Baseline1FixedCost: Baseline1FixedCost with java.lang.String = js.native
  val Baseline1FixedCostAccrual: Baseline1FixedCostAccrual with java.lang.String = js.native
  val Baseline1Start: Baseline1Start with java.lang.String = js.native
  val Baseline1Work: Baseline1Work with java.lang.String = js.native
  val Baseline2BudgetCost: Baseline2BudgetCost with java.lang.String = js.native
  val Baseline2BudgetWork: Baseline2BudgetWork with java.lang.String = js.native
  val Baseline2Cost: Baseline2Cost with java.lang.String = js.native
  val Baseline2Duration: Baseline2Duration with java.lang.String = js.native
  val Baseline2Finish: Baseline2Finish with java.lang.String = js.native
  val Baseline2FixedCost: Baseline2FixedCost with java.lang.String = js.native
  val Baseline2FixedCostAccrual: Baseline2FixedCostAccrual with java.lang.String = js.native
  val Baseline2Start: Baseline2Start with java.lang.String = js.native
  val Baseline2Work: Baseline2Work with java.lang.String = js.native
  val Baseline3BudgetCost: Baseline3BudgetCost with java.lang.String = js.native
  val Baseline3BudgetWork: Baseline3BudgetWork with java.lang.String = js.native
  val Baseline3Cost: Baseline3Cost with java.lang.String = js.native
  val Baseline3Duration: Baseline3Duration with java.lang.String = js.native
  val Baseline3Finish: Baseline3Finish with java.lang.String = js.native
  val Baseline3FixedCost: Baseline3FixedCost with java.lang.String = js.native
  val Baseline3FixedCostAccrual: Baseline3FixedCostAccrual with java.lang.String = js.native
  val Baseline3Start: Baseline3Start with java.lang.String = js.native
  val Baseline3Work: Baseline3Work with java.lang.String = js.native
  val Baseline4BudgetCost: Baseline4BudgetCost with java.lang.String = js.native
  val Baseline4BudgetWork: Baseline4BudgetWork with java.lang.String = js.native
  val Baseline4Cost: Baseline4Cost with java.lang.String = js.native
  val Baseline4Duration: Baseline4Duration with java.lang.String = js.native
  val Baseline4Finish: Baseline4Finish with java.lang.String = js.native
  val Baseline4FixedCost: Baseline4FixedCost with java.lang.String = js.native
  val Baseline4FixedCostAccrual: Baseline4FixedCostAccrual with java.lang.String = js.native
  val Baseline4Start: Baseline4Start with java.lang.String = js.native
  val Baseline4Work: Baseline4Work with java.lang.String = js.native
  val Baseline5BudgetCost: Baseline5BudgetCost with java.lang.String = js.native
  val Baseline5BudgetWork: Baseline5BudgetWork with java.lang.String = js.native
  val Baseline5Cost: Baseline5Cost with java.lang.String = js.native
  val Baseline5Duration: Baseline5Duration with java.lang.String = js.native
  val Baseline5Finish: Baseline5Finish with java.lang.String = js.native
  val Baseline5FixedCost: Baseline5FixedCost with java.lang.String = js.native
  val Baseline5FixedCostAccrual: Baseline5FixedCostAccrual with java.lang.String = js.native
  val Baseline5Start: Baseline5Start with java.lang.String = js.native
  val Baseline5Work: Baseline5Work with java.lang.String = js.native
  val Baseline6BudgetCost: Baseline6BudgetCost with java.lang.String = js.native
  val Baseline6BudgetWork: Baseline6BudgetWork with java.lang.String = js.native
  val Baseline6Cost: Baseline6Cost with java.lang.String = js.native
  val Baseline6Duration: Baseline6Duration with java.lang.String = js.native
  val Baseline6Finish: Baseline6Finish with java.lang.String = js.native
  val Baseline6FixedCost: Baseline6FixedCost with java.lang.String = js.native
  val Baseline6FixedCostAccrual: Baseline6FixedCostAccrual with java.lang.String = js.native
  val Baseline6Start: Baseline6Start with java.lang.String = js.native
  val Baseline6Work: Baseline6Work with java.lang.String = js.native
  val Baseline7BudgetCost: Baseline7BudgetCost with java.lang.String = js.native
  val Baseline7BudgetWork: Baseline7BudgetWork with java.lang.String = js.native
  val Baseline7Cost: Baseline7Cost with java.lang.String = js.native
  val Baseline7Duration: Baseline7Duration with java.lang.String = js.native
  val Baseline7Finish: Baseline7Finish with java.lang.String = js.native
  val Baseline7FixedCost: Baseline7FixedCost with java.lang.String = js.native
  val Baseline7FixedCostAccrual: Baseline7FixedCostAccrual with java.lang.String = js.native
  val Baseline7Start: Baseline7Start with java.lang.String = js.native
  val Baseline7Work: Baseline7Work with java.lang.String = js.native
  val Baseline8BudgetCost: Baseline8BudgetCost with java.lang.String = js.native
  val Baseline8BudgetWork: Baseline8BudgetWork with java.lang.String = js.native
  val Baseline8Cost: Baseline8Cost with java.lang.String = js.native
  val Baseline8Duration: Baseline8Duration with java.lang.String = js.native
  val Baseline8Finish: Baseline8Finish with java.lang.String = js.native
  val Baseline8FixedCost: Baseline8FixedCost with java.lang.String = js.native
  val Baseline8FixedCostAccrual: Baseline8FixedCostAccrual with java.lang.String = js.native
  val Baseline8Start: Baseline8Start with java.lang.String = js.native
  val Baseline8Work: Baseline8Work with java.lang.String = js.native
  val Baseline9BudgetCost: Baseline9BudgetCost with java.lang.String = js.native
  val Baseline9BudgetWork: Baseline9BudgetWork with java.lang.String = js.native
  val Baseline9Cost: Baseline9Cost with java.lang.String = js.native
  val Baseline9Duration: Baseline9Duration with java.lang.String = js.native
  val Baseline9Finish: Baseline9Finish with java.lang.String = js.native
  val Baseline9FixedCost: Baseline9FixedCost with java.lang.String = js.native
  val Baseline9FixedCostAccrual: Baseline9FixedCostAccrual with java.lang.String = js.native
  val Baseline9Start: Baseline9Start with java.lang.String = js.native
  val Baseline9Work: Baseline9Work with java.lang.String = js.native
  val BaselineBudgetCost: BaselineBudgetCost with java.lang.String = js.native
  val BaselineBudgetWork: BaselineBudgetWork with java.lang.String = js.native
  val BaselineCost: BaselineCost with java.lang.String = js.native
  val BaselineDuration: BaselineDuration with java.lang.String = js.native
  val BaselineFinish: BaselineFinish with java.lang.String = js.native
  val BaselineFixedCost: BaselineFixedCost with java.lang.String = js.native
  val BaselineFixedCostAccrual: BaselineFixedCostAccrual with java.lang.String = js.native
  val BaselineStart: BaselineStart with java.lang.String = js.native
  val BaselineWork: BaselineWork with java.lang.String = js.native
  val BudgetCost: BudgetCost with java.lang.String = js.native
  val BudgetFixedCost: BudgetFixedCost with java.lang.String = js.native
  val BudgetFixedWork: BudgetFixedWork with java.lang.String = js.native
  val BudgetWork: BudgetWork with java.lang.String = js.native
  val ConstraintDate: ConstraintDate with java.lang.String = js.native
  val ConstraintType: ConstraintType with java.lang.String = js.native
  val Cost: Cost with java.lang.String = js.native
  val Cost1: Cost1 with java.lang.String = js.native
  val Cost10: Cost10 with java.lang.String = js.native
  val Cost2: Cost2 with java.lang.String = js.native
  val Cost3: Cost3 with java.lang.String = js.native
  val Cost4: Cost4 with java.lang.String = js.native
  val Cost5: Cost5 with java.lang.String = js.native
  val Cost6: Cost6 with java.lang.String = js.native
  val Cost7: Cost7 with java.lang.String = js.native
  val Cost8: Cost8 with java.lang.String = js.native
  val Cost9: Cost9 with java.lang.String = js.native
  val Critical: Critical with java.lang.String = js.native
  val Date1: Date1 with java.lang.String = js.native
  val Date10: Date10 with java.lang.String = js.native
  val Date2: Date2 with java.lang.String = js.native
  val Date3: Date3 with java.lang.String = js.native
  val Date4: Date4 with java.lang.String = js.native
  val Date5: Date5 with java.lang.String = js.native
  val Date6: Date6 with java.lang.String = js.native
  val Date7: Date7 with java.lang.String = js.native
  val Date8: Date8 with java.lang.String = js.native
  val Date9: Date9 with java.lang.String = js.native
  val Deadline: Deadline with java.lang.String = js.native
  val Duration: Duration with java.lang.String = js.native
  val Duration1: Duration1 with java.lang.String = js.native
  val Duration10: Duration10 with java.lang.String = js.native
  val Duration2: Duration2 with java.lang.String = js.native
  val Duration3: Duration3 with java.lang.String = js.native
  val Duration4: Duration4 with java.lang.String = js.native
  val Duration5: Duration5 with java.lang.String = js.native
  val Duration6: Duration6 with java.lang.String = js.native
  val Duration7: Duration7 with java.lang.String = js.native
  val Duration8: Duration8 with java.lang.String = js.native
  val Duration9: Duration9 with java.lang.String = js.native
  val EarnedValueMethod: EarnedValueMethod with java.lang.String = js.native
  val Finish: Finish with java.lang.String = js.native
  val Finish1: Finish1 with java.lang.String = js.native
  val Finish10: Finish10 with java.lang.String = js.native
  val Finish2: Finish2 with java.lang.String = js.native
  val Finish3: Finish3 with java.lang.String = js.native
  val Finish4: Finish4 with java.lang.String = js.native
  val Finish5: Finish5 with java.lang.String = js.native
  val Finish6: Finish6 with java.lang.String = js.native
  val Finish7: Finish7 with java.lang.String = js.native
  val Finish8: Finish8 with java.lang.String = js.native
  val Finish9: Finish9 with java.lang.String = js.native
  val FinishSlack: FinishSlack with java.lang.String = js.native
  val FixedCost: FixedCost with java.lang.String = js.native
  val FixedCostAccrual: FixedCostAccrual with java.lang.String = js.native
  val Flag1: Flag1 with java.lang.String = js.native
  val Flag10: Flag10 with java.lang.String = js.native
  val Flag11: Flag11 with java.lang.String = js.native
  val Flag12: Flag12 with java.lang.String = js.native
  val Flag13: Flag13 with java.lang.String = js.native
  val Flag14: Flag14 with java.lang.String = js.native
  val Flag15: Flag15 with java.lang.String = js.native
  val Flag16: Flag16 with java.lang.String = js.native
  val Flag17: Flag17 with java.lang.String = js.native
  val Flag18: Flag18 with java.lang.String = js.native
  val Flag19: Flag19 with java.lang.String = js.native
  val Flag2: Flag2 with java.lang.String = js.native
  val Flag20: Flag20 with java.lang.String = js.native
  val Flag3: Flag3 with java.lang.String = js.native
  val Flag4: Flag4 with java.lang.String = js.native
  val Flag5: Flag5 with java.lang.String = js.native
  val Flag6: Flag6 with java.lang.String = js.native
  val Flag7: Flag7 with java.lang.String = js.native
  val Flag8: Flag8 with java.lang.String = js.native
  val Flag9: Flag9 with java.lang.String = js.native
  val FreeSlack: FreeSlack with java.lang.String = js.native
  val HasRollupSubTasks: HasRollupSubTasks with java.lang.String = js.native
  val ID: ID with java.lang.String = js.native
  val IsRollup: IsRollup with java.lang.String = js.native
  val Milestone: Milestone with java.lang.String = js.native
  val Name: Name with java.lang.String = js.native
  val Notes: Notes with java.lang.String = js.native
  val Number1: Number1 with java.lang.String = js.native
  val Number10: Number10 with java.lang.String = js.native
  val Number11: Number11 with java.lang.String = js.native
  val Number12: Number12 with java.lang.String = js.native
  val Number13: Number13 with java.lang.String = js.native
  val Number14: Number14 with java.lang.String = js.native
  val Number15: Number15 with java.lang.String = js.native
  val Number16: Number16 with java.lang.String = js.native
  val Number17: Number17 with java.lang.String = js.native
  val Number18: Number18 with java.lang.String = js.native
  val Number19: Number19 with java.lang.String = js.native
  val Number2: Number2 with java.lang.String = js.native
  val Number20: Number20 with java.lang.String = js.native
  val Number3: Number3 with java.lang.String = js.native
  val Number4: Number4 with java.lang.String = js.native
  val Number5: Number5 with java.lang.String = js.native
  val Number6: Number6 with java.lang.String = js.native
  val Number7: Number7 with java.lang.String = js.native
  val Number8: Number8 with java.lang.String = js.native
  val Number9: Number9 with java.lang.String = js.native
  val OutlineLevel: OutlineLevel with java.lang.String = js.native
  val Overallocated: Overallocated with java.lang.String = js.native
  val OvertimeCost: OvertimeCost with java.lang.String = js.native
  val OvertimeWork: OvertimeWork with java.lang.String = js.native
  val PercentComplete: PercentComplete with java.lang.String = js.native
  val PercentWorkComplete: PercentWorkComplete with java.lang.String = js.native
  val Predecessors: Predecessors with java.lang.String = js.native
  val PreleveledFinish: PreleveledFinish with java.lang.String = js.native
  val PreleveledStart: PreleveledStart with java.lang.String = js.native
  val Priority: Priority with java.lang.String = js.native
  val RegularWork: RegularWork with java.lang.String = js.native
  val RemainingCost: RemainingCost with java.lang.String = js.native
  val RemainingDuration: RemainingDuration with java.lang.String = js.native
  val RemainingOvertimeCost: RemainingOvertimeCost with java.lang.String = js.native
  val RemainingWork: RemainingWork with java.lang.String = js.native
  val ResourceNames: ResourceNames with java.lang.String = js.native
  val ScheduledDuration: ScheduledDuration with java.lang.String = js.native
  val ScheduledFinish: ScheduledFinish with java.lang.String = js.native
  val ScheduledStart: ScheduledStart with java.lang.String = js.native
  val Start: Start with java.lang.String = js.native
  val Start1: Start1 with java.lang.String = js.native
  val Start10: Start10 with java.lang.String = js.native
  val Start2: Start2 with java.lang.String = js.native
  val Start3: Start3 with java.lang.String = js.native
  val Start4: Start4 with java.lang.String = js.native
  val Start5: Start5 with java.lang.String = js.native
  val Start6: Start6 with java.lang.String = js.native
  val Start7: Start7 with java.lang.String = js.native
  val Start8: Start8 with java.lang.String = js.native
  val Start9: Start9 with java.lang.String = js.native
  val StartSlack: StartSlack with java.lang.String = js.native
  val Status: Status with java.lang.String = js.native
  val StatusManager: StatusManager with java.lang.String = js.native
  val Successors: Successors with java.lang.String = js.native
  val Summary: Summary with java.lang.String = js.native
  val TaskCalendarGUID: TaskCalendarGUID with java.lang.String = js.native
  val TaskGUID: TaskGUID with java.lang.String = js.native
  val Text1: Text1 with java.lang.String = js.native
  val Text10: Text10 with java.lang.String = js.native
  val Text11: Text11 with java.lang.String = js.native
  val Text12: Text12 with java.lang.String = js.native
  val Text13: Text13 with java.lang.String = js.native
  val Text14: Text14 with java.lang.String = js.native
  val Text15: Text15 with java.lang.String = js.native
  val Text16: Text16 with java.lang.String = js.native
  val Text17: Text17 with java.lang.String = js.native
  val Text18: Text18 with java.lang.String = js.native
  val Text19: Text19 with java.lang.String = js.native
  val Text2: Text2 with java.lang.String = js.native
  val Text20: Text20 with java.lang.String = js.native
  val Text21: Text21 with java.lang.String = js.native
  val Text22: Text22 with java.lang.String = js.native
  val Text23: Text23 with java.lang.String = js.native
  val Text24: Text24 with java.lang.String = js.native
  val Text25: Text25 with java.lang.String = js.native
  val Text26: Text26 with java.lang.String = js.native
  val Text27: Text27 with java.lang.String = js.native
  val Text28: Text28 with java.lang.String = js.native
  val Text29: Text29 with java.lang.String = js.native
  val Text3: Text3 with java.lang.String = js.native
  val Text30: Text30 with java.lang.String = js.native
  val Text4: Text4 with java.lang.String = js.native
  val Text5: Text5 with java.lang.String = js.native
  val Text6: Text6 with java.lang.String = js.native
  val Text7: Text7 with java.lang.String = js.native
  val Text8: Text8 with java.lang.String = js.native
  val Text9: Text9 with java.lang.String = js.native
  val TotalSlack: TotalSlack with java.lang.String = js.native
  val Type: Type with java.lang.String = js.native
  val WBS: WBS with java.lang.String = js.native
  val WBSPREDECESSORS: WBSPREDECESSORS with java.lang.String = js.native
  val WBSSUCCESSORS: WBSSUCCESSORS with java.lang.String = js.native
  val WSSID: WSSID with java.lang.String = js.native
  val Work: Work with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.ProjectTaskFields with java.lang.String] = js.native
}

