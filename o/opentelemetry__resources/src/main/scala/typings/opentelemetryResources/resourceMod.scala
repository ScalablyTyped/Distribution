package typings.opentelemetryResources

import typings.opentelemetryResources.typesMod.ResourceAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/resources/build/src/Resource", JSImport.Namespace)
@js.native
object resourceMod extends js.Object {
  
  @js.native
  class Resource protected () extends js.Object {
    def this(/**
      * A dictionary of attributes with string keys and values that provide
      * information about the entity as numbers, strings or booleans
      * TODO: Consider to add check/validation on attributes.
      */
    attributes: ResourceAttributes) = this()
    
    /**
      * A dictionary of attributes with string keys and values that provide
      * information about the entity as numbers, strings or booleans
      * TODO: Consider to add check/validation on attributes.
      */
    val attributes: ResourceAttributes = js.native
    
    /**
      * Returns a new, merged {@link Resource} by merging the current Resource
      * with the other Resource. In case of a collision, current Resource takes
      * precedence.
      *
      * @param other the Resource that will be merged with this.
      * @returns the newly merged Resource.
      */
    def merge(): Resource = js.native
    def merge(other: Resource): Resource = js.native
  }
  /* static members */
  @js.native
  object Resource extends js.Object {
    
    val EMPTY: Resource = js.native
    
    /**
      * Returns a Resource that indentifies the SDK in use.
      */
    def createTelemetrySDKResource(): Resource = js.native
    
    /**
      * Returns an empty Resource
      */
    def empty(): Resource = js.native
  }
}
