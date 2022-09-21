package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelFive extends StObject {
  
  def levelFive(): String
}
object LevelFive {
  
  inline def apply(levelFive: () => String): LevelFive = {
    val __obj = js.Dynamic.literal(levelFive = js.Any.fromFunction0(levelFive))
    __obj.asInstanceOf[LevelFive]
  }
  
  extension [Self <: LevelFive](x: Self) {
    
    inline def setLevelFive(value: () => String): Self = StObject.set(x, "levelFive", js.Any.fromFunction0(value))
  }
}
