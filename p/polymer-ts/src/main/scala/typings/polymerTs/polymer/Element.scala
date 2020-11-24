package typings.polymerTs.polymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends js.Object {
  
  var attached: js.UndefOr[js.Function0[Unit]] = js.native
  
  var attributeChanged: js.UndefOr[
    js.Function3[/* attrName */ String, /* oldVal */ js.Any, /* newVal */ js.Any, Unit]
  ] = js.native
  
  var behaviors: js.UndefOr[js.Array[js.Object]] = js.native
  
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  
  var detached: js.UndefOr[js.Function0[Unit]] = js.native
  
  var factoryImpl: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var listeners: js.UndefOr[js.Object] = js.native
  
  var observers: js.UndefOr[js.Array[String]] = js.native
  
  var properties: js.UndefOr[js.Object] = js.native
  
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
}
object Element {
  
  @scala.inline
  def apply(): Element = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    
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
    def setAttached(value: () => Unit): Self = this.set("attached", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    
    @scala.inline
    def setAttributeChanged(value: (/* attrName */ String, /* oldVal */ js.Any, /* newVal */ js.Any) => Unit): Self = this.set("attributeChanged", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAttributeChanged: Self = this.set("attributeChanged", js.undefined)
    
    @scala.inline
    def setBehaviorsVarargs(value: js.Object*): Self = this.set("behaviors", js.Array(value :_*))
    
    @scala.inline
    def setBehaviors(value: js.Array[js.Object]): Self = this.set("behaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehaviors: Self = this.set("behaviors", js.undefined)
    
    @scala.inline
    def setCreated(value: () => Unit): Self = this.set("created", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDetached(value: () => Unit): Self = this.set("detached", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    
    @scala.inline
    def setFactoryImpl(value: /* repeated */ js.Any => Unit): Self = this.set("factoryImpl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFactoryImpl: Self = this.set("factoryImpl", js.undefined)
    
    @scala.inline
    def setListeners(value: js.Object): Self = this.set("listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListeners: Self = this.set("listeners", js.undefined)
    
    @scala.inline
    def setObserversVarargs(value: String*): Self = this.set("observers", js.Array(value :_*))
    
    @scala.inline
    def setObservers(value: js.Array[String]): Self = this.set("observers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservers: Self = this.set("observers", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Object): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
  }
}
