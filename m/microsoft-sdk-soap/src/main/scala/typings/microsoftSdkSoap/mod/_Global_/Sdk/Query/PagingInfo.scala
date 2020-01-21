package typings.microsoftSdkSoap.mod._Global_.Sdk.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Sdk.Query.PagingInfo")
@js.native
class PagingInfo () extends js.Object {
  /**
    * Gets the number of entity instances returned per page.
    */
  def getCount(): Double = js.native
  /**
    * Gets the number of pages returned from the query.
    */
  def getPageNumber(): Double = js.native
  /**
    * Gets the info used to page large result sets.
    */
  def getPagingCookie(): String = js.native
  /**
    * Gets whether the total number of records should be returned from the query.
    */
  def getReturnTotalRecordCount(): Boolean = js.native
  /**
    * Sets the number of entity instances returned per page.
    * @param The number of entity instances returned per page
    */
  def setCount(count: Double): Unit = js.native
  /**
    * Sets the number of pages returned from the query.
    * @param The number of pages returned from the query.
    */
  def setPageNumber(pages: Double): Unit = js.native
  /**
    * Sets the info used to page large result sets.
    */
  def setPagingCookie(cookie: String): Unit = js.native
  /**
    * Sets whether the total number of records should be returned from the query.
    * @param Specifies whether the TotalRecordCount should be set when the query is executed.
    */
  def setReturnTotalRecordCount(returnTotalRecordsCount: Boolean): Unit = js.native
  /// prototype methods
  /**
    * Gets the serialized paging info.
    *
    toXml():string;
    / **
    * Gets the serialized paging info values.
    */
  def toValueXml(): String = js.native
}

