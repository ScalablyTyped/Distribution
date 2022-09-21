package typings.microsoftSdkSoap.mod.global.Sdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the data that is needed to convert a query in FetchXML to a QueryExpression.
  * @param fetchXml Sets the query to convert.
  */
@JSGlobal("Sdk.FetchXmlToQueryExpressionRequest")
@js.native
open class FetchXmlToQueryExpressionRequest protected () extends OrganizationRequest {
  def this(fetchXml: java.lang.String) = this()
  
  /**
    * Sets the query to convert.
    * @param The query to convert.
    */
  def setFetchXml(value: java.lang.String): Unit = js.native
}
