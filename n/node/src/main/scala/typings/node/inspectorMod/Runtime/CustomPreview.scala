package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @experimental
  */
@js.native
trait CustomPreview extends StObject {
  
  var bindRemoteObjectFunctionId: RemoteObjectId = js.native
  
  var configObjectId: js.UndefOr[RemoteObjectId] = js.native
  
  var formatterObjectId: RemoteObjectId = js.native
  
  var hasBody: Boolean = js.native
  
  var header: String = js.native
}
object CustomPreview {
  
  @scala.inline
  def apply(
    bindRemoteObjectFunctionId: RemoteObjectId,
    formatterObjectId: RemoteObjectId,
    hasBody: Boolean,
    header: String
  ): CustomPreview = {
    val __obj = js.Dynamic.literal(bindRemoteObjectFunctionId = bindRemoteObjectFunctionId.asInstanceOf[js.Any], formatterObjectId = formatterObjectId.asInstanceOf[js.Any], hasBody = hasBody.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPreview]
  }
  
  @scala.inline
  implicit class CustomPreviewMutableBuilder[Self <: CustomPreview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindRemoteObjectFunctionId(value: RemoteObjectId): Self = StObject.set(x, "bindRemoteObjectFunctionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigObjectId(value: RemoteObjectId): Self = StObject.set(x, "configObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigObjectIdUndefined: Self = StObject.set(x, "configObjectId", js.undefined)
    
    @scala.inline
    def setFormatterObjectId(value: RemoteObjectId): Self = StObject.set(x, "formatterObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBody(value: Boolean): Self = StObject.set(x, "hasBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
