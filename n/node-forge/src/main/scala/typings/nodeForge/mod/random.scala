package typings.nodeForge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object random {
  
  @JSImport("node-forge", "random.createInstance")
  @js.native
  def createInstance(): Random = js.native
  
  @JSImport("node-forge", "random.getBytes")
  @js.native
  def getBytes(count: Double): Bytes = js.native
  @JSImport("node-forge", "random.getBytes")
  @js.native
  def getBytes(count: Double, callback: js.Function1[/* bytes */ Bytes, _]): Bytes = js.native
  
  @JSImport("node-forge", "random.getBytesSync")
  @js.native
  def getBytesSync(count: Double): Bytes = js.native
  
  type CB = js.Function2[/* _ */ js.Any, /* seed */ String, Unit]
  
  @js.native
  trait Random extends StObject {
    
    def seedFile(needed: Double, cb: CB): Unit = js.native
    
    def seedFileSync(needed: Double): String = js.native
  }
  object Random {
    
    @scala.inline
    def apply(seedFile: (Double, CB) => Unit, seedFileSync: Double => String): Random = {
      val __obj = js.Dynamic.literal(seedFile = js.Any.fromFunction2(seedFile), seedFileSync = js.Any.fromFunction1(seedFileSync))
      __obj.asInstanceOf[Random]
    }
    
    @scala.inline
    implicit class RandomMutableBuilder[Self <: Random] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSeedFile(value: (Double, CB) => Unit): Self = StObject.set(x, "seedFile", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeedFileSync(value: Double => String): Self = StObject.set(x, "seedFileSync", js.Any.fromFunction1(value))
    }
  }
}
