package typings.nodeForge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object random {
  
  @JSImport("node-forge", "random")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createInstance(): Random = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[Random]
  
  @scala.inline
  def getBytes(count: Double): Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(count.asInstanceOf[js.Any]).asInstanceOf[Bytes]
  @scala.inline
  def getBytes(count: Double, callback: js.Function1[/* bytes */ Bytes, js.Any]): Bytes = (^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(count.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Bytes]
  
  @scala.inline
  def getBytesSync(count: Double): Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytesSync")(count.asInstanceOf[js.Any]).asInstanceOf[Bytes]
  
  type CB = js.Function2[/* _ */ js.Any, /* seed */ String, Unit]
  
  trait Random extends StObject {
    
    def seedFile(needed: Double, cb: CB): Unit
    
    def seedFileSync(needed: Double): String
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
