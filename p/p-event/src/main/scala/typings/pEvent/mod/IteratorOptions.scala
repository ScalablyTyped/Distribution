package typings.pEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IteratorOptions[EmittedType /* <: js.Array[_] */] extends Options[EmittedType] {
  
  /**
  		Maximum number of events for the iterator before it ends. When the limit is reached, the iterator will be marked as `done`. This option is useful to paginate events, for example, fetching 10 events per page.
  		@default Infinity
  		*/
  var limit: js.UndefOr[Double] = js.native
  
  /**
  		Events that will end the iterator.
  		@default []
  		*/
  var resolutionEvents: js.UndefOr[js.Array[String | js.Symbol]] = js.native
}
object IteratorOptions {
  
  @scala.inline
  def apply[EmittedType /* <: js.Array[_] */](): IteratorOptions[EmittedType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IteratorOptions[EmittedType]]
  }
  
  @scala.inline
  implicit class IteratorOptionsOps[Self <: IteratorOptions[_], EmittedType /* <: js.Array[_] */] (val x: Self with IteratorOptions[EmittedType]) extends AnyVal {
    
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setResolutionEventsVarargs(value: (String | js.Symbol)*): Self = this.set("resolutionEvents", js.Array(value :_*))
    
    @scala.inline
    def setResolutionEvents(value: js.Array[String | js.Symbol]): Self = this.set("resolutionEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolutionEvents: Self = this.set("resolutionEvents", js.undefined)
  }
}
