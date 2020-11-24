package typings.opentelemetryApi

import typings.opentelemetryApi.getterMod.GetterFunction
import typings.opentelemetryApi.setterMod.SetterFunction
import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import typings.opentelemetryContextBase.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/api/propagation", JSImport.Namespace)
@js.native
object propagationMod extends js.Object {
  
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  class PropagationAPI protected () extends js.Object {
    
    var _getGlobalPropagator: js.Any = js.native
    
    /** Remove the global propagator */
    def disable(): Unit = js.native
    
    /**
      * Extract context from a carrier
      *
      * @param carrier Carrier to extract context from
      * @param getter Function used to extract keys from a carrier
      * @param context Context which the newly created context will inherit from. Defaults to the currently active context.
      */
    def extract[Carrier](carrier: Carrier): Context = js.native
    def extract[Carrier](carrier: Carrier, getter: js.UndefOr[scala.Nothing], context: Context): Context = js.native
    def extract[Carrier](carrier: Carrier, getter: GetterFunction[Carrier]): Context = js.native
    def extract[Carrier](carrier: Carrier, getter: GetterFunction[Carrier], context: Context): Context = js.native
    
    /**
      * Inject context into a carrier to be propagated inter-process
      *
      * @param carrier carrier to inject context into
      * @param setter Function used to set values on the carrier
      * @param context Context carrying tracing data to inject. Defaults to the currently active context.
      */
    def inject[Carrier](carrier: Carrier): Unit = js.native
    def inject[Carrier](carrier: Carrier, setter: js.UndefOr[scala.Nothing], context: Context): Unit = js.native
    def inject[Carrier](carrier: Carrier, setter: SetterFunction[Carrier]): Unit = js.native
    def inject[Carrier](carrier: Carrier, setter: SetterFunction[Carrier], context: Context): Unit = js.native
    
    /**
      * Set the current propagator. Returns the initialized propagator
      */
    def setGlobalPropagator(propagator: TextMapPropagator): TextMapPropagator = js.native
  }
  /* static members */
  @js.native
  object PropagationAPI extends js.Object {
    
    var _instance: js.Any = js.native
    
    /** Get the singleton instance of the Propagator API */
    def getInstance(): PropagationAPI = js.native
  }
}
