package typings.memFsEditor.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyOptions extends WithGlobOptions {
  
  var ignoreNoMatch: js.UndefOr[Boolean] = js.native
  
  var process: js.UndefOr[ProcessingFunction] = js.native
  
  var processDestinationPath: js.UndefOr[js.Function1[/* path */ String, String]] = js.native
}
object CopyOptions {
  
  @scala.inline
  def apply(): CopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptions]
  }
  
  @scala.inline
  implicit class CopyOptionsOps[Self <: CopyOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnoreNoMatch(value: Boolean): Self = this.set("ignoreNoMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreNoMatch: Self = this.set("ignoreNoMatch", js.undefined)
    
    @scala.inline
    def setProcess(value: (/* contents */ Buffer, /* path */ String) => WriteContents): Self = this.set("process", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
    
    @scala.inline
    def setProcessDestinationPath(value: /* path */ String => String): Self = this.set("processDestinationPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProcessDestinationPath: Self = this.set("processDestinationPath", js.undefined)
  }
}
