package typings.officeJs.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
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
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Month with String] = js.native
  /* "apr" */ @js.native
  object Apr extends TopLevel[Apr with String]
  
  /* "aug" */ @js.native
  object Aug extends TopLevel[Aug with String]
  
  /* "dec" */ @js.native
  object Dec extends TopLevel[Dec with String]
  
  /* "feb" */ @js.native
  object Feb extends TopLevel[Feb with String]
  
  /* "jan" */ @js.native
  object Jan extends TopLevel[Jan with String]
  
  /* "jul" */ @js.native
  object Jul extends TopLevel[Jul with String]
  
  /* "jun" */ @js.native
  object Jun extends TopLevel[Jun with String]
  
  /* "mar" */ @js.native
  object Mar extends TopLevel[Mar with String]
  
  /* "may" */ @js.native
  object May extends TopLevel[May with String]
  
  /* "nov" */ @js.native
  object Nov extends TopLevel[Nov with String]
  
  /* "oct" */ @js.native
  object Oct extends TopLevel[Oct with String]
  
  /* "sep" */ @js.native
  object Sep extends TopLevel[Sep with String]
  
}

