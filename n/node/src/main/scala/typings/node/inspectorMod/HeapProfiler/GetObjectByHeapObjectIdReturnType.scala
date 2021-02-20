package typings.node.inspectorMod.HeapProfiler

import typings.node.inspectorMod.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectByHeapObjectIdReturnType extends StObject {
  
  /**
    * Evaluation result.
    */
  var result: RemoteObject = js.native
}
object GetObjectByHeapObjectIdReturnType {
  
  @scala.inline
  def apply(result: RemoteObject): GetObjectByHeapObjectIdReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectByHeapObjectIdReturnType]
  }
  
  @scala.inline
  implicit class GetObjectByHeapObjectIdReturnTypeMutableBuilder[Self <: GetObjectByHeapObjectIdReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: RemoteObject): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
