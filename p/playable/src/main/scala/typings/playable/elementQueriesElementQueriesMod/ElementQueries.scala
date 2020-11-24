package typings.playable.elementQueriesElementQueriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementQueries extends js.Object {
  
  var _element: js.Any = js.native
  
  var _getQueryAttributeValue: js.Any = js.native
  
  var _queries: js.Any = js.native
  
  var _queryPrefix: js.Any = js.native
  
  var _setQueryAttribute: js.Any = js.native
  
  def destroy(): Unit = js.native
  
  def getQueries(): Unit = js.native
  
  def setWidth(width: Double): Unit = js.native
}
object ElementQueries {
  
  @scala.inline
  def apply(
    _element: js.Any,
    _getQueryAttributeValue: js.Any,
    _queries: js.Any,
    _queryPrefix: js.Any,
    _setQueryAttribute: js.Any,
    destroy: () => Unit,
    getQueries: () => Unit,
    setWidth: Double => Unit
  ): ElementQueries = {
    val __obj = js.Dynamic.literal(_element = _element.asInstanceOf[js.Any], _getQueryAttributeValue = _getQueryAttributeValue.asInstanceOf[js.Any], _queries = _queries.asInstanceOf[js.Any], _queryPrefix = _queryPrefix.asInstanceOf[js.Any], _setQueryAttribute = _setQueryAttribute.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getQueries = js.Any.fromFunction0(getQueries), setWidth = js.Any.fromFunction1(setWidth))
    __obj.asInstanceOf[ElementQueries]
  }
  
  @scala.inline
  implicit class ElementQueriesOps[Self <: ElementQueries] (val x: Self) extends AnyVal {
    
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
    def set_element(value: js.Any): Self = this.set("_element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_getQueryAttributeValue(value: js.Any): Self = this.set("_getQueryAttributeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_queries(value: js.Any): Self = this.set("_queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_queryPrefix(value: js.Any): Self = this.set("_queryPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_setQueryAttribute(value: js.Any): Self = this.set("_setQueryAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetQueries(value: () => Unit): Self = this.set("getQueries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetWidth(value: Double => Unit): Self = this.set("setWidth", js.Any.fromFunction1(value))
  }
}
