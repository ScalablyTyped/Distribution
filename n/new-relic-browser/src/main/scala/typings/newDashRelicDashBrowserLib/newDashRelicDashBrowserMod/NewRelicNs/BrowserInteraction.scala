package typings
package newDashRelicDashBrowserLib.newDashRelicDashBrowserMod.NewRelicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserInteraction extends js.Object {
  /**
           * Times sub-components of a SPA interaction separately, including wait time and JS execution time.
           *
           * @param name This will be used as the name of the tracer. If you do not include a name,
           *   New Relic Browser does not add a node to the interaction tree. The callback time will be
           *   attributed to the parent node.
           * @returns This method ends the async time. It calls (and times) the callback that was passed into createTracer().
           * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-create-tracer
           */
  def createTracer(name: java.lang.String): js.Function0[scala.Unit] = js.native
  /**
           * Times sub-components of a SPA interaction separately, including wait time and JS execution time.
           *
           * @param name This will be used as the name of the tracer. If you do not include a name,
           *   New Relic Browser does not add a node to the interaction tree. The callback time will be
           *   attributed to the parent node.
           * @returns This method ends the async time. It calls (and times) the callback that was passed into createTracer().
           * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-create-tracer
           */
  def createTracer(name: java.lang.String, syncCallback: js.Function0[scala.Unit]): js.Function0[scala.Unit] = js.native
  /**
           * Ends the New Relic SPA interaction at the current time.
           *
           * @returns This method returns the same API object created by interaction().
           * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-end
           */
  def end(): BrowserInteraction = js.native
  /**
           * Stores values across the current SPA interaction asynchronously in New Relic Browser.
           *
           * @param callback A function that accepts the interaction context object
           *   as its only argument.
           * @returns This method returns the same API object created by interaction().
           * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-get-context
           */
  def getContext(callback: js.Function1[/* contextObject */ js.Any, scala.Unit]): BrowserInteraction = js.native
  /**
           * Overrides other SPA save() calls; ignores an interaction so it is not saved or sent to New Relic.
           *
           * @returns This method returns the same API object created by interaction().
           * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-ignore-browser
           */
  def ignore(): BrowserInteraction = js.native
  /**
           * Adds custom attributes for SPA interactions to the end of an event. It is called when the interaction
           * has finished. You can invoke methods to modify the interaction, but methods that have asynchronous
           * side effects will not have an effect.
           *
           * @returns This method returns the same API object created by interaction().
           * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-on-end
           */
  def onEnd(callback: js.Function1[/* contextObject */ js.Any, scala.Unit]): BrowserInteraction = js.native
  /**
           * Ensures a SPA browser interaction will be saved when it ends.
           *
           * @returns This method returns the same API object created by interaction().
           * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-save
           */
  def save(): BrowserInteraction = js.native
  /**
           * Adds a custom SPA attribute only to the current interaction in New Relic Browser.
           *
           * @param key Used as the attribute name on the BrowserInteraction event.
           * @param value Used as the attribute value on the BrowserInteraction event. This can be a
           *   string, number, boolean, or object. If it is an object, New Relic serializes it to a JSON string.
           * @returns This method returns the same API object created by interaction().
           * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-set-attribute
           */
  def setAttribute(key: java.lang.String, value: js.Any): BrowserInteraction = js.native
  /**
           * Sets the name and trigger of a SPA's browser interaction that is not a route change or URL change.
           *
           * @param name If null, the name will be set using the targetGroupedUrl attribute.
           *   If not null, this will set the browserInteractionName attribute in the BrowserInteraction event.
           * @param trigger If not null, this will set the TRIGGER attribute on the BrowserInteraction event.
           * @returns This method returns the same API object created by interaction().
           * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-set-name
           */
  def setName(name: java.lang.String): BrowserInteraction = js.native
  /**
           * Sets the name and trigger of a SPA's browser interaction that is not a route change or URL change.
           *
           * @param name If null, the name will be set using the targetGroupedUrl attribute.
           *   If not null, this will set the browserInteractionName attribute in the BrowserInteraction event.
           * @param trigger If not null, this will set the TRIGGER attribute on the BrowserInteraction event.
           * @returns This method returns the same API object created by interaction().
           * @see https://docs.newrelic.com/docs/browser/new-relic-browser/browser-agent-spa-api/spa-set-name
           */
  def setName(name: java.lang.String, trigger: java.lang.String): BrowserInteraction = js.native
}

