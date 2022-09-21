package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesServer.anon.Namefilter
import typings.minecraftScriptingTypesShared.MinecraftTrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Nameable component describes an entity's ability to be named using a nametag and whether the name shows up or not once applied. Additionally, scripting allows setting the name of the entity directly with the property 'name'.
  */
trait INameableComponent extends StObject {
  
  /**
    * If true, this entity can be renamed with name tags
    * @default true
    */
  var allowNameTagRenaming: Boolean
  
  /**
    * If true, the name will always be shown
    * @default false
    */
  var alwaysShow: Boolean
  
  /**
    * Trigger to run when the entity gets named
    */
  var default_trigger: MinecraftTrigger | String
  
  /**
    * The current name of the entity, empty if the entity hasn't been named yet, making this non-empty will apply the name to the entity
    */
  var name: String
  
  /**
    * Describes the special names for this entity and the events to call when the entity acquires those names
    */
  var name_actions: js.Array[Namefilter]
}
object INameableComponent {
  
  inline def apply(
    allowNameTagRenaming: Boolean,
    alwaysShow: Boolean,
    default_trigger: MinecraftTrigger | String,
    name: String,
    name_actions: js.Array[Namefilter]
  ): INameableComponent = {
    val __obj = js.Dynamic.literal(allowNameTagRenaming = allowNameTagRenaming.asInstanceOf[js.Any], alwaysShow = alwaysShow.asInstanceOf[js.Any], default_trigger = default_trigger.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_actions = name_actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[INameableComponent]
  }
  
  extension [Self <: INameableComponent](x: Self) {
    
    inline def setAllowNameTagRenaming(value: Boolean): Self = StObject.set(x, "allowNameTagRenaming", value.asInstanceOf[js.Any])
    
    inline def setAlwaysShow(value: Boolean): Self = StObject.set(x, "alwaysShow", value.asInstanceOf[js.Any])
    
    inline def setDefault_trigger(value: MinecraftTrigger | String): Self = StObject.set(x, "default_trigger", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setName_actions(value: js.Array[Namefilter]): Self = StObject.set(x, "name_actions", value.asInstanceOf[js.Any])
    
    inline def setName_actionsVarargs(value: Namefilter*): Self = StObject.set(x, "name_actions", js.Array(value*))
  }
}
