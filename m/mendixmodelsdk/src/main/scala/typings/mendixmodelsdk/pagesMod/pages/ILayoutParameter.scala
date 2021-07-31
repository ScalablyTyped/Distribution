package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILayoutParameter
  extends StObject
     with IElement
     with IByNameReferrable {
  
  val containerAsLayout: ILayout = js.native
  
  @JSName("model")
  val model_ILayoutParameter: IModel = js.native
  
  val name: String = js.native
}
