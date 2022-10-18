package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIfpControlChannelBusMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/ifp/ControlChannelBus", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ControlChannelBus
  @JSImport("@nginstack/web-framework/lib/ifp/ControlChannelBus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): ControlChannelBus = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[ControlChannelBus]
  
  @js.native
  trait ControlChannelBus extends StObject {
    
    /* private */ var _loadSharedData: Any = js.native
    
    /* private */ var _sharedData: Any = js.native
    
    def openChannel(sid: String): String = js.native
    
    def read(cid: String, fieldName: String): Any = js.native
    
    def readMap(cid: String, fieldNames: js.Array[Any]): Any = js.native
    
    def writeMap(cid: String, data: Any): Unit = js.native
    def writeMap(cid: String, data: Any, msgCondition: String): Unit = js.native
  }
}
