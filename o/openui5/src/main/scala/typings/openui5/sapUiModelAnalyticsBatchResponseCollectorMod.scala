package typings.openui5

import typings.openui5.anon.Binding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelAnalyticsBatchResponseCollectorMod {
  
  @JSImport("sap/ui/model/analytics/BatchResponseCollector", JSImport.Default)
  @js.native
  /**
    * Constructor for a batch response collecting component.
    */
  open class default ()
    extends StObject
       with BatchResponseCollector {
    def this(/**
      * optional Setup-Parameter, @see BatchResponseCollector#setup
      */
    mParams: js.Object) = this()
  }
  
  @js.native
  trait BatchResponseCollector extends StObject {
    
    /**
      * Collects responses of type BatchResponseCollector.TYPE_SUCCESS and BatchResponseCollector.TYPE_ERROR.
      *
      * Keeps track of all collected responses and fires the necessary events after all responses for the requests,
      * given in the constructor, have returned.
      */
    def collect(/**
      * the response which should be collected
      */
    oResponse: js.Object): Unit = js.native
    def collect(
      /**
      * the response which should be collected
      */
    oResponse: js.Object,
      /**
      * the type of the response, either BatchResponseCollector.TYPE_SUCCESS or BatchResponseCollector.TYPE_ERROR
      */
    sResponseType: String
    ): Unit = js.native
    
    /**
      * Convenience function to collect an error response.
      *
      * Internally BatchResponseCollector#collect is called, the second parameter is set to BatchResponseCollector.TYPE_ERROR
      */
    def error(/**
      * the erroneous response object
      */
    oResponse: js.Object): Unit = js.native
    
    /**
      * Setup-Function to initialize/reset the BatchResponseCollector.
      */
    def setup(): Unit = js.native
    def setup(/**
      * optional Setup-Parameter
      */
    mParams: Binding): Unit = js.native
    
    /**
      * Convenience function to collect a success response.
      *
      * Internally BatchResponseCollector#collect is called with second parameter BatchResponseCollector.TYPE_SUCCESS
      */
    def success(/**
      * the successful response, which should be collected
      */
    oResponse: js.Object): Unit = js.native
  }
}
