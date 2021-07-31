package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatObject extends StObject {
  
  var atk: Double
  
  var `def`: Double
  
  var hp: Double
  
  var sp_atk: Double
  
  var sp_def: Double
  
  var speed: Double
}
object StatObject {
  
  @scala.inline
  def apply(atk: Double, `def`: Double, hp: Double, sp_atk: Double, sp_def: Double, speed: Double): StatObject = {
    val __obj = js.Dynamic.literal(atk = atk.asInstanceOf[js.Any], hp = hp.asInstanceOf[js.Any], sp_atk = sp_atk.asInstanceOf[js.Any], sp_def = sp_def.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatObject]
  }
  
  @scala.inline
  implicit class StatObjectMutableBuilder[Self <: StatObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtk(value: Double): Self = StObject.set(x, "atk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDef(value: Double): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHp(value: Double): Self = StObject.set(x, "hp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSp_atk(value: Double): Self = StObject.set(x, "sp_atk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSp_def(value: Double): Self = StObject.set(x, "sp_def", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
  }
}
