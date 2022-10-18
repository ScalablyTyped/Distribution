package typings.pdfjsDist

import typings.pdfjsDist.anon.AllowRangeRequests
import typings.pdfjsDist.anon.DisableRange
import typings.pdfjsDist.typesSrcSharedUtilMod.MissingPDFException
import typings.pdfjsDist.typesSrcSharedUtilMod.UnexpectedResponseException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayNetworkUtilsMod {
  
  @JSImport("pdfjs-dist/types/src/display/network_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createResponseStatusError(status: Any, url: Any): MissingPDFException | UnexpectedResponseException = (^.asInstanceOf[js.Dynamic].applyDynamic("createResponseStatusError")(status.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[MissingPDFException | UnexpectedResponseException]
  
  inline def extractFilenameFromHeader(getResponseHeader: Any): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractFilenameFromHeader")(getResponseHeader.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def validateRangeRequestCapabilities(hasGetResponseHeaderIsHttpRangeChunkSizeDisableRange: DisableRange): AllowRangeRequests = ^.asInstanceOf[js.Dynamic].applyDynamic("validateRangeRequestCapabilities")(hasGetResponseHeaderIsHttpRangeChunkSizeDisableRange.asInstanceOf[js.Any]).asInstanceOf[AllowRangeRequests]
  
  inline def validateResponseStatus(status: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateResponseStatus")(status.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
