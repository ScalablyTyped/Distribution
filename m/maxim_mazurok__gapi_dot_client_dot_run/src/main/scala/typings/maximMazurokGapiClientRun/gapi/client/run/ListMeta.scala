package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMeta extends StObject {
  
  /**
    * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue
    * another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a list may not be possible if the server configuration has changed or
    * more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response.
    */
  var continue: js.UndefOr[String] = js.undefined
  
  /**
    * String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients
    * and passed unmodified back to the server. Populated by the system. Read-only. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency +optional
    */
  var resourceVersion: js.UndefOr[String] = js.undefined
  
  /** SelfLink is a URL representing this object. Populated by the system. Read-only. +optional */
  var selfLink: js.UndefOr[String] = js.undefined
}
object ListMeta {
  
  @scala.inline
  def apply(): ListMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMeta]
  }
  
  @scala.inline
  implicit class ListMetaMutableBuilder[Self <: ListMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinue(value: String): Self = StObject.set(x, "continue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueUndefined: Self = StObject.set(x, "continue", js.undefined)
    
    @scala.inline
    def setResourceVersion(value: String): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceVersionUndefined: Self = StObject.set(x, "resourceVersion", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
