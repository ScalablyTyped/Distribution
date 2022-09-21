package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelFour extends StObject {
  
  var levelFour: LevelFive
}
object LevelFour {
  
  inline def apply(levelFour: LevelFive): LevelFour = {
    val __obj = js.Dynamic.literal(levelFour = levelFour.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelFour]
  }
  
  extension [Self <: LevelFour](x: Self) {
    
    inline def setLevelFour(value: LevelFive): Self = StObject.set(x, "levelFour", value.asInstanceOf[js.Any])
  }
}
