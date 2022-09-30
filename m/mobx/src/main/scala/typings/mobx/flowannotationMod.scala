package typings.mobx

import typings.mobx.annotationMod.Annotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowannotationMod {
  
  @JSImport("mobx/dist/types/flowannotation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFlowAnnotation(name: String): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("createFlowAnnotation")(name.asInstanceOf[js.Any]).asInstanceOf[Annotation]
  inline def createFlowAnnotation(name: String, options: js.Object): Annotation = (^.asInstanceOf[js.Dynamic].applyDynamic("createFlowAnnotation")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Annotation]
}
