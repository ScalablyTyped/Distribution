package typings.officeDashJs.Office

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectResourceFields extends js.Object

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
object ProjectResourceFields extends js.Object {
  /**
    * The accrual method that defines how a task accrues the cost of the resource: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Accrual extends ProjectResourceFields
  
  /**
    * The calculated actual cost of the resource for assignments in the project.
    */
  @js.native
  sealed trait ActualCost extends ProjectResourceFields
  
  /**
    * The actual overtime cost for a resource.
    */
  @js.native
  sealed trait ActualOvertimeCost extends ProjectResourceFields
  
  /**
    * The actual overtime work for a resource, in minutes.
    */
  @js.native
  sealed trait ActualOvertimeWork extends ProjectResourceFields
  
  /**
    * The actual overtime work for the resource that has been protected (made read-only).
    */
  @js.native
  sealed trait ActualOvertimeWorkProtected extends ProjectResourceFields
  
  /**
    * The actual work that the resource has done on assignments in the project.
    */
  @js.native
  sealed trait ActualWork extends ProjectResourceFields
  
  /**
    * The actual work for the resource that has been protected (made read-only).
    */
  @js.native
  sealed trait ActualWorkProtected extends ProjectResourceFields
  
  /**
    * The name of the base calendar for the resource.
    */
  @js.native
  sealed trait BaseCalendar extends ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline10BudgetCost extends ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline10BudgetWork extends ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline10Cost extends ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline10Work extends ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline1BudgetCost extends ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline1BudgetWork extends ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline1Cost extends ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline1Work extends ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline2BudgetCost extends ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline2BudgetWork extends ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline2Cost extends ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline2Work extends ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline3BudgetCost extends ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline3BudgetWork extends ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline3Cost extends ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline3Work extends ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline4BudgetCost extends ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline4BudgetWork extends ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline4Cost extends ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline4Work extends ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline5BudgetCost extends ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline5BudgetWork extends ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline5Cost extends ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline5Work extends ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline6BudgetCost extends ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline6BudgetWork extends ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline6Cost extends ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline6Work extends ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline7BudgetCost extends ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline7BudgetWork extends ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline7Cost extends ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline7Work extends ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline8BudgetCost extends ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline8BudgetWork extends ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline8Cost extends ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline8Work extends ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline9BudgetCost extends ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait Baseline9BudgetWork extends ProjectResourceFields
  
  /**
    * The cost for the baseline resource.
    */
  @js.native
  sealed trait Baseline9Cost extends ProjectResourceFields
  
  /**
    * The work for the baseline resource, in minutes.
    */
  @js.native
  sealed trait Baseline9Work extends ProjectResourceFields
  
  /**
    * The budget cost for the baseline resource.
    */
  @js.native
  sealed trait BaselineBudgetCost extends ProjectResourceFields
  
  /**
    * The budget work for the baseline resource, in hours.
    */
  @js.native
  sealed trait BaselineBudgetWork extends ProjectResourceFields
  
  /**
    * The baseline cost for the resource for assignments in the project.
    */
  @js.native
  sealed trait BaselineCost extends ProjectResourceFields
  
  /**
    * The baseline work for the resource for assignments in the project, in minutes.
    */
  @js.native
  sealed trait BaselineWork extends ProjectResourceFields
  
  /**
    * The budget cost for the resource.
    */
  @js.native
  sealed trait BudgetCost extends ProjectResourceFields
  
  /**
    * The budget work for the resource.
    */
  @js.native
  sealed trait BudgetWork extends ProjectResourceFields
  
  /**
    * The code value of the resource.
    */
  @js.native
  sealed trait Code extends ProjectResourceFields
  
  /**
    * The total cost of the resource.
    */
  @js.native
  sealed trait Cost extends ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost1 extends ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost10 extends ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost2 extends ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost3 extends ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost4 extends ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost5 extends ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost6 extends ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost7 extends ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost8 extends ProjectResourceFields
  
  /**
    * A cost field for the resource.
    */
  @js.native
  sealed trait Cost9 extends ProjectResourceFields
  
  /**
    * The cost per use of the resource.
    */
  @js.native
  sealed trait CostPerUse extends ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date1 extends ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date10 extends ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date2 extends ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date3 extends ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date4 extends ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date5 extends ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date6 extends ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date7 extends ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date8 extends ProjectResourceFields
  
  /**
    * A date field for the resource.
    */
  @js.native
  sealed trait Date9 extends ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration1 extends ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration10 extends ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration2 extends ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration3 extends ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration4 extends ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration5 extends ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration6 extends ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration7 extends ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration8 extends ProjectResourceFields
  
  /**
    * A duration field for the resource.
    */
  @js.native
  sealed trait Duration9 extends ProjectResourceFields
  
  /**
    * The email address of the resource.
    */
  @js.native
  sealed trait Email extends ProjectResourceFields
  
  /**
    * The end date of the resource availability.
    */
  @js.native
  sealed trait End extends ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish1 extends ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish10 extends ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish2 extends ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish3 extends ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish4 extends ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish5 extends ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish6 extends ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish7 extends ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish8 extends ProjectResourceFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish9 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag1 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag10 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag11 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag12 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag13 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag14 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag15 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag16 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag17 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag18 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag19 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag2 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag20 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag3 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag4 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag5 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag6 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag7 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag8 extends ProjectResourceFields
  
  /**
    * A Boolean flag field for the resource.
    */
  @js.native
  sealed trait Flag9 extends ProjectResourceFields
  
  /**
    * Indicates whether the resource is a generic resource (identified by skill rather than by name).
    */
  @js.native
  sealed trait Generic extends ProjectResourceFields
  
  /**
    * The group the resource belongs to.
    */
  @js.native
  sealed trait Group extends ProjectResourceFields
  
  /**
    * The name of the resource.
    */
  @js.native
  sealed trait Name extends ProjectResourceFields
  
  /**
    * The text value of the notes regarding the resource.
    */
  @js.native
  sealed trait Notes extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number1 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number10 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number11 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number12 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number13 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number14 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number15 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number16 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number17 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number18 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number19 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number2 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number20 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number3 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number4 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number5 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number6 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number7 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number8 extends ProjectResourceFields
  
  /**
    * A number field for the resource.
    */
  @js.native
  sealed trait Number9 extends ProjectResourceFields
  
  /**
    * Indicates whether the resource is overallocated.
    */
  @js.native
  sealed trait OverAllocated extends ProjectResourceFields
  
  /**
    * The overtime cost for a resource.
    */
  @js.native
  sealed trait OvertimeCost extends ProjectResourceFields
  
  /**
    * The overtime rate for a resource.
    */
  @js.native
  sealed trait OvertimeRate extends ProjectResourceFields
  
  /**
    * The overtime work for a resource.
    */
  @js.native
  sealed trait OvertimeWork extends ProjectResourceFields
  
  /**
    * The percentage of work complete for a resource.
    */
  @js.native
  sealed trait PercentWorkComplete extends ProjectResourceFields
  
  /**
    * The amount of regular work for the resource.
    */
  @js.native
  sealed trait RegularWork extends ProjectResourceFields
  
  /**
    * The remaining cost for the resource.
    */
  @js.native
  sealed trait RemainingCost extends ProjectResourceFields
  
  /**
    * The remaining overtime cost for the resource.
    */
  @js.native
  sealed trait RemainingOvertimeCost extends ProjectResourceFields
  
  /**
    * The remaining overtime work for the resource, in minutes.
    */
  @js.native
  sealed trait RemainingOvertimeWork extends ProjectResourceFields
  
  /**
    * The remaining work for the resource, in minutes.
    */
  @js.native
  sealed trait RemainingWork extends ProjectResourceFields
  
  /**
    * The GUID of the resource calendar.
    */
  @js.native
  sealed trait ResourceCalendarGUID extends ProjectResourceFields
  
  /**
    * The date the resource was created.
    */
  @js.native
  sealed trait ResourceCreationDate extends ProjectResourceFields
  
  /**
    * The ID of the resource.
    */
  @js.native
  sealed trait ResourceGUID extends ProjectResourceFields
  
  /**
    * The standard rate of pay for the resource, in cost per hour.
    */
  @js.native
  sealed trait StandardRate extends ProjectResourceFields
  
  /**
    * The start date for the resource.
    */
  @js.native
  sealed trait Start extends ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start1 extends ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start10 extends ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start2 extends ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start3 extends ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start4 extends ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start5 extends ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start6 extends ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start7 extends ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start8 extends ProjectResourceFields
  
  /**
    * A start field for the resource.
    */
  @js.native
  sealed trait Start9 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text1 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text10 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text11 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text12 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text13 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text14 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text15 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text16 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text17 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text18 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text19 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text2 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text20 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text21 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text22 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text23 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text24 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text25 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text26 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text27 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text28 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text29 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text3 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text30 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text4 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text5 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text6 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text7 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text8 extends ProjectResourceFields
  
  /**
    * A text field for the resource.
    */
  @js.native
  sealed trait Text9 extends ProjectResourceFields
  
  /**
    * The percentage of work units that the resource has assigned in the project. If the resource is working full-time on the project, Units = 100.
    */
  @js.native
  sealed trait Units extends ProjectResourceFields
  
  /**
    * The total work for the resource, in minutes.
    */
  @js.native
  sealed trait Work extends ProjectResourceFields
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectResourceFields with Double] = js.native
  /* 0 */ @js.native
  object Accrual extends TopLevel[Accrual with Double]
  
  /* 1 */ @js.native
  object ActualCost extends TopLevel[ActualCost with Double]
  
  /* 2 */ @js.native
  object ActualOvertimeCost extends TopLevel[ActualOvertimeCost with Double]
  
  /* 3 */ @js.native
  object ActualOvertimeWork extends TopLevel[ActualOvertimeWork with Double]
  
  /* 4 */ @js.native
  object ActualOvertimeWorkProtected extends TopLevel[ActualOvertimeWorkProtected with Double]
  
  /* 5 */ @js.native
  object ActualWork extends TopLevel[ActualWork with Double]
  
  /* 6 */ @js.native
  object ActualWorkProtected extends TopLevel[ActualWorkProtected with Double]
  
  /* 7 */ @js.native
  object BaseCalendar extends TopLevel[BaseCalendar with Double]
  
  /* 8 */ @js.native
  object Baseline10BudgetCost extends TopLevel[Baseline10BudgetCost with Double]
  
  /* 9 */ @js.native
  object Baseline10BudgetWork extends TopLevel[Baseline10BudgetWork with Double]
  
  /* 10 */ @js.native
  object Baseline10Cost extends TopLevel[Baseline10Cost with Double]
  
  /* 11 */ @js.native
  object Baseline10Work extends TopLevel[Baseline10Work with Double]
  
  /* 12 */ @js.native
  object Baseline1BudgetCost extends TopLevel[Baseline1BudgetCost with Double]
  
  /* 13 */ @js.native
  object Baseline1BudgetWork extends TopLevel[Baseline1BudgetWork with Double]
  
  /* 14 */ @js.native
  object Baseline1Cost extends TopLevel[Baseline1Cost with Double]
  
  /* 15 */ @js.native
  object Baseline1Work extends TopLevel[Baseline1Work with Double]
  
  /* 16 */ @js.native
  object Baseline2BudgetCost extends TopLevel[Baseline2BudgetCost with Double]
  
  /* 17 */ @js.native
  object Baseline2BudgetWork extends TopLevel[Baseline2BudgetWork with Double]
  
  /* 18 */ @js.native
  object Baseline2Cost extends TopLevel[Baseline2Cost with Double]
  
  /* 19 */ @js.native
  object Baseline2Work extends TopLevel[Baseline2Work with Double]
  
  /* 20 */ @js.native
  object Baseline3BudgetCost extends TopLevel[Baseline3BudgetCost with Double]
  
  /* 21 */ @js.native
  object Baseline3BudgetWork extends TopLevel[Baseline3BudgetWork with Double]
  
  /* 22 */ @js.native
  object Baseline3Cost extends TopLevel[Baseline3Cost with Double]
  
  /* 23 */ @js.native
  object Baseline3Work extends TopLevel[Baseline3Work with Double]
  
  /* 24 */ @js.native
  object Baseline4BudgetCost extends TopLevel[Baseline4BudgetCost with Double]
  
  /* 25 */ @js.native
  object Baseline4BudgetWork extends TopLevel[Baseline4BudgetWork with Double]
  
  /* 26 */ @js.native
  object Baseline4Cost extends TopLevel[Baseline4Cost with Double]
  
  /* 27 */ @js.native
  object Baseline4Work extends TopLevel[Baseline4Work with Double]
  
  /* 28 */ @js.native
  object Baseline5BudgetCost extends TopLevel[Baseline5BudgetCost with Double]
  
  /* 29 */ @js.native
  object Baseline5BudgetWork extends TopLevel[Baseline5BudgetWork with Double]
  
  /* 30 */ @js.native
  object Baseline5Cost extends TopLevel[Baseline5Cost with Double]
  
  /* 31 */ @js.native
  object Baseline5Work extends TopLevel[Baseline5Work with Double]
  
  /* 32 */ @js.native
  object Baseline6BudgetCost extends TopLevel[Baseline6BudgetCost with Double]
  
  /* 33 */ @js.native
  object Baseline6BudgetWork extends TopLevel[Baseline6BudgetWork with Double]
  
  /* 34 */ @js.native
  object Baseline6Cost extends TopLevel[Baseline6Cost with Double]
  
  /* 35 */ @js.native
  object Baseline6Work extends TopLevel[Baseline6Work with Double]
  
  /* 36 */ @js.native
  object Baseline7BudgetCost extends TopLevel[Baseline7BudgetCost with Double]
  
  /* 37 */ @js.native
  object Baseline7BudgetWork extends TopLevel[Baseline7BudgetWork with Double]
  
  /* 38 */ @js.native
  object Baseline7Cost extends TopLevel[Baseline7Cost with Double]
  
  /* 39 */ @js.native
  object Baseline7Work extends TopLevel[Baseline7Work with Double]
  
  /* 40 */ @js.native
  object Baseline8BudgetCost extends TopLevel[Baseline8BudgetCost with Double]
  
  /* 41 */ @js.native
  object Baseline8BudgetWork extends TopLevel[Baseline8BudgetWork with Double]
  
  /* 42 */ @js.native
  object Baseline8Cost extends TopLevel[Baseline8Cost with Double]
  
  /* 43 */ @js.native
  object Baseline8Work extends TopLevel[Baseline8Work with Double]
  
  /* 44 */ @js.native
  object Baseline9BudgetCost extends TopLevel[Baseline9BudgetCost with Double]
  
  /* 45 */ @js.native
  object Baseline9BudgetWork extends TopLevel[Baseline9BudgetWork with Double]
  
  /* 46 */ @js.native
  object Baseline9Cost extends TopLevel[Baseline9Cost with Double]
  
  /* 47 */ @js.native
  object Baseline9Work extends TopLevel[Baseline9Work with Double]
  
  /* 48 */ @js.native
  object BaselineBudgetCost extends TopLevel[BaselineBudgetCost with Double]
  
  /* 49 */ @js.native
  object BaselineBudgetWork extends TopLevel[BaselineBudgetWork with Double]
  
  /* 50 */ @js.native
  object BaselineCost extends TopLevel[BaselineCost with Double]
  
  /* 51 */ @js.native
  object BaselineWork extends TopLevel[BaselineWork with Double]
  
  /* 52 */ @js.native
  object BudgetCost extends TopLevel[BudgetCost with Double]
  
  /* 53 */ @js.native
  object BudgetWork extends TopLevel[BudgetWork with Double]
  
  /* 55 */ @js.native
  object Code extends TopLevel[Code with Double]
  
  /* 156 */ @js.native
  object Cost extends TopLevel[Cost with Double]
  
  /* 56 */ @js.native
  object Cost1 extends TopLevel[Cost1 with Double]
  
  /* 57 */ @js.native
  object Cost10 extends TopLevel[Cost10 with Double]
  
  /* 58 */ @js.native
  object Cost2 extends TopLevel[Cost2 with Double]
  
  /* 59 */ @js.native
  object Cost3 extends TopLevel[Cost3 with Double]
  
  /* 60 */ @js.native
  object Cost4 extends TopLevel[Cost4 with Double]
  
  /* 61 */ @js.native
  object Cost5 extends TopLevel[Cost5 with Double]
  
  /* 62 */ @js.native
  object Cost6 extends TopLevel[Cost6 with Double]
  
  /* 63 */ @js.native
  object Cost7 extends TopLevel[Cost7 with Double]
  
  /* 64 */ @js.native
  object Cost8 extends TopLevel[Cost8 with Double]
  
  /* 65 */ @js.native
  object Cost9 extends TopLevel[Cost9 with Double]
  
  /* 147 */ @js.native
  object CostPerUse extends TopLevel[CostPerUse with Double]
  
  /* 67 */ @js.native
  object Date1 extends TopLevel[Date1 with Double]
  
  /* 68 */ @js.native
  object Date10 extends TopLevel[Date10 with Double]
  
  /* 69 */ @js.native
  object Date2 extends TopLevel[Date2 with Double]
  
  /* 70 */ @js.native
  object Date3 extends TopLevel[Date3 with Double]
  
  /* 71 */ @js.native
  object Date4 extends TopLevel[Date4 with Double]
  
  /* 72 */ @js.native
  object Date5 extends TopLevel[Date5 with Double]
  
  /* 73 */ @js.native
  object Date6 extends TopLevel[Date6 with Double]
  
  /* 74 */ @js.native
  object Date7 extends TopLevel[Date7 with Double]
  
  /* 75 */ @js.native
  object Date8 extends TopLevel[Date8 with Double]
  
  /* 76 */ @js.native
  object Date9 extends TopLevel[Date9 with Double]
  
  /* 77 */ @js.native
  object Duration1 extends TopLevel[Duration1 with Double]
  
  /* 78 */ @js.native
  object Duration10 extends TopLevel[Duration10 with Double]
  
  /* 79 */ @js.native
  object Duration2 extends TopLevel[Duration2 with Double]
  
  /* 80 */ @js.native
  object Duration3 extends TopLevel[Duration3 with Double]
  
  /* 81 */ @js.native
  object Duration4 extends TopLevel[Duration4 with Double]
  
  /* 82 */ @js.native
  object Duration5 extends TopLevel[Duration5 with Double]
  
  /* 83 */ @js.native
  object Duration6 extends TopLevel[Duration6 with Double]
  
  /* 84 */ @js.native
  object Duration7 extends TopLevel[Duration7 with Double]
  
  /* 85 */ @js.native
  object Duration8 extends TopLevel[Duration8 with Double]
  
  /* 86 */ @js.native
  object Duration9 extends TopLevel[Duration9 with Double]
  
  /* 87 */ @js.native
  object Email extends TopLevel[Email with Double]
  
  /* 88 */ @js.native
  object End extends TopLevel[End with Double]
  
  /* 89 */ @js.native
  object Finish1 extends TopLevel[Finish1 with Double]
  
  /* 90 */ @js.native
  object Finish10 extends TopLevel[Finish10 with Double]
  
  /* 91 */ @js.native
  object Finish2 extends TopLevel[Finish2 with Double]
  
  /* 92 */ @js.native
  object Finish3 extends TopLevel[Finish3 with Double]
  
  /* 93 */ @js.native
  object Finish4 extends TopLevel[Finish4 with Double]
  
  /* 94 */ @js.native
  object Finish5 extends TopLevel[Finish5 with Double]
  
  /* 95 */ @js.native
  object Finish6 extends TopLevel[Finish6 with Double]
  
  /* 96 */ @js.native
  object Finish7 extends TopLevel[Finish7 with Double]
  
  /* 97 */ @js.native
  object Finish8 extends TopLevel[Finish8 with Double]
  
  /* 98 */ @js.native
  object Finish9 extends TopLevel[Finish9 with Double]
  
  /* 100 */ @js.native
  object Flag1 extends TopLevel[Flag1 with Double]
  
  /* 99 */ @js.native
  object Flag10 extends TopLevel[Flag10 with Double]
  
  /* 101 */ @js.native
  object Flag11 extends TopLevel[Flag11 with Double]
  
  /* 102 */ @js.native
  object Flag12 extends TopLevel[Flag12 with Double]
  
  /* 103 */ @js.native
  object Flag13 extends TopLevel[Flag13 with Double]
  
  /* 104 */ @js.native
  object Flag14 extends TopLevel[Flag14 with Double]
  
  /* 105 */ @js.native
  object Flag15 extends TopLevel[Flag15 with Double]
  
  /* 106 */ @js.native
  object Flag16 extends TopLevel[Flag16 with Double]
  
  /* 107 */ @js.native
  object Flag17 extends TopLevel[Flag17 with Double]
  
  /* 108 */ @js.native
  object Flag18 extends TopLevel[Flag18 with Double]
  
  /* 109 */ @js.native
  object Flag19 extends TopLevel[Flag19 with Double]
  
  /* 110 */ @js.native
  object Flag2 extends TopLevel[Flag2 with Double]
  
  /* 111 */ @js.native
  object Flag20 extends TopLevel[Flag20 with Double]
  
  /* 112 */ @js.native
  object Flag3 extends TopLevel[Flag3 with Double]
  
  /* 113 */ @js.native
  object Flag4 extends TopLevel[Flag4 with Double]
  
  /* 114 */ @js.native
  object Flag5 extends TopLevel[Flag5 with Double]
  
  /* 115 */ @js.native
  object Flag6 extends TopLevel[Flag6 with Double]
  
  /* 116 */ @js.native
  object Flag7 extends TopLevel[Flag7 with Double]
  
  /* 117 */ @js.native
  object Flag8 extends TopLevel[Flag8 with Double]
  
  /* 118 */ @js.native
  object Flag9 extends TopLevel[Flag9 with Double]
  
  /* 148 */ @js.native
  object Generic extends TopLevel[Generic with Double]
  
  /* 119 */ @js.native
  object Group extends TopLevel[Group with Double]
  
  /* 121 */ @js.native
  object Name extends TopLevel[Name with Double]
  
  /* 122 */ @js.native
  object Notes extends TopLevel[Notes with Double]
  
  /* 123 */ @js.native
  object Number1 extends TopLevel[Number1 with Double]
  
  /* 124 */ @js.native
  object Number10 extends TopLevel[Number10 with Double]
  
  /* 125 */ @js.native
  object Number11 extends TopLevel[Number11 with Double]
  
  /* 126 */ @js.native
  object Number12 extends TopLevel[Number12 with Double]
  
  /* 127 */ @js.native
  object Number13 extends TopLevel[Number13 with Double]
  
  /* 128 */ @js.native
  object Number14 extends TopLevel[Number14 with Double]
  
  /* 129 */ @js.native
  object Number15 extends TopLevel[Number15 with Double]
  
  /* 130 */ @js.native
  object Number16 extends TopLevel[Number16 with Double]
  
  /* 131 */ @js.native
  object Number17 extends TopLevel[Number17 with Double]
  
  /* 132 */ @js.native
  object Number18 extends TopLevel[Number18 with Double]
  
  /* 133 */ @js.native
  object Number19 extends TopLevel[Number19 with Double]
  
  /* 134 */ @js.native
  object Number2 extends TopLevel[Number2 with Double]
  
  /* 135 */ @js.native
  object Number20 extends TopLevel[Number20 with Double]
  
  /* 136 */ @js.native
  object Number3 extends TopLevel[Number3 with Double]
  
  /* 137 */ @js.native
  object Number4 extends TopLevel[Number4 with Double]
  
  /* 138 */ @js.native
  object Number5 extends TopLevel[Number5 with Double]
  
  /* 139 */ @js.native
  object Number6 extends TopLevel[Number6 with Double]
  
  /* 140 */ @js.native
  object Number7 extends TopLevel[Number7 with Double]
  
  /* 141 */ @js.native
  object Number8 extends TopLevel[Number8 with Double]
  
  /* 142 */ @js.native
  object Number9 extends TopLevel[Number9 with Double]
  
  /* 149 */ @js.native
  object OverAllocated extends TopLevel[OverAllocated with Double]
  
  /* 143 */ @js.native
  object OvertimeCost extends TopLevel[OvertimeCost with Double]
  
  /* 144 */ @js.native
  object OvertimeRate extends TopLevel[OvertimeRate with Double]
  
  /* 145 */ @js.native
  object OvertimeWork extends TopLevel[OvertimeWork with Double]
  
  /* 146 */ @js.native
  object PercentWorkComplete extends TopLevel[PercentWorkComplete with Double]
  
  /* 150 */ @js.native
  object RegularWork extends TopLevel[RegularWork with Double]
  
  /* 151 */ @js.native
  object RemainingCost extends TopLevel[RemainingCost with Double]
  
  /* 152 */ @js.native
  object RemainingOvertimeCost extends TopLevel[RemainingOvertimeCost with Double]
  
  /* 153 */ @js.native
  object RemainingOvertimeWork extends TopLevel[RemainingOvertimeWork with Double]
  
  /* 154 */ @js.native
  object RemainingWork extends TopLevel[RemainingWork with Double]
  
  /* 54 */ @js.native
  object ResourceCalendarGUID extends TopLevel[ResourceCalendarGUID with Double]
  
  /* 66 */ @js.native
  object ResourceCreationDate extends TopLevel[ResourceCreationDate with Double]
  
  /* 155 */ @js.native
  object ResourceGUID extends TopLevel[ResourceGUID with Double]
  
  /* 169 */ @js.native
  object StandardRate extends TopLevel[StandardRate with Double]
  
  /* 158 */ @js.native
  object Start extends TopLevel[Start with Double]
  
  /* 159 */ @js.native
  object Start1 extends TopLevel[Start1 with Double]
  
  /* 160 */ @js.native
  object Start10 extends TopLevel[Start10 with Double]
  
  /* 161 */ @js.native
  object Start2 extends TopLevel[Start2 with Double]
  
  /* 162 */ @js.native
  object Start3 extends TopLevel[Start3 with Double]
  
  /* 163 */ @js.native
  object Start4 extends TopLevel[Start4 with Double]
  
  /* 164 */ @js.native
  object Start5 extends TopLevel[Start5 with Double]
  
  /* 165 */ @js.native
  object Start6 extends TopLevel[Start6 with Double]
  
  /* 166 */ @js.native
  object Start7 extends TopLevel[Start7 with Double]
  
  /* 167 */ @js.native
  object Start8 extends TopLevel[Start8 with Double]
  
  /* 168 */ @js.native
  object Start9 extends TopLevel[Start9 with Double]
  
  /* 170 */ @js.native
  object Text1 extends TopLevel[Text1 with Double]
  
  /* 171 */ @js.native
  object Text10 extends TopLevel[Text10 with Double]
  
  /* 172 */ @js.native
  object Text11 extends TopLevel[Text11 with Double]
  
  /* 173 */ @js.native
  object Text12 extends TopLevel[Text12 with Double]
  
  /* 174 */ @js.native
  object Text13 extends TopLevel[Text13 with Double]
  
  /* 175 */ @js.native
  object Text14 extends TopLevel[Text14 with Double]
  
  /* 176 */ @js.native
  object Text15 extends TopLevel[Text15 with Double]
  
  /* 177 */ @js.native
  object Text16 extends TopLevel[Text16 with Double]
  
  /* 178 */ @js.native
  object Text17 extends TopLevel[Text17 with Double]
  
  /* 179 */ @js.native
  object Text18 extends TopLevel[Text18 with Double]
  
  /* 180 */ @js.native
  object Text19 extends TopLevel[Text19 with Double]
  
  /* 181 */ @js.native
  object Text2 extends TopLevel[Text2 with Double]
  
  /* 182 */ @js.native
  object Text20 extends TopLevel[Text20 with Double]
  
  /* 183 */ @js.native
  object Text21 extends TopLevel[Text21 with Double]
  
  /* 184 */ @js.native
  object Text22 extends TopLevel[Text22 with Double]
  
  /* 185 */ @js.native
  object Text23 extends TopLevel[Text23 with Double]
  
  /* 186 */ @js.native
  object Text24 extends TopLevel[Text24 with Double]
  
  /* 187 */ @js.native
  object Text25 extends TopLevel[Text25 with Double]
  
  /* 188 */ @js.native
  object Text26 extends TopLevel[Text26 with Double]
  
  /* 189 */ @js.native
  object Text27 extends TopLevel[Text27 with Double]
  
  /* 190 */ @js.native
  object Text28 extends TopLevel[Text28 with Double]
  
  /* 191 */ @js.native
  object Text29 extends TopLevel[Text29 with Double]
  
  /* 192 */ @js.native
  object Text3 extends TopLevel[Text3 with Double]
  
  /* 193 */ @js.native
  object Text30 extends TopLevel[Text30 with Double]
  
  /* 194 */ @js.native
  object Text4 extends TopLevel[Text4 with Double]
  
  /* 195 */ @js.native
  object Text5 extends TopLevel[Text5 with Double]
  
  /* 196 */ @js.native
  object Text6 extends TopLevel[Text6 with Double]
  
  /* 197 */ @js.native
  object Text7 extends TopLevel[Text7 with Double]
  
  /* 198 */ @js.native
  object Text8 extends TopLevel[Text8 with Double]
  
  /* 199 */ @js.native
  object Text9 extends TopLevel[Text9 with Double]
  
  /* 120 */ @js.native
  object Units extends TopLevel[Units with Double]
  
  /* 157 */ @js.native
  object Work extends TopLevel[Work with Double]
  
}

