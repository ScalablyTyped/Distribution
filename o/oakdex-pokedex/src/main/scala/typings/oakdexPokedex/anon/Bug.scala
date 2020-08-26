package typings.oakdexPokedex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bug extends js.Object {
  var Bug: Double = js.native
  var Dark: Double = js.native
  var Dragon: Double = js.native
  var Electric: Double = js.native
  var Fairy: Double = js.native
  var Fighting: Double = js.native
  var Fire: Double = js.native
  var Flying: Double = js.native
  var Ghost: Double = js.native
  var Grass: Double = js.native
  var Ground: Double = js.native
  var Ice: Double = js.native
  var Normal: Double = js.native
  var Poison: Double = js.native
  var Psychic: Double = js.native
  var Rock: Double = js.native
  var Steel: Double = js.native
  var Water: Double = js.native
}

object Bug {
  @scala.inline
  def apply(
    Bug: Double,
    Dark: Double,
    Dragon: Double,
    Electric: Double,
    Fairy: Double,
    Fighting: Double,
    Fire: Double,
    Flying: Double,
    Ghost: Double,
    Grass: Double,
    Ground: Double,
    Ice: Double,
    Normal: Double,
    Poison: Double,
    Psychic: Double,
    Rock: Double,
    Steel: Double,
    Water: Double
  ): Bug = {
    val __obj = js.Dynamic.literal(Bug = Bug.asInstanceOf[js.Any], Dark = Dark.asInstanceOf[js.Any], Dragon = Dragon.asInstanceOf[js.Any], Electric = Electric.asInstanceOf[js.Any], Fairy = Fairy.asInstanceOf[js.Any], Fighting = Fighting.asInstanceOf[js.Any], Fire = Fire.asInstanceOf[js.Any], Flying = Flying.asInstanceOf[js.Any], Ghost = Ghost.asInstanceOf[js.Any], Grass = Grass.asInstanceOf[js.Any], Ground = Ground.asInstanceOf[js.Any], Ice = Ice.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any], Poison = Poison.asInstanceOf[js.Any], Psychic = Psychic.asInstanceOf[js.Any], Rock = Rock.asInstanceOf[js.Any], Steel = Steel.asInstanceOf[js.Any], Water = Water.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bug]
  }
  @scala.inline
  implicit class BugOps[Self <: Bug] (val x: Self) extends AnyVal {
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
    def setBug(value: Double): Self = this.set("Bug", value.asInstanceOf[js.Any])
    @scala.inline
    def setDark(value: Double): Self = this.set("Dark", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragon(value: Double): Self = this.set("Dragon", value.asInstanceOf[js.Any])
    @scala.inline
    def setElectric(value: Double): Self = this.set("Electric", value.asInstanceOf[js.Any])
    @scala.inline
    def setFairy(value: Double): Self = this.set("Fairy", value.asInstanceOf[js.Any])
    @scala.inline
    def setFighting(value: Double): Self = this.set("Fighting", value.asInstanceOf[js.Any])
    @scala.inline
    def setFire(value: Double): Self = this.set("Fire", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlying(value: Double): Self = this.set("Flying", value.asInstanceOf[js.Any])
    @scala.inline
    def setGhost(value: Double): Self = this.set("Ghost", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrass(value: Double): Self = this.set("Grass", value.asInstanceOf[js.Any])
    @scala.inline
    def setGround(value: Double): Self = this.set("Ground", value.asInstanceOf[js.Any])
    @scala.inline
    def setIce(value: Double): Self = this.set("Ice", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormal(value: Double): Self = this.set("Normal", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoison(value: Double): Self = this.set("Poison", value.asInstanceOf[js.Any])
    @scala.inline
    def setPsychic(value: Double): Self = this.set("Psychic", value.asInstanceOf[js.Any])
    @scala.inline
    def setRock(value: Double): Self = this.set("Rock", value.asInstanceOf[js.Any])
    @scala.inline
    def setSteel(value: Double): Self = this.set("Steel", value.asInstanceOf[js.Any])
    @scala.inline
    def setWater(value: Double): Self = this.set("Water", value.asInstanceOf[js.Any])
  }
  
}

