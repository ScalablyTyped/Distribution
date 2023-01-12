package typings.objectRefs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("object-refs", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Refs {
    /**
      * Creates a new references object defining two inversly related
      * attribute descriptors a and b.
      * @param {Refs.AttributeDescriptor} a property descriptor
      * @param {Refs.AttributeDescriptor} b property descriptor
      **/
    def this(a: AttributeDescriptor, b: AttributeDescriptor) = this()
  }
  
  object Collection {
    
    @JSImport("object-refs", "Collection")
    @js.native
    val ^ : js.Any = js.native
    
    /** Extends a collection with Refs aware methods */
    inline def extend(collection: js.Array[Any], refs: Refs, property: String, target: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(collection.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], property.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def extend(collection: js.Array[Any], refs: Refs, property: AttributeDescriptor, target: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(collection.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], property.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def isExtended(collection: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtended")(collection.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  trait AttributeDescriptor extends StObject {
    
    var collection: js.UndefOr[Boolean] = js.undefined
    
    var enumerable: js.UndefOr[Boolean] = js.undefined
    
    var name: String
  }
  object AttributeDescriptor {
    
    inline def apply(name: String): AttributeDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttributeDescriptor] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: Boolean): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      inline def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
      
      inline def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Refs extends StObject {
    
    /**
      * Binds one side of a bi-directional reference to a target object.
      * @param {*} target
      * @param {string|Refs.AttributeDescriptor} property
      */
    def bind(target: Any, property: String): Unit = js.native
    def bind(target: Any, property: AttributeDescriptor): Unit = js.native
    
    def ensureBound(target: Any, property: String): Unit = js.native
    def ensureBound(target: Any, property: AttributeDescriptor): Unit = js.native
    
    def ensureRefsCollection(target: Any, property: AttributeDescriptor): Any = js.native
    
    def set(target: Any, property: String, value: Any): Unit = js.native
    def set(target: Any, property: AttributeDescriptor, value: Any): Unit = js.native
    
    def unset(target: Any, property: String, value: Any): Unit = js.native
    def unset(target: Any, property: AttributeDescriptor, value: Any): Unit = js.native
  }
}
