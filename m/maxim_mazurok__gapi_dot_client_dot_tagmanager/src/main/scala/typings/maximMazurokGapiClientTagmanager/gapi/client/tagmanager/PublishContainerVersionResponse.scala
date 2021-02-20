package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishContainerVersionResponse extends StObject {
  
  /** Compiler errors or not. */
  var compilerError: js.UndefOr[Boolean] = js.native
  
  /** The container version created. */
  var containerVersion: js.UndefOr[ContainerVersion] = js.native
}
object PublishContainerVersionResponse {
  
  @scala.inline
  def apply(): PublishContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishContainerVersionResponse]
  }
  
  @scala.inline
  implicit class PublishContainerVersionResponseMutableBuilder[Self <: PublishContainerVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompilerError(value: Boolean): Self = StObject.set(x, "compilerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilerErrorUndefined: Self = StObject.set(x, "compilerError", js.undefined)
    
    @scala.inline
    def setContainerVersion(value: ContainerVersion): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
  }
}
