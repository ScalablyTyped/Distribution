package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefPermissionFieldScopeMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/PermissionFieldScope", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PermissionFieldScope {
    
    /* CompleteClass */
    override def addClass(classKey: Double): Unit = js.native
    
    /* CompleteClass */
    override def addMimeType(typeKey: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var classes_ : Any = js.native
    
    /* CompleteClass */
    override def getClasses(): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def getMimeTypes(): js.Array[Double] = js.native
    
    /* private */ /* CompleteClass */
    var mimeTypes_ : Any = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/PermissionFieldScope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PermissionFieldScope extends StObject {
    
    def addClass(classKey: Double): Unit
    
    def addMimeType(typeKey: Double): Unit
    
    /* private */ var classes_ : Any
    
    def getClasses(): js.Array[Double]
    
    def getMimeTypes(): js.Array[Double]
    
    /* private */ var mimeTypes_ : Any
  }
  object PermissionFieldScope {
    
    inline def apply(
      addClass: Double => Unit,
      addMimeType: Double => Unit,
      classes_ : Any,
      getClasses: () => js.Array[Double],
      getMimeTypes: () => js.Array[Double],
      mimeTypes_ : Any
    ): PermissionFieldScope = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), addMimeType = js.Any.fromFunction1(addMimeType), classes_ = classes_.asInstanceOf[js.Any], getClasses = js.Any.fromFunction0(getClasses), getMimeTypes = js.Any.fromFunction0(getMimeTypes), mimeTypes_ = mimeTypes_.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionFieldScope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PermissionFieldScope] (val x: Self) extends AnyVal {
      
      inline def setAddClass(value: Double => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddMimeType(value: Double => Unit): Self = StObject.set(x, "addMimeType", js.Any.fromFunction1(value))
      
      inline def setClasses_(value: Any): Self = StObject.set(x, "classes_", value.asInstanceOf[js.Any])
      
      inline def setGetClasses(value: () => js.Array[Double]): Self = StObject.set(x, "getClasses", js.Any.fromFunction0(value))
      
      inline def setGetMimeTypes(value: () => js.Array[Double]): Self = StObject.set(x, "getMimeTypes", js.Any.fromFunction0(value))
      
      inline def setMimeTypes_(value: Any): Self = StObject.set(x, "mimeTypes_", value.asInstanceOf[js.Any])
    }
  }
}
