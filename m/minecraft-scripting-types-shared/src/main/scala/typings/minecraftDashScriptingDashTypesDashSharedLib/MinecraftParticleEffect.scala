package typings
package minecraftDashScriptingDashTypesDashSharedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MinecraftParticleEffect extends js.Object

@JSGlobal("MinecraftParticleEffect")
@js.native
object MinecraftParticleEffect extends js.Object {
  /**
    * Breaking blocks, sprinting, iron golems walking
    */
  @js.native
  sealed trait BlockBreak
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Breaking armor stands, falling
    */
  @js.native
  sealed trait BlockDust
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Entities in water, guardian laser beams, fishing
    */
  @js.native
  sealed trait Bubble
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Critical hits, bows, evoker fangs
    */
  @js.native
  sealed trait CriticalHit
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * 	An ender dragon's breath and dragon fireballs
    */
  @js.native
  sealed trait DragonBreath
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Dripping lava through blocks
    */
  @js.native
  sealed trait DripLava
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * 	Dripping water through blocks, wet sponges, leaves when raining
    */
  @js.native
  sealed trait DripWater
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * From bookshelves near an enchanting table.
    */
  @js.native
  sealed trait EnchantingTable
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * End rods, shulker bullets.
    */
  @js.native
  sealed trait EndRod
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * After jumping into water while on fire
    */
  @js.native
  sealed trait Evaporation
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Explosions, death of mobs, mobs spawned from a spawner, silverfish infesting blocks.
    */
  @js.native
  sealed trait Explode
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Floating sand, gravel, concrete powder, and anvils.
    */
  @js.native
  sealed trait FallingDust
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Firework rocket trail and explosion (trail is not shown when the "minimal" particle setting is used), when dolphins track shipwrecks and underwater ruins.
    */
  @js.native
  sealed trait FireworksSpark
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * 	Torches, furnaces, magma cubes, spawners.
    */
  @js.native
  sealed trait Flame
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Breeding and taming animals.
    */
  @js.native
  sealed trait Heart
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Explosions, ender dragon death.
    */
  @js.native
  sealed trait HugeExplosion
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * 	Eating, thrown eggs, splash potions, eyes of ender, breaking tools.
    */
  @js.native
  sealed trait IconCrack
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Produced by squids when attacked
    */
  @js.native
  sealed trait Ink
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Explosions, ghast fireballs, wither skulls, ender dragon death, shearing mooshrooms.
    */
  @js.native
  sealed trait LargeExplosion
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Fire, minecart with furnace, blazes, water flowing into lava, lava flowing into water.
    */
  @js.native
  sealed trait LargeSmoke
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Lava
    */
  @js.native
  sealed trait Lava
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Elder Gardians
    * note: wiki has a question mark
    */
  @js.native
  sealed trait MobAppearance
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Burning entities, blazes for example.
    */
  @js.native
  sealed trait MobFlame
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * 	Status effects, lingering potions, tipped arrows, trading, withered armor (linger potion particles decrease when the "minimal" particle setting is used).
    */
  @js.native
  sealed trait MobSpell
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Beacon effects
    */
  @js.native
  sealed trait MobSpellAmbient
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Instant health/damage splash and lingering potions, spectral arrows.
    */
  @js.native
  sealed trait MobSpellInstantaneous
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Activated Conduits.
    */
  @js.native
  sealed trait Nautilus
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Emitted from note blocks and jukeboxes
    */
  @js.native
  sealed trait Note
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * 	Nether portals, endermen, endermites, ender pearls, eyes of ender, ender chests, dragon eggs, teleporting from eating chorus fruits, end gateway portals.
    */
  @js.native
  sealed trait Portal
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Rain
    */
  @js.native
  sealed trait RainSplash
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Redstone ore, powered redstone dust, redstone torches, powered redstone repeaters
    */
  @js.native
  sealed trait RedstoneDust
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Jumping slimes.
    */
  @js.native
  sealed trait Slime
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * 	Torches, primed TNT, droppers, dispensers, end portals, brewing stands, spawners, furnaces, ghast fireballs, wither skulls, taming, withers, lava (when raining), placing an eye of ender in an end portal frame, redstone torches burning out.
    */
  @js.native
  sealed trait Smoke
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Thrown snowballs, creating withers, creating iron golems.
    */
  @js.native
  sealed trait SnowballPoof
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Splash potions, lingering potions, bottles o' enchanting, evokers.
    */
  @js.native
  sealed trait Spell
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * ?
    */
  @js.native
  sealed trait Terrain
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Activated totem of undying.
    */
  @js.native
  sealed trait Totem
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Mycelium blocks.
    */
  @js.native
  sealed trait TownAura
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * ?
    */
  @js.native
  sealed trait TrackingEmitter
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Attacking a villager in a village
    */
  @js.native
  sealed trait VillagerAngry
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * 	Bone mealing a crop, trading with villagers, feeding baby animals, walking or jumping on turtle eggs.
    */
  @js.native
  sealed trait VillagerHappy
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Entities in water, wolves shaking off after swimming, boats.
    */
  @js.native
  sealed trait WaterSplash
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Fishing
    */
  @js.native
  sealed trait WaterWake
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /**
    * Witches.
    */
  @js.native
  sealed trait WitchSpell
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect
  
  /* "minecraft:blockbreak" */ val BlockBreak: BlockBreak with java.lang.String = js.native
  /* "minecraft:blockdust" */ val BlockDust: BlockDust with java.lang.String = js.native
  /* "minecraft:bubble" */ val Bubble: Bubble with java.lang.String = js.native
  /* "minecraft:crit" */ val CriticalHit: CriticalHit with java.lang.String = js.native
  /* "minecraft:dragonbreath" */ val DragonBreath: DragonBreath with java.lang.String = js.native
  /* "minecraft:driplava" */ val DripLava: DripLava with java.lang.String = js.native
  /* "minecraft:dripwater" */ val DripWater: DripWater with java.lang.String = js.native
  /* "minecraft:enchantingtable" */ val EnchantingTable: EnchantingTable with java.lang.String = js.native
  /* "minecraft:endrod" */ val EndRod: EndRod with java.lang.String = js.native
  /* "minecraft:evaporation" */ val Evaporation: Evaporation with java.lang.String = js.native
  /* "minecraft:explode" */ val Explode: Explode with java.lang.String = js.native
  /* "minecraft:fallingdust" */ val FallingDust: FallingDust with java.lang.String = js.native
  /* "minecraft:fireworksspark" */ val FireworksSpark: FireworksSpark with java.lang.String = js.native
  /* "minecraft:flame" */ val Flame: Flame with java.lang.String = js.native
  /* "minecraft:heart" */ val Heart: Heart with java.lang.String = js.native
  /* "minecraft:hugeexplosion" */ val HugeExplosion: HugeExplosion with java.lang.String = js.native
  /* "minecraft:iconcrack" */ val IconCrack: IconCrack with java.lang.String = js.native
  /* "minecraft:ink" */ val Ink: Ink with java.lang.String = js.native
  /* "minecraft:largeexplode" */ val LargeExplosion: LargeExplosion with java.lang.String = js.native
  /* "minecraft:largesmoke" */ val LargeSmoke: LargeSmoke with java.lang.String = js.native
  /* "minecraft:lava" */ val Lava: Lava with java.lang.String = js.native
  /* "minecraft:mobappearance" */ val MobAppearance: MobAppearance with java.lang.String = js.native
  /* "minecraft:mobflame" */ val MobFlame: MobFlame with java.lang.String = js.native
  /* "minecraft:mobspell" */ val MobSpell: MobSpell with java.lang.String = js.native
  /* "minecraft:mobspellambient" */ val MobSpellAmbient: MobSpellAmbient with java.lang.String = js.native
  /* "minecraft:mobspellinstantaneous" */ val MobSpellInstantaneous: MobSpellInstantaneous with java.lang.String = js.native
  /* "minecraft:nautilus" */ val Nautilus: Nautilus with java.lang.String = js.native
  /* "minecraft:note" */ val Note: Note with java.lang.String = js.native
  /* "minecraft:portal" */ val Portal: Portal with java.lang.String = js.native
  /* "minecraft:rainsplash" */ val RainSplash: RainSplash with java.lang.String = js.native
  /* "minecraft:reddust" */ val RedstoneDust: RedstoneDust with java.lang.String = js.native
  /* "minecraft:slime" */ val Slime: Slime with java.lang.String = js.native
  /* "minecraft:smoke" */ val Smoke: Smoke with java.lang.String = js.native
  /* "minecraft:snowballpoof" */ val SnowballPoof: SnowballPoof with java.lang.String = js.native
  /* "minecraft:spell" */ val Spell: Spell with java.lang.String = js.native
  /* "minecraft:terrain" */ val Terrain: Terrain with java.lang.String = js.native
  /* "minecraft:totem" */ val Totem: Totem with java.lang.String = js.native
  /* "minecraft:townaura" */ val TownAura: TownAura with java.lang.String = js.native
  /* "minecraft:trackingemitter" */ val TrackingEmitter: TrackingEmitter with java.lang.String = js.native
  /* "minecraft:villagerangry" */ val VillagerAngry: VillagerAngry with java.lang.String = js.native
  /* "minecraft:villagerhappy" */ val VillagerHappy: VillagerHappy with java.lang.String = js.native
  /* "minecraft:watersplash" */ val WaterSplash: WaterSplash with java.lang.String = js.native
  /* "minecraft:waterwake" */ val WaterWake: WaterWake with java.lang.String = js.native
  /* "minecraft:witchspell" */ val WitchSpell: WitchSpell with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    minecraftDashScriptingDashTypesDashSharedLib.MinecraftParticleEffect with java.lang.String
  ] = js.native
}

