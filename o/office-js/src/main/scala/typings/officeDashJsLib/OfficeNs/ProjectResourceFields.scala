package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectResourceFields extends js.Object

/**
  * Specifies the resource fields that are available as a parameter for the {@link Office.Document | Document}.getResourceFieldAsync method.
  *
  * @remarks
  * A ProjectResourceFields constant can be used as a parameter of the {@link Office.Document | Document}.getResourceFieldAsync method.
  *
  * For more information about working with fields in Project, see 
  * {@link https://support.office.com/article/Available-fields-reference-615a4563-1cc3-40f4-b66f-1b17e793a460 | Available fields} reference. In 
  * Project Help, search for Available fields.
  */
@JSGlobal("Office.ProjectResourceFields")
@js.native
object ProjectResourceFields extends js.Object {
  /**
    * The accrual method that defines how a task accrues the cost of the resource: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Accrual
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The calculated actual cost of the resource for assignments in the project.
    */
  @js.native
  sealed trait ActualCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The actual overtime cost for a resource.
    */
  @js.native
  sealed trait ActualOvertimeCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The actual overtime work for a resource, in minutes.
    */
  @js.native
  sealed trait ActualOvertimeWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The actual overtime work for the resource that has been protected (made read-only).
    */
  @js.native
  sealed trait ActualOvertimeWorkProtected
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The actual work that the resource has done on assignments in the project.
    */
  @js.native
  sealed trait ActualWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The actual work for the resource that has been protected (made read-only).
    */
  @js.native
  sealed trait ActualWorkProtected
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The name of the base calendar for the resource.
    */
  @js.native
  sealed trait BaseCalendar
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline10BudgetCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline10BudgetWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline10Cost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline10Work
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline1BudgetCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline1BudgetWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline1Cost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline1Work
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline2BudgetCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline2BudgetWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline2Cost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline2Work
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline3BudgetCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline3BudgetWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline3Cost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline3Work
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline4BudgetCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline4BudgetWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline4Cost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline4Work
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline5BudgetCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline5BudgetWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline5Cost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline5Work
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline6BudgetCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline6BudgetWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline6Cost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline6Work
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline7BudgetCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline7BudgetWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline7Cost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline7Work
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline8BudgetCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline8BudgetWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline8Cost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline8Work
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline9BudgetCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline9BudgetWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline9Cost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline9Work
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait BaselineBudgetCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait BaselineBudgetWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The baseline cost for the resource for assignments in the project.
    */
  @js.native
  sealed trait BaselineCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The baseline work for the resource for assignments in the project, in minutes.
    */
  @js.native
  sealed trait BaselineWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the resource.
    */
  @js.native
  sealed trait BudgetCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the resource.
    */
  @js.native
  sealed trait BudgetWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The code value of the resource.
    */
  @js.native
  sealed trait Code
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The total cost of the resource.
    */
  @js.native
  sealed trait Cost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost1
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost10
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost2
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost3
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost4
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost5
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost6
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost7
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost8
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost9
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost per use of the resource.
    */
  @js.native
  sealed trait CostPerUse
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date1
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date10
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date2
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date3
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date4
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date5
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date6
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date7
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date8
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date9
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration1
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration10
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration2
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration3
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration4
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration5
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration6
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration7
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration8
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration9
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The email address of the resource.
    */
  @js.native
  sealed trait Email
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The end date of the resource availability.
    */
  @js.native
  sealed trait End
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish1
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish10
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish2
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish3
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish4
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish5
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish6
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish7
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish8
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish9
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag1
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag10
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag11
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag12
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag13
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag14
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag15
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag16
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag17
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag18
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag19
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag2
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag20
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag3
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag4
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag5
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag6
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag7
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag8
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag9
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * Indicates whether the resource is a generic resource (identified by skill rather than by name).
    */
  @js.native
  sealed trait Generic
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The group the resource belongs to.
    */
  @js.native
  sealed trait Group
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The name of the resource.
    */
  @js.native
  sealed trait Name
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The text value of the notes regarding the resource.
    */
  @js.native
  sealed trait Notes
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number1
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number10
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number11
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number12
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number13
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number14
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number15
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number16
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number17
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number18
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number19
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number2
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number20
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number3
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number4
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number5
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number6
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number7
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number8
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number9
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * Indicates whether the resource is overallocated.
    */
  @js.native
  sealed trait OverAllocated
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The overtime cost for a resource.
    */
  @js.native
  sealed trait OvertimeCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The overtime rate for a resource.
    */
  @js.native
  sealed trait OvertimeRate
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The overtime work for a resource.
    */
  @js.native
  sealed trait OvertimeWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The percentage of work complete for a resource.
    */
  @js.native
  sealed trait PercentWorkComplete
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The amount of regular work for the resource.
    */
  @js.native
  sealed trait RegularWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The remaining cost for the resource.
    */
  @js.native
  sealed trait RemainingCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The remaining overtime cost for the resource.
    */
  @js.native
  sealed trait RemainingOvertimeCost
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The remaining overtime work for the resource, in minutes.
    */
  @js.native
  sealed trait RemainingOvertimeWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The remaining work for the resource, in minutes.
    */
  @js.native
  sealed trait RemainingWork
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The GUID of the resource calendar.
    */
  @js.native
  sealed trait ResourceCalendarGUID
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The date the resource was created.
    */
  @js.native
  sealed trait ResourceCreationDate
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The ID of the resource.
    */
  @js.native
  sealed trait ResourceGUID
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The standard rate of pay for the resource, in cost per hour.
    */
  @js.native
  sealed trait StandardRate
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The start date for the resource.
    */
  @js.native
  sealed trait Start
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start1
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start10
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start2
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start3
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start4
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start5
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start6
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start7
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start8
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start9
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text1
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text10
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text11
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text12
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text13
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text14
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text15
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text16
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text17
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text18
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text19
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text2
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text20
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text21
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text22
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text23
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text24
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text25
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text26
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text27
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text28
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text29
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text3
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text30
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text4
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text5
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text6
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text7
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text8
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text9
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The percentage of work units that the resource has assigned in the project. If the resource is working full-time on the project, Units = 100.
    */
  @js.native
  sealed trait Units
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /**
    * The total work for the resource, in minutes.
    */
  @js.native
  sealed trait Work
    extends officeDashJsLib.OfficeNs.ProjectResourceFields
  
  /* 0 */ val Accrual: Accrual with scala.Double = js.native
  /* 1 */ val ActualCost: ActualCost with scala.Double = js.native
  /* 2 */ val ActualOvertimeCost: ActualOvertimeCost with scala.Double = js.native
  /* 3 */ val ActualOvertimeWork: ActualOvertimeWork with scala.Double = js.native
  /* 4 */ val ActualOvertimeWorkProtected: ActualOvertimeWorkProtected with scala.Double = js.native
  /* 5 */ val ActualWork: ActualWork with scala.Double = js.native
  /* 6 */ val ActualWorkProtected: ActualWorkProtected with scala.Double = js.native
  /* 7 */ val BaseCalendar: BaseCalendar with scala.Double = js.native
  /* 8 */ val Baseline10BudgetCost: Baseline10BudgetCost with scala.Double = js.native
  /* 9 */ val Baseline10BudgetWork: Baseline10BudgetWork with scala.Double = js.native
  /* 10 */ val Baseline10Cost: Baseline10Cost with scala.Double = js.native
  /* 11 */ val Baseline10Work: Baseline10Work with scala.Double = js.native
  /* 12 */ val Baseline1BudgetCost: Baseline1BudgetCost with scala.Double = js.native
  /* 13 */ val Baseline1BudgetWork: Baseline1BudgetWork with scala.Double = js.native
  /* 14 */ val Baseline1Cost: Baseline1Cost with scala.Double = js.native
  /* 15 */ val Baseline1Work: Baseline1Work with scala.Double = js.native
  /* 16 */ val Baseline2BudgetCost: Baseline2BudgetCost with scala.Double = js.native
  /* 17 */ val Baseline2BudgetWork: Baseline2BudgetWork with scala.Double = js.native
  /* 18 */ val Baseline2Cost: Baseline2Cost with scala.Double = js.native
  /* 19 */ val Baseline2Work: Baseline2Work with scala.Double = js.native
  /* 20 */ val Baseline3BudgetCost: Baseline3BudgetCost with scala.Double = js.native
  /* 21 */ val Baseline3BudgetWork: Baseline3BudgetWork with scala.Double = js.native
  /* 22 */ val Baseline3Cost: Baseline3Cost with scala.Double = js.native
  /* 23 */ val Baseline3Work: Baseline3Work with scala.Double = js.native
  /* 24 */ val Baseline4BudgetCost: Baseline4BudgetCost with scala.Double = js.native
  /* 25 */ val Baseline4BudgetWork: Baseline4BudgetWork with scala.Double = js.native
  /* 26 */ val Baseline4Cost: Baseline4Cost with scala.Double = js.native
  /* 27 */ val Baseline4Work: Baseline4Work with scala.Double = js.native
  /* 28 */ val Baseline5BudgetCost: Baseline5BudgetCost with scala.Double = js.native
  /* 29 */ val Baseline5BudgetWork: Baseline5BudgetWork with scala.Double = js.native
  /* 30 */ val Baseline5Cost: Baseline5Cost with scala.Double = js.native
  /* 31 */ val Baseline5Work: Baseline5Work with scala.Double = js.native
  /* 32 */ val Baseline6BudgetCost: Baseline6BudgetCost with scala.Double = js.native
  /* 33 */ val Baseline6BudgetWork: Baseline6BudgetWork with scala.Double = js.native
  /* 34 */ val Baseline6Cost: Baseline6Cost with scala.Double = js.native
  /* 35 */ val Baseline6Work: Baseline6Work with scala.Double = js.native
  /* 36 */ val Baseline7BudgetCost: Baseline7BudgetCost with scala.Double = js.native
  /* 37 */ val Baseline7BudgetWork: Baseline7BudgetWork with scala.Double = js.native
  /* 38 */ val Baseline7Cost: Baseline7Cost with scala.Double = js.native
  /* 39 */ val Baseline7Work: Baseline7Work with scala.Double = js.native
  /* 40 */ val Baseline8BudgetCost: Baseline8BudgetCost with scala.Double = js.native
  /* 41 */ val Baseline8BudgetWork: Baseline8BudgetWork with scala.Double = js.native
  /* 42 */ val Baseline8Cost: Baseline8Cost with scala.Double = js.native
  /* 43 */ val Baseline8Work: Baseline8Work with scala.Double = js.native
  /* 44 */ val Baseline9BudgetCost: Baseline9BudgetCost with scala.Double = js.native
  /* 45 */ val Baseline9BudgetWork: Baseline9BudgetWork with scala.Double = js.native
  /* 46 */ val Baseline9Cost: Baseline9Cost with scala.Double = js.native
  /* 47 */ val Baseline9Work: Baseline9Work with scala.Double = js.native
  /* 48 */ val BaselineBudgetCost: BaselineBudgetCost with scala.Double = js.native
  /* 49 */ val BaselineBudgetWork: BaselineBudgetWork with scala.Double = js.native
  /* 50 */ val BaselineCost: BaselineCost with scala.Double = js.native
  /* 51 */ val BaselineWork: BaselineWork with scala.Double = js.native
  /* 52 */ val BudgetCost: BudgetCost with scala.Double = js.native
  /* 53 */ val BudgetWork: BudgetWork with scala.Double = js.native
  /* 55 */ val Code: Code with scala.Double = js.native
  /* 156 */ val Cost: Cost with scala.Double = js.native
  /* 56 */ val Cost1: Cost1 with scala.Double = js.native
  /* 57 */ val Cost10: Cost10 with scala.Double = js.native
  /* 58 */ val Cost2: Cost2 with scala.Double = js.native
  /* 59 */ val Cost3: Cost3 with scala.Double = js.native
  /* 60 */ val Cost4: Cost4 with scala.Double = js.native
  /* 61 */ val Cost5: Cost5 with scala.Double = js.native
  /* 62 */ val Cost6: Cost6 with scala.Double = js.native
  /* 63 */ val Cost7: Cost7 with scala.Double = js.native
  /* 64 */ val Cost8: Cost8 with scala.Double = js.native
  /* 65 */ val Cost9: Cost9 with scala.Double = js.native
  /* 147 */ val CostPerUse: CostPerUse with scala.Double = js.native
  /* 67 */ val Date1: Date1 with scala.Double = js.native
  /* 68 */ val Date10: Date10 with scala.Double = js.native
  /* 69 */ val Date2: Date2 with scala.Double = js.native
  /* 70 */ val Date3: Date3 with scala.Double = js.native
  /* 71 */ val Date4: Date4 with scala.Double = js.native
  /* 72 */ val Date5: Date5 with scala.Double = js.native
  /* 73 */ val Date6: Date6 with scala.Double = js.native
  /* 74 */ val Date7: Date7 with scala.Double = js.native
  /* 75 */ val Date8: Date8 with scala.Double = js.native
  /* 76 */ val Date9: Date9 with scala.Double = js.native
  /* 77 */ val Duration1: Duration1 with scala.Double = js.native
  /* 78 */ val Duration10: Duration10 with scala.Double = js.native
  /* 79 */ val Duration2: Duration2 with scala.Double = js.native
  /* 80 */ val Duration3: Duration3 with scala.Double = js.native
  /* 81 */ val Duration4: Duration4 with scala.Double = js.native
  /* 82 */ val Duration5: Duration5 with scala.Double = js.native
  /* 83 */ val Duration6: Duration6 with scala.Double = js.native
  /* 84 */ val Duration7: Duration7 with scala.Double = js.native
  /* 85 */ val Duration8: Duration8 with scala.Double = js.native
  /* 86 */ val Duration9: Duration9 with scala.Double = js.native
  /* 87 */ val Email: Email with scala.Double = js.native
  /* 88 */ val End: End with scala.Double = js.native
  /* 89 */ val Finish1: Finish1 with scala.Double = js.native
  /* 90 */ val Finish10: Finish10 with scala.Double = js.native
  /* 91 */ val Finish2: Finish2 with scala.Double = js.native
  /* 92 */ val Finish3: Finish3 with scala.Double = js.native
  /* 93 */ val Finish4: Finish4 with scala.Double = js.native
  /* 94 */ val Finish5: Finish5 with scala.Double = js.native
  /* 95 */ val Finish6: Finish6 with scala.Double = js.native
  /* 96 */ val Finish7: Finish7 with scala.Double = js.native
  /* 97 */ val Finish8: Finish8 with scala.Double = js.native
  /* 98 */ val Finish9: Finish9 with scala.Double = js.native
  /* 100 */ val Flag1: Flag1 with scala.Double = js.native
  /* 99 */ val Flag10: Flag10 with scala.Double = js.native
  /* 101 */ val Flag11: Flag11 with scala.Double = js.native
  /* 102 */ val Flag12: Flag12 with scala.Double = js.native
  /* 103 */ val Flag13: Flag13 with scala.Double = js.native
  /* 104 */ val Flag14: Flag14 with scala.Double = js.native
  /* 105 */ val Flag15: Flag15 with scala.Double = js.native
  /* 106 */ val Flag16: Flag16 with scala.Double = js.native
  /* 107 */ val Flag17: Flag17 with scala.Double = js.native
  /* 108 */ val Flag18: Flag18 with scala.Double = js.native
  /* 109 */ val Flag19: Flag19 with scala.Double = js.native
  /* 110 */ val Flag2: Flag2 with scala.Double = js.native
  /* 111 */ val Flag20: Flag20 with scala.Double = js.native
  /* 112 */ val Flag3: Flag3 with scala.Double = js.native
  /* 113 */ val Flag4: Flag4 with scala.Double = js.native
  /* 114 */ val Flag5: Flag5 with scala.Double = js.native
  /* 115 */ val Flag6: Flag6 with scala.Double = js.native
  /* 116 */ val Flag7: Flag7 with scala.Double = js.native
  /* 117 */ val Flag8: Flag8 with scala.Double = js.native
  /* 118 */ val Flag9: Flag9 with scala.Double = js.native
  /* 148 */ val Generic: Generic with scala.Double = js.native
  /* 119 */ val Group: Group with scala.Double = js.native
  /* 121 */ val Name: Name with scala.Double = js.native
  /* 122 */ val Notes: Notes with scala.Double = js.native
  /* 123 */ val Number1: Number1 with scala.Double = js.native
  /* 124 */ val Number10: Number10 with scala.Double = js.native
  /* 125 */ val Number11: Number11 with scala.Double = js.native
  /* 126 */ val Number12: Number12 with scala.Double = js.native
  /* 127 */ val Number13: Number13 with scala.Double = js.native
  /* 128 */ val Number14: Number14 with scala.Double = js.native
  /* 129 */ val Number15: Number15 with scala.Double = js.native
  /* 130 */ val Number16: Number16 with scala.Double = js.native
  /* 131 */ val Number17: Number17 with scala.Double = js.native
  /* 132 */ val Number18: Number18 with scala.Double = js.native
  /* 133 */ val Number19: Number19 with scala.Double = js.native
  /* 134 */ val Number2: Number2 with scala.Double = js.native
  /* 135 */ val Number20: Number20 with scala.Double = js.native
  /* 136 */ val Number3: Number3 with scala.Double = js.native
  /* 137 */ val Number4: Number4 with scala.Double = js.native
  /* 138 */ val Number5: Number5 with scala.Double = js.native
  /* 139 */ val Number6: Number6 with scala.Double = js.native
  /* 140 */ val Number7: Number7 with scala.Double = js.native
  /* 141 */ val Number8: Number8 with scala.Double = js.native
  /* 142 */ val Number9: Number9 with scala.Double = js.native
  /* 149 */ val OverAllocated: OverAllocated with scala.Double = js.native
  /* 143 */ val OvertimeCost: OvertimeCost with scala.Double = js.native
  /* 144 */ val OvertimeRate: OvertimeRate with scala.Double = js.native
  /* 145 */ val OvertimeWork: OvertimeWork with scala.Double = js.native
  /* 146 */ val PercentWorkComplete: PercentWorkComplete with scala.Double = js.native
  /* 150 */ val RegularWork: RegularWork with scala.Double = js.native
  /* 151 */ val RemainingCost: RemainingCost with scala.Double = js.native
  /* 152 */ val RemainingOvertimeCost: RemainingOvertimeCost with scala.Double = js.native
  /* 153 */ val RemainingOvertimeWork: RemainingOvertimeWork with scala.Double = js.native
  /* 154 */ val RemainingWork: RemainingWork with scala.Double = js.native
  /* 54 */ val ResourceCalendarGUID: ResourceCalendarGUID with scala.Double = js.native
  /* 66 */ val ResourceCreationDate: ResourceCreationDate with scala.Double = js.native
  /* 155 */ val ResourceGUID: ResourceGUID with scala.Double = js.native
  /* 169 */ val StandardRate: StandardRate with scala.Double = js.native
  /* 158 */ val Start: Start with scala.Double = js.native
  /* 159 */ val Start1: Start1 with scala.Double = js.native
  /* 160 */ val Start10: Start10 with scala.Double = js.native
  /* 161 */ val Start2: Start2 with scala.Double = js.native
  /* 162 */ val Start3: Start3 with scala.Double = js.native
  /* 163 */ val Start4: Start4 with scala.Double = js.native
  /* 164 */ val Start5: Start5 with scala.Double = js.native
  /* 165 */ val Start6: Start6 with scala.Double = js.native
  /* 166 */ val Start7: Start7 with scala.Double = js.native
  /* 167 */ val Start8: Start8 with scala.Double = js.native
  /* 168 */ val Start9: Start9 with scala.Double = js.native
  /* 170 */ val Text1: Text1 with scala.Double = js.native
  /* 171 */ val Text10: Text10 with scala.Double = js.native
  /* 172 */ val Text11: Text11 with scala.Double = js.native
  /* 173 */ val Text12: Text12 with scala.Double = js.native
  /* 174 */ val Text13: Text13 with scala.Double = js.native
  /* 175 */ val Text14: Text14 with scala.Double = js.native
  /* 176 */ val Text15: Text15 with scala.Double = js.native
  /* 177 */ val Text16: Text16 with scala.Double = js.native
  /* 178 */ val Text17: Text17 with scala.Double = js.native
  /* 179 */ val Text18: Text18 with scala.Double = js.native
  /* 180 */ val Text19: Text19 with scala.Double = js.native
  /* 181 */ val Text2: Text2 with scala.Double = js.native
  /* 182 */ val Text20: Text20 with scala.Double = js.native
  /* 183 */ val Text21: Text21 with scala.Double = js.native
  /* 184 */ val Text22: Text22 with scala.Double = js.native
  /* 185 */ val Text23: Text23 with scala.Double = js.native
  /* 186 */ val Text24: Text24 with scala.Double = js.native
  /* 187 */ val Text25: Text25 with scala.Double = js.native
  /* 188 */ val Text26: Text26 with scala.Double = js.native
  /* 189 */ val Text27: Text27 with scala.Double = js.native
  /* 190 */ val Text28: Text28 with scala.Double = js.native
  /* 191 */ val Text29: Text29 with scala.Double = js.native
  /* 192 */ val Text3: Text3 with scala.Double = js.native
  /* 193 */ val Text30: Text30 with scala.Double = js.native
  /* 194 */ val Text4: Text4 with scala.Double = js.native
  /* 195 */ val Text5: Text5 with scala.Double = js.native
  /* 196 */ val Text6: Text6 with scala.Double = js.native
  /* 197 */ val Text7: Text7 with scala.Double = js.native
  /* 198 */ val Text8: Text8 with scala.Double = js.native
  /* 199 */ val Text9: Text9 with scala.Double = js.native
  /* 120 */ val Units: Units with scala.Double = js.native
  /* 157 */ val Work: Work with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsLib.OfficeNs.ProjectResourceFields with scala.Double] = js.native
}

