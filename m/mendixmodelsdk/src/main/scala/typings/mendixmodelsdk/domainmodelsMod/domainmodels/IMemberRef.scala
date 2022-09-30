package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.6.0: added public
  * In version 7.11.0: introduced
  */
@js.native
trait IMemberRef
  extends StObject
     with IElement {
  
  /**
    * In version 9.6.0: added public
    */
  val entityRef: IIndirectEntityRef | Null = js.native
  
  @JSName("model")
  val model_IMemberRef: IModel = js.native
}
