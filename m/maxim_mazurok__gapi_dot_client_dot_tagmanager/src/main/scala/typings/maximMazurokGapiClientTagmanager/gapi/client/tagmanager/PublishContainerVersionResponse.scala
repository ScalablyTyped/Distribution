package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishContainerVersionResponse extends StObject {
  
  /** Compiler errors or not. */
  var compilerError: js.UndefOr[Boolean] = js.undefined
  
  /** The container version created. */
  var containerVersion: js.UndefOr[ContainerVersion] = js.undefined
}
object PublishContainerVersionResponse {
  
  inline def apply(): PublishContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishContainerVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishContainerVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setCompilerError(value: Boolean): Self = StObject.set(x, "compilerError", value.asInstanceOf[js.Any])
    
    inline def setCompilerErrorUndefined: Self = StObject.set(x, "compilerError", js.undefined)
    
    inline def setContainerVersion(value: ContainerVersion): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
  }
}
