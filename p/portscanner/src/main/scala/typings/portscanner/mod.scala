package typings.portscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("portscanner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkPortStatus(port: Double): js.Promise[Status] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPortStatus")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Status]]
  inline def checkPortStatus(port: Double, checkPortCallback: StatusCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPortStatus")(port.asInstanceOf[js.Any], checkPortCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkPortStatus(port: Double, host: String): js.Promise[Status] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPortStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Status]]
  inline def checkPortStatus(port: Double, host: String, checkPortCallback: StatusCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPortStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], checkPortCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkPortStatus(port: Double, host: String, opts: Options): js.Promise[Status] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPortStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Status]]
  inline def checkPortStatus(port: Double, host: String, opts: Options, checkPortCallback: StatusCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPortStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], checkPortCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkPortStatus(port: Double, opts: Options): js.Promise[Status] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPortStatus")(port.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Status]]
  inline def checkPortStatus(port: Double, opts: Options, checkPortCallback: StatusCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPortStatus")(port.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], checkPortCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findAPortInUse(portList: js.Array[Double]): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAPortInUse")(portList.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def findAPortInUse(portList: js.Array[Double], findPortCallback: PortCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortInUse")(portList.asInstanceOf[js.Any], findPortCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findAPortInUse(portList: js.Array[Double], host: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortInUse")(portList.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def findAPortInUse(startPort: Double): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAPortInUse")(startPort.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def findAPortInUse(startPort: Double, endPort: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortInUse")(startPort.asInstanceOf[js.Any], endPort.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def findAPortInUse(startPort: Double, endPort: Double, findPortCallback: PortCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortInUse")(startPort.asInstanceOf[js.Any], endPort.asInstanceOf[js.Any], findPortCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findAPortInUse(startPort: Double, endPort: Double, host: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortInUse")(startPort.asInstanceOf[js.Any], endPort.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def findAPortInUse(startPort: Double, endPort: Double, host: String, findPortCallback: PortCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortInUse")(startPort.asInstanceOf[js.Any], endPort.asInstanceOf[js.Any], host.asInstanceOf[js.Any], findPortCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findAPortInUse(startPort: Double, findPortCallback: PortCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortInUse")(startPort.asInstanceOf[js.Any], findPortCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findAPortInUse(startPort: Double, host: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortInUse")(startPort.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def findAPortNotInUse(portList: js.Array[Double]): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAPortNotInUse")(portList.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def findAPortNotInUse(portList: js.Array[Double], findPortCallback: PortCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortNotInUse")(portList.asInstanceOf[js.Any], findPortCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findAPortNotInUse(portList: js.Array[Double], host: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortNotInUse")(portList.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def findAPortNotInUse(startPort: Double): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAPortNotInUse")(startPort.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def findAPortNotInUse(startPort: Double, endPort: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortNotInUse")(startPort.asInstanceOf[js.Any], endPort.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def findAPortNotInUse(startPort: Double, endPort: Double, findPortCallback: PortCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortNotInUse")(startPort.asInstanceOf[js.Any], endPort.asInstanceOf[js.Any], findPortCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findAPortNotInUse(startPort: Double, endPort: Double, host: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortNotInUse")(startPort.asInstanceOf[js.Any], endPort.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def findAPortNotInUse(startPort: Double, endPort: Double, host: String, findPortCallback: PortCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortNotInUse")(startPort.asInstanceOf[js.Any], endPort.asInstanceOf[js.Any], host.asInstanceOf[js.Any], findPortCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findAPortNotInUse(startPort: Double, findPortCallback: PortCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortNotInUse")(startPort.asInstanceOf[js.Any], findPortCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findAPortNotInUse(startPort: Double, host: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAPortNotInUse")(startPort.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  trait Options extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type PortCallback = js.Function2[/* error */ js.Error | Null, /* port */ Double, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.portscanner.portscannerStrings.open
    - typings.portscanner.portscannerStrings.closed
  */
  trait Status extends StObject
  object Status {
    
    inline def closed: typings.portscanner.portscannerStrings.closed = "closed".asInstanceOf[typings.portscanner.portscannerStrings.closed]
    
    inline def open: typings.portscanner.portscannerStrings.open = "open".asInstanceOf[typings.portscanner.portscannerStrings.open]
  }
  
  type StatusCallback = js.Function2[/* error */ js.Error | Null, /* port */ Status, Unit]
}
