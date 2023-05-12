package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcTypesMod.ResourceAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcIresourceMod {
  
  @js.native
  trait IResource extends StObject {
    
    /**
      * Check if async attributes have resolved. This is useful to avoid awaiting
      * waitForAsyncAttributes (which will introduce asynchronous behavior) when not necessary.
      *
      * @returns true if the resource "attributes" property is not yet settled to its final value
      */
    var asyncAttributesPending: js.UndefOr[Boolean] = js.native
    
    /**
      * @returns the Resource's attributes.
      */
    val attributes: ResourceAttributes = js.native
    
    /**
      * Returns a new, merged {@link Resource} by merging the current Resource
      * with the other Resource. In case of a collision, other Resource takes
      * precedence.
      *
      * @param other the Resource that will be merged with this.
      * @returns the newly merged Resource.
      */
    def merge(): IResource = js.native
    def merge(other: IResource): IResource = js.native
    
    /**
      * Returns a promise that will never be rejected. Resolves when all async attributes have finished being added to
      * this Resource's attributes. This is useful in exporters to block until resource detection
      * has finished.
      */
    var waitForAsyncAttributes: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  }
}
