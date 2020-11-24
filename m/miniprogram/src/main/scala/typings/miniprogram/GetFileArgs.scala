package typings.miniprogram

import typings.miniprogram.anon.Digest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileArgs extends AsyncCallback[Digest] {
  
  var apFilePath: String = js.native
  
  /**
    * Digest algorithm, supporting md5 and sha1, md5 by default.
    */
  var digestAlgorithm: js.UndefOr[String] = js.native
}
object GetFileArgs {
  
  @scala.inline
  def apply(apFilePath: String): GetFileArgs = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileArgs]
  }
  
  @scala.inline
  implicit class GetFileArgsOps[Self <: GetFileArgs] (val x: Self) extends AnyVal {
    
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
    def setApFilePath(value: String): Self = this.set("apFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestAlgorithm(value: String): Self = this.set("digestAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigestAlgorithm: Self = this.set("digestAlgorithm", js.undefined)
  }
}
