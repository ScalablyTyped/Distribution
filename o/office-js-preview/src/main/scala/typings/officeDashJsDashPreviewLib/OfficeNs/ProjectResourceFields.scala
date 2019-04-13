package typings
package officeDashJsDashPreviewLib.OfficeNs

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
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The calculated actual cost of the resource for assignments in the project.
    */
  @js.native
  sealed trait ActualCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The actual overtime cost for a resource.
    */
  @js.native
  sealed trait ActualOvertimeCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The actual overtime work for a resource, in minutes.
    */
  @js.native
  sealed trait ActualOvertimeWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The actual overtime work for the resource that has been protected (made read-only).
    */
  @js.native
  sealed trait ActualOvertimeWorkProtected
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The actual work that the resource has done on assignments in the project.
    */
  @js.native
  sealed trait ActualWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The actual work for the resource that has been protected (made read-only).
    */
  @js.native
  sealed trait ActualWorkProtected
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The name of the base calendar for the resource.
    */
  @js.native
  sealed trait BaseCalendar
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline10BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline10BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline10Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline10Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline1BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline1BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline1Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline1Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline2BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline2BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline2Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline2Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline3BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline3BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline3Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline3Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline4BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline4BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline4Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline4Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline5BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline5BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline5Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline5Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline6BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline6BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline6Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline6Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline7BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline7BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline7Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline7Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline8BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline8BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline8Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline8Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline9BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline9BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline9Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline9Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait BaselineBudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait BaselineBudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The baseline cost for the resource for assignments in the project.
    */
  @js.native
  sealed trait BaselineCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The baseline work for the resource for assignments in the project, in minutes.
    */
  @js.native
  sealed trait BaselineWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget cost for the resource.
    */
  @js.native
  sealed trait BudgetCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The budget work for the resource.
    */
  @js.native
  sealed trait BudgetWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The code value of the resource.
    */
  @js.native
  sealed trait Code
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The total cost of the resource.
    */
  @js.native
  sealed trait Cost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The cost per use of the resource.
    */
  @js.native
  sealed trait CostPerUse
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The email address of the resource.
    */
  @js.native
  sealed trait Email
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The end date of the resource availability.
    */
  @js.native
  sealed trait End
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag11
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag12
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag13
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag14
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag15
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag16
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag17
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag18
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag19
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag20
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * Indicates whether the resource is a generic resource (identified by skill rather than by name).
    */
  @js.native
  sealed trait Generic
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The group the resource belongs to.
    */
  @js.native
  sealed trait Group
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The name of the resource.
    */
  @js.native
  sealed trait Name
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The text value of the notes regarding the resource.
    */
  @js.native
  sealed trait Notes
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number11
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number12
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number13
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number14
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number15
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number16
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number17
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number18
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number19
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number20
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * Indicates whether the resource is overallocated.
    */
  @js.native
  sealed trait OverAllocated
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The overtime cost for a resource.
    */
  @js.native
  sealed trait OvertimeCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The overtime rate for a resource.
    */
  @js.native
  sealed trait OvertimeRate
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The overtime work for a resource.
    */
  @js.native
  sealed trait OvertimeWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The percentage of work complete for a resource.
    */
  @js.native
  sealed trait PercentWorkComplete
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The amount of regular work for the resource.
    */
  @js.native
  sealed trait RegularWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The remaining cost for the resource.
    */
  @js.native
  sealed trait RemainingCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The remaining overtime cost for the resource.
    */
  @js.native
  sealed trait RemainingOvertimeCost
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The remaining overtime work for the resource, in minutes.
    */
  @js.native
  sealed trait RemainingOvertimeWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The remaining work for the resource, in minutes.
    */
  @js.native
  sealed trait RemainingWork
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The GUID of the resource calendar.
    */
  @js.native
  sealed trait ResourceCalendarGUID
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The date the resource was created.
    */
  @js.native
  sealed trait ResourceCreationDate
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The ID of the resource.
    */
  @js.native
  sealed trait ResourceGUID
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The standard rate of pay for the resource, in cost per hour.
    */
  @js.native
  sealed trait StandardRate
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The start date for the resource.
    */
  @js.native
  sealed trait Start
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text1
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text10
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text11
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text12
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text13
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text14
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text15
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text16
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text17
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text18
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text19
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text2
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text20
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text21
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text22
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text23
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text24
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text25
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text26
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text27
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text28
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text29
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text3
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text30
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text4
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text5
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text6
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text7
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text8
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text9
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The percentage of work units that the resource has assigned in the project. If the resource is working full-time on the project, Units = 100.
    */
  @js.native
  sealed trait Units
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  /**
    * The total work for the resource, in minutes.
    */
  @js.native
  sealed trait Work
    extends officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields
  
  val Accrual: Accrual with java.lang.String = js.native
  val ActualCost: ActualCost with java.lang.String = js.native
  val ActualOvertimeCost: ActualOvertimeCost with java.lang.String = js.native
  val ActualOvertimeWork: ActualOvertimeWork with java.lang.String = js.native
  val ActualOvertimeWorkProtected: ActualOvertimeWorkProtected with java.lang.String = js.native
  val ActualWork: ActualWork with java.lang.String = js.native
  val ActualWorkProtected: ActualWorkProtected with java.lang.String = js.native
  val BaseCalendar: BaseCalendar with java.lang.String = js.native
  val Baseline10BudgetCost: Baseline10BudgetCost with java.lang.String = js.native
  val Baseline10BudgetWork: Baseline10BudgetWork with java.lang.String = js.native
  val Baseline10Cost: Baseline10Cost with java.lang.String = js.native
  val Baseline10Work: Baseline10Work with java.lang.String = js.native
  val Baseline1BudgetCost: Baseline1BudgetCost with java.lang.String = js.native
  val Baseline1BudgetWork: Baseline1BudgetWork with java.lang.String = js.native
  val Baseline1Cost: Baseline1Cost with java.lang.String = js.native
  val Baseline1Work: Baseline1Work with java.lang.String = js.native
  val Baseline2BudgetCost: Baseline2BudgetCost with java.lang.String = js.native
  val Baseline2BudgetWork: Baseline2BudgetWork with java.lang.String = js.native
  val Baseline2Cost: Baseline2Cost with java.lang.String = js.native
  val Baseline2Work: Baseline2Work with java.lang.String = js.native
  val Baseline3BudgetCost: Baseline3BudgetCost with java.lang.String = js.native
  val Baseline3BudgetWork: Baseline3BudgetWork with java.lang.String = js.native
  val Baseline3Cost: Baseline3Cost with java.lang.String = js.native
  val Baseline3Work: Baseline3Work with java.lang.String = js.native
  val Baseline4BudgetCost: Baseline4BudgetCost with java.lang.String = js.native
  val Baseline4BudgetWork: Baseline4BudgetWork with java.lang.String = js.native
  val Baseline4Cost: Baseline4Cost with java.lang.String = js.native
  val Baseline4Work: Baseline4Work with java.lang.String = js.native
  val Baseline5BudgetCost: Baseline5BudgetCost with java.lang.String = js.native
  val Baseline5BudgetWork: Baseline5BudgetWork with java.lang.String = js.native
  val Baseline5Cost: Baseline5Cost with java.lang.String = js.native
  val Baseline5Work: Baseline5Work with java.lang.String = js.native
  val Baseline6BudgetCost: Baseline6BudgetCost with java.lang.String = js.native
  val Baseline6BudgetWork: Baseline6BudgetWork with java.lang.String = js.native
  val Baseline6Cost: Baseline6Cost with java.lang.String = js.native
  val Baseline6Work: Baseline6Work with java.lang.String = js.native
  val Baseline7BudgetCost: Baseline7BudgetCost with java.lang.String = js.native
  val Baseline7BudgetWork: Baseline7BudgetWork with java.lang.String = js.native
  val Baseline7Cost: Baseline7Cost with java.lang.String = js.native
  val Baseline7Work: Baseline7Work with java.lang.String = js.native
  val Baseline8BudgetCost: Baseline8BudgetCost with java.lang.String = js.native
  val Baseline8BudgetWork: Baseline8BudgetWork with java.lang.String = js.native
  val Baseline8Cost: Baseline8Cost with java.lang.String = js.native
  val Baseline8Work: Baseline8Work with java.lang.String = js.native
  val Baseline9BudgetCost: Baseline9BudgetCost with java.lang.String = js.native
  val Baseline9BudgetWork: Baseline9BudgetWork with java.lang.String = js.native
  val Baseline9Cost: Baseline9Cost with java.lang.String = js.native
  val Baseline9Work: Baseline9Work with java.lang.String = js.native
  val BaselineBudgetCost: BaselineBudgetCost with java.lang.String = js.native
  val BaselineBudgetWork: BaselineBudgetWork with java.lang.String = js.native
  val BaselineCost: BaselineCost with java.lang.String = js.native
  val BaselineWork: BaselineWork with java.lang.String = js.native
  val BudgetCost: BudgetCost with java.lang.String = js.native
  val BudgetWork: BudgetWork with java.lang.String = js.native
  val Code: Code with java.lang.String = js.native
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
  val CostPerUse: CostPerUse with java.lang.String = js.native
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
  val Email: Email with java.lang.String = js.native
  val End: End with java.lang.String = js.native
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
  val Generic: Generic with java.lang.String = js.native
  val Group: Group with java.lang.String = js.native
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
  val OverAllocated: OverAllocated with java.lang.String = js.native
  val OvertimeCost: OvertimeCost with java.lang.String = js.native
  val OvertimeRate: OvertimeRate with java.lang.String = js.native
  val OvertimeWork: OvertimeWork with java.lang.String = js.native
  val PercentWorkComplete: PercentWorkComplete with java.lang.String = js.native
  val RegularWork: RegularWork with java.lang.String = js.native
  val RemainingCost: RemainingCost with java.lang.String = js.native
  val RemainingOvertimeCost: RemainingOvertimeCost with java.lang.String = js.native
  val RemainingOvertimeWork: RemainingOvertimeWork with java.lang.String = js.native
  val RemainingWork: RemainingWork with java.lang.String = js.native
  val ResourceCalendarGUID: ResourceCalendarGUID with java.lang.String = js.native
  val ResourceCreationDate: ResourceCreationDate with java.lang.String = js.native
  val ResourceGUID: ResourceGUID with java.lang.String = js.native
  val StandardRate: StandardRate with java.lang.String = js.native
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
  val Units: Units with java.lang.String = js.native
  val Work: Work with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.ProjectResourceFields with java.lang.String] = js.native
}

