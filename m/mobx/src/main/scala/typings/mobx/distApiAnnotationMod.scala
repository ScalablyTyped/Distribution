package typings.mobx

import typings.mobx.distInternalMod.ObservableObjectAdministration
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiAnnotationMod {
  
  @JSImport("mobx/dist/api/annotation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAnnotation(thing: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnnotation")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAnnotationMapEntry(thing: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnnotationMapEntry")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Annotation extends StObject {
    
    var annotationType_ : String
    
    def extend_(
      adm: ObservableObjectAdministration,
      key: PropertyKey,
      descriptor: js.PropertyDescriptor,
      proxyTrap: Boolean
    ): Boolean | Null
    
    def make_(
      adm: ObservableObjectAdministration,
      key: PropertyKey,
      descriptor: js.PropertyDescriptor,
      source: js.Object
    ): MakeResult
    
    var options_ : js.UndefOr[Any] = js.undefined
  }
  object Annotation {
    
    inline def apply(
      annotationType_ : String,
      extend_ : (ObservableObjectAdministration, PropertyKey, js.PropertyDescriptor, Boolean) => Boolean | Null,
      make_ : (ObservableObjectAdministration, PropertyKey, js.PropertyDescriptor, js.Object) => MakeResult
    ): Annotation = {
      val __obj = js.Dynamic.literal(annotationType_ = annotationType_.asInstanceOf[js.Any], extend_ = js.Any.fromFunction4(extend_), make_ = js.Any.fromFunction4(make_))
      __obj.asInstanceOf[Annotation]
    }
    
    extension [Self <: Annotation](x: Self) {
      
      inline def setAnnotationType_(value: String): Self = StObject.set(x, "annotationType_", value.asInstanceOf[js.Any])
      
      inline def setExtend_(
        value: (ObservableObjectAdministration, PropertyKey, js.PropertyDescriptor, Boolean) => Boolean | Null
      ): Self = StObject.set(x, "extend_", js.Any.fromFunction4(value))
      
      inline def setMake_(
        value: (ObservableObjectAdministration, PropertyKey, js.PropertyDescriptor, js.Object) => MakeResult
      ): Self = StObject.set(x, "make_", js.Any.fromFunction4(value))
      
      inline def setOptions_(value: Any): Self = StObject.set(x, "options_", value.asInstanceOf[js.Any])
      
      inline def setOptions_Undefined: Self = StObject.set(x, "options_", js.undefined)
    }
  }
  
  type AnnotationMapEntry = Annotation | true | false
  
  type AnnotationsMap[T, AdditionalFields /* <: PropertyKey */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in std.Exclude<keyof T, 'toString'> ]:? mobx.mobx/dist/api/annotation.AnnotationMapEntry} */ js.Any) & (Record[AdditionalFields, AnnotationMapEntry])
  
  object MakeResult {
    
    inline def Break: 1 = 1.asInstanceOf[1]
    
    inline def Cancel: 0 = 0.asInstanceOf[0]
    
    inline def Continue: 2 = 2.asInstanceOf[2]
  }
  type MakeResult = 0 | 1 | 2
}
