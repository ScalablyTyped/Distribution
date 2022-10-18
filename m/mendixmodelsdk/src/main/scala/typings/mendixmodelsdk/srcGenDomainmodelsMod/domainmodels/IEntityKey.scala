package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
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
