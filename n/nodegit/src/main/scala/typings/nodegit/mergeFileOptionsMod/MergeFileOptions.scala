package typings.nodegit.mergeFileOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeFileOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var ancestorLabel: js.UndefOr[String] = js.native
  
  var favor: js.UndefOr[Double] = js.native
  
  var flags: js.UndefOr[Double] = js.native
  
  var ourLabel: js.UndefOr[String] = js.native
  
  var theirLabel: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object MergeFileOptions {
  
  @scala.inline
  def apply(): MergeFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeFileOptions]
  }
  
  @scala.inline
  implicit class MergeFileOptionsOps[Self <: MergeFileOptions] (val x: Self) extends AnyVal {
    
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
    def setAncestorLabel(value: String): Self = this.set("ancestorLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAncestorLabel: Self = this.set("ancestorLabel", js.undefined)
    
    @scala.inline
    def setFavor(value: Double): Self = this.set("favor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavor: Self = this.set("favor", js.undefined)
    
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setOurLabel(value: String): Self = this.set("ourLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOurLabel: Self = this.set("ourLabel", js.undefined)
    
    @scala.inline
    def setTheirLabel(value: String): Self = this.set("theirLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheirLabel: Self = this.set("theirLabel", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
