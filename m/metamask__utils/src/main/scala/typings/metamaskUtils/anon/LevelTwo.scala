package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelTwo extends StObject {
  
  var levelTwo: LevelThree
}
object LevelTwo {
  
  inline def apply(levelTwo: LevelThree): LevelTwo = {
    val __obj = js.Dynamic.literal(levelTwo = levelTwo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelTwo]
  }
  
  extension [Self <: LevelTwo](x: Self) {
    
    inline def setLevelTwo(value: LevelThree): Self = StObject.set(x, "levelTwo", value.asInstanceOf[js.Any])
  }
}
