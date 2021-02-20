package typings.objectRefs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("object-refs", JSImport.Namespace)
  @js.native
  class ^ protected () extends Refs {
    /**
      * Creates a new references object defining two inversly related
      * attribute descriptors a and b.
      * @param {Refs.AttributeDescriptor} a property descriptor
      * @param {Refs.AttributeDescriptor} b property descriptor
      **/
    def this(a: AttributeDescriptor, b: AttributeDescriptor) = this()
  }
  
  object Collection {
    
    /** Extends a collection with Refs aware methods */
    @JSImport("object-refs", "Collection.extend")
    @js.native
    def extend(collection: js.Array[_], refs: Refs, property: String, target: js.Any): js.Any = js.native
    @JSImport("object-refs", "Collection.extend")
    @js.native
    def extend(collection: js.Array[_], refs: Refs, property: AttributeDescriptor, target: js.Any): js.Any = js.native
    
    @JSImport("object-refs", "Collection.isExtended")
    @js.native
    def isExtended(collection: js.Array[_]): Boolean = js.native
  }
  
  @js.native
  trait AttributeDescriptor extends StObject {
    
    var collection: js.UndefOr[Boolean] = js.native
    
    var enumerable: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
  }
  object AttributeDescriptor {
    
    @scala.inline
    def apply(name: String): AttributeDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeDescriptor]
    }
    
    @scala.inline
    implicit class AttributeDescriptorMutableBuilder[Self <: AttributeDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: Boolean): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      @scala.inline
      def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Refs extends StObject {
    
    /**
      * Binds one side of a bi-directional reference to a target object.
      * @param {*} target
      * @param {string|Refs.AttributeDescriptor} property
      */
    def bind(target: js.Any, property: String): Unit = js.native
    def bind(target: js.Any, property: AttributeDescriptor): Unit = js.native
    
    def ensureBound(target: js.Any, property: String): Unit = js.native
    def ensureBound(target: js.Any, property: AttributeDescriptor): Unit = js.native
    
    def ensureRefsCollection(target: js.Any, property: AttributeDescriptor): js.Any = js.native
    
    def set(target: js.Any, property: String, value: js.Any): Unit = js.native
    def set(target: js.Any, property: AttributeDescriptor, value: js.Any): Unit = js.native
    
    def unset(target: js.Any, property: String, value: js.Any): Unit = js.native
    def unset(target: js.Any, property: AttributeDescriptor, value: js.Any): Unit = js.native
  }
}
