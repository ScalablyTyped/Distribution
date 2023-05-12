package typings.mendixmodelsdk.srcGenRestMod.rest

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 9.24.0: introduced
  */
@js.native
trait IOperationParameter
  extends StObject
     with IElement
     with IByNameReferrable {
  
  val containerAsInteractiveRestOperation: IInteractiveRestOperation = js.native
  
  @JSName("model")
  val model_IOperationParameter: IModel = js.native
  
  val name: String = js.native
}
