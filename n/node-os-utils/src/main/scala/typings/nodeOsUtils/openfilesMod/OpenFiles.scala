package typings.nodeOsUtils.openfilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenFiles extends js.Object {
  
  def openFd(): js.Promise[Double] = js.native
}
object OpenFiles {
  
  @scala.inline
  def apply(openFd: () => js.Promise[Double]): OpenFiles = {
    val __obj = js.Dynamic.literal(openFd = js.Any.fromFunction0(openFd))
    __obj.asInstanceOf[OpenFiles]
  }
  
  @scala.inline
  implicit class OpenFilesOps[Self <: OpenFiles] (val x: Self) extends AnyVal {
    
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
    def setOpenFd(value: () => js.Promise[Double]): Self = this.set("openFd", js.Any.fromFunction0(value))
  }
}
