package typings.mobxStateTree.snapshotProcessorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISnapshotProcessors[C, CustomC, S, CustomS] extends js.Object {
  
  /**
    * Function that transforms an output snapshot.
    * @param snapshot
    */
  var postProcessor: js.UndefOr[js.Function1[/* snapshot */ S, CustomS]] = js.native
  
  /**
    * Function that transforms an input snapshot.
    */
  var preProcessor: js.UndefOr[js.Function1[/* snapshot */ CustomC, C]] = js.native
}
object ISnapshotProcessors {
  
  @scala.inline
  def apply[C, CustomC, S, CustomS](): ISnapshotProcessors[C, CustomC, S, CustomS] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISnapshotProcessors[C, CustomC, S, CustomS]]
  }
  
  @scala.inline
  implicit class ISnapshotProcessorsOps[Self <: ISnapshotProcessors[_, _, _, _], C, CustomC, S, CustomS] (val x: Self with (ISnapshotProcessors[C, CustomC, S, CustomS])) extends AnyVal {
    
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
    def setPostProcessor(value: /* snapshot */ S => CustomS): Self = this.set("postProcessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePostProcessor: Self = this.set("postProcessor", js.undefined)
    
    @scala.inline
    def setPreProcessor(value: /* snapshot */ CustomC => C): Self = this.set("preProcessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreProcessor: Self = this.set("preProcessor", js.undefined)
  }
}
