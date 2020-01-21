package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.MinecraftTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNamefilter extends js.Object {
  /**
    * List of special names that will cause the events defined in 'on_named' to fire
    */
  var name_filter: js.Array[String]
  /**
    * Event to be called when this entity acquires the name specified in 'name_filter'
    */
  var on_named: MinecraftTrigger | String
}

object AnonNamefilter {
  @scala.inline
  def apply(name_filter: js.Array[String], on_named: MinecraftTrigger | String): AnonNamefilter = {
    val __obj = js.Dynamic.literal(name_filter = name_filter.asInstanceOf[js.Any], on_named = on_named.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNamefilter]
  }
}

