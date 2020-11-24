package typings.monacoEditor.mod.worker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWorkerContext[H] extends js.Object {
  
  /**
    * Get all available mirror models in this worker.
    */
  def getMirrorModels(): js.Array[IMirrorModel] = js.native
  
  /**
    * A proxy to the main thread host object.
    */
  var host: H = js.native
}
object IWorkerContext {
  
  @scala.inline
  def apply[H](getMirrorModels: () => js.Array[IMirrorModel], host: H): IWorkerContext[H] = {
    val __obj = js.Dynamic.literal(getMirrorModels = js.Any.fromFunction0(getMirrorModels), host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkerContext[H]]
  }
  
  @scala.inline
  implicit class IWorkerContextOps[Self <: IWorkerContext[_], H] (val x: Self with IWorkerContext[H]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetMirrorModels(value: () => js.Array[IMirrorModel]): Self = this.set("getMirrorModels", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHost(value: H): Self = this.set("host", value.asInstanceOf[js.Any])
  }
}
