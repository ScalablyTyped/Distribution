package typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.6.0: introduced
  */
@js.native
trait IMessageDefinition
  extends IElement
     with IByNameReferrable {
  
  val containerAsMessageDefinitionCollection: IMessageDefinitionCollection = js.native
  
  @JSName("model")
  val model_IMessageDefinition: IModel = js.native
  
  val name: String = js.native
}
