package typings.nodegit

import typings.node.bufferMod.global.Buffer
import typings.nodegit.nodegitInts.`2`
import typings.nodegit.nodegitInts.`4`
import typings.nodegit.nodegitInts.`6`
import typings.nodegit.objectMod.Object.TYPE
import typings.nodegit.odbExpandIdMod.OdbExpandId
import typings.nodegit.odbObjectMod.OdbObject
import typings.nodegit.oidMod.Oid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object odbMod {
  
  @JSImport("nodegit/odb", "Odb")
  @js.native
  open class Odb () extends StObject {
    
    def addDiskAlternate(path: String): Double = js.native
    
    def expandIds(ids: OdbExpandId, count: Double): Double = js.native
    
    def free(): Unit = js.native
    
    def read(id: Oid): js.Promise[OdbObject] = js.native
    
    def write(data: Buffer, len: Double, `type`: TYPE): js.Promise[Oid] = js.native
  }
  /* static members */
  object Odb {
    
    @JSImport("nodegit/odb", "Odb")
    @js.native
    val ^ : js.Any = js.native
    
    inline def open(objectsDir: String): js.Promise[Odb] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(objectsDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Odb]]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`2`
      - typings.nodegit.nodegitInts.`4`
      - typings.nodegit.nodegitInts.`6`
    */
    trait STREAM extends StObject
    object STREAM {
      
      inline def RDONLY: `2` = 2.asInstanceOf[`2`]
      
      inline def RW: `6` = 6.asInstanceOf[`6`]
      
      inline def WRONLY: `4` = 4.asInstanceOf[`4`]
    }
  }
}
