package typings.nodegit

import typings.nodegit.bufMod.Buf
import typings.nodegit.nodegitInts.`-1`
import typings.nodegit.nodegitInts.`0`
import typings.nodegit.nodegitInts.`1`
import typings.nodegit.nodegitInts.`2`
import typings.nodegit.nodegitInts.`3`
import typings.nodegit.nodegitInts.`4`
import typings.nodegit.nodegitInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("nodegit/config", "Config")
  @js.native
  open class Config () extends StObject {
    
    def deleteEntry(name: String): Double = js.native
    
    def deleteMultivar(name: String, regexp: String): Double = js.native
    
    def getBool(name: String): js.Promise[Double] = js.native
    
    def getEntry(name: String): js.Promise[ConfigEntry] = js.native
    
    def getInt32(name: String): js.Promise[Double] = js.native
    
    def getInt64(name: String): js.Promise[Double] = js.native
    
    def getPath(name: String): js.Promise[String] = js.native
    
    // the docs says Buf but it's actually a string
    def getStringBuf(name: String): js.Promise[Buf] = js.native
    
    def lock(transaction: Any): Double = js.native
    
    def setBool(name: String, value: Double): js.Promise[Double] = js.native
    
    def setInt32(name: String, value: Double): js.Promise[Double] = js.native
    
    def setInt64(name: String, value: Double): js.Promise[Double] = js.native
    
    def setMultivar(name: String, regexp: String, value: String): js.Promise[Double] = js.native
    
    def setString(name: String, value: String): js.Promise[Double] = js.native
    
    def snapshot(): js.Promise[Config] = js.native
  }
  /* static members */
  object Config {
    
    @JSImport("nodegit/config", "Config")
    @js.native
    val ^ : js.Any = js.native
    
    inline def findGlobal(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findGlobal")().asInstanceOf[js.Promise[String]]
    
    // the docs says it's a buff but it's actually a string
    inline def findProgramdata(): js.Promise[Buf] = ^.asInstanceOf[js.Dynamic].applyDynamic("findProgramdata")().asInstanceOf[js.Promise[Buf]]
    
    inline def findSystem(): js.Promise[Buf] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSystem")().asInstanceOf[js.Promise[Buf]]
    
    inline def findXdg(): js.Promise[Buf] = ^.asInstanceOf[js.Dynamic].applyDynamic("findXdg")().asInstanceOf[js.Promise[Buf]]
    
    inline def openDefault(): js.Promise[Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("openDefault")().asInstanceOf[js.Promise[Config]]
    
    inline def openOndisk(path: String): js.Promise[Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("openOndisk")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Config]]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`1`
      - typings.nodegit.nodegitInts.`2`
      - typings.nodegit.nodegitInts.`3`
      - typings.nodegit.nodegitInts.`4`
      - typings.nodegit.nodegitInts.`5`
      - typings.nodegit.nodegitInts.`-1`
    */
    trait LEVEL extends StObject
    object LEVEL {
      
      inline def APP: `5` = 5.asInstanceOf[`5`]
      
      inline def GLOBAL: `3` = 3.asInstanceOf[`3`]
      
      inline def HIGHEST_LEVEL: `-1` = -1.asInstanceOf[`-1`]
      
      inline def LOCAL: `4` = 4.asInstanceOf[`4`]
      
      inline def SYSTEM: `1` = 1.asInstanceOf[`1`]
      
      inline def XDG: `2` = 2.asInstanceOf[`2`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`0`
      - typings.nodegit.nodegitInts.`1`
      - typings.nodegit.nodegitInts.`2`
      - typings.nodegit.nodegitInts.`3`
    */
    trait MAP extends StObject
    object MAP {
      
      inline def FALSE: `0` = 0.asInstanceOf[`0`]
      
      inline def INT32: `2` = 2.asInstanceOf[`2`]
      
      inline def STRING: `3` = 3.asInstanceOf[`3`]
      
      inline def TRUE: `1` = 1.asInstanceOf[`1`]
    }
  }
  
  @JSImport("nodegit/config", "ConfigEntry")
  @js.native
  open class ConfigEntry () extends StObject {
    
    // the documentation says those are variables,
    // but in reality they are functions
    def level(): Double = js.native
    
    def name(): Double = js.native
    
    def value(): String = js.native
  }
}
