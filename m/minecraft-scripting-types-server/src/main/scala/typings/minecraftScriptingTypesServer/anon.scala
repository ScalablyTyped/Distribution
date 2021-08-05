package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.MinecraftFilter
import typings.minecraftScriptingTypesShared.MinecraftTrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accepteditems extends StObject {
    
    /**
      * The list of items that can go in this slot
      */
    var accepted_items: js.Array[String]
    
    /**
      * Text to be displayed when the entity can be equipped with this item when playing with Touch-screen controls
      */
    var interact_text: String
    
    /**
      * Event to trigger when this entity is equipped with this item
      */
    var on_equip: MinecraftTrigger | String
    
    /**
      * Event to trigger when this item is removed from this entity
      */
    var on_unequip: MinecraftTrigger | String
    
    /**
      * The slot number of this slot
      */
    var slot: Double
  }
  object Accepteditems {
    
    inline def apply(
      accepted_items: js.Array[String],
      interact_text: String,
      on_equip: MinecraftTrigger | String,
      on_unequip: MinecraftTrigger | String,
      slot: Double
    ): Accepteditems = {
      val __obj = js.Dynamic.literal(accepted_items = accepted_items.asInstanceOf[js.Any], interact_text = interact_text.asInstanceOf[js.Any], on_equip = on_equip.asInstanceOf[js.Any], on_unequip = on_unequip.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accepteditems]
    }
    
    extension [Self <: Accepteditems](x: Self) {
      
      inline def setAccepted_items(value: js.Array[String]): Self = StObject.set(x, "accepted_items", value.asInstanceOf[js.Any])
      
      inline def setAccepted_itemsVarargs(value: String*): Self = StObject.set(x, "accepted_items", js.Array(value :_*))
      
      inline def setInteract_text(value: String): Self = StObject.set(x, "interact_text", value.asInstanceOf[js.Any])
      
      inline def setOn_equip(value: MinecraftTrigger | String): Self = StObject.set(x, "on_equip", value.asInstanceOf[js.Any])
      
      inline def setOn_unequip(value: MinecraftTrigger | String): Self = StObject.set(x, "on_unequip", value.asInstanceOf[js.Any])
      
      inline def setSlot(value: Double): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    }
  }
  
  trait Amplifier extends StObject {
    
    /**
      * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
      */
    var amplifier: Double
    
    /**
      * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
      */
    var chance: Double
    
    /**
      * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
      */
    var duration: Double
    
    /**
      * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
      */
    var name: String
  }
  object Amplifier {
    
    inline def apply(amplifier: Double, chance: Double, duration: Double, name: String): Amplifier = {
      val __obj = js.Dynamic.literal(amplifier = amplifier.asInstanceOf[js.Any], chance = chance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Amplifier]
    }
    
    extension [Self <: Amplifier](x: Self) {
      
      inline def setAmplifier(value: Double): Self = StObject.set(x, "amplifier", value.asInstanceOf[js.Any])
      
      inline def setChance(value: Double): Self = StObject.set(x, "chance", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dropchance extends StObject {
    
    /**
      * The chance that the item in this slot will be dropped
      */
    var drop_chance: Double
    
    /**
      * The slot number
      */
    var slot: Double
  }
  object Dropchance {
    
    inline def apply(drop_chance: Double, slot: Double): Dropchance = {
      val __obj = js.Dynamic.literal(drop_chance = drop_chance.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dropchance]
    }
    
    extension [Self <: Dropchance](x: Self) {
      
      inline def setDrop_chance(value: Double): Self = StObject.set(x, "drop_chance", value.asInstanceOf[js.Any])
      
      inline def setSlot(value: Double): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    }
  }
  
  trait Effects extends StObject {
    
    /**
      * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
      */
    var effects: js.Array[Amplifier]
    
    /**
      * The filter group that defines the conditions for using this item to heal the entity
      */
    var filters: js.UndefOr[MinecraftFilter] = js.undefined
    
    /**
      * The amount of health this entity gains when fed this item
      * @default 1
      */
    var heal_amount: Double
    
    /**
      * Item identifier that can be used to heal this entity
      */
    var item: String
  }
  object Effects {
    
    inline def apply(effects: js.Array[Amplifier], heal_amount: Double, item: String): Effects = {
      val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], heal_amount = heal_amount.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[Effects]
    }
    
    extension [Self <: Effects](x: Self) {
      
      inline def setEffects(value: js.Array[Amplifier]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setEffectsVarargs(value: Amplifier*): Self = StObject.set(x, "effects", js.Array(value :_*))
      
      inline def setFilters(value: MinecraftFilter): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setHeal_amount(value: Double): Self = StObject.set(x, "heal_amount", value.asInstanceOf[js.Any])
      
      inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var message: String
    
    var statusCode: Double
  }
  object Message {
    
    inline def apply(message: String, statusCode: Double): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Namefilter extends StObject {
    
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
    
    inline def apply(name_filter: js.Array[String], on_named: MinecraftTrigger | String): Namefilter = {
      val __obj = js.Dynamic.literal(name_filter = name_filter.asInstanceOf[js.Any], on_named = on_named.asInstanceOf[js.Any])
      __obj.asInstanceOf[Namefilter]
    }
    
    extension [Self <: Namefilter](x: Self) {
      
      inline def setName_filter(value: js.Array[String]): Self = StObject.set(x, "name_filter", value.asInstanceOf[js.Any])
      
      inline def setName_filterVarargs(value: String*): Self = StObject.set(x, "name_filter", js.Array(value :_*))
      
      inline def setOn_named(value: MinecraftTrigger | String): Self = StObject.set(x, "on_named", value.asInstanceOf[js.Any])
    }
  }
  
  trait Particleoffsettowardsinteractor extends StObject {
    
    /**
      * Whether or not the particle will appear closer to who performed the interaction
      * @default false
      */
    var particle_offset_towards_interactor: Boolean
    
    /**
      * The type of particle that will be spawned
      */
    var particle_type: String
    
    /**
      * Will offset the particle this amount in the y direction
      * @default 0.0
      */
    var particle_y_offset: Double
  }
  object Particleoffsettowardsinteractor {
    
    inline def apply(particle_offset_towards_interactor: Boolean, particle_type: String, particle_y_offset: Double): Particleoffsettowardsinteractor = {
      val __obj = js.Dynamic.literal(particle_offset_towards_interactor = particle_offset_towards_interactor.asInstanceOf[js.Any], particle_type = particle_type.asInstanceOf[js.Any], particle_y_offset = particle_y_offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Particleoffsettowardsinteractor]
    }
    
    extension [Self <: Particleoffsettowardsinteractor](x: Self) {
      
      inline def setParticle_offset_towards_interactor(value: Boolean): Self = StObject.set(x, "particle_offset_towards_interactor", value.asInstanceOf[js.Any])
      
      inline def setParticle_type(value: String): Self = StObject.set(x, "particle_type", value.asInstanceOf[js.Any])
      
      inline def setParticle_y_offset(value: Double): Self = StObject.set(x, "particle_y_offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rangemax extends StObject {
    
    /**
      * The maximum amount of damage the entity will deal
      * @default 0.0
      */
    var range_max: Double
    
    /**
      * The minimum amount of damage the entity will deal
      * @default 0.0
      */
    var range_min: Double
  }
  object Rangemax {
    
    inline def apply(range_max: Double, range_min: Double): Rangemax = {
      val __obj = js.Dynamic.literal(range_max = range_max.asInstanceOf[js.Any], range_min = range_min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rangemax]
    }
    
    extension [Self <: Rangemax](x: Self) {
      
      inline def setRange_max(value: Double): Self = StObject.set(x, "range_max", value.asInstanceOf[js.Any])
      
      inline def setRange_min(value: Double): Self = StObject.set(x, "range_min", value.asInstanceOf[js.Any])
    }
  }
  
  trait Table extends StObject {
    
    /**
      * File path, relative to the behavior pack's path, to the loot table file
      */
    var table: String
  }
  object Table {
    
    inline def apply(table: String): Table = {
      val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Table]
    }
    
    extension [Self <: Table](x: Self) {
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
}
