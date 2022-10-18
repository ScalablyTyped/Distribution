package typings.mobx

import typings.mobx.distApiAnnotationMod.Annotation
import typings.mobx.distApiAnnotationMod.AnnotationsMap
import typings.std.PropertyDecorator
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiDecoratorsMod {
  
  @JSImport("mobx/dist/api/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectStoredAnnotations(target: Any): AnnotationsMap[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("collectStoredAnnotations")(target.asInstanceOf[js.Any]).asInstanceOf[AnnotationsMap[Any, Any]]
  
  inline def createDecoratorAnnotation(annotation: Annotation): PropertyDecorator & Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecoratorAnnotation")(annotation.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator & Annotation]
  
  inline def storeAnnotation(prototype: Any, key: PropertyKey, annotation: Annotation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("storeAnnotation")(prototype.asInstanceOf[js.Any], key.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("mobx/dist/api/decorators", "storedAnnotationsSymbol")
  @js.native
  val storedAnnotationsSymbol: js.Symbol = js.native
}
