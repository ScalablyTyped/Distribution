package typings.pacote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManifestResult extends Manifest_ {
  
  /**
    * A normalized form of the spec passed in as an argument.
    */
  var _from: String = js.native
  
  /**
    * The integrity value for the package artifact.
    */
  var _integrity: String = js.native
  
  /**
    * The tarball url or file path where the package artifact can be found.
    */
  var _resolved: String = js.native
}
object ManifestResult {
  
  @scala.inline
  def apply(
    _from: String,
    _integrity: String,
    _resolved: String,
    dist: PackageDist,
    name: String,
    version: String
  ): ManifestResult = {
    val __obj = js.Dynamic.literal(_from = _from.asInstanceOf[js.Any], _integrity = _integrity.asInstanceOf[js.Any], _resolved = _resolved.asInstanceOf[js.Any], dist = dist.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestResult]
  }
  
  @scala.inline
  implicit class ManifestResultOps[Self <: ManifestResult] (val x: Self) extends AnyVal {
    
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
    def set_from(value: String): Self = this.set("_from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_integrity(value: String): Self = this.set("_integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_resolved(value: String): Self = this.set("_resolved", value.asInstanceOf[js.Any])
  }
}
