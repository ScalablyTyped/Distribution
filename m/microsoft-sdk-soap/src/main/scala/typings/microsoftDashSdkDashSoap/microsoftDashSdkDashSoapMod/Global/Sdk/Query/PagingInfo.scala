package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Sdk.Query.PagingInfo")
@js.native
class PagingInfo () extends js.Object {
  /**
    * Gets the number of entity instances returned per page.
    */
  def getCount(): scala.Double = js.native
  /**
    * Gets the number of pages returned from the query.
    */
  def getPageNumber(): scala.Double = js.native
  /**
    * Gets the info used to page large result sets.
    */
  def getPagingCookie(): java.lang.String = js.native
  /**
    * Gets whether the total number of records should be returned from the query.
    */
  def getReturnTotalRecordCount(): scala.Boolean = js.native
  /**
    * Sets the number of entity instances returned per page.
    * @param The number of entity instances returned per page
    */
  def setCount(count: scala.Double): Unit = js.native
  /**
    * Sets the number of pages returned from the query.
    * @param The number of pages returned from the query.
    */
  def setPageNumber(pages: scala.Double): Unit = js.native
  /**
    * Sets the info used to page large result sets.
    */
  def setPagingCookie(cookie: java.lang.String): Unit = js.native
  /**
    * Sets whether the total number of records should be returned from the query.
    * @param Specifies whether the TotalRecordCount should be set when the query is executed.
    */
  def setReturnTotalRecordCount(returnTotalRecordsCount: scala.Boolean): Unit = js.native
  /// prototype methods
  /**
    * Gets the serialized paging info.
    *
    toXml():string;
    / **
    * Gets the serialized paging info values.
    */
  def toValueXml(): java.lang.String = js.native
}

