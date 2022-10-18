package typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: introduced
  */
@js.native
trait IType
  extends StObject
     with IElement {
  
  val containerAsBasicParameterType: IBasicParameterType = js.native
  
  val containerAsCodeAction: ICodeAction = js.native
  
  val containerAsListType: IListType = js.native
  
  @JSName("model")
  val model_IType: IModel = js.native
}
