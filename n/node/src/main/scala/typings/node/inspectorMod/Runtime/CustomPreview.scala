package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @experimental
  */
trait CustomPreview extends StObject {
  
  var bindRemoteObjectFunctionId: RemoteObjectId
  
  var configObjectId: js.UndefOr[RemoteObjectId] = js.undefined
  
  var formatterObjectId: RemoteObjectId
  
  var hasBody: Boolean
  
  var header: String
}
object CustomPreview {
  
  inline def apply(
    bindRemoteObjectFunctionId: RemoteObjectId,
    formatterObjectId: RemoteObjectId,
    hasBody: Boolean,
    header: String
  ): CustomPreview = {
    val __obj = js.Dynamic.literal(bindRemoteObjectFunctionId = bindRemoteObjectFunctionId.asInstanceOf[js.Any], formatterObjectId = formatterObjectId.asInstanceOf[js.Any], hasBody = hasBody.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPreview]
  }
  
  extension [Self <: CustomPreview](x: Self) {
    
    inline def setBindRemoteObjectFunctionId(value: RemoteObjectId): Self = StObject.set(x, "bindRemoteObjectFunctionId", value.asInstanceOf[js.Any])
    
    inline def setConfigObjectId(value: RemoteObjectId): Self = StObject.set(x, "configObjectId", value.asInstanceOf[js.Any])
    
    inline def setConfigObjectIdUndefined: Self = StObject.set(x, "configObjectId", js.undefined)
    
    inline def setFormatterObjectId(value: RemoteObjectId): Self = StObject.set(x, "formatterObjectId", value.asInstanceOf[js.Any])
    
    inline def setHasBody(value: Boolean): Self = StObject.set(x, "hasBody", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
