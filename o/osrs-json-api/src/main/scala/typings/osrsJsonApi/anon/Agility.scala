package typings.osrsJsonApi.anon

import typings.osrsJsonApi.mod.hiscores.RankLevelXpObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Agility extends js.Object {
  
  var agility: RankLevelXpObject = js.native
  
  var attack: RankLevelXpObject = js.native
  
  var construction: RankLevelXpObject = js.native
  
  var cooking: RankLevelXpObject = js.native
  
  var crafting: RankLevelXpObject = js.native
  
  var defence: RankLevelXpObject = js.native
  
  var farming: RankLevelXpObject = js.native
  
  var firemaking: RankLevelXpObject = js.native
  
  var fishing: RankLevelXpObject = js.native
  
  var fletching: RankLevelXpObject = js.native
  
  var herblore: RankLevelXpObject = js.native
  
  var hitpoints: RankLevelXpObject = js.native
  
  var hunter: RankLevelXpObject = js.native
  
  var magic: RankLevelXpObject = js.native
  
  var mining: RankLevelXpObject = js.native
  
  var overall: RankLevelXpObject = js.native
  
  var prayer: RankLevelXpObject = js.native
  
  var ranged: RankLevelXpObject = js.native
  
  var runecraft: RankLevelXpObject = js.native
  
  var slayer: RankLevelXpObject = js.native
  
  var smithing: RankLevelXpObject = js.native
  
  var strength: RankLevelXpObject = js.native
  
  var thieving: RankLevelXpObject = js.native
  
  var woodcutting: RankLevelXpObject = js.native
}
object Agility {
  
  @scala.inline
  def apply(
    agility: RankLevelXpObject,
    attack: RankLevelXpObject,
    construction: RankLevelXpObject,
    cooking: RankLevelXpObject,
    crafting: RankLevelXpObject,
    defence: RankLevelXpObject,
    farming: RankLevelXpObject,
    firemaking: RankLevelXpObject,
    fishing: RankLevelXpObject,
    fletching: RankLevelXpObject,
    herblore: RankLevelXpObject,
    hitpoints: RankLevelXpObject,
    hunter: RankLevelXpObject,
    magic: RankLevelXpObject,
    mining: RankLevelXpObject,
    overall: RankLevelXpObject,
    prayer: RankLevelXpObject,
    ranged: RankLevelXpObject,
    runecraft: RankLevelXpObject,
    slayer: RankLevelXpObject,
    smithing: RankLevelXpObject,
    strength: RankLevelXpObject,
    thieving: RankLevelXpObject,
    woodcutting: RankLevelXpObject
  ): Agility = {
    val __obj = js.Dynamic.literal(agility = agility.asInstanceOf[js.Any], attack = attack.asInstanceOf[js.Any], construction = construction.asInstanceOf[js.Any], cooking = cooking.asInstanceOf[js.Any], crafting = crafting.asInstanceOf[js.Any], defence = defence.asInstanceOf[js.Any], farming = farming.asInstanceOf[js.Any], firemaking = firemaking.asInstanceOf[js.Any], fishing = fishing.asInstanceOf[js.Any], fletching = fletching.asInstanceOf[js.Any], herblore = herblore.asInstanceOf[js.Any], hitpoints = hitpoints.asInstanceOf[js.Any], hunter = hunter.asInstanceOf[js.Any], magic = magic.asInstanceOf[js.Any], mining = mining.asInstanceOf[js.Any], overall = overall.asInstanceOf[js.Any], prayer = prayer.asInstanceOf[js.Any], ranged = ranged.asInstanceOf[js.Any], runecraft = runecraft.asInstanceOf[js.Any], slayer = slayer.asInstanceOf[js.Any], smithing = smithing.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any], thieving = thieving.asInstanceOf[js.Any], woodcutting = woodcutting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Agility]
  }
  
  @scala.inline
  implicit class AgilityOps[Self <: Agility] (val x: Self) extends AnyVal {
    
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
    def setAgility(value: RankLevelXpObject): Self = this.set("agility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttack(value: RankLevelXpObject): Self = this.set("attack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstruction(value: RankLevelXpObject): Self = this.set("construction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooking(value: RankLevelXpObject): Self = this.set("cooking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrafting(value: RankLevelXpObject): Self = this.set("crafting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefence(value: RankLevelXpObject): Self = this.set("defence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFarming(value: RankLevelXpObject): Self = this.set("farming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiremaking(value: RankLevelXpObject): Self = this.set("firemaking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFishing(value: RankLevelXpObject): Self = this.set("fishing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFletching(value: RankLevelXpObject): Self = this.set("fletching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHerblore(value: RankLevelXpObject): Self = this.set("herblore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitpoints(value: RankLevelXpObject): Self = this.set("hitpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHunter(value: RankLevelXpObject): Self = this.set("hunter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagic(value: RankLevelXpObject): Self = this.set("magic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMining(value: RankLevelXpObject): Self = this.set("mining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverall(value: RankLevelXpObject): Self = this.set("overall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrayer(value: RankLevelXpObject): Self = this.set("prayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanged(value: RankLevelXpObject): Self = this.set("ranged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunecraft(value: RankLevelXpObject): Self = this.set("runecraft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlayer(value: RankLevelXpObject): Self = this.set("slayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmithing(value: RankLevelXpObject): Self = this.set("smithing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrength(value: RankLevelXpObject): Self = this.set("strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThieving(value: RankLevelXpObject): Self = this.set("thieving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWoodcutting(value: RankLevelXpObject): Self = this.set("woodcutting", value.asInstanceOf[js.Any])
  }
}
