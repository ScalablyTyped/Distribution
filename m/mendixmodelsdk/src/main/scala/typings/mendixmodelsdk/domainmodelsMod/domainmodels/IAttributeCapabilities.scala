package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.13.0: introduced
  */
@js.native
trait IAttributeCapabilities extends IElement {
  
  /**
    * In version 9.0.0: introduced
    */
  val canDeleteFromModel: Boolean = js.native
  
  val containerAsAttribute: IAttribute = js.native
  
  val filterable: Boolean = js.native
  
  @JSName("model")
  val model_IAttributeCapabilities: IModel = js.native
  
  val sortable: Boolean = js.native
}
