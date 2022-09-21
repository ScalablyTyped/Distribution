package typings.microsoftSdkSoap.mod.global.Sdk

import typings.microsoftSdkSoap.mod.global.Sdk.Mdq.IEntityMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to RetrieveMetadataChangesRequest.
  * @param resopnseXml The response XML.
  */
@JSGlobal("Sdk.RetrieveMetadataChangesResponse")
@js.native
open class RetrieveMetadataChangesResponse protected () extends StObject {
  def this(responseXml: java.lang.String) = this()
  
  /***
    *
    */
  def getDeletedMetadata(): Any = js.native
  
  /***
    *
    */
  def getEntityMetadata(): js.Array[IEntityMetadata] = js.native
  
  /***
    *
    */
  def getServerVersionStamp(): java.lang.String = js.native
}
