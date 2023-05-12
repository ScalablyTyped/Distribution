package typings.newRelicBrowser

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object newrelic {
  
  @js.native
  trait BrowserInteraction extends StObject {
    
    /**
      * Sets the text value of the HTML element that was clicked to start a browser interaction.
      *
      * @param value The text value of the HTML element that represents the action that started the interaction.
      * @returns This method returns the same API object created by interaction().
      * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/actiontext-browser-spa-api
      */
    def actionText(value: String): this.type = js.native
    
    /**
      * Times sub-components of a SPA interaction separately, including wait time and JS execution time.
      *
      * @param name This will be used as the name of the tracer. If you do not include a name,
      *   New Relic Browser does not add a node to the interaction tree. The callback time will be
      *   attributed to the parent node.
      * @param callback A callback that contains the synchronous work to run at the end of the async work.
      *   To execute this callback, call the wrapper function returned using createTracer()
      * @returns This method ends the async time. It calls (and times) the callback that was passed into createTracer().
      * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-create-tracer
      */
    def createTracer(name: String): Wrapper = js.native
    def createTracer(name: String, callback: Callback): Wrapper = js.native
    
    /**
      * Ends the New Relic SPA interaction at the current time.
      *
      * @returns This method returns the same API object created by interaction().
      * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-end
      */
    def end(): this.type = js.native
    
    /**
      * Stores values across the current SPA interaction asynchronously in New Relic Browser.
      *
      * @param callback A function that accepts the interaction context object
      *   as its only argument.
      * @returns This method returns the same API object created by interaction().
      * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-get-context
      */
    // eslint-disable-next-line no-unnecessary-generics
    def getContext[T /* <: ContextObject */](callback: GetContextCallback[T]): this.type = js.native
    
    /**
      * Overrides other SPA save() calls; ignores an interaction so it is not saved or sent to New Relic.
      *
      * @returns This method returns the same API object created by interaction().
      * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-ignore-browser
      */
    def ignore(): this.type = js.native
    
    /**
      * Adds custom attributes for SPA interactions to the end of an event. It is called when the interaction
      * has finished. You can invoke methods to modify the interaction, but methods that have asynchronous
      * side effects will not have an effect.
      *
      * @returns This method returns the same API object created by interaction().
      * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-on-end
      */
    // eslint-disable-next-line no-unnecessary-generics
    def onEnd[T /* <: ContextObject */](callback: GetContextCallback[T]): this.type = js.native
    
    /**
      * Ensures a SPA browser interaction will be saved when it ends.
      *
      * @returns This method returns the same API object created by interaction().
      * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-save
      */
    def save(): this.type = js.native
    
    /**
      * Adds a custom SPA attribute only to the current interaction in New Relic Browser.
      *
      * @param key Used as the attribute name on the BrowserInteraction event.
      * @param value Used as the attribute value on the BrowserInteraction event. This can be a
      *   string, number, boolean, or object. If it is an object, New Relic serializes it to a JSON string.
      * @returns This method returns the same API object created by interaction().
      * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-set-attribute
      */
    def setAttribute(key: String, value: ComplexType): this.type = js.native
    
    /**
      * Sets the name and trigger of a SPA's browser interaction that is not a route change or URL change.
      *
      * @param name If null, the name will be set using the targetGroupedUrl attribute.
      *   If not null, this will set the browserInteractionName attribute in the BrowserInteraction event.
      * @param trigger If not null, this will set the TRIGGER attribute on the BrowserInteraction event.
      * @returns This method returns the same API object created by interaction().
      * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-set-name
      */
    def setName(name: String): this.type = js.native
    def setName(name: String, trigger: String): this.type = js.native
  }
  
  type Callback = js.Function0[Unit]
  
  type ComplexType = String | Double | Boolean | Any
  
  type ContextObject = Record[String, Any]
  
  type ErrorHandler = js.Function1[/* err */ Any, Boolean]
  
  trait EventObject extends StObject {
    
    /** End time in ms since epoch.  Defaults to same as start resulting in trace object with a duration of zero. */
    var end: js.UndefOr[Double] = js.undefined
    
    /** Event name */
    var name: String
    
    /** Origin of event */
    var origin: js.UndefOr[String] = js.undefined
    
    /** Start time in ms since epoch */
    var start: Double
    
    /** Event type */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object EventObject {
    
    inline def apply(name: String, start: Double): EventObject = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventObject] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type GetContextCallback[T /* <: ContextObject */] = js.Function1[/* contextObject */ T, Unit]
  
  trait Info extends StObject {
    
    var agent: String
    
    var applicationID: String
    
    var beacon: String
    
    var errorBeacon: String
    
    var jsAttributes: Record[String, ComplexType]
    
    var licenseKey: String
    
    var sa: Double
  }
  object Info {
    
    inline def apply(
      agent: String,
      applicationID: String,
      beacon: String,
      errorBeacon: String,
      jsAttributes: Record[String, ComplexType],
      licenseKey: String,
      sa: Double
    ): Info = {
      val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], applicationID = applicationID.asInstanceOf[js.Any], beacon = beacon.asInstanceOf[js.Any], errorBeacon = errorBeacon.asInstanceOf[js.Any], jsAttributes = jsAttributes.asInstanceOf[js.Any], licenseKey = licenseKey.asInstanceOf[js.Any], sa = sa.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setApplicationID(value: String): Self = StObject.set(x, "applicationID", value.asInstanceOf[js.Any])
      
      inline def setBeacon(value: String): Self = StObject.set(x, "beacon", value.asInstanceOf[js.Any])
      
      inline def setErrorBeacon(value: String): Self = StObject.set(x, "errorBeacon", value.asInstanceOf[js.Any])
      
      inline def setJsAttributes(value: Record[String, ComplexType]): Self = StObject.set(x, "jsAttributes", value.asInstanceOf[js.Any])
      
      inline def setLicenseKey(value: String): Self = StObject.set(x, "licenseKey", value.asInstanceOf[js.Any])
      
      inline def setSa(value: Double): Self = StObject.set(x, "sa", value.asInstanceOf[js.Any])
    }
  }
  
  type SimpleType = String | Double
  
  type Wrapper = js.Function0[Unit]
}
