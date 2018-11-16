package typings
package officeDashJsLib.OfficeNs.MailboxEnumsNs

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
         * <table><tr><td>
         * {@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}
         * </td><td>Compose or read</td></tr></table>
         */
@JSGlobal("Office.MailboxEnums.Month")
@js.native
object Month extends js.Object {
  /**
               * April
               */
  @js.native
  sealed trait Apr
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Month
  
  /**
               * August
               */
  @js.native
  sealed trait Aug
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Month
  
  /**
               * December
               */
  @js.native
  sealed trait Dec
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Month
  
  /**
               * February
               */
  @js.native
  sealed trait Feb
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Month
  
  /**
               * January
               */
  @js.native
  sealed trait Jan
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Month
  
  /**
               * July
               */
  @js.native
  sealed trait Jul
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Month
  
  /**
               * June
               */
  @js.native
  sealed trait Jun
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Month
  
  /**
               * March
               */
  @js.native
  sealed trait Mar
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Month
  
  /**
               * May
               */
  @js.native
  sealed trait May
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Month
  
  /**
               * November
               */
  @js.native
  sealed trait Nov
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Month
  
  /**
               * October
               */
  @js.native
  sealed trait Oct
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Month
  
  /**
               * September
               */
  @js.native
  sealed trait Sep
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.Month
  
  /* "apr" */ val Apr: Apr with java.lang.String = js.native
  /* "aug" */ val Aug: Aug with java.lang.String = js.native
  /* "dec" */ val Dec: Dec with java.lang.String = js.native
  /* "feb" */ val Feb: Feb with java.lang.String = js.native
  /* "jan" */ val Jan: Jan with java.lang.String = js.native
  /* "jul" */ val Jul: Jul with java.lang.String = js.native
  /* "jun" */ val Jun: Jun with java.lang.String = js.native
  /* "mar" */ val Mar: Mar with java.lang.String = js.native
  /* "may" */ val May: May with java.lang.String = js.native
  /* "nov" */ val Nov: Nov with java.lang.String = js.native
  /* "oct" */ val Oct: Oct with java.lang.String = js.native
  /* "sep" */ val Sep: Sep with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.MailboxEnumsNs.Month with java.lang.String] = js.native
}

