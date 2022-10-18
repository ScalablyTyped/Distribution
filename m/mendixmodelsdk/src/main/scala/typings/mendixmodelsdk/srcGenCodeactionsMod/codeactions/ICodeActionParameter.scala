package typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenJavaactionsMod.javaactions.IJavaAction
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICodeActionParameter
  extends StObject
     with IElement
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
  
  /**
    * In version 9.17.0: introduced
    */
  val isRequired: Boolean = js.native
  
  @JSName("model")
  val model_ICodeActionParameter: IModel = js.native
  
  val name: String = js.native
}
