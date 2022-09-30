package typings.mobx

import typings.mobx.annotationMod.Annotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoannotationMod {
  
  @JSImport("mobx/dist/types/autoannotation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/dist/types/autoannotation", "autoAnnotation")
  @js.native
  val autoAnnotation: Annotation = js.native
  
  inline def createAutoAnnotation(): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAutoAnnotation")().asInstanceOf[Annotation]
  inline def createAutoAnnotation(options: js.Object): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAutoAnnotation")(options.asInstanceOf[js.Any]).asInstanceOf[Annotation]
}
