package typings.portfinder

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("portfinder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("portfinder", "basePort")
  @js.native
  def basePort: Double = js.native
  @scala.inline
  def basePort_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("basePort")(x.asInstanceOf[js.Any])
  
  @JSImport("portfinder", "getPort")
  @js.native
  def getPort(callback: PortfinderCallback): Unit = js.native
  @JSImport("portfinder", "getPort")
  @js.native
  def getPort(options: PortFinderOptions, callback: PortfinderCallback): Unit = js.native
  
  @JSImport("portfinder", "getPortPromise")
  @js.native
  def getPortPromise(): js.Promise[Double] = js.native
  @JSImport("portfinder", "getPortPromise")
  @js.native
  def getPortPromise(options: PortFinderOptions): js.Promise[Double] = js.native
  
  @JSImport("portfinder", "getPorts")
  @js.native
  def getPorts(
    count: Double,
    options: PortFinderOptions,
    callback: js.Function2[/* err */ Error, /* ports */ js.Array[Double], Unit]
  ): Unit = js.native
  
  @js.native
  trait PortFinderOptions extends StObject {
    
    /**
      * Host to find available port on.
      */
    var host: js.UndefOr[String] = js.native
    
    /**
      * Minimum port (takes precedence over `basePort`).
      */
    var port: js.UndefOr[Double] = js.native
    
    /**
      * search start port (equals to port when not provided)
      * This exists because getPort and getPortPromise mutates port state in
      * recursive calls and doesn't have a way to retrieve begininng port while
      * searching.
      */
    var startPort: js.UndefOr[Double] = js.native
    
    /**
      * Maximum port
      */
    var stopPort: js.UndefOr[Double] = js.native
  }
  object PortFinderOptions {
    
    @scala.inline
    def apply(): PortFinderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortFinderOptions]
    }
    
    @scala.inline
    implicit class PortFinderOptionsMutableBuilder[Self <: PortFinderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setStartPort(value: Double): Self = StObject.set(x, "startPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPortUndefined: Self = StObject.set(x, "startPort", js.undefined)
      
      @scala.inline
      def setStopPort(value: Double): Self = StObject.set(x, "stopPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPortUndefined: Self = StObject.set(x, "stopPort", js.undefined)
    }
  }
  
  type PortfinderCallback = js.Function2[/* err */ Error, /* port */ Double, Unit]
}
