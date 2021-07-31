package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProjectResourceFields extends StObject
/**
  * Specifies the resource fields that are available as a parameter for the {@link Office.Document | Document}.getResourceFieldAsync method.
  *
  * @remarks
  * 
  * A ProjectResourceFields constant can be used as a parameter of the {@link Office.Document | Document}.getResourceFieldAsync method.
  *
  * For more information about working with fields in Project, see 
  * {@link https://support.office.com/article/Available-fields-reference-615a4563-1cc3-40f4-b66f-1b17e793a460 | Available fields} reference. In 
  * Project Help, search for Available fields.
  */
@JSGlobal("Office.ProjectResourceFields")
@js.native
object ProjectResourceFields extends StObject {
  
  /**
    * The accrual method that defines how a task accrues the cost of the resource: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Accrual
    extends StObject
       with ProjectResourceFields
  
  /**
    * The calculated actual cost of the resource for assignments in the project.
    */
  @js.native
  sealed trait ActualCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The actual overtime cost for a resource.
    */
  @js.native
  sealed trait ActualOvertimeCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The actual overtime work for a resource, in minutes.
    */
  @js.native
  sealed trait ActualOvertimeWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The actual overtime work for the resource that has been protected (made read-only).
    */
  @js.native
  sealed trait ActualOvertimeWorkProtected
    extends StObject
       with ProjectResourceFields
  
  /**
    * The actual work that the resource has done on assignments in the project.
    */
  @js.native
  sealed trait ActualWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The actual work for the resource that has been protected (made read-only).
    */
  @js.native
  sealed trait ActualWorkProtected
    extends StObject
       with ProjectResourceFields
  
  /**
    * The name of the base calendar for the resource.
    */
  @js.native
  sealed trait BaseCalendar
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline10BudgetCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline10BudgetWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline10Cost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline10Work
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline1BudgetCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline1BudgetWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline1Cost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline1Work
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline2BudgetCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline2BudgetWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline2Cost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline2Work
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline3BudgetCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline3BudgetWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline3Cost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline3Work
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline4BudgetCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline4BudgetWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline4Cost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline4Work
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline5BudgetCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline5BudgetWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline5Cost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline5Work
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline6BudgetCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline6BudgetWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline6Cost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline6Work
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline7BudgetCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline7BudgetWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline7Cost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline7Work
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline8BudgetCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline8BudgetWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline8Cost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline8Work
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline9BudgetCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline9BudgetWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline9Cost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline9Work
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait BaselineBudgetCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait BaselineBudgetWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The baseline cost for the resource for assignments in the project.
    */
  @js.native
  sealed trait BaselineCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The baseline work for the resource for assignments in the project, in minutes.
    */
  @js.native
  sealed trait BaselineWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget cost for the resource.
    */
  @js.native
  sealed trait BudgetCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The budget work for the resource.
    */
  @js.native
  sealed trait BudgetWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The code value of the resource.
    */
  @js.native
  sealed trait Code
    extends StObject
       with ProjectResourceFields
  
  /**
    * The total cost of the resource.
    */
  @js.native
  sealed trait Cost
    extends StObject
       with ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost1
    extends StObject
       with ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost10
    extends StObject
       with ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost2
    extends StObject
       with ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost3
    extends StObject
       with ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost4
    extends StObject
       with ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost5
    extends StObject
       with ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost6
    extends StObject
       with ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost7
    extends StObject
       with ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost8
    extends StObject
       with ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost9
    extends StObject
       with ProjectResourceFields
  
  /**
    * The cost per use of the resource.
    */
  @js.native
  sealed trait CostPerUse
    extends StObject
       with ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date1
    extends StObject
       with ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date10
    extends StObject
       with ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date2
    extends StObject
       with ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date3
    extends StObject
       with ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date4
    extends StObject
       with ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date5
    extends StObject
       with ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date6
    extends StObject
       with ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date7
    extends StObject
       with ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date8
    extends StObject
       with ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date9
    extends StObject
       with ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration1
    extends StObject
       with ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration10
    extends StObject
       with ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration2
    extends StObject
       with ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration3
    extends StObject
       with ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration4
    extends StObject
       with ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration5
    extends StObject
       with ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration6
    extends StObject
       with ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration7
    extends StObject
       with ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration8
    extends StObject
       with ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration9
    extends StObject
       with ProjectResourceFields
  
  /**
    * The email address of the resource.
    */
  @js.native
  sealed trait Email
    extends StObject
       with ProjectResourceFields
  
  /**
    * The end date of the resource availability.
    */
  @js.native
  sealed trait End
    extends StObject
       with ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish1
    extends StObject
       with ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish10
    extends StObject
       with ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish2
    extends StObject
       with ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish3
    extends StObject
       with ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish4
    extends StObject
       with ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish5
    extends StObject
       with ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish6
    extends StObject
       with ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish7
    extends StObject
       with ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish8
    extends StObject
       with ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish9
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag1
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag10
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag11
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag12
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag13
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag14
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag15
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag16
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag17
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag18
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag19
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag2
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag20
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag3
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag4
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag5
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag6
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag7
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag8
    extends StObject
       with ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag9
    extends StObject
       with ProjectResourceFields
  
  /**
    * Indicates whether the resource is a generic resource (identified by skill rather than by name).
    */
  @js.native
  sealed trait Generic
    extends StObject
       with ProjectResourceFields
  
  /**
    * The group the resource belongs to.
    */
  @js.native
  sealed trait Group
    extends StObject
       with ProjectResourceFields
  
  /**
    * The name of the resource.
    */
  @js.native
  sealed trait Name
    extends StObject
       with ProjectResourceFields
  
  /**
    * The text value of the notes regarding the resource.
    */
  @js.native
  sealed trait Notes
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number1
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number10
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number11
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number12
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number13
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number14
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number15
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number16
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number17
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number18
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number19
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number2
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number20
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number3
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number4
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number5
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number6
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number7
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number8
    extends StObject
       with ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number9
    extends StObject
       with ProjectResourceFields
  
  /**
    * Indicates whether the resource is overallocated.
    */
  @js.native
  sealed trait OverAllocated
    extends StObject
       with ProjectResourceFields
  
  /**
    * The overtime cost for a resource.
    */
  @js.native
  sealed trait OvertimeCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The overtime rate for a resource.
    */
  @js.native
  sealed trait OvertimeRate
    extends StObject
       with ProjectResourceFields
  
  /**
    * The overtime work for a resource.
    */
  @js.native
  sealed trait OvertimeWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The percentage of work complete for a resource.
    */
  @js.native
  sealed trait PercentWorkComplete
    extends StObject
       with ProjectResourceFields
  
  /**
    * The amount of regular work for the resource.
    */
  @js.native
  sealed trait RegularWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The remaining cost for the resource.
    */
  @js.native
  sealed trait RemainingCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The remaining overtime cost for the resource.
    */
  @js.native
  sealed trait RemainingOvertimeCost
    extends StObject
       with ProjectResourceFields
  
  /**
    * The remaining overtime work for the resource, in minutes.
    */
  @js.native
  sealed trait RemainingOvertimeWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The remaining work for the resource, in minutes.
    */
  @js.native
  sealed trait RemainingWork
    extends StObject
       with ProjectResourceFields
  
  /**
    * The GUID of the resource calendar.
    */
  @js.native
  sealed trait ResourceCalendarGUID
    extends StObject
       with ProjectResourceFields
  
  /**
    * The date the resource was created.
    */
  @js.native
  sealed trait ResourceCreationDate
    extends StObject
       with ProjectResourceFields
  
  /**
    * The ID of the resource.
    */
  @js.native
  sealed trait ResourceGUID
    extends StObject
       with ProjectResourceFields
  
  /**
    * The standard rate of pay for the resource, in cost per hour.
    */
  @js.native
  sealed trait StandardRate
    extends StObject
       with ProjectResourceFields
  
  /**
    * The start date for the resource.
    */
  @js.native
  sealed trait Start
    extends StObject
       with ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start1
    extends StObject
       with ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start10
    extends StObject
       with ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start2
    extends StObject
       with ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start3
    extends StObject
       with ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start4
    extends StObject
       with ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start5
    extends StObject
       with ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start6
    extends StObject
       with ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start7
    extends StObject
       with ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start8
    extends StObject
       with ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start9
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text1
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text10
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text11
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text12
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text13
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text14
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text15
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text16
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text17
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text18
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text19
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text2
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text20
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text21
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text22
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text23
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text24
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text25
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text26
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text27
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text28
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text29
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text3
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text30
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text4
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text5
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text6
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text7
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text8
    extends StObject
       with ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text9
    extends StObject
       with ProjectResourceFields
  
  /**
    * The percentage of work units that the resource has assigned in the project. If the resource is working full-time on the project, Units = 100.
    */
  @js.native
  sealed trait Units
    extends StObject
       with ProjectResourceFields
  
  /**
    * The total work for the resource, in minutes.
    */
  @js.native
  sealed trait Work
    extends StObject
       with ProjectResourceFields
}
