package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockProperties")
@js.native
/* protected */ open class BlockProperties () extends StObject
/* static members */
object BlockProperties {
  
  @JSImport("mojang-minecraft", "BlockProperties.active")
  @js.native
  val active: /* "active" */ String = js.native
  
  /**
    * Integer property that represents the age of the block. Valid
    * values are between 0 and 15 inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.age")
  @js.native
  val age: /* "age" */ String = js.native
  
  /**
    * Boolean property that determines if saplings should grow.
    */
  @JSImport("mojang-minecraft", "BlockProperties.ageBit")
  @js.native
  val ageBit: /* "age_bit" */ String = js.native
  
  /**
    * Boolean property that determines if an explosion propagates
    * underwater.
    */
  @JSImport("mojang-minecraft", "BlockProperties.allowUnderwaterBit")
  @js.native
  val allowUnderwaterBit: /* "allow_underwater_bit" */ String = js.native
  
  /**
    * Boolean property that determines if a tripwire is attached
    * to another tripwire.
    */
  @JSImport("mojang-minecraft", "BlockProperties.attachedBit")
  @js.native
  val attachedBit: /* "attached_bit" */ String = js.native
  
  /**
    * String property that represents the type of attachment used
    * by a bell or grindstone block. Valid values are 'standing',
    * 'hanging', 'side' and 'multiple'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.attachment")
  @js.native
  val attachment: /* "attachment" */ String = js.native
  
  /**
    * String property that determines the thickness of a bamboo
    * stalk. Valid values are 'thin' and 'thick'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.bambooLeafSize")
  @js.native
  val bambooLeafSize: /* "bamboo_leaf_size" */ String = js.native
  
  /**
    * String property that determines the size of bamboo leaves.
    * Valid values are 'no_leaves', 'small_leaves', and
    * 'large_leaves'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.bambooStalkThickness")
  @js.native
  val bambooStalkThickness: /* "bamboo_stalk_thickness" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.bigDripleafHead")
  @js.native
  val bigDripleafHead: /* "big_dripleaf_head" */ String = js.native
  
  /**
    * String property that represents the tilt state of big
    * dripleaf block. Valid values are 'none', 'unstable',
    * 'partial_tilt' and 'full_tilt'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.bigDripleafTilt")
  @js.native
  val bigDripleafTilt: /* "big_dripleaf_tilt" */ String = js.native
  
  /**
    * Integer property that tracks how many bites of cake have
    * been taken. Valid values are between 0 and 6 inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.biteCounter")
  @js.native
  val biteCounter: /* "bite_counter" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.blockLightLevel")
  @js.native
  val blockLightLevel: /* "block_light_level" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.bloom")
  @js.native
  val bloom: /* "bloom" */ String = js.native
  
  /**
    * Boolean property that determines if a bottle is shown in the
    * first slot of the brewing stand.
    */
  @JSImport("mojang-minecraft", "BlockProperties.brewingStandSlotABit")
  @js.native
  val brewingStandSlotABit: /* "brewing_stand_slot_a_bit" */ String = js.native
  
  /**
    * Boolean property that determines if a bottle is shown in the
    * second slot of the brewing stand.
    */
  @JSImport("mojang-minecraft", "BlockProperties.brewingStandSlotBBit")
  @js.native
  val brewingStandSlotBBit: /* "brewing_stand_slot_b_bit" */ String = js.native
  
  /**
    * Boolean property that determines if a bottle is shown in the
    * third slot of the brewing stand.
    */
  @JSImport("mojang-minecraft", "BlockProperties.brewingStandSlotCBit")
  @js.native
  val brewingStandSlotCBit: /* "brewing_stand_slot_c_bit" */ String = js.native
  
  /**
    * Boolean property that determines if a button is in a pressed
    * state or not.
    */
  @JSImport("mojang-minecraft", "BlockProperties.buttonPressedBit")
  @js.native
  val buttonPressedBit: /* "button_pressed_bit" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.canSummon")
  @js.native
  val canSummon: /* "can_summon" */ String = js.native
  
  /**
    * Integer property that describes how many extra candles are
    * in the same block space. Valid values are between 0 and 3
    * inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.candles")
  @js.native
  val candles: /* "candles" */ String = js.native
  
  /**
    * String property that represents the type of liquid in a
    * cauldron. Valid values are 'water', 'powder_snow', and
    * 'lava'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.cauldronLiquid")
  @js.native
  val cauldronLiquid: /* "cauldron_liquid" */ String = js.native
  
  /**
    * String property that represents the type of work benches
    * that are within Minecraft Education experiences. Valid
    * values are 'compound_creator', 'material_reducer',
    * 'element_constructor' and 'lab_table'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.chemistryTableType")
  @js.native
  val chemistryTableType: /* "chemistry_table_type" */ String = js.native
  
  /**
    * String property determines the pattern of quartz and purpur
    * blocks. Valid values are 'default', 'chiseled', 'lines',
    * 'smooth'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.chiselType")
  @js.native
  val chiselType: /* "chisel_type" */ String = js.native
  
  /**
    * Integer property that describes how many sea pickles are in
    * a cluster. Valid values are between 0 and 3 inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.clusterCount")
  @js.native
  val clusterCount: /* "cluster_count" */ String = js.native
  
  /**
    * String property that represents the color of a block, like
    * wool. Valid values are 'white', 'orange', 'magenta',
    * 'light_blue', 'yellow', 'lime', 'pink', 'gray', 'silver',
    * 'cyan', 'purple', 'blue', 'brown', 'green', 'red' and
    * 'black'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.color")
  @js.native
  val color: /* "color" */ String = js.native
  
  /**
    * Boolean property that determines if a torch has a particular
    * color.
    */
  @JSImport("mojang-minecraft", "BlockProperties.colorBit")
  @js.native
  val colorBit: /* "color_bit" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.composterFillLevel")
  @js.native
  val composterFillLevel: /* "composter_fill_level" */ String = js.native
  
  /**
    * Boolean property that determines if a command block is
    * conditional or not.
    */
  @JSImport("mojang-minecraft", "BlockProperties.conditionalBit")
  @js.native
  val conditionalBit: /* "conditional_bit" */ String = js.native
  
  /**
    * String property that represents the color of a coral block.
    * Valid values are 'blue', 'pink', 'purple', 'red', 'yellow',
    * 'blue dead', 'pink dead', 'red dead', and 'yellow dead'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.coralColor")
  @js.native
  val coralColor: /* "coral_color" */ String = js.native
  
  /**
    * Integer property that describes the rotation of coral fans.
    * Valid values are between 0 and 3 inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.coralDirection")
  @js.native
  val coralDirection: /* "coral_direction" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.coralFanDirection")
  @js.native
  val coralFanDirection: /* "coral_fan_direction" */ String = js.native
  
  /**
    * Boolean property that represents the type of hanging for
    * coral fan.
    */
  @JSImport("mojang-minecraft", "BlockProperties.coralHangTypeBit")
  @js.native
  val coralHangTypeBit: /* "coral_hang_type_bit" */ String = js.native
  
  /**
    * Boolean property that describes if a top snow block is
    * covering another block.
    */
  @JSImport("mojang-minecraft", "BlockProperties.coveredBit")
  @js.native
  val coveredBit: /* "covered_bit" */ String = js.native
  
  /**
    * String property that determines the cracked state of turtle
    * eggs. Valid values are 'no_cracks', 'cracked', and
    * 'max_cracked'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.crackedState")
  @js.native
  val crackedState: /* "cracked_state" */ String = js.native
  
  /**
    * String property that determines the damage state of an
    * anvil. Valid values are 'undamaged', 'slightly_damaged',
    * 'very_damaged', and 'broken'
    */
  @JSImport("mojang-minecraft", "BlockProperties.damage")
  @js.native
  val damage: /* "damage" */ String = js.native
  
  /**
    * Boolean property that determines if coral, coral fans, or
    * sea pickles are dead.
    */
  @JSImport("mojang-minecraft", "BlockProperties.deadBit")
  @js.native
  val deadBit: /* "dead_bit" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.deprecated")
  @js.native
  val deprecated: /* "deprecated" */ String = js.native
  
  /**
    * Integer property determines the north, south, east, or west
    * direction of a block. Valid values include are south = 0,
    * west = 1, north = 2, east = 3.
    */
  @JSImport("mojang-minecraft", "BlockProperties.direction")
  @js.native
  val direction: /* "direction" */ String = js.native
  
  /**
    * String property that determines the dirt type of a block.
    * Valid values are 'normal' and 'coarse'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.dirtType")
  @js.native
  val dirtType: /* "dirt_type" */ String = js.native
  
  /**
    * Boolean property that determines if a tripwire is disarmed
    * or not.
    */
  @JSImport("mojang-minecraft", "BlockProperties.disarmedBit")
  @js.native
  val disarmedBit: /* "disarmed_bit" */ String = js.native
  
  /**
    * Boolean property that determines if a door's hinge is
    * mirrored or not.
    */
  @JSImport("mojang-minecraft", "BlockProperties.doorHingeBit")
  @js.native
  val doorHingeBit: /* "door_hinge_bit" */ String = js.native
  
  /**
    * String property that represents the type of a double plant
    * block. Valid values are 'sunflower', 'syringa', 'grass',
    * 'fern', 'rose', and 'paeonia'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.doublePlantType")
  @js.native
  val doublePlantType: /* "double_plant_type" */ String = js.native
  
  /**
    * Boolean property that describes if bubble columns drag
    * entities down or push them up.
    */
  @JSImport("mojang-minecraft", "BlockProperties.dragDown")
  @js.native
  val dragDown: /* "drag_down" */ String = js.native
  
  /**
    * String property that represents the type of a pointed
    * dripstone block. Valid values are 'tip', 'frustum', 'base',
    * 'middle' and 'merge'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.dripstoneThickness")
  @js.native
  val dripstoneThickness: /* "dripstone_thickness" */ String = js.native
  
  /**
    * Boolean property that determines if an end portal block has
    * an Eye of Ender in it.
    */
  @JSImport("mojang-minecraft", "BlockProperties.endPortalEyeBit")
  @js.native
  val endPortalEyeBit: /* "end_portal_eye_bit" */ String = js.native
  
  /**
    * Boolean property that determines if a TNT block should start
    * its explode sequence.
    */
  @JSImport("mojang-minecraft", "BlockProperties.explodeBit")
  @js.native
  val explodeBit: /* "explode_bit" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.extinguished")
  @js.native
  val extinguished: /* "extinguished" */ String = js.native
  
  /**
    * Integer property that determines the facing direction of
    * some types of blocks. Valid values include down = 0, up = 1,
    * north = 2, south = 3, west = 4, east = 5.
    */
  @JSImport("mojang-minecraft", "BlockProperties.facingDirection")
  @js.native
  val facingDirection: /* "facing_direction" */ String = js.native
  
  /**
    * Integer property that determines the fill level of a
    * cauldron block. Valid values are between 0 and 6 inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.fillLevel")
  @js.native
  val fillLevel: /* "fill_level" */ String = js.native
  
  /**
    * String property that represents the type of flow. Valid
    * values are 'poppy', 'orchid', 'allium', 'houstonia',
    * 'tulip_red', 'tulip_orange', 'tulip_white', 'tulip_pink',
    * 'oxeye', 'cornflower' and 'lily_of_the_valley'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.flowerType")
  @js.native
  val flowerType: /* "flower_type" */ String = js.native
  
  /**
    * Integer property that represents the rotation of signs and
    * standing banners. Valid values are between 0 and 15
    * inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.groundSignDirection")
  @js.native
  val groundSignDirection: /* "ground_sign_direction" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.growingPlantAge")
  @js.native
  val growingPlantAge: /* "growing_plant_age" */ String = js.native
  
  /**
    * Integer property that determines the growth level of crops.
    * Valid values are between 0 and 7 inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.growth")
  @js.native
  val growth: /* "growth" */ String = js.native
  
  /**
    * Boolean property that represents if a lantern block is
    * hanging or not.
    */
  @JSImport("mojang-minecraft", "BlockProperties.hanging")
  @js.native
  val hanging: /* "hanging" */ String = js.native
  
  /**
    * Boolean property that determines if a block is the pillow
    * side of a bed.
    */
  @JSImport("mojang-minecraft", "BlockProperties.headPieceBit")
  @js.native
  val headPieceBit: /* "head_piece_bit" */ String = js.native
  
  /**
    * Integer property that determines the height of a top snow
    * block. Valid values are between 0 and 7 inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.height")
  @js.native
  val height: /* "height" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.honeyLevel")
  @js.native
  val honeyLevel: /* "honey_level" */ String = js.native
  
  /**
    * Integer property that determines which huge mushroom block
    * should be displayed. Valid values are between 0 and 15
    * inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.hugeMushroomBits")
  @js.native
  val hugeMushroomBits: /* "huge_mushroom_bits" */ String = js.native
  
  /**
    * Boolean property that determines if a fence block is
    * connected to a wall block.
    */
  @JSImport("mojang-minecraft", "BlockProperties.inWallBit")
  @js.native
  val inWallBit: /* "in_wall_bit" */ String = js.native
  
  /**
    * Boolean property that determines if a block should burn
    * infinitely.
    */
  @JSImport("mojang-minecraft", "BlockProperties.infiniburnBit")
  @js.native
  val infiniburnBit: /* "infiniburn_bit" */ String = js.native
  
  /**
    * Boolean property that describes if an item frame block has a
    * map in it.
    */
  @JSImport("mojang-minecraft", "BlockProperties.itemFrameMapBit")
  @js.native
  val itemFrameMapBit: /* "item_frame_map_bit" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.itemFramePhotoBit")
  @js.native
  val itemFramePhotoBit: /* "item_frame_photo_bit" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.kelpAge")
  @js.native
  val kelpAge: /* "kelp_age" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.leverDirection")
  @js.native
  val leverDirection: /* "lever_direction" */ String = js.native
  
  /**
    * Integer property that represents the level of liquid blocks.
    * Valid values are between 0 and 15 inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.liquidDepth")
  @js.native
  val liquidDepth: /* "liquid_depth" */ String = js.native
  
  /**
    * Boolean property that determines if a block is lit or not.
    */
  @JSImport("mojang-minecraft", "BlockProperties.lit")
  @js.native
  val lit: /* "lit" */ String = js.native
  
  /**
    * Integer property that represents the moisture level of crop.
    * Valid values are between 0 and 7 inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.moisturizedAmount")
  @js.native
  val moisturizedAmount: /* "moisturized_amount" */ String = js.native
  
  /**
    * String property that represents the stone type of an
    * Infested Stone block. Valid values are 'stone',
    * 'cobblestone', 'stone_brick', 'mossy_stone_brick',
    * 'cracked_stone_brick' and 'chiseled_stone_brick'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.monsterEggStoneType")
  @js.native
  val monsterEggStoneType: /* "monster_egg_stone_type" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.multiFaceDirectionBits")
  @js.native
  val multiFaceDirectionBits: /* "multi_face_direction_bits" */ String = js.native
  
  /**
    * String property that represents the leaf type of some block
    * types. Valid values are 'acacia' and 'dark_oak'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.newLeafType")
  @js.native
  val newLeafType: /* "new_leaf_type" */ String = js.native
  
  /**
    * String property that represents the wood type of certain
    * types of blocks. Valid values are 'acacia' and 'dark_oak'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.newLogType")
  @js.native
  val newLogType: /* "new_log_type" */ String = js.native
  
  /**
    * Boolean property that determines if a skull block should
    * drop loot.
    */
  @JSImport("mojang-minecraft", "BlockProperties.noDropBit")
  @js.native
  val noDropBit: /* "no_drop_bit" */ String = js.native
  
  /**
    * Boolean property that determines if a bed block is occupied.
    */
  @JSImport("mojang-minecraft", "BlockProperties.occupiedBit")
  @js.native
  val occupiedBit: /* "occupied_bit" */ String = js.native
  
  /**
    * String property that represents the leaf type of some block
    * types. Valid values are 'oak', 'spruce', 'birch', and
    * 'jungle'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.oldLeafType")
  @js.native
  val oldLeafType: /* "old_leaf_type" */ String = js.native
  
  /**
    * String property that determines the wood type of certain
    * types of blocks. Valid values are 'oak', 'spruce', 'birch'
    * and 'jungle'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.oldLogType")
  @js.native
  val oldLogType: /* "old_log_type" */ String = js.native
  
  /**
    * Boolean property that determines if a door, gate, or
    * trapdoor is open.
    */
  @JSImport("mojang-minecraft", "BlockProperties.openBit")
  @js.native
  val openBit: /* "open_bit" */ String = js.native
  
  /**
    * Boolean property that determines if a comparator's output is
    * lit.
    */
  @JSImport("mojang-minecraft", "BlockProperties.outputLitBit")
  @js.native
  val outputLitBit: /* "output_lit_bit" */ String = js.native
  
  /**
    * Boolean property that determines if a comparator is set to
    * subtract output.
    */
  @JSImport("mojang-minecraft", "BlockProperties.outputSubtractBit")
  @js.native
  val outputSubtractBit: /* "output_subtract_bit" */ String = js.native
  
  /**
    * Boolean property that determines if a leaf block is
    * persistent.
    */
  @JSImport("mojang-minecraft", "BlockProperties.persistentBit")
  @js.native
  val persistentBit: /* "persistent_bit" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.pillarAxis")
  @js.native
  val pillarAxis: /* "pillar_axis" */ String = js.native
  
  /**
    * String property that determines the orientation of portal
    * blocks. Valid values include 'unknown', 'x', and 'z'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.portalAxis")
  @js.native
  val portalAxis: /* "portal_axis" */ String = js.native
  
  /**
    * Boolean property that is true when an observer or tripwire
    * sends a redstone signal.
    */
  @JSImport("mojang-minecraft", "BlockProperties.poweredBit")
  @js.native
  val poweredBit: /* "powered_bit" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.prismarineBlockType")
  @js.native
  val prismarineBlockType: /* "prismarine_block_type" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.propaguleStage")
  @js.native
  val propaguleStage: /* "propagule_stage" */ String = js.native
  
  /**
    * Boolean property that returns true if a rail has a redstone
    * signal.
    */
  @JSImport("mojang-minecraft", "BlockProperties.railDataBit")
  @js.native
  val railDataBit: /* "rail_data_bit" */ String = js.native
  
  /**
    * Integer property determines the orientation of a placed rail
    * block. Valid values are between 0 and 8 inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.railDirection")
  @js.native
  val railDirection: /* "rail_direction" */ String = js.native
  
  /**
    * Integer property that determines the signal strength of a
    * redstone signal. Valid values are between 0 and 15
    * inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.redstoneSignal")
  @js.native
  val redstoneSignal: /* "redstone_signal" */ String = js.native
  
  /**
    * Integer property that represents the amount of delay of a
    * repeater. Valid values are between 0 and 3 inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.repeaterDelay")
  @js.native
  val repeaterDelay: /* "repeater_delay" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.respawnAnchorCharge")
  @js.native
  val respawnAnchorCharge: /* "respawn_anchor_charge" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.rotation")
  @js.native
  val rotation: /* "rotation" */ String = js.native
  
  /**
    * String property that represents the pattern of a sandstone
    * block. Valid values are 'default', 'heiroglyphs', 'cut', and
    * 'smooth'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.sandStoneType")
  @js.native
  val sandStoneType: /* "sand_stone_type" */ String = js.native
  
  /**
    * String property that represents the sand type of a block.
    * Valid values are 'normal' and 'red'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.sandType")
  @js.native
  val sandType: /* "sand_type" */ String = js.native
  
  /**
    * String property that determines the type of the sapling
    * block. Valid values are 'evergreen', 'birch', 'jungle',
    * 'acacia', and 'roofed_oak'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.saplingType")
  @js.native
  val saplingType: /* "sapling_type" */ String = js.native
  
  /**
    * String property that determines the type of a sea grass
    * block. Valid values are 'default', 'double_top' and
    * 'double_bot'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.seaGrassType")
  @js.native
  val seaGrassType: /* "sea_grass_type" */ String = js.native
  
  /**
    * String property that represents the type of a sponge block.
    * Valid values are 'dry' and 'wet'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.spongeType")
  @js.native
  val spongeType: /* "sponge_type" */ String = js.native
  
  /**
    * Integer property that determines the stability of a
    * scaffolding block. Valid values are between 0 and 5
    * inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.stability")
  @js.native
  val stability: /* "stability" */ String = js.native
  
  /**
    * Boolean property that describes if a scaffolding block has
    * been checked for stability.
    */
  @JSImport("mojang-minecraft", "BlockProperties.stabilityCheck")
  @js.native
  val stabilityCheck: /* "stability_check" */ String = js.native
  
  /**
    * String property that determines the type of a stone brick
    * block. Valid values are 'default', 'mossy', 'cracked',
    * 'chiseled' and 'smooth'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.stoneBrickType")
  @js.native
  val stoneBrickType: /* "stone_brick_type" */ String = js.native
  
  /**
    * String property that represents the type of certain types of
    * stone slab blocks. Valid values are 'smooth_stone',
    * 'sandstone', 'wood', 'cobblestone', 'brick', 'stone_brick',
    * 'quartz' and 'nether_brick'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.stoneSlabType")
  @js.native
  val stoneSlabType: /* "stone_slab_type" */ String = js.native
  
  /**
    * String property that represents the type of certain types of
    * stone slab blocks. Valid values are 'red_sandstone',
    * 'purpur', 'prismarine_rough', 'prismarine_dark',
    * 'prismarine_brick', 'mossy_cobblestone', 'smooth_sandstone'
    * and 'red_nether_brick'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.stoneSlabType2")
  @js.native
  val stoneSlabType2: /* "stone_slab_type_2" */ String = js.native
  
  /**
    * String property that represents the type of certain types of
    * stone slab blocks. Valid values are 'end_stone_brick',
    * 'smooth_red_sandstone', 'polished_andesite', 'andesite',
    * 'diorite', 'polished_diorite', 'granite', and
    * 'polished_granite'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.stoneSlabType3")
  @js.native
  val stoneSlabType3: /* "stone_slab_type_3" */ String = js.native
  
  /**
    * String property that represents the type of certain types of
    * stone slab blocks. Valid values are 'mossy_stone_brick',
    * 'smooth_quartz', 'stone', 'cut_sandstone', and
    * 'cut_red_sandstone'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.stoneSlabType4")
  @js.native
  val stoneSlabType4: /* "stone_slab_type_4" */ String = js.native
  
  /**
    * String property that determines the type of a stone block.
    * Valid values are 'stone', 'granite', 'granite_smooth',
    * 'diorite', 'diorite_smooth', 'andesite', and
    * 'andesite_smooth'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.stoneType")
  @js.native
  val stoneType: /* "stone_type" */ String = js.native
  
  /**
    * Boolean property that represents if a wood log has been
    * stripped of bark.
    */
  @JSImport("mojang-minecraft", "BlockProperties.strippedBit")
  @js.native
  val strippedBit: /* "stripped_bit" */ String = js.native
  
  /**
    * String property that represents the state of a structure
    * block. Valid values are 'data', 'save', 'load', 'corner',
    * 'invalid' and 'export'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.structureBlockType")
  @js.native
  val structureBlockType: /* "structure_block_type" */ String = js.native
  
  /**
    * String property that determines which void mode to draw for
    * structure blocks. Valid values are 'void' and 'air'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.structureVoidType")
  @js.native
  val structureVoidType: /* "structure_void_type" */ String = js.native
  
  /**
    * Boolean property that indicates if a tripwire block is
    * suspended.
    */
  @JSImport("mojang-minecraft", "BlockProperties.suspendedBit")
  @js.native
  val suspendedBit: /* "suspended_bit" */ String = js.native
  
  /**
    * String property that represents the type of a tall grass
    * block. Valid values are 'default', 'tall', 'fern', and
    * 'snow'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.tallGrassType")
  @js.native
  val tallGrassType: /* "tall_grass_type" */ String = js.native
  
  /**
    * Boolean property that determines if a hopper block is active
    * or not.
    */
  @JSImport("mojang-minecraft", "BlockProperties.toggleBit")
  @js.native
  val toggleBit: /* "toggle_bit" */ String = js.native
  
  /**
    * Boolean property that determines if a slab is the top half
    * of the block or not
    */
  @JSImport("mojang-minecraft", "BlockProperties.topSlotBit")
  @js.native
  val topSlotBit: /* "top_slot_bit" */ String = js.native
  
  /**
    * String property that determines the direction of a torch in
    * relation to the block it is attached to. Valid values are
    * 'unknown', 'west', 'east', 'north', 'south', 'top'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.torchFacingDirection")
  @js.native
  val torchFacingDirection: /* "torch_facing_direction" */ String = js.native
  
  /**
    * Boolean property that determines if a dispenser is
    * triggered.
    */
  @JSImport("mojang-minecraft", "BlockProperties.triggeredBit")
  @js.native
  val triggeredBit: /* "triggered_bit" */ String = js.native
  
  /**
    * String property that represents the amount of turtle eggs in
    * an egg block. Valid values are 'one_egg', 'two_egg',
    * 'three_egg' and 'four_egg'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.turtleEggCount")
  @js.native
  val turtleEggCount: /* "turtle_egg_count" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.twistingVinesAge")
  @js.native
  val twistingVinesAge: /* "twisting_vines_age" */ String = js.native
  
  /**
    * Boolean property that determines if a leaf block or flower
    * block should be updated.
    */
  @JSImport("mojang-minecraft", "BlockProperties.updateBit")
  @js.native
  val updateBit: /* "update_bit" */ String = js.native
  
  /**
    * Boolean property that determines if a block is the upper
    * half of an object like a door or a tall plant.
    */
  @JSImport("mojang-minecraft", "BlockProperties.upperBlockBit")
  @js.native
  val upperBlockBit: /* "upper_block_bit" */ String = js.native
  
  /**
    * Boolean property that determines if a stair block or
    * trapdoor block is upside-down.
    */
  @JSImport("mojang-minecraft", "BlockProperties.upsideDownBit")
  @js.native
  val upsideDownBit: /* "upside_down_bit" */ String = js.native
  
  /**
    * Integer property that represents the facing direction for
    * vines. Valid values are between 0 and 15 inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.vineDirectionBits")
  @js.native
  val vineDirectionBits: /* "vine_direction_bits" */ String = js.native
  
  /**
    * String property that represents the type of stone used in a
    * wall block. Valid values are 'cobblestone',
    * 'mossy_cobblestone', 'granite', 'diorite', 'andesite',
    * 'sandstone', 'brick', 'stone_brick', 'mossy_stone_brick',
    * 'nether_brick', 'end_brick', 'prismarine', 'red_sandstone'
    * and 'red_nether_brick'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.wallBlockType")
  @js.native
  val wallBlockType: /* "wall_block_type" */ String = js.native
  
  /**
    * String property that determines what kind of connection a
    * wall has to the east. Valid values are 'none', 'short' and
    * 'tall'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.wallConnectionTypeEast")
  @js.native
  val wallConnectionTypeEast: /* "wall_connection_type_east" */ String = js.native
  
  /**
    * String property that determines what kind of connection a
    * wall has to the north. Valid values are 'none', 'short' and
    * 'tall'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.wallConnectionTypeNorth")
  @js.native
  val wallConnectionTypeNorth: /* "wall_connection_type_north" */ String = js.native
  
  /**
    * String property that determines what kind of connection a
    * wall has to the south. Valid values are 'none', 'short' and
    * 'tall'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.wallConnectionTypeSouth")
  @js.native
  val wallConnectionTypeSouth: /* "wall_connection_type_south" */ String = js.native
  
  /**
    * String property that determines what kind of connection a
    * wall has to the west. Valid values are 'none', 'short' and
    * 'tall'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.wallConnectionTypeWest")
  @js.native
  val wallConnectionTypeWest: /* "wall_connection_type_west" */ String = js.native
  
  /**
    * Boolean property that determines if a wall should contain a
    * post.
    */
  @JSImport("mojang-minecraft", "BlockProperties.wallPostBit")
  @js.native
  val wallPostBit: /* "wall_post_bit" */ String = js.native
  
  @JSImport("mojang-minecraft", "BlockProperties.weepingVinesAge")
  @js.native
  val weepingVinesAge: /* "weeping_vines_age" */ String = js.native
  
  /**
    * Integer property that represents the rotation of stairs.
    * Valid values are between 0 and 3 inclusive.
    */
  @JSImport("mojang-minecraft", "BlockProperties.weirdoDirection")
  @js.native
  val weirdoDirection: /* "weirdo_direction" */ String = js.native
  
  /**
    * String property that determines the wood type of a block.
    * Valid values are 'oak', 'spruce', 'birch', 'jungle',
    * 'acacia', and 'dark_oak'.
    */
  @JSImport("mojang-minecraft", "BlockProperties.woodType")
  @js.native
  val woodType: /* "wood_type" */ String = js.native
}
