package typings.onionoo.mod.Onionoo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response[TRelay, TBridge] extends js.Object {
  
  var bridges: js.Array[TBridge] = js.native
  
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the last known bridge network status was published.
    * Indicates how recent the bridge objects in this document are.
    */
  var bridges_published: String = js.native
  
  /**
    * Number of skipped bridges as requested by a positive `offset` parameter value. Omitted if zero.
    */
  var bridges_skipped: js.UndefOr[Double] = js.native
  
  /**
    * Number of truncated bridges as requested by a positive `limit` parameter value. Omitted if zero.
    */
  var bridges_truncated: js.UndefOr[Double] = js.native
  
  /**
    * Git revision of the Onionoo instance's software used to write this response, which will be omitted if unknown.
    */
  var build_revision: js.UndefOr[String] = js.native
  
  /**
    * UTC date (YYYY-MM-DD) when the next major protocol version is scheduled to be deployed. Omitted if no major
    * protocol changes are planned.
    */
  var next_major_version_scheduled: js.UndefOr[String] = js.native
  
  var relays: js.Array[TRelay] = js.native
  
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the last known relay network status consensus started being valid.
    * Indicates how recent the relay objects in this document are.
    */
  var relays_published: String = js.native
  
  /**
    * Number of skipped relays as requested by a positive "offset" parameter value. Omitted if zero.
    */
  var relays_skipped: js.UndefOr[Double] = js.native
  
  /**
    * Number of truncated relays as requested by a positive "limit" parameter value. Omitted if zero.
    */
  var relays_truncated: js.UndefOr[Double] = js.native
  
  /**
    * Onionoo protocol version string.
    */
  var version: String = js.native
}
object Response {
  
  @scala.inline
  def apply[TRelay, TBridge](
    bridges: js.Array[TBridge],
    bridges_published: String,
    relays: js.Array[TRelay],
    relays_published: String,
    version: String
  ): Response[TRelay, TBridge] = {
    val __obj = js.Dynamic.literal(bridges = bridges.asInstanceOf[js.Any], bridges_published = bridges_published.asInstanceOf[js.Any], relays = relays.asInstanceOf[js.Any], relays_published = relays_published.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[TRelay, TBridge]]
  }
  
  @scala.inline
  implicit class ResponseOps[Self <: Response[_, _], TRelay, TBridge] (val x: Self with (Response[TRelay, TBridge])) extends AnyVal {
    
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
    def setBridgesVarargs(value: TBridge*): Self = this.set("bridges", js.Array(value :_*))
    
    @scala.inline
    def setBridges(value: js.Array[TBridge]): Self = this.set("bridges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBridges_published(value: String): Self = this.set("bridges_published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelaysVarargs(value: TRelay*): Self = this.set("relays", js.Array(value :_*))
    
    @scala.inline
    def setRelays(value: js.Array[TRelay]): Self = this.set("relays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelays_published(value: String): Self = this.set("relays_published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBridges_skipped(value: Double): Self = this.set("bridges_skipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBridges_skipped: Self = this.set("bridges_skipped", js.undefined)
    
    @scala.inline
    def setBridges_truncated(value: Double): Self = this.set("bridges_truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBridges_truncated: Self = this.set("bridges_truncated", js.undefined)
    
    @scala.inline
    def setBuild_revision(value: String): Self = this.set("build_revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuild_revision: Self = this.set("build_revision", js.undefined)
    
    @scala.inline
    def setNext_major_version_scheduled(value: String): Self = this.set("next_major_version_scheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext_major_version_scheduled: Self = this.set("next_major_version_scheduled", js.undefined)
    
    @scala.inline
    def setRelays_skipped(value: Double): Self = this.set("relays_skipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelays_skipped: Self = this.set("relays_skipped", js.undefined)
    
    @scala.inline
    def setRelays_truncated(value: Double): Self = this.set("relays_truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelays_truncated: Self = this.set("relays_truncated", js.undefined)
  }
}
