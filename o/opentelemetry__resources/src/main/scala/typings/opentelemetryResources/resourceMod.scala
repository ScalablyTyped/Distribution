package typings.opentelemetryResources

import typings.opentelemetryResources.typesMod.ResourceAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceMod {
  
  @JSImport("@opentelemetry/resources/build/src/Resource", "Resource")
  @js.native
  open class Resource protected () extends StObject {
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
      * with the other Resource. In case of a collision, other Resource takes
      * precedence.
      *
      * @param other the Resource that will be merged with this.
      * @returns the newly merged Resource.
      */
    def merge(): Resource = js.native
    def merge(other: Resource): Resource = js.native
  }
  /* static members */
  object Resource {
    
    @JSImport("@opentelemetry/resources/build/src/Resource", "Resource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a Resource that indentifies the SDK in use.
      */
    inline def default(): Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Resource]
    
    @JSImport("@opentelemetry/resources/build/src/Resource", "Resource.EMPTY")
    @js.native
    val EMPTY: Resource = js.native
    
    /**
      * Returns an empty Resource
      */
    inline def empty(): Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Resource]
  }
}
