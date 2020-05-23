package typings.minecraftScriptingTypesServer.anon

import typings.minecraftScriptingTypesShared.MinecraftTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Namefilter extends js.Object {
  /**
    * List of special names that will cause the events defined in 'on_named' to fire
    */
  var name_filter: js.Array[String]
  /**
    * Event to be called when this entity acquires the name specified in 'name_filter'
    */
  var on_named: MinecraftTrigger | String
}

object Namefilter {
  @scala.inline
  def apply(name_filter: js.Array[String], on_named: MinecraftTrigger | String): Namefilter = {
    val __obj = js.Dynamic.literal(name_filter = name_filter.asInstanceOf[js.Any], on_named = on_named.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namefilter]
  }
}

