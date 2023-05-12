package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcIresourceMod.IResource
import typings.opentelemetryResources.buildSrcTypesMod.ResourceAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcResourceMod {
  
  @JSImport("@opentelemetry/resources/build/src/Resource", "Resource")
  @js.native
  open class Resource protected ()
    extends StObject
       with IResource {
    def this(/**
      * A dictionary of attributes with string keys and values that provide
      * information about the entity as numbers, strings or booleans
      * TODO: Consider to add check/validation on attributes.
      */
    attributes: ResourceAttributes) = this()
    def this(
      /**
      * A dictionary of attributes with string keys and values that provide
      * information about the entity as numbers, strings or booleans
      * TODO: Consider to add check/validation on attributes.
      */
    attributes: ResourceAttributes,
      asyncAttributesPromise: js.Promise[ResourceAttributes]
    ) = this()
    
    /* private */ var _asyncAttributesPromise: Any = js.native
    
    /* private */ var _attributes: Any = js.native
    
    /* private */ var _syncAttributes: Any = js.native
    
    @JSName("attributes")
    def attributes_MResource: ResourceAttributes = js.native
  }
  /* static members */
  object Resource {
    
    @JSImport("@opentelemetry/resources/build/src/Resource", "Resource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a Resource that identifies the SDK in use.
      */
    inline def default(): IResource = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[IResource]
    
    @JSImport("@opentelemetry/resources/build/src/Resource", "Resource.EMPTY")
    @js.native
    val EMPTY: Resource = js.native
    
    /**
      * Returns an empty Resource
      */
    inline def empty(): IResource = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[IResource]
  }
}
