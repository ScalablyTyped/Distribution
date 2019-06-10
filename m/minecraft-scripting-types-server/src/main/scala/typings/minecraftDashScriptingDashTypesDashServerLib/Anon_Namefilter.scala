package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Namefilter extends js.Object {
  /**
    * List of special names that will cause the events defined in 'on_named' to fire
    */
  var name_filter: js.Array[java.lang.String]
  /**
    * Event to be called when this entity acquires the name specified in 'name_filter'
    */
  var on_named: minecraftDashScriptingDashTypesDashSharedLib.MinecraftTrigger | java.lang.String
}

object Anon_Namefilter {
  @scala.inline
  def apply(
    name_filter: js.Array[java.lang.String],
    on_named: minecraftDashScriptingDashTypesDashSharedLib.MinecraftTrigger | java.lang.String
  ): Anon_Namefilter = {
    val __obj = js.Dynamic.literal(name_filter = name_filter, on_named = on_named.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Namefilter]
  }
}

