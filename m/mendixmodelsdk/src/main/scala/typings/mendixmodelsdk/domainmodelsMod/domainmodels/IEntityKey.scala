package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IElement
import typings.mendixmodelsdk.instancesMod.IList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.9.0: introduced
  */
@js.native
trait IEntityKey
  extends StObject
     with IElement {
  
  @JSName("model")
  val model_IEntityKey: IModel = js.native
  
  val parts: IList[IEntityKeyPart] = js.native
}
