package typings.officeDashJs.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Month extends js.Object

/**
  * Specifies the month.
  * 
  * [Api set: Mailbox 1.7]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.Month")
@js.native
object Month extends js.Object {
  /**
    * April
    */
  @js.native
  sealed trait Apr extends Month
  
  /**
    * August
    */
  @js.native
  sealed trait Aug extends Month
  
  /**
    * December
    */
  @js.native
  sealed trait Dec extends Month
  
  /**
    * February
    */
  @js.native
  sealed trait Feb extends Month
  
  /**
    * January
    */
  @js.native
  sealed trait Jan extends Month
  
  /**
    * July
    */
  @js.native
  sealed trait Jul extends Month
  
  /**
    * June
    */
  @js.native
  sealed trait Jun extends Month
  
  /**
    * March
    */
  @js.native
  sealed trait Mar extends Month
  
  /**
    * May
    */
  @js.native
  sealed trait May extends Month
  
  /**
    * November
    */
  @js.native
  sealed trait Nov extends Month
  
  /**
    * October
    */
  @js.native
  sealed trait Oct extends Month
  
  /**
    * September
    */
  @js.native
  sealed trait Sep extends Month
  
  /* "apr" */ val Apr: typings.officeDashJs.Office.MailboxEnums.Month.Apr with String = js.native
  /* "aug" */ val Aug: typings.officeDashJs.Office.MailboxEnums.Month.Aug with String = js.native
  /* "dec" */ val Dec: typings.officeDashJs.Office.MailboxEnums.Month.Dec with String = js.native
  /* "feb" */ val Feb: typings.officeDashJs.Office.MailboxEnums.Month.Feb with String = js.native
  /* "jan" */ val Jan: typings.officeDashJs.Office.MailboxEnums.Month.Jan with String = js.native
  /* "jul" */ val Jul: typings.officeDashJs.Office.MailboxEnums.Month.Jul with String = js.native
  /* "jun" */ val Jun: typings.officeDashJs.Office.MailboxEnums.Month.Jun with String = js.native
  /* "mar" */ val Mar: typings.officeDashJs.Office.MailboxEnums.Month.Mar with String = js.native
  /* "may" */ val May: typings.officeDashJs.Office.MailboxEnums.Month.May with String = js.native
  /* "nov" */ val Nov: typings.officeDashJs.Office.MailboxEnums.Month.Nov with String = js.native
  /* "oct" */ val Oct: typings.officeDashJs.Office.MailboxEnums.Month.Oct with String = js.native
  /* "sep" */ val Sep: typings.officeDashJs.Office.MailboxEnums.Month.Sep with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Month with String] = js.native
}

