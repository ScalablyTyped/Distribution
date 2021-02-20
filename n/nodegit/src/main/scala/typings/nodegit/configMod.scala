package typings.nodegit

import typings.nodegit.bufMod.Buf
import typings.nodegit.nodegitNumbers.`-1`
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`3`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("nodegit/config", "Config")
  @js.native
  class Config () extends StObject {
    
    def deleteEntry(name: String): Double = js.native
    
    def deleteMultivar(name: String, regexp: String): Double = js.native
    
    def getBool(name: String): js.Promise[Double] = js.native
    
    def getEntry(name: String): js.Promise[ConfigEntry] = js.native
    
    def getInt32(name: String): js.Promise[Double] = js.native
    
    def getInt64(name: String): js.Promise[Double] = js.native
    
    def getPath(name: String): js.Promise[String] = js.native
    
    // the docs says Buf but it's actually a string
    def getStringBuf(name: String): js.Promise[Buf] = js.native
    
    def lock(transaction: js.Any): Double = js.native
    
    def setBool(name: String, value: Double): js.Promise[Double] = js.native
    
    def setInt32(name: String, value: Double): js.Promise[Double] = js.native
    
    def setInt64(name: String, value: Double): Double = js.native
    
    def setMultivar(name: String, regexp: String, value: String): js.Promise[Double] = js.native
    
    def setString(name: String, value: String): js.Promise[Double] = js.native
    
    def snapshot(): js.Promise[Config] = js.native
  }
  /* static members */
  object Config {
    
    @JSImport("nodegit/config", "Config.findGlobal")
    @js.native
    def findGlobal(): js.Promise[String] = js.native
    
    // the docs says it's a buff but it's actually a string
    @JSImport("nodegit/config", "Config.findProgramdata")
    @js.native
    def findProgramdata(): js.Promise[Buf] = js.native
    
    @JSImport("nodegit/config", "Config.findSystem")
    @js.native
    def findSystem(): js.Promise[Buf] = js.native
    
    @JSImport("nodegit/config", "Config.findXdg")
    @js.native
    def findXdg(): js.Promise[Buf] = js.native
    
    @JSImport("nodegit/config", "Config.openDefault")
    @js.native
    def openDefault(): js.Promise[Config] = js.native
    
    @JSImport("nodegit/config", "Config.openOndisk")
    @js.native
    def openOndisk(path: String): js.Promise[Config] = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`5`
      - typings.nodegit.nodegitNumbers.`-1`
    */
    trait LEVEL extends StObject
    object LEVEL {
      
      @scala.inline
      def APP: `5` = 5.asInstanceOf[`5`]
      
      @scala.inline
      def GLOBAL: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def HIGHEST_LEVEL: `-1` = -1.asInstanceOf[`-1`]
      
      @scala.inline
      def LOCAL: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def SYSTEM: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def XDG: `2` = 2.asInstanceOf[`2`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
    */
    trait MAP extends StObject
    object MAP {
      
      @scala.inline
      def FALSE: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def INT32: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def STRING: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def TRUE: `1` = 1.asInstanceOf[`1`]
    }
  }
  
  @JSImport("nodegit/config", "ConfigEntry")
  @js.native
  class ConfigEntry () extends StObject {
    
    // the documentation says those are variables,
    // but in reality they are functions
    def level(): Double = js.native
    
    def name(): Double = js.native
    
    def value(): String = js.native
  }
}
