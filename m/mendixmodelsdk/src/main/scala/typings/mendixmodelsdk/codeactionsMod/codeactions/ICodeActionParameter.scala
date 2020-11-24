package typings.mendixmodelsdk.codeactionsMod.codeactions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import typings.mendixmodelsdk.javaactionsMod.javaactions.IJavaAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICodeActionParameter
  extends IElement
     with IByNameReferrable {
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.21.0: introduced
    */
  val actionParameterType: IParameterType = js.native
  
  val containerAsCodeAction: ICodeAction = js.native
  
  val containerAsJavaAction: IJavaAction = js.native
  
  /**
    * In version 6.10.0: introduced
    */
  val description: String = js.native
  
  @JSName("model")
  val model_ICodeActionParameter: IModel = js.native
  
  val name: String = js.native
}
