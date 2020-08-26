package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trending extends Entity {
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Used for navigating to the trending document.
  var resource: js.UndefOr[Entity] = js.native
  // Reference properties of the trending document, such as the url and type of the document.
  var resourceReference: js.UndefOr[ResourceReference] = js.native
  // Properties that you can use to visualize the document in your experience.
  var resourceVisualization: js.UndefOr[ResourceVisualization] = js.native
  /**
    * Value indicating how much the document is currently trending. The larger the number, the more the document is currently
    * trending around the user (the more relevant it is). Returned documents are sorted by this value.
    */
  var weight: js.UndefOr[Double] = js.native
}

object Trending {
  @scala.inline
  def apply(): Trending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trending]
  }
  @scala.inline
  implicit class TrendingOps[Self <: Trending] (val x: Self) extends AnyVal {
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
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setResource(value: Entity): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setResourceReference(value: ResourceReference): Self = this.set("resourceReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceReference: Self = this.set("resourceReference", js.undefined)
    @scala.inline
    def setResourceVisualization(value: ResourceVisualization): Self = this.set("resourceVisualization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceVisualization: Self = this.set("resourceVisualization", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

