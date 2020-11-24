package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyToPath extends js.Object {
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported The key to project. */
  var key: js.UndefOr[String] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Mode bits to use on this file, must be a value between 0000 and 0777. If not specified, the volume
    * defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var mode: js.UndefOr[Double] = js.native
  
  /**
    * Cloud Run fully managed: not supported Cloud Run for Anthos: supported The relative path of the file to map the key to. May not be an absolute path. May not contain the path element
    * '..'. May not start with the string '..'.
    */
  var path: js.UndefOr[String] = js.native
}
object KeyToPath {
  
  @scala.inline
  def apply(): KeyToPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyToPath]
  }
  
  @scala.inline
  implicit class KeyToPathOps[Self <: KeyToPath] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
