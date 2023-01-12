package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelThree extends StObject {
  
  var levelThree: LevelFour
}
object LevelThree {
  
  inline def apply(levelThree: LevelFour): LevelThree = {
    val __obj = js.Dynamic.literal(levelThree = levelThree.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelThree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LevelThree] (val x: Self) extends AnyVal {
    
    inline def setLevelThree(value: LevelFour): Self = StObject.set(x, "levelThree", value.asInstanceOf[js.Any])
  }
}
