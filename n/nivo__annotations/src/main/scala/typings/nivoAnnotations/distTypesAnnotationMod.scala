package typings.nivoAnnotations

import typings.nivoAnnotations.distTypesTypesMod.BoundAnnotation
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAnnotationMod {
  
  @JSImport("@nivo/annotations/dist/types/Annotation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Annotation[Datum](annotation: BoundAnnotation[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Annotation")(annotation.asInstanceOf[js.Any]).asInstanceOf[Element]
}
