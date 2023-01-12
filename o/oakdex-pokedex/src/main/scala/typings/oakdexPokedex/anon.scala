package typings.oakdexPokedex

import typings.oakdexPokedex.mod.MoveStatusCondition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bug extends StObject {
    
    var Bug: Double
    
    var Dark: Double
    
    var Dragon: Double
    
    var Electric: Double
    
    var Fairy: Double
    
    var Fighting: Double
    
    var Fire: Double
    
    var Flying: Double
    
    var Ghost: Double
    
    var Grass: Double
    
    var Ground: Double
    
    var Ice: Double
    
    var Normal: Double
    
    var Poison: Double
    
    var Psychic: Double
    
    var Rock: Double
    
    var Steel: Double
    
    var Water: Double
  }
  object Bug {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Bug] (val x: Self) extends AnyVal {
      
      inline def setBug(value: Double): Self = StObject.set(x, "Bug", value.asInstanceOf[js.Any])
      
      inline def setDark(value: Double): Self = StObject.set(x, "Dark", value.asInstanceOf[js.Any])
      
      inline def setDragon(value: Double): Self = StObject.set(x, "Dragon", value.asInstanceOf[js.Any])
      
      inline def setElectric(value: Double): Self = StObject.set(x, "Electric", value.asInstanceOf[js.Any])
      
      inline def setFairy(value: Double): Self = StObject.set(x, "Fairy", value.asInstanceOf[js.Any])
      
      inline def setFighting(value: Double): Self = StObject.set(x, "Fighting", value.asInstanceOf[js.Any])
      
      inline def setFire(value: Double): Self = StObject.set(x, "Fire", value.asInstanceOf[js.Any])
      
      inline def setFlying(value: Double): Self = StObject.set(x, "Flying", value.asInstanceOf[js.Any])
      
      inline def setGhost(value: Double): Self = StObject.set(x, "Ghost", value.asInstanceOf[js.Any])
      
      inline def setGrass(value: Double): Self = StObject.set(x, "Grass", value.asInstanceOf[js.Any])
      
      inline def setGround(value: Double): Self = StObject.set(x, "Ground", value.asInstanceOf[js.Any])
      
      inline def setIce(value: Double): Self = StObject.set(x, "Ice", value.asInstanceOf[js.Any])
      
      inline def setNormal(value: Double): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
      
      inline def setPoison(value: Double): Self = StObject.set(x, "Poison", value.asInstanceOf[js.Any])
      
      inline def setPsychic(value: Double): Self = StObject.set(x, "Psychic", value.asInstanceOf[js.Any])
      
      inline def setRock(value: Double): Self = StObject.set(x, "Rock", value.asInstanceOf[js.Any])
      
      inline def setSteel(value: Double): Self = StObject.set(x, "Steel", value.asInstanceOf[js.Any])
      
      inline def setWater(value: Double): Self = StObject.set(x, "Water", value.asInstanceOf[js.Any])
    }
  }
  
  trait Female extends StObject {
    
    var female: Double
    
    var male: Double
  }
  object Female {
    
    inline def apply(female: Double, male: Double): Female = {
      val __obj = js.Dynamic.literal(female = female.asInstanceOf[js.Any], male = male.asInstanceOf[js.Any])
      __obj.asInstanceOf[Female]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Female] (val x: Self) extends AnyVal {
      
      inline def setFemale(value: Double): Self = StObject.set(x, "female", value.asInstanceOf[js.Any])
      
      inline def setMale(value: Double): Self = StObject.set(x, "male", value.asInstanceOf[js.Any])
    }
  }
  
  trait Increasedcriticalhitratio extends StObject {
    
    var increased_critical_hit_ratio: js.UndefOr[Boolean] = js.undefined
    
    var status_conditions: js.UndefOr[js.Array[MoveStatusCondition]] = js.undefined
  }
  object Increasedcriticalhitratio {
    
    inline def apply(): Increasedcriticalhitratio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Increasedcriticalhitratio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Increasedcriticalhitratio] (val x: Self) extends AnyVal {
      
      inline def setIncreased_critical_hit_ratio(value: Boolean): Self = StObject.set(x, "increased_critical_hit_ratio", value.asInstanceOf[js.Any])
      
      inline def setIncreased_critical_hit_ratioUndefined: Self = StObject.set(x, "increased_critical_hit_ratio", js.undefined)
      
      inline def setStatus_conditions(value: js.Array[MoveStatusCondition]): Self = StObject.set(x, "status_conditions", value.asInstanceOf[js.Any])
      
      inline def setStatus_conditionsUndefined: Self = StObject.set(x, "status_conditions", js.undefined)
      
      inline def setStatus_conditionsVarargs(value: MoveStatusCondition*): Self = StObject.set(x, "status_conditions", js.Array(value*))
    }
  }
  
  trait Jump extends StObject {
    
    var jump: js.UndefOr[js.Array[Double]] = js.undefined
    
    var power: js.UndefOr[js.Array[Double]] = js.undefined
    
    var skill: js.UndefOr[js.Array[Double]] = js.undefined
    
    var speed: js.UndefOr[js.Array[Double]] = js.undefined
    
    var stamina: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Jump {
    
    inline def apply(): Jump = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Jump]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Jump] (val x: Self) extends AnyVal {
      
      inline def setJump(value: js.Array[Double]): Self = StObject.set(x, "jump", value.asInstanceOf[js.Any])
      
      inline def setJumpUndefined: Self = StObject.set(x, "jump", js.undefined)
      
      inline def setJumpVarargs(value: Double*): Self = StObject.set(x, "jump", js.Array(value*))
      
      inline def setPower(value: js.Array[Double]): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
      
      inline def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
      
      inline def setPowerVarargs(value: Double*): Self = StObject.set(x, "power", js.Array(value*))
      
      inline def setSkill(value: js.Array[Double]): Self = StObject.set(x, "skill", value.asInstanceOf[js.Any])
      
      inline def setSkillUndefined: Self = StObject.set(x, "skill", js.undefined)
      
      inline def setSkillVarargs(value: Double*): Self = StObject.set(x, "skill", js.Array(value*))
      
      inline def setSpeed(value: js.Array[Double]): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setSpeedVarargs(value: Double*): Self = StObject.set(x, "speed", js.Array(value*))
      
      inline def setStamina(value: js.Array[Double]): Self = StObject.set(x, "stamina", value.asInstanceOf[js.Any])
      
      inline def setStaminaUndefined: Self = StObject.set(x, "stamina", js.undefined)
      
      inline def setStaminaVarargs(value: Double*): Self = StObject.set(x, "stamina", js.Array(value*))
    }
  }
}
