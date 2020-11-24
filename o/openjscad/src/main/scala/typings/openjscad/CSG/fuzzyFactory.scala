package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait fuzzyFactory extends js.Object {
  
  def lookupOrCreate(els: js.Any, creatorCallback: js.Any): js.Any = js.native
  
  var lookuptable: js.Any = js.native
  
  var multiplier: Double = js.native
}
object fuzzyFactory {
  
  @scala.inline
  def apply(lookupOrCreate: (js.Any, js.Any) => js.Any, lookuptable: js.Any, multiplier: Double): fuzzyFactory = {
    val __obj = js.Dynamic.literal(lookupOrCreate = js.Any.fromFunction2(lookupOrCreate), lookuptable = lookuptable.asInstanceOf[js.Any], multiplier = multiplier.asInstanceOf[js.Any])
    __obj.asInstanceOf[fuzzyFactory]
  }
  
  @scala.inline
  implicit class fuzzyFactoryOps[Self <: fuzzyFactory] (val x: Self) extends AnyVal {
    
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
    def setLookupOrCreate(value: (js.Any, js.Any) => js.Any): Self = this.set("lookupOrCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLookuptable(value: js.Any): Self = this.set("lookuptable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplier(value: Double): Self = this.set("multiplier", value.asInstanceOf[js.Any])
  }
}
