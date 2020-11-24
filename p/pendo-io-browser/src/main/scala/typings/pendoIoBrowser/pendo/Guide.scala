package typings.pendoIoBrowser.pendo

import typings.pendoIoBrowser.anon.Badge
import typings.pendoIoBrowser.anon.Filters
import typings.pendoIoBrowser.pendoIoBrowserStrings.api
import typings.pendoIoBrowser.pendoIoBrowserStrings.automatic
import typings.pendoIoBrowser.pendoIoBrowserStrings.badge
import typings.pendoIoBrowser.pendoIoBrowserStrings.disabled
import typings.pendoIoBrowser.pendoIoBrowserStrings.dom
import typings.pendoIoBrowser.pendoIoBrowserStrings.draft
import typings.pendoIoBrowser.pendoIoBrowserStrings.launcher
import typings.pendoIoBrowser.pendoIoBrowserStrings.published
import typings.pendoIoBrowser.pendoIoBrowserStrings.staged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Guide extends js.Object {
  
  var attributes: Badge = js.native
  
  var audience: js.Array[_] = js.native
  
   // TODO
  var audienceUiHint: Filters = js.native
  
  var createdAt: Double = js.native
  
  var createdByUser: User = js.native
  
  var id: String = js.native
  
  var isMultiStep: Boolean = js.native
  
  var kind: String = js.native
  
  var lastUpdatedAt: Double = js.native
  
  var lastUpdatedByUser: User = js.native
  
  var launchMethod: api | automatic | badge | dom | launcher = js.native
  
  var name: String = js.native
  
  var publishedAt: Double = js.native
  
   // TODO
  var resetAt: Double = js.native
  
  var rootVersionId: String = js.native
  
  var stableVersionId: String = js.native
  
  var state: published | staged | draft | disabled = js.native
  
  var steps: js.Array[GuideStep] = js.native
}
object Guide {
  
  @scala.inline
  def apply(
    attributes: Badge,
    audience: js.Array[_],
    audienceUiHint: Filters,
    createdAt: Double,
    createdByUser: User,
    id: String,
    isMultiStep: Boolean,
    kind: String,
    lastUpdatedAt: Double,
    lastUpdatedByUser: User,
    launchMethod: api | automatic | badge | dom | launcher,
    name: String,
    publishedAt: Double,
    resetAt: Double,
    rootVersionId: String,
    stableVersionId: String,
    state: published | staged | draft | disabled,
    steps: js.Array[GuideStep]
  ): Guide = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], audience = audience.asInstanceOf[js.Any], audienceUiHint = audienceUiHint.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdByUser = createdByUser.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isMultiStep = isMultiStep.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], lastUpdatedByUser = lastUpdatedByUser.asInstanceOf[js.Any], launchMethod = launchMethod.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], resetAt = resetAt.asInstanceOf[js.Any], rootVersionId = rootVersionId.asInstanceOf[js.Any], stableVersionId = stableVersionId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guide]
  }
  
  @scala.inline
  implicit class GuideOps[Self <: Guide] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: Badge): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceVarargs(value: js.Any*): Self = this.set("audience", js.Array(value :_*))
    
    @scala.inline
    def setAudience(value: js.Array[_]): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUiHint(value: Filters): Self = this.set("audienceUiHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: Double): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUser(value: User): Self = this.set("createdByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMultiStep(value: Boolean): Self = this.set("isMultiStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAt(value: Double): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedByUser(value: User): Self = this.set("lastUpdatedByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchMethod(value: api | automatic | badge | dom | launcher): Self = this.set("launchMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAt(value: Double): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetAt(value: Double): Self = this.set("resetAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootVersionId(value: String): Self = this.set("rootVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStableVersionId(value: String): Self = this.set("stableVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: published | staged | draft | disabled): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: GuideStep*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[GuideStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
  }
}
