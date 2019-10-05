package typings.officeDashJsDashPreview.Office

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
  
  /* 0 */ val Accrual: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Accrual with Double = js.native
  /* 1 */ val ActualCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.ActualCost with Double = js.native
  /* 2 */ val ActualOvertimeCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.ActualOvertimeCost with Double = js.native
  /* 3 */ val ActualOvertimeWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.ActualOvertimeWork with Double = js.native
  /* 4 */ val ActualOvertimeWorkProtected: typings.officeDashJsDashPreview.Office.ProjectResourceFields.ActualOvertimeWorkProtected with Double = js.native
  /* 5 */ val ActualWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.ActualWork with Double = js.native
  /* 6 */ val ActualWorkProtected: typings.officeDashJsDashPreview.Office.ProjectResourceFields.ActualWorkProtected with Double = js.native
  /* 7 */ val BaseCalendar: typings.officeDashJsDashPreview.Office.ProjectResourceFields.BaseCalendar with Double = js.native
  /* 8 */ val Baseline10BudgetCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline10BudgetCost with Double = js.native
  /* 9 */ val Baseline10BudgetWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline10BudgetWork with Double = js.native
  /* 10 */ val Baseline10Cost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline10Cost with Double = js.native
  /* 11 */ val Baseline10Work: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline10Work with Double = js.native
  /* 12 */ val Baseline1BudgetCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline1BudgetCost with Double = js.native
  /* 13 */ val Baseline1BudgetWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline1BudgetWork with Double = js.native
  /* 14 */ val Baseline1Cost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline1Cost with Double = js.native
  /* 15 */ val Baseline1Work: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline1Work with Double = js.native
  /* 16 */ val Baseline2BudgetCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline2BudgetCost with Double = js.native
  /* 17 */ val Baseline2BudgetWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline2BudgetWork with Double = js.native
  /* 18 */ val Baseline2Cost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline2Cost with Double = js.native
  /* 19 */ val Baseline2Work: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline2Work with Double = js.native
  /* 20 */ val Baseline3BudgetCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline3BudgetCost with Double = js.native
  /* 21 */ val Baseline3BudgetWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline3BudgetWork with Double = js.native
  /* 22 */ val Baseline3Cost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline3Cost with Double = js.native
  /* 23 */ val Baseline3Work: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline3Work with Double = js.native
  /* 24 */ val Baseline4BudgetCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline4BudgetCost with Double = js.native
  /* 25 */ val Baseline4BudgetWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline4BudgetWork with Double = js.native
  /* 26 */ val Baseline4Cost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline4Cost with Double = js.native
  /* 27 */ val Baseline4Work: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline4Work with Double = js.native
  /* 28 */ val Baseline5BudgetCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline5BudgetCost with Double = js.native
  /* 29 */ val Baseline5BudgetWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline5BudgetWork with Double = js.native
  /* 30 */ val Baseline5Cost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline5Cost with Double = js.native
  /* 31 */ val Baseline5Work: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline5Work with Double = js.native
  /* 32 */ val Baseline6BudgetCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline6BudgetCost with Double = js.native
  /* 33 */ val Baseline6BudgetWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline6BudgetWork with Double = js.native
  /* 34 */ val Baseline6Cost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline6Cost with Double = js.native
  /* 35 */ val Baseline6Work: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline6Work with Double = js.native
  /* 36 */ val Baseline7BudgetCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline7BudgetCost with Double = js.native
  /* 37 */ val Baseline7BudgetWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline7BudgetWork with Double = js.native
  /* 38 */ val Baseline7Cost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline7Cost with Double = js.native
  /* 39 */ val Baseline7Work: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline7Work with Double = js.native
  /* 40 */ val Baseline8BudgetCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline8BudgetCost with Double = js.native
  /* 41 */ val Baseline8BudgetWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline8BudgetWork with Double = js.native
  /* 42 */ val Baseline8Cost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline8Cost with Double = js.native
  /* 43 */ val Baseline8Work: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline8Work with Double = js.native
  /* 44 */ val Baseline9BudgetCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline9BudgetCost with Double = js.native
  /* 45 */ val Baseline9BudgetWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline9BudgetWork with Double = js.native
  /* 46 */ val Baseline9Cost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline9Cost with Double = js.native
  /* 47 */ val Baseline9Work: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Baseline9Work with Double = js.native
  /* 48 */ val BaselineBudgetCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.BaselineBudgetCost with Double = js.native
  /* 49 */ val BaselineBudgetWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.BaselineBudgetWork with Double = js.native
  /* 50 */ val BaselineCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.BaselineCost with Double = js.native
  /* 51 */ val BaselineWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.BaselineWork with Double = js.native
  /* 52 */ val BudgetCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.BudgetCost with Double = js.native
  /* 53 */ val BudgetWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.BudgetWork with Double = js.native
  /* 55 */ val Code: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Code with Double = js.native
  /* 156 */ val Cost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Cost with Double = js.native
  /* 56 */ val Cost1: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Cost1 with Double = js.native
  /* 57 */ val Cost10: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Cost10 with Double = js.native
  /* 58 */ val Cost2: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Cost2 with Double = js.native
  /* 59 */ val Cost3: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Cost3 with Double = js.native
  /* 60 */ val Cost4: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Cost4 with Double = js.native
  /* 61 */ val Cost5: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Cost5 with Double = js.native
  /* 62 */ val Cost6: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Cost6 with Double = js.native
  /* 63 */ val Cost7: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Cost7 with Double = js.native
  /* 64 */ val Cost8: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Cost8 with Double = js.native
  /* 65 */ val Cost9: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Cost9 with Double = js.native
  /* 147 */ val CostPerUse: typings.officeDashJsDashPreview.Office.ProjectResourceFields.CostPerUse with Double = js.native
  /* 67 */ val Date1: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Date1 with Double = js.native
  /* 68 */ val Date10: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Date10 with Double = js.native
  /* 69 */ val Date2: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Date2 with Double = js.native
  /* 70 */ val Date3: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Date3 with Double = js.native
  /* 71 */ val Date4: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Date4 with Double = js.native
  /* 72 */ val Date5: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Date5 with Double = js.native
  /* 73 */ val Date6: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Date6 with Double = js.native
  /* 74 */ val Date7: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Date7 with Double = js.native
  /* 75 */ val Date8: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Date8 with Double = js.native
  /* 76 */ val Date9: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Date9 with Double = js.native
  /* 77 */ val Duration1: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Duration1 with Double = js.native
  /* 78 */ val Duration10: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Duration10 with Double = js.native
  /* 79 */ val Duration2: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Duration2 with Double = js.native
  /* 80 */ val Duration3: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Duration3 with Double = js.native
  /* 81 */ val Duration4: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Duration4 with Double = js.native
  /* 82 */ val Duration5: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Duration5 with Double = js.native
  /* 83 */ val Duration6: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Duration6 with Double = js.native
  /* 84 */ val Duration7: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Duration7 with Double = js.native
  /* 85 */ val Duration8: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Duration8 with Double = js.native
  /* 86 */ val Duration9: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Duration9 with Double = js.native
  /* 87 */ val Email: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Email with Double = js.native
  /* 88 */ val End: typings.officeDashJsDashPreview.Office.ProjectResourceFields.End with Double = js.native
  /* 89 */ val Finish1: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Finish1 with Double = js.native
  /* 90 */ val Finish10: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Finish10 with Double = js.native
  /* 91 */ val Finish2: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Finish2 with Double = js.native
  /* 92 */ val Finish3: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Finish3 with Double = js.native
  /* 93 */ val Finish4: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Finish4 with Double = js.native
  /* 94 */ val Finish5: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Finish5 with Double = js.native
  /* 95 */ val Finish6: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Finish6 with Double = js.native
  /* 96 */ val Finish7: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Finish7 with Double = js.native
  /* 97 */ val Finish8: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Finish8 with Double = js.native
  /* 98 */ val Finish9: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Finish9 with Double = js.native
  /* 100 */ val Flag1: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag1 with Double = js.native
  /* 99 */ val Flag10: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag10 with Double = js.native
  /* 101 */ val Flag11: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag11 with Double = js.native
  /* 102 */ val Flag12: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag12 with Double = js.native
  /* 103 */ val Flag13: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag13 with Double = js.native
  /* 104 */ val Flag14: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag14 with Double = js.native
  /* 105 */ val Flag15: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag15 with Double = js.native
  /* 106 */ val Flag16: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag16 with Double = js.native
  /* 107 */ val Flag17: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag17 with Double = js.native
  /* 108 */ val Flag18: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag18 with Double = js.native
  /* 109 */ val Flag19: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag19 with Double = js.native
  /* 110 */ val Flag2: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag2 with Double = js.native
  /* 111 */ val Flag20: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag20 with Double = js.native
  /* 112 */ val Flag3: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag3 with Double = js.native
  /* 113 */ val Flag4: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag4 with Double = js.native
  /* 114 */ val Flag5: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag5 with Double = js.native
  /* 115 */ val Flag6: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag6 with Double = js.native
  /* 116 */ val Flag7: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag7 with Double = js.native
  /* 117 */ val Flag8: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag8 with Double = js.native
  /* 118 */ val Flag9: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Flag9 with Double = js.native
  /* 148 */ val Generic: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Generic with Double = js.native
  /* 119 */ val Group: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Group with Double = js.native
  /* 121 */ val Name: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Name with Double = js.native
  /* 122 */ val Notes: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Notes with Double = js.native
  /* 123 */ val Number1: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number1 with Double = js.native
  /* 124 */ val Number10: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number10 with Double = js.native
  /* 125 */ val Number11: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number11 with Double = js.native
  /* 126 */ val Number12: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number12 with Double = js.native
  /* 127 */ val Number13: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number13 with Double = js.native
  /* 128 */ val Number14: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number14 with Double = js.native
  /* 129 */ val Number15: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number15 with Double = js.native
  /* 130 */ val Number16: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number16 with Double = js.native
  /* 131 */ val Number17: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number17 with Double = js.native
  /* 132 */ val Number18: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number18 with Double = js.native
  /* 133 */ val Number19: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number19 with Double = js.native
  /* 134 */ val Number2: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number2 with Double = js.native
  /* 135 */ val Number20: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number20 with Double = js.native
  /* 136 */ val Number3: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number3 with Double = js.native
  /* 137 */ val Number4: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number4 with Double = js.native
  /* 138 */ val Number5: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number5 with Double = js.native
  /* 139 */ val Number6: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number6 with Double = js.native
  /* 140 */ val Number7: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number7 with Double = js.native
  /* 141 */ val Number8: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number8 with Double = js.native
  /* 142 */ val Number9: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Number9 with Double = js.native
  /* 149 */ val OverAllocated: typings.officeDashJsDashPreview.Office.ProjectResourceFields.OverAllocated with Double = js.native
  /* 143 */ val OvertimeCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.OvertimeCost with Double = js.native
  /* 144 */ val OvertimeRate: typings.officeDashJsDashPreview.Office.ProjectResourceFields.OvertimeRate with Double = js.native
  /* 145 */ val OvertimeWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.OvertimeWork with Double = js.native
  /* 146 */ val PercentWorkComplete: typings.officeDashJsDashPreview.Office.ProjectResourceFields.PercentWorkComplete with Double = js.native
  /* 150 */ val RegularWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.RegularWork with Double = js.native
  /* 151 */ val RemainingCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.RemainingCost with Double = js.native
  /* 152 */ val RemainingOvertimeCost: typings.officeDashJsDashPreview.Office.ProjectResourceFields.RemainingOvertimeCost with Double = js.native
  /* 153 */ val RemainingOvertimeWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.RemainingOvertimeWork with Double = js.native
  /* 154 */ val RemainingWork: typings.officeDashJsDashPreview.Office.ProjectResourceFields.RemainingWork with Double = js.native
  /* 54 */ val ResourceCalendarGUID: typings.officeDashJsDashPreview.Office.ProjectResourceFields.ResourceCalendarGUID with Double = js.native
  /* 66 */ val ResourceCreationDate: typings.officeDashJsDashPreview.Office.ProjectResourceFields.ResourceCreationDate with Double = js.native
  /* 155 */ val ResourceGUID: typings.officeDashJsDashPreview.Office.ProjectResourceFields.ResourceGUID with Double = js.native
  /* 169 */ val StandardRate: typings.officeDashJsDashPreview.Office.ProjectResourceFields.StandardRate with Double = js.native
  /* 158 */ val Start: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Start with Double = js.native
  /* 159 */ val Start1: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Start1 with Double = js.native
  /* 160 */ val Start10: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Start10 with Double = js.native
  /* 161 */ val Start2: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Start2 with Double = js.native
  /* 162 */ val Start3: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Start3 with Double = js.native
  /* 163 */ val Start4: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Start4 with Double = js.native
  /* 164 */ val Start5: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Start5 with Double = js.native
  /* 165 */ val Start6: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Start6 with Double = js.native
  /* 166 */ val Start7: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Start7 with Double = js.native
  /* 167 */ val Start8: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Start8 with Double = js.native
  /* 168 */ val Start9: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Start9 with Double = js.native
  /* 170 */ val Text1: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text1 with Double = js.native
  /* 171 */ val Text10: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text10 with Double = js.native
  /* 172 */ val Text11: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text11 with Double = js.native
  /* 173 */ val Text12: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text12 with Double = js.native
  /* 174 */ val Text13: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text13 with Double = js.native
  /* 175 */ val Text14: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text14 with Double = js.native
  /* 176 */ val Text15: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text15 with Double = js.native
  /* 177 */ val Text16: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text16 with Double = js.native
  /* 178 */ val Text17: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text17 with Double = js.native
  /* 179 */ val Text18: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text18 with Double = js.native
  /* 180 */ val Text19: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text19 with Double = js.native
  /* 181 */ val Text2: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text2 with Double = js.native
  /* 182 */ val Text20: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text20 with Double = js.native
  /* 183 */ val Text21: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text21 with Double = js.native
  /* 184 */ val Text22: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text22 with Double = js.native
  /* 185 */ val Text23: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text23 with Double = js.native
  /* 186 */ val Text24: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text24 with Double = js.native
  /* 187 */ val Text25: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text25 with Double = js.native
  /* 188 */ val Text26: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text26 with Double = js.native
  /* 189 */ val Text27: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text27 with Double = js.native
  /* 190 */ val Text28: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text28 with Double = js.native
  /* 191 */ val Text29: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text29 with Double = js.native
  /* 192 */ val Text3: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text3 with Double = js.native
  /* 193 */ val Text30: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text30 with Double = js.native
  /* 194 */ val Text4: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text4 with Double = js.native
  /* 195 */ val Text5: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text5 with Double = js.native
  /* 196 */ val Text6: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text6 with Double = js.native
  /* 197 */ val Text7: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text7 with Double = js.native
  /* 198 */ val Text8: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text8 with Double = js.native
  /* 199 */ val Text9: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Text9 with Double = js.native
  /* 120 */ val Units: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Units with Double = js.native
  /* 157 */ val Work: typings.officeDashJsDashPreview.Office.ProjectResourceFields.Work with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectResourceFields with Double] = js.native
}

