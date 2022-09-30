package typings.mobx

import typings.mobx.annotationMod.Annotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computedannotationMod {
  
  @JSImport("mobx/dist/types/computedannotation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createComputedAnnotation(name: String): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("createComputedAnnotation")(name.asInstanceOf[js.Any]).asInstanceOf[Annotation]
  inline def createComputedAnnotation(name: String, options: js.Object): Annotation = (^.asInstanceOf[js.Dynamic].applyDynamic("createComputedAnnotation")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Annotation]
}
