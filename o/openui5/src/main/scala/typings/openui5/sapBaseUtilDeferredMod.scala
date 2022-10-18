package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseUtilDeferredMod {
  
  @JSImport("sap/base/util/Deferred", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Deferred
  
  @js.native
  trait Deferred extends StObject {
    
    /**
      * Promise instance of the Deferred
      */
    var promise: js.Promise[Any] = js.native
    
    /**
      * Proxy call to the `reject` method of the wrapped Promise
      */
    def reject(): Unit = js.native
    def reject(/**
      * Failure reason
      */
    reason: Any): Unit = js.native
    
    /**
      * Proxy call to the `resolve` method of the wrapped Promise
      */
    def resolve(): Unit = js.native
    def resolve(/**
      * Fulfillment value
      */
    value: Any): Unit = js.native
  }
}
