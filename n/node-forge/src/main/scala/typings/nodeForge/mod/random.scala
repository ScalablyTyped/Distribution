package typings.nodeForge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object random {
  
  @JSImport("node-forge", "random")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInstance(): Random = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[Random]
  
  inline def getBytes(count: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getBytes(count: Double, callback: js.Function2[/* err */ js.Error | Null, /* bytes */ Bytes, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(count.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getBytesSync(count: Double): Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytesSync")(count.asInstanceOf[js.Any]).asInstanceOf[Bytes]
  
  type CB = js.Function2[/* _ */ Any, /* seed */ String, Unit]
  
  trait Random extends StObject {
    
    def seedFile(needed: Double, cb: CB): Unit
    
    def seedFileSync(needed: Double): String
  }
  object Random {
    
    inline def apply(seedFile: (Double, CB) => Unit, seedFileSync: Double => String): Random = {
      val __obj = js.Dynamic.literal(seedFile = js.Any.fromFunction2(seedFile), seedFileSync = js.Any.fromFunction1(seedFileSync))
      __obj.asInstanceOf[Random]
    }
    
    extension [Self <: Random](x: Self) {
      
      inline def setSeedFile(value: (Double, CB) => Unit): Self = StObject.set(x, "seedFile", js.Any.fromFunction2(value))
      
      inline def setSeedFileSync(value: Double => String): Self = StObject.set(x, "seedFileSync", js.Any.fromFunction1(value))
    }
  }
}
