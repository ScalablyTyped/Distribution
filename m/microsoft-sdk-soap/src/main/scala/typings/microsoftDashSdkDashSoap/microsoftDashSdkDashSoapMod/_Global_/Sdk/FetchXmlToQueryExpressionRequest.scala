package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the data that is needed to convert a query in FetchXML to a QueryExpression.
  * @param fetchXml Sets the query to convert.
  */
@JSGlobal("Sdk.FetchXmlToQueryExpressionRequest")
@js.native
class FetchXmlToQueryExpressionRequest protected () extends OrganizationRequest {
  def this(fetchXml: java.lang.String) = this()
  /**
    * Sets the query to convert.
    * @param The query to convert.
    */
  def setFetchXml(value: java.lang.String): Unit = js.native
}

