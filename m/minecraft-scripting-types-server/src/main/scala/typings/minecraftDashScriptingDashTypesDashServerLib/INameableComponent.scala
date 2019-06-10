package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Nameable component describes an entity's ability to be named using a nametag and whether the name shows up or not once applied. Additionally, scripting allows setting the name of the entity directly with the property 'name'.
  */
trait INameableComponent extends js.Object {
  /**
    * If true, this entity can be renamed with name tags
    * @default true
    */
  var allowNameTagRenaming: scala.Boolean
  /**
    * If true, the name will always be shown
    * @default false
    */
  var alwaysShow: scala.Boolean
  /**
    * Trigger to run when the entity gets named
    */
  var default_trigger: minecraftDashScriptingDashTypesDashSharedLib.MinecraftTrigger | java.lang.String
  /**
    * The current name of the entity, empty if the entity hasn't been named yet, making this non-empty will apply the name to the entity
    */
  var name: java.lang.String
  /**
    * Describes the special names for this entity and the events to call when the entity acquires those names
    */
  var name_actions: js.Array[Anon_Namefilter]
}

object INameableComponent {
  @scala.inline
  def apply(
    allowNameTagRenaming: scala.Boolean,
    alwaysShow: scala.Boolean,
    default_trigger: minecraftDashScriptingDashTypesDashSharedLib.MinecraftTrigger | java.lang.String,
    name: java.lang.String,
    name_actions: js.Array[Anon_Namefilter]
  ): INameableComponent = {
    val __obj = js.Dynamic.literal(allowNameTagRenaming = allowNameTagRenaming, alwaysShow = alwaysShow, default_trigger = default_trigger.asInstanceOf[js.Any], name = name, name_actions = name_actions)
  
    __obj.asInstanceOf[INameableComponent]
  }
}

