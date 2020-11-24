package typings.pollyjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableSortingHarEntries
  extends /* key */ StringDictionary[js.Any] {
  
  var disableSortingHarEntries: js.UndefOr[Boolean] = js.native
  
  var fs: js.UndefOr[RecordingsDir] = js.native
  
  var keepUnusedRequests: js.UndefOr[Boolean] = js.native
  
  var `local-storage`: js.UndefOr[Key] = js.native
  
  var rest: js.UndefOr[ApiNamespace] = js.native
}
object DisableSortingHarEntries {
  
  @scala.inline
  def apply(): DisableSortingHarEntries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableSortingHarEntries]
  }
  
  @scala.inline
  implicit class DisableSortingHarEntriesOps[Self <: DisableSortingHarEntries] (val x: Self) extends AnyVal {
    
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
    def setDisableSortingHarEntries(value: Boolean): Self = this.set("disableSortingHarEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSortingHarEntries: Self = this.set("disableSortingHarEntries", js.undefined)
    
    @scala.inline
    def setFs(value: RecordingsDir): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    
    @scala.inline
    def setKeepUnusedRequests(value: Boolean): Self = this.set("keepUnusedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepUnusedRequests: Self = this.set("keepUnusedRequests", js.undefined)
    
    @scala.inline
    def `setLocal-storage`(value: Key): Self = this.set("local-storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLocal-storage`: Self = this.set("local-storage", js.undefined)
    
    @scala.inline
    def setRest(value: ApiNamespace): Self = this.set("rest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRest: Self = this.set("rest", js.undefined)
  }
}
