package typings.oJs.odataQueryMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OdataQuery
  extends /* key */ StringDictionary[js.Any] {
  
  @JSName("$compute")
  var $compute: js.UndefOr[String] = js.native
  
  @JSName("$count")
  var $count: js.UndefOr[Boolean] = js.native
  
  @JSName("$expand")
  var $expand: js.UndefOr[String] = js.native
  
  @JSName("$filter")
  var $filter: js.UndefOr[String] = js.native
  
  @JSName("$format")
  var $format: js.UndefOr[String] = js.native
  
  @JSName("$index")
  var $index: js.UndefOr[Double] = js.native
  
  @JSName("$orderby")
  var $orderby: js.UndefOr[String] = js.native
  
  @JSName("$search")
  var $search: js.UndefOr[String] = js.native
  
  @JSName("$select")
  var $select: js.UndefOr[String] = js.native
  
  @JSName("$skip")
  var $skip: js.UndefOr[Double] = js.native
  
  @JSName("$top")
  var $top: js.UndefOr[Double] = js.native
}
object OdataQuery {
  
  @scala.inline
  def apply(): OdataQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OdataQuery]
  }
  
  @scala.inline
  implicit class OdataQueryOps[Self <: OdataQuery] (val x: Self) extends AnyVal {
    
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
    def set$compute(value: String): Self = this.set("$compute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$compute: Self = this.set("$compute", js.undefined)
    
    @scala.inline
    def set$count(value: Boolean): Self = this.set("$count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$count: Self = this.set("$count", js.undefined)
    
    @scala.inline
    def set$expand(value: String): Self = this.set("$expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$expand: Self = this.set("$expand", js.undefined)
    
    @scala.inline
    def set$filter(value: String): Self = this.set("$filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$filter: Self = this.set("$filter", js.undefined)
    
    @scala.inline
    def set$format(value: String): Self = this.set("$format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$format: Self = this.set("$format", js.undefined)
    
    @scala.inline
    def set$index(value: Double): Self = this.set("$index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$index: Self = this.set("$index", js.undefined)
    
    @scala.inline
    def set$orderby(value: String): Self = this.set("$orderby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$orderby: Self = this.set("$orderby", js.undefined)
    
    @scala.inline
    def set$search(value: String): Self = this.set("$search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$search: Self = this.set("$search", js.undefined)
    
    @scala.inline
    def set$select(value: String): Self = this.set("$select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$select: Self = this.set("$select", js.undefined)
    
    @scala.inline
    def set$skip(value: Double): Self = this.set("$skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$skip: Self = this.set("$skip", js.undefined)
    
    @scala.inline
    def set$top(value: Double): Self = this.set("$top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$top: Self = this.set("$top", js.undefined)
  }
}
