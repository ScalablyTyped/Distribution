package typings.microsoftSdkSoap.mod.global.Sdk

import typings.microsoftSdkSoap.mod.global.Sdk.Query.QueryBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the data that is needed to  convert a query, which is represented as a QueryExpression class, to its equivalent query, which is represented as FetchXML.
  * @param query The query.
  */
@JSGlobal("Sdk.QueryExpressionToFetchXmlRequest")
@js.native
open class QueryExpressionToFetchXmlRequest protected () extends OrganizationRequest {
  def this(query: QueryBase) = this()
  
  /**
    * Sets the query to convert.
    * @param query The query.
    * @param query
    */
  def setQuery(query: QueryBase): Unit = js.native
}
