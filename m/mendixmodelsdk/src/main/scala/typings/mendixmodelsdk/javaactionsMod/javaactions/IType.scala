package typings.mendixmodelsdk.javaactionsMod.javaactions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
@js.native
trait IType extends IElement {
  
  val containerAsBasicParameterType: IBasicParameterType = js.native
  
  val containerAsJavaAction: IJavaAction = js.native
  
  val containerAsJavaActionParameter: IJavaActionParameter = js.native
  
  val containerAsListType: IListType = js.native
  
  @JSName("model")
  val model_IType: IModel = js.native
}
