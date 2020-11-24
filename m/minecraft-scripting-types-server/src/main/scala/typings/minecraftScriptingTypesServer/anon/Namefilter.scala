package typings.minecraftScriptingTypesServer.anon

import typings.minecraftScriptingTypesShared.MinecraftTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Namefilter extends js.Object {
  
  /**
    * List of special names that will cause the events defined in 'on_named' to fire
    */
  var name_filter: js.Array[String] = js.native
  
  /**
    * Event to be called when this entity acquires the name specified in 'name_filter'
    */
  var on_named: MinecraftTrigger | String = js.native
}
object Namefilter {
  
  @scala.inline
  def apply(name_filter: js.Array[String], on_named: MinecraftTrigger | String): Namefilter = {
    val __obj = js.Dynamic.literal(name_filter = name_filter.asInstanceOf[js.Any], on_named = on_named.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namefilter]
  }
  
  @scala.inline
  implicit class NamefilterOps[Self <: Namefilter] (val x: Self) extends AnyVal {
    
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
    def setName_filterVarargs(value: String*): Self = this.set("name_filter", js.Array(value :_*))
    
    @scala.inline
    def setName_filter(value: js.Array[String]): Self = this.set("name_filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_named(value: MinecraftTrigger | String): Self = this.set("on_named", value.asInstanceOf[js.Any])
  }
}
