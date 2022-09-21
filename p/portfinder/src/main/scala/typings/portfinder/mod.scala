package typings.portfinder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("portfinder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("portfinder", "basePort")
  @js.native
  def basePort: Double = js.native
  inline def basePort_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("basePort")(x.asInstanceOf[js.Any])
  
  inline def getPort(callback: PortfinderCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPort")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getPort(options: PortFinderOptions, callback: PortfinderCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getPort")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getPortPromise(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPortPromise")().asInstanceOf[js.Promise[Double]]
  inline def getPortPromise(options: PortFinderOptions): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPortPromise")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  inline def getPorts(
    count: Double,
    options: PortFinderOptions,
    callback: js.Function2[/* err */ js.Error, /* ports */ js.Array[Double], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getPorts")(count.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait PortFinderOptions extends StObject {
    
    /**
      * Host to find available port on.
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Minimum port (takes precedence over `basePort`).
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * search start port (equals to port when not provided)
      * This exists because getPort and getPortPromise mutates port state in
      * recursive calls and doesn't have a way to retrieve begininng port while
      * searching.
      */
    var startPort: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum port
      */
    var stopPort: js.UndefOr[Double] = js.undefined
  }
  object PortFinderOptions {
    
    inline def apply(): PortFinderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortFinderOptions]
    }
    
    extension [Self <: PortFinderOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setStartPort(value: Double): Self = StObject.set(x, "startPort", value.asInstanceOf[js.Any])
      
      inline def setStartPortUndefined: Self = StObject.set(x, "startPort", js.undefined)
      
      inline def setStopPort(value: Double): Self = StObject.set(x, "stopPort", value.asInstanceOf[js.Any])
      
      inline def setStopPortUndefined: Self = StObject.set(x, "stopPort", js.undefined)
    }
  }
  
  type PortfinderCallback = js.Function2[/* err */ js.Error, /* port */ Double, Unit]
}
