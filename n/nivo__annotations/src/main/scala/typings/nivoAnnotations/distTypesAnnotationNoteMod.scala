package typings.nivoAnnotations

import typings.nivoAnnotations.anon.Note
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAnnotationNoteMod {
  
  @JSImport("@nivo/annotations/dist/types/AnnotationNote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AnnotationNote[Datum](param0: Note[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AnnotationNote")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
