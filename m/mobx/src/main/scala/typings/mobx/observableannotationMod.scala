package typings.mobx

import typings.mobx.annotationMod.Annotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableannotationMod {
  
  @JSImport("mobx/dist/types/observableannotation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createObservableAnnotation(name: String): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("createObservableAnnotation")(name.asInstanceOf[js.Any]).asInstanceOf[Annotation]
  inline def createObservableAnnotation(name: String, options: js.Object): Annotation = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableAnnotation")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Annotation]
}
